public class Q189RotateArray {
    public void test(){
        int[] arr = {1,2,3,4,5,6,7};

        rotate(arr,3);
    }

    private void rotate(int[] nums, int k){
        int[] arr = new int[nums.length];

        k = k%nums.length;

        for(int i=0;i<nums.length;i++){
            arr[i]=nums[(i-k+nums.length)%nums.length];
        }

        nums = arr;
        for(int i:arr){
            System.out.print(i);
        }

    }
}
