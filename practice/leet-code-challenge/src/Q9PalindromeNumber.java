public class Q9PalindromeNumber {
    public void test(){
        System.out.println(isPalindromeNumber(-123));
        System.out.println(isPalindromeNumber(-121));
        System.out.println(isPalindromeNumber(121));
    }

    private boolean isPalindromeNumber(int x){
        String tmp = new Integer(x).toString();

        int left =0;
        int right = tmp.length()-1;

        while(left<right){
            if(tmp.charAt(left)!=tmp.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
