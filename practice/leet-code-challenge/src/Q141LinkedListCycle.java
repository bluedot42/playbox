import java.util.HashSet;

public class Q141LinkedListCycle {
    public boolean hasCycle(ListNode head){
        HashSet<ListNode> hashSet = new HashSet<>();

        boolean res = false;

        while(head!=null && head.next != null){
            if(hashSet.contains(head.next)){
                res = true;
                break;
            }

            hashSet.add(head);
            head = head.next;
        }

        return res;
    }
}
