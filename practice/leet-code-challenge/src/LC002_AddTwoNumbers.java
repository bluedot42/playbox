public class LC002_AddTwoNumbers {
    public static void solution(ListNode a, ListNode b){
        ListNode res = null;
        int carry = 0;
        while(a!=null && b!=null){
            int tmp = a.val+b.val + carry;
            carry = tmp/10;
            if(res==null){
                res = new ListNode(tmp%10);
            }
            else{
                res.next = new ListNode(tmp%10);
            }
            a = a.next;
            b = b.next;
        }

        if(a==null){
            while(b.next!=null){
                int tmp = b.val + carry;
                carry = tmp/10;
                res.next = new ListNode(tmp%10);
                b=b.next;
            }
        }
        else if(b==null){
            while(a.next!=null){
                int tmp = a.val + carry;
                carry = tmp/10;
                res.next = new ListNode(tmp%10);
                a=a.next;
            }
        }

        while(res.next!=null){
            System.out.printf("%d -> ", res.val);
        }
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}