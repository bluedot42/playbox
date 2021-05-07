public class LC066_PlusOne {
    public int[] plusOne(int[] digits){
        int carry = 0;
        int[] res = new int[digits.length];

        for(int i=digits.length-1;i>=0;i--){
            int tmp = digits[i] + carry;
            if(i==digits.length-1){
                tmp+=1;
            }

            res[i] = tmp%10;
            carry = tmp/10;
        }

        if(carry == 1){
            int[] res_expand = new int[res.length+1];
            res_expand[0] = 1;
            for(int i=1;i<res_expand.length;i++){
                res_expand[i] = res[i-1];
            }

            return res_expand;
        }

        return res;
    }
}
