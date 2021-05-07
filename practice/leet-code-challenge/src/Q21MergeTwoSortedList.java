public class Q21MergeTwoSortedList {
    public void test(){

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;

        l4.next = l5;
        l5.next = l6;

        ListNode res = mergeTwoSortedList(l1,l4);
        while(res!=null){
            System.out.print(res.val+"-");
            res = res.next;
        }
    }

    public ListNode mergeTwoSortedList(ListNode l1, ListNode l2){

        ListNode result = null;
        ListNode curL1 = l1;
        ListNode curL2 = l2;

        if(l1 == null && l2==null){
            result = null;
        }

        while(l1!=null && l2!=null ){
            if(l2.val >= l1.val && l2.val <= l1.next.val){
                curL2 = curL2.next;
                curL2.next = curL1.next;
                curL1.next = curL2;
            }
            else{

            }
        }

        if(curL1==null){
            while(curL2 != null){
                result.next = curL2;
                curL2 = curL2.next;
            }
        }

        if(curL2==null){
            while(curL1 != null){
                result.next = curL1;
                curL1 = curL1.next;
            }
        }

        return result;
    }
}
