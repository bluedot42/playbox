public class Q198HouseRobber {
    public void test(){
        int[] arr = {1,2};

        System.out.println(rob(arr));
    }

    public int rob(int[] nums){
        int a = 0;
        int b = 0;
        int index = 0;
        while(index<nums.length){
            if(index%2==0){
                a+=nums[index];

                if(index+1<nums.length){
                    b+=nums[index+1];
                }
            }

            index++;
        }

        return a>b?a:b;
    }
}
