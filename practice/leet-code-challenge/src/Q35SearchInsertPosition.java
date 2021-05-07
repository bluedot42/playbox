public class Q35SearchInsertPosition {
    public void test(){

        int[] nums = {1,3,5,6};
        int target =6;

        System.out.println(searchInsert(nums,target));
    }

    public int searchInsert(int[] nums, int target){
        int res = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                res = i;
            }else if(i+1<=nums.length-1){
                if(nums[i]<target && nums[i+1]>target){
                    res = i+1;
                }
            }else if(i+1==nums.length){
                if(nums[i]<target){
                    res = nums.length;
                }
            }
        }

        if(nums[0]>target){
            res = 0;
        }

        return res;
    }
}
