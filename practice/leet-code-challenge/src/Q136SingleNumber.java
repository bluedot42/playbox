public class Q136SingleNumber {
    public void test(){
        int[] nums = {4,1,2,2,1};
        System.out.println(singleNumber(nums));
    }

    public int singleNumber(int[] nums) {

        int res = 0;

        for(int i=0;i<nums.length;i++){
            res = res ^ nums[i];
        }

        return res;
    }
}
