import java.util.Arrays;

public class LC344_ReverseString {
    public String reverseString(String s){
//        String res = "";
        char[] in = s.toCharArray();
        char[] res = new char[s.length()];
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            res[left] = in[right];
            res[right] = in[left];
            left++;
            right--;
        }
        if(left==right){
            res[left]=in[left];
        }

        return String.valueOf(res);
    }

    public String reverseStringSolution2(String s){
        String res = "";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }

        return res;
    }
}
