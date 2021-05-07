public class Q27RemoveElement {
    public void test(){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println(removeElement(nums,val));
    }

    public int removeElement(int[] nums, int val){

        int res = nums.length;

        for(int i=0;i<res;i++){
            if(nums[i]==val){

                for(int j=i;j<res;j++){
                    nums[j]=nums[j+1];
                }

                i=i-1;
            }
        }

        return res;
    }
}
