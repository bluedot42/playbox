import java.util.Arrays;

public class Q169MajorityElement {
    public void test(){
        int[] arr = {3,2,3};

        System.out.println(majorityElement(arr));
    }

    private int majorityElement(int[] nums){
        Arrays.sort(nums);

        return nums[nums.length/2];
    }
}
