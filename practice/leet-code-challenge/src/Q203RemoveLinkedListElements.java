public class Q203RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val){
        ListNode curr = head;

        if(head!=null && head.next==null){
            if(head.val == val){
                return null;
            }else{
                return head;
            }
        }

        while(curr !=null){

            if(curr == head && curr.next!=null){
                if(curr.val == val){
                    head = curr.next;
                    curr = head;
                }
                else{
                    curr = curr.next;
                }
            }
            else if(curr == head && curr.next == null){
                if(curr.val == val){
                    return null;
                }
                else{
                    return curr;
                }
            } else{
                if(curr.next == null){

                }else{
                    if(curr.next.val == val){
                        curr.next = curr.next.next;
                    }

                    curr = curr.next;
                }

            }
        }

        return head;
    }
}
