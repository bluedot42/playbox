public class Q1TwoSum{
    public void test(String[] args){
        int[] nums = {3,2,11,7};

        int[] result = twoSum(nums,9);

        System.out.println(result[0]+" "+result[1]);
    }

    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target == nums[i]+nums[j]){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
        }

        return result;
    }
}