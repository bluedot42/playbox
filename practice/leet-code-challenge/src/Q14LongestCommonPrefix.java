public class Q14LongestCommonPrefix {
    public void test(){
        String[] testArr = {"flower","flow","flight"};
        String[] testArr2 = {"dog","racecar","car"};
        System.out.println(solution(testArr));
        System.out.println(solution(testArr2));
    }

    public String solution(String[] strs){

        if(strs.length==0 && strs.length ==1){
            return "";
        }

        String base = strs[0];
        int index = -1;
        boolean stop = false;

        for(int i=0;i<base.length();i++){
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=base.charAt(i) || strs[j].length()<i){
                    index = i;
                    stop = true;
                    break;
                }
            }

            if(stop){
                break;
            }
        }

        if(index < 0){
            return "";
        }
        else{
            return base.substring(0,index);
        }

    }
}
