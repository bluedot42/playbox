import java.util.HashSet;
import java.util.Iterator;

public class Q83RemoveDuplicatesFromSortedLinkedList {

    public void test(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);

        ListNode node5 = new ListNode(3);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        deleteDuplicates(node1);
    }

    public ListNode deleteDuplicates(ListNode head) {
//        HashSet<Integer> hashSet = new HashSet<Integer>();
        ListNode curr = head;
        while(curr !=null && curr.next !=null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }

        return head;

    }
}