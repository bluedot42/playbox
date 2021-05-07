import java.util.*;

public class G4G_DSA_Solutions {

    /**
     * Test data
     * int[] arr = {1, 2, 3, 4, 5, 6, 7};
     * array01(arr,2);

     int [] arr = {11, 15, 6, 8, 9, 10};
     int [] arr2 = {11, 15, 26, 38, 9, 10};
     System.out.println(array06_solution02(arr,16)) ;
     System.out.println(array06_solution02(arr2,45)) ;

     int[] arr = {15, 18, 2, 3, 6, 12};
     int[] arr2 = {7, 9, 11, 12, 15};

     array09(arr);
     array09(arr2);
     int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
     int[] arr2 = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4};

     array_arrangem_rearrange_01(arr);
     array_arrangem_rearrange_01(arr2);

     int arr[] = {1, 2, 3};
     int [] arr2 = {4, 5, 1, 2};
     array_arrange_02(arr);
     array_arrange_02(arr2);
     int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
     int arr2[]  = {1, 2, 0, 0, 0, 3, 6};

     array_arrange_06(arr);
     array_arrange_06(arr2);

     int [] arr3 = {1, 2, 2, 1};
     int [] arr4 = {1, 3, 2};

     array_arrange_10(arr3);
     array_arrange_10(arr4);
     int [] arr1 = {5, 8, 1, 4, 2, 9, 3, 7, 6};
     int[] arr2 = {1, 2, 3, 4};
     array_arrange_11(arr1);
     array_arrange_11(arr2);

     int[] arr3 = {0, 1, 2, 3};
     int[] arr4 = {3, 2, 1, 0};

     array_arrange_16(arr1);
     array_arrange_16(arr2);
     array_arrange_16(arr3);
     array_arrange_16(arr4);

     int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
     int[] arr2 = {1, 2, 3, 4, 5, 6};

     array_arrange_17(arr1);
     array_arrange_17(arr2);
     int[] arr1 = {1, -1, 3, 2, -7, -5, 11, 6 };
     int[] arr2 = {-5, 7, -3, -4, 9, 10, -1, 11};

     array_arrange_20(arr1);
     array_arrange_20(arr2);

     int[] arr1 = {2, 3, 4, 5};
     int[] arr2 = {6, 4, 2, 1, 8, 3};

     array_arrange_21(arr1);
     array_arrange_21(arr2);

     int[] arr = {2, 3, 4, 5, 6};
     array_arrange_23(arr);

     int[] arr1 = {1, 9, 5, 3, 2, 6, 7, 11};
     int[] arr2 = {1, 3, 2, 4, 7, 6, 9, 10};

     array_arrange_25_solution2(arr1);
     array_arrange_25_solution2(arr2);

     int[] arr = {7, 10, 4, 3, 20, 15};
     int[] arr2 = {7, 10, 4, 3, 20, 15};

     array_order_01(arr,3);
     array_order_02(arr2,1);

     int[] arr = {10, 20, 4};
     int[] arr2 = {20, 10, 20, 4, 100};

     array_order_07_solution1(arr);
     array_order_07_solution1(arr2);
     array_order_07_solution2(arr);
     array_order_07_solution2(arr2);

     int[] arr = {10, 4, 3, 50, 23, 90};
     array_order_08_solution1(arr,3);
     array_order_08_solution2(arr,3);

     int[] A = {3, 2};
     int[] B = {1, 4};

     int[] A1= {4, 2, 5, 1};
     int[] B1= {8, 0, 3, 5};

     array_order_14_solution1(A,B,2);
     array_order_14_solution1(A1,B1,3);

     int[] arr1 = {198, 76, 544, 123, 154, 675};
     int[] arr2 = {11, 8, 5, 7, 5, 100};

     array_order_12_solution(arr1,2);
     array_order_12_solution(arr2,4);

     int[] arr = {12, 35, 1, 10, 34, 1};
     int[] arr1 = {10, 5, 10};
     int[] arr2 = {10,10,10};

     array_order_20_solution1(arr);
     array_order_20_solution1(arr1);
     array_order_20_solution1(arr2);

     int[] arr = {0, 1, 2, 6, 9};// n = 5, m = 10;
     int[] arr2 = {4, 5, 10, 11};// n = 4, m = 12;
     int[] arr3 = {0, 1, 2, 3};// n = 4, m = 5;
     int[] arr4 =  {0, 1, 2, 3, 4, 5, 6, 7, 10};// n = 9, m = 11;

     array_order_23(arr,10,5);
     array_order_23(arr2,12,4);
     array_order_23(arr3,5,4);
     array_order_23(arr4,11,9);

     int[] arr = {2, 3, 4, 5};
     int[][]q = {{0, 3, 5},{0, 2, 2}};
     array_range_11(arr, 2, q);

     int[] arr = {1, 0, 1, 0, 1, 1};
     array_range_14(arr,2,4);
     array_range_14(arr,4,5);

     int[] arr = {1, 2, 2, 3, 3, 3};
     array_range_20(arr, 0,1);
     array_range_20(arr, 1,1);
     array_range_20(arr, 0,2);
     array_range_20(arr, 1,3);
     array_range_20(arr, 3,5);
     array_range_20(arr, 0,5);

     int[] arr = {1, 1, 5, 4, 5};
     array_range_19(arr, 1,3,2);
     array_range_19(arr, 2,5,1);
     array_range_19(arr, 3,5,5);

     int[] arr = {-5, -5, 2, 2, 2, 2, 3, 7, 7, 7};
     array_range_21(arr, 0,9);
     array_range_21(arr, 4,9);

     int[] arr1 = {12, 22, 102, 194, 213, 212, 171, 4004};
     array_range_24(arr1);

     int[] arr =  {1, 4, 45, 6, 10, -8};
     array_search_03(arr,16);

     int[] arr = {7, 3, 5, 4, 5, 3, 4};
     array_search_08(arr);

     int[] arr = {-7, 1, 5, 2, -4, 3, 6};
     array_search_11(arr);

     int[] arr = {1, 2, 8, 10, 10, 12, 19};
     array_search_13(arr,0);
     array_search_13(arr,1);
     array_search_13(arr,5);
     array_search_13(arr,20);
     */
    public static void main(String[] args){

        String a = "The quick brown fox jumps over the lazy dog";
        String b = "The quick brown fox jumps over the dog";
        string_basic_02(a);
        string_basic_02(b);
    }

    /**
     * TODO
     * https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
     * https://www.geeksforgeeks.org/find-maximum-value-of-sum-iarri-with-only-rotations-on-given-array-allowed/
     * https://www.geeksforgeeks.org/find-element-given-index-number-rotations/
=>     * https://www.geeksforgeeks.org/rearrange-array-arri-arrj-even-arri/
=>     * https://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers-publish/
=>     * https://www.geeksforgeeks.org/rearrange-array-alternating-positive-negative-items-o1-extra-space/
=>     * https://www.geeksforgeeks.org/move-zeroes-end-array/
     https://www.geeksforgeeks.org/minimum-swaps-required-bring-elements-less-equal-k-together/
     https://www.geeksforgeeks.org/double-first-element-move-zero-end/
     https://www.geeksforgeeks.org/positive-elements-even-negative-odd-positions/
     https://www.geeksforgeeks.org/shuffle-a-given-array/
     https://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers/
     https://www.geeksforgeeks.org/program-for-mean-and-median-of-an-unsorted-array/
=>   https://www.geeksforgeeks.org/kth-smallest-element-in-a-row-wise-and-column-wise-sorted-2d-array-set-1/
=>   https://www.geeksforgeeks.org/k-th-largest-sum-contiguous-subarray/
=>   https://www.geeksforgeeks.org/k-maximum-sum-overlapping-contiguous-sub-arrays/
=>   https://www.geeksforgeeks.org/k-maximum-sums-non-overlapping-contiguous-sub-arrays/
     https://www.geeksforgeeks.org/find-k-numbers-occurrences-given-array/
     https://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/
     https://www.geeksforgeeks.org/k-smallest-elements-order-using-o1-extra-space/
     https://www.geeksforgeeks.org/find-k-pairs-smallest-sums-two-arrays/
     https://www.geeksforgeeks.org/k-th-smallest-absolute-difference-two-elements-array/
     https://www.geeksforgeeks.org/range-lcm-queries/
     https://www.geeksforgeeks.org/gcds-of-a-given-index-ranges-in-an-array/
     https://www.geeksforgeeks.org/range-queries-for-frequencies-of-array-elements/
     https://www.geeksforgeeks.org/count-elements-which-divide-all-numbers-in-range-l-r/
     https://www.geeksforgeeks.org/number-whose-sum-of-xor-with-given-array-range-is-maximum/
     https://www.geeksforgeeks.org/xor-numbers-appeared-even-number-times-given-range/
     https://www.geeksforgeeks.org/array-range-queries-range-queries/
     https://www.geeksforgeeks.org/number-indexes-equal-elements-given-range/
=>   https://www.geeksforgeeks.org/find-common-elements-three-sorted-arrays/
=>   https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
     */

    /*
    2018-08-08 12:00:00 OPS1 START
    2018-08-08 12:00:00 OPS1 END
    2018-08-08 12:00:00 OPS2 START
    * */

    class Operation{
        String name;
        Date start;
        Date end;
        int duration;
    }

    public static void opsCounter(String str, HashMap<String, Operation> map){
        String[] arr = str.split(" ");
        if(map.containsKey(arr[2])){

        }
    }

    public static void string_basic_02(String A){
        int[] tmp = new int[26];
        for(int i=0;i<A.length();i++){
            int v = A.charAt(i) - 'a';
            if(v>=0 && v<=25){
                tmp[v]=1;
            }
        }

        int result = 1;
        for(int i=0;i<tmp.length;i++){
            if(tmp[i]==0){
                System.out.printf("%c ",'a'+i);
            }
            result = result & tmp[i];
        }

        System.out.println(result==1?"Yes":"No");

    }

    public static void array_search_13(int[] arr, int x){
        int floor = Integer.MIN_VALUE;
        int ceiling = Integer.MIN_VALUE;

        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<=x && arr[i+1]>x)
                floor = arr[i];
            else if(arr[i]>=x && arr[i-1]<x)
                ceiling = arr[i];
        }

        if(arr[0]>=x){
            ceiling = arr[0];
            floor = -1;
        }

        if(arr[arr.length-1]<=x){
            ceiling=-1;
            floor=arr[arr.length-1];
        }

        System.out.printf("floor = %d, ceiling = %d", floor,ceiling);
    }

    public static void array_search_11(int[] arr){

        int sumLeft = 0;
        int sumRight = 0;
        for(int i=1;i<arr.length-1;i++){
            sumLeft=0;
            for(int j=0;j<i;j++){
                sumLeft+=arr[j];
            }

            sumRight=0;
            for(int j=i+1;j<arr.length;j++){
                sumRight+=arr[j];
            }

            if(sumLeft==sumRight){
                System.out.println(i);
                return;
            }
        }

        System.out.println("-1");
    }

    public static void array_search_08(int[] arr){
        int tmp = arr[0];
        for(int i=1;i<arr.length;i++){
            tmp = tmp ^ arr[i];
        }

        System.out.println(tmp);
    }

    public static void array_search_03(int[] arr, int val){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==val){
                    System.out.printf("%d + %d = %d", arr[i], arr[j], val);
                    return;
                }
            }
        }
    }

    public static void array_range_24(int[] arr){
        for(int i=0;i<arr.length;i++){
            String tmp = arr[i]+"";
            boolean noDup = true;
            for(int j=0;j<tmp.length();j++){
                if(tmp.indexOf(tmp.charAt(j))!=tmp.lastIndexOf(tmp.charAt(j))){
                    noDup = false;
                    break;
                }
            }

            if(noDup){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void array_range_21(int[] arr, int l, int r){
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i=l;i<=r;i++){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else{
                hashMap.put(arr[i],1);
            }
        }

        int tmp = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> e:hashMap.entrySet()){
            tmp = Math.max(tmp, e.getValue());
        }

        System.out.println(tmp);
    }

    public static void array_range_19(int[] arr, int l, int r, int x){
        Set<Integer> set = new HashSet<>();

        for(int i=l-1;i<=r-1;i++){
            set.add(arr[i]);
        }

        System.out.println(set.contains(x)?"Yes":"No");
    }

    public static void array_range_20(int[] arr, int l, int r){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=l;i<=r;i++){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else{
                hashMap.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer, Integer> e: hashMap.entrySet()){
            if(e.getKey()==e.getValue())
                System.out.print(e.getKey()+" ");
        }

    }

    public static void array_range_14(int[] arr, int l, int r){
        String res="";
        for(int i=l;i<=r;i++){
            res+=arr[i];
        }

        System.out.println(Integer.parseInt(res,2));
    }

    public static void array_range_11(int[] arr, int n, int[][] q){
        for(int i=0;i<n;i++){
            for(int j=q[i][0];j<=q[i][1];j++){
                if(arr[j]<=q[i][2]){
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void array_order_23(int[] arr, int m, int n){
        int[] tmp = new int[m];
        Arrays.fill(tmp, -1);

        for(int i=0;i<n;i++){
            tmp[arr[i]] = 1;
        }

        for(int i=0;i<m;i++){
            if(tmp[i]==-1){
                System.out.println(i);
                return;
            }
        }
    }

    public static void array_order_20_solution1(int[] arr){
        int[] res = new int[2];
        Arrays.fill(res,Integer.MIN_VALUE);

        for(int i=0;i<arr.length;i++){
            if(arr[i]>res[0]){
                int tmp = res[1];
                res[1]=res[0];
                res[0]=arr[i];
            }
            else if(arr[i]>res[1]){
                res[1]=arr[i];
            }
        }

        System.out.println(res[1]);
    }

    public static void array_order_14_solution1(int[] arrA, int[] arrB, int k){
        int [] tmp = new int[arrA.length*2];

        for(int i=0;i<arrA.length;i++){
            for(int j=0;j<arrB.length;j++){
                tmp[i+j] = arrA[i]+arrB[j];
            }
        }

        Arrays.sort(tmp);

        for(int i=tmp.length-1;i>tmp.length-1-k;i--){
            System.out.print(tmp[i]+" ");
        }
    }

    public static void array_order_12_solution(int[] arr, int k){
        Arrays.sort(arr);
        int tmp = 1;
        for(int i=0;i<k;i++){
            tmp*=arr[i];
        }
        System.out.println(tmp);
    }

    public static void array_order_08_solution2(int[] arr, int k){
        k = 3;
        int[] res = new int[3];
        Arrays.fill(res,Integer.MIN_VALUE);

        for(int i=0;i<arr.length;i++){
            if(arr[i]>res[0]){
                res[2]=res[1];
                res[1]=res[0];
                res[0]=arr[i];
            }
            else if(arr[i]>res[1]){
                res[2]=res[1];
                res[1]=arr[i];
            }
            else if(arr[i]>res[2]){
                res[2] = arr[i];
            }
        }

        System.out.println(Arrays.toString(res));
    }

    public static void array_order_08_solution1(int[] arr, int k){
        Arrays.sort(arr);

        for(int i=arr.length-k;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void array_order_07_solution2(int[] arr){
        int tmp = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            tmp = arr[i]>tmp?arr[i]:tmp;
        }

        System.out.println(tmp);
    }

    public static void array_order_07_solution1(int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }

    public static void array_order_06_solution1(int[][] arr, int k){

    }

    public static void array_order_02(int[] arr, int k){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-k]);
    }

    public static void array_order_01(int[] arr, int k){
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }

    //TODO: incorrect
    public static void array_arrange_25_solution2(int[] arr){
        int indexOdd = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                if(indexOdd==-1)
                    indexOdd = i;
            }
            else{
                int tmp = arr[indexOdd];
                arr[indexOdd] = arr[i];
                arr[i] = tmp;
                indexOdd = i;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void array_arrange_25(int[] arr){
        int[] res = new int[arr.length];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                res[index++]=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                res[index++]=arr[i];
            }
        }

        System.out.println(Arrays.toString(res));
    }

    public static void array_arrange_23(int[] arr){
        int [] res = new int[arr.length];
        int prev = 1;
        int next = 1;
        for(int i=0;i<arr.length;i++){
            if(i-1>=0)
                prev = arr[i-1];
            else
                prev = arr[0];
            if(i+1<arr.length)
                next = arr[i+1];
            else
                next = arr[i];
            res[i] = prev*next;
        }

        System.out.println(Arrays.toString(res));
    }

    public static void array_arrange_21(int[] arr){
        Arrays.sort(arr);

        for(int i=1;i<arr.length-2;i=i+2){
            int tmp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=tmp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void array_arrange_20(int[] arr){
        int[] tmp = new int[arr.length];
        int[] tmpNeg = new int[arr.length];
        int posCount = 0;
        int posNeg = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                tmp[posCount++] = arr[i];
            }
            else{
                tmpNeg[posNeg++] = arr[i];
            }
        }

        for(int i=0;i<posNeg;i++){
            tmp[posCount++] = tmpNeg[i];
        }
        System.out.println(Arrays.toString(tmp));
    }

    public static void array_arrange_17(int[] arr){
        int l=0;
        int r=arr.length-1;
        int index = 0;
        int[] tmp = new int[r];
        while(l<r){
            if((index+1)<arr.length)
                tmp[index++] = arr[r--];
            if((index+1)<arr.length)
                tmp[index++] = arr[l++];
        }


        System.out.println(Arrays.toString(tmp));
    }

    public static void array_arrange_16(int[] arr){
        int[] tmp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            tmp[arr[i]]=i;
        }

        System.out.println(Arrays.toString(tmp));
    }

    public static void array_arrange_15(Integer[] arr){
        Arrays.sort(arr, new Comparator<Integer>(){

            @Override
            public int compare(Integer a, Integer b) {
                Integer ab=Integer.parseInt(a+""+b);
                Integer ba=Integer.parseInt(b+""+a);
                return ab.compareTo(ba) > 0 ? 1:-1;
            }
        });
    }

    public static void array_arrange_11(int[] arr){
        Arrays.sort(arr);

        int[] tmpArr = new int[arr.length];
        int l=0;
        int r=arr.length-1;
        int index = 0;
        while(l<r){
            tmpArr[index++] = arr[l++];
            tmpArr[index++] = arr[r--];
        }

        System.out.println(Arrays.toString(tmpArr));
    }

    public static void array_arrange_10(int[] arr){
        Arrays.sort(arr);

        for(int i=1;i<=arr.length-2;i=i+2){
            int tmp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=tmp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void array_arrange_06(int[] arr){
        int index = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=0) {
                if(index!=i && arr[index]==0){
                    arr[index++]=arr[i];
                    arr[i]=0;
                }
                else{
                    index++;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void array_arrange_02(int[] arr){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int tmp = arr[l];
            arr[l]=arr[r];
            arr[r]=tmp;
            l++;
            r--;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void array_arrangem_rearrange_01(int[] arr){
        Set<Integer> hset = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hset.add(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            if(hset.contains(i)){
                arr[i]=i;
            }
            else{
                arr[i]=-1;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void array09(int[] arr){
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                k=i+1;
                break;
            }
        }

        System.out.println(k);
    }

    public static boolean array06_solution01(int[] arr, int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean array06_solution02(int[] arr, int sum){
        HashSet<Integer> hset = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hset.add(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            if(hset.contains(sum-arr[i])){
                return true;
            }
        }

        return false;
    }

    public static void array04(int[] arr){
        int tmp = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }

        arr[arr.length-1]=tmp;

        System.out.println(Arrays.toString(arr));
    }

    public static void array01(int[] arr, int n){
        int[] tmpArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i+n<arr.length){
                tmpArr[i]=arr[i+n];
            }
            else{
                tmpArr[i]=arr[n+i-arr.length];
            }
        }

        System.out.println(Arrays.toString(tmpArr));
    }
}
