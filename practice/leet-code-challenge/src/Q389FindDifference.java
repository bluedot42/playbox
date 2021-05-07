public class Q389FindDifference {
    public void test(){

        String s = "abcf";
        String t = "abcfe";

        System.out.println(findTheDifference(s,t));
    }

    public char findTheDifference(String s, String t) {
        char[] a = (s+t).toCharArray();
        int res = 0;

        for(int i=0;i<a.length;i++){
            res = res ^ a[i];//Character.getNumericValue(a[i]);
        }

        return (char)res;
    }
}
