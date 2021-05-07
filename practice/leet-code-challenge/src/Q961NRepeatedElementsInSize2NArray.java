import java.util.HashSet;

public class Q961NRepeatedElementsInSize2NArray {
    public void test(){
        int[] arr = {1,2,3,3};
        System.out.println(repeatedNTimes(arr));
    }

    public int repeatedNTimes(int[] A) {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        int index = 0;

        for(int i=0;i<A.length;i++){
            if(hashSet.contains(A[i])){
                index = i;
            }
            else{
                hashSet.add(A[i]);
            }
        }

        return A[index];
    }
}
