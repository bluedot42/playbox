public class LC001_TwoSum {

    public static void main(String[] args){
        int[] data = {2,7,11,15};
        twoSum(data, 9);
    }

    public static void twoSum(int[] data, int out){

        for(int i=0;i<data.length;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[i]+data[j]==out){
                    System.out.printf("{%d, %d}", i+1, j+1);
                    return;
                }
            }
        }
    }
}
