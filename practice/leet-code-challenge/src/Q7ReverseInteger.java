public class Q7ReverseInteger {

    public void test(){

        System.out.println(reverse(-123));
        System.out.println(reverse(-120));
        System.out.println(reverse(123));
        System.out.println(reverse(9876));

    }

    private int reverse(int x){

        if(x+1==Integer.MIN_VALUE){
            return 0;
        }
        else{
            String tmp = new Integer(x).toString();
            char[] chars = tmp.toCharArray();

            StringBuilder stringBuilder = new StringBuilder();
            int left = 0;
            int right = chars.length-1;

            if(tmp.charAt(0) == '-') {
                stringBuilder.append('-');
                left++;
            }

            while(left<right){
                char tmpChar = chars[left];
                chars[left] = chars[right];
                chars[right] = tmpChar;
                left++;
                right--;
            }

            return Integer.parseInt(new String(chars));
        }
    }
}
