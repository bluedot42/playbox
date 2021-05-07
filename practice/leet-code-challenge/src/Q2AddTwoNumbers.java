public class Q2AddTwoNumbers{

    public void test(String[] args){
        ListNode l1 = new ListNode(2);
        ListNode l11= new ListNode(4);
        ListNode l12= new ListNode(3);

        l1.next = l11;
        l11.next = l12;

        ListNode l2 = new ListNode(5);
        ListNode l21= new ListNode(6);
        ListNode l22= new ListNode(4);
        l2.next=l21;
        l21.next=l22;

        // AddTwoNumbersSolution1 solution1 = new AddTwoNumbersSolution1();
        AddTwoNumbersSolution3 solution1 = new AddTwoNumbersSolution3();
        ListNode l3 = solution1.addTwoNumbers(l1, l2);

        while(l3!=null){
            System.out.print(l3.val+"->");
            l3 = l3.next;
        }
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {val = x;}
}

//invalid, size of linkedlist is limited to long/int sum size
class AddTwoNumbersSolution3{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){

        int pos = 0;
        long sum = 0;

        while(l1!=null){
            sum += l1.val*Math.pow(10,pos);
            l1 = l1.next;
            pos++;
        }

        pos = 0;
        while(l2!=null){
            sum += l2.val*Math.pow(10,pos);
            l2=l2.next;
            pos++;
        }

        String sl1 = String.valueOf(sum);

        ListNode head = null;
        ListNode curr = head;

        for(int i=sl1.length()-1;i>=0;i--){
            ListNode ln = new ListNode(Character.getNumericValue(sl1.charAt(i)));
            if(head == null){
                head = ln;
                curr = head;
            }else{
                curr.next = ln;
                curr = ln;
            }
        }

        return head;
    }
}

class AddTwoNumbersSolution2{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int flag = 0;

        while(l1!=null && l2!=null){
            int tmp = l1.val + l2.val + flag;
            if(tmp>=10){
                flag = 1;
                l1.val = tmp - 10;
            }
            else{
                l1.val = tmp;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

    return null;

    }
}

class AddTwoNumbersSolution1{

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode res = null;
        ListNode head = res;
        ListNode curr = res;

        int flag = 0;

        while(l1!=null && l2!=null){

            ListNode nextNode = new ListNode(0);

            if(res == null){
                res = nextNode;
                curr = res;
                head = res;
            }

            curr.next = nextNode;
            curr = curr.next;
            
            int tmp = l1.val + l2.val + flag;
            int remainer = 0;

            if(tmp>=10){
                flag=1;
                remainer = tmp-10;
            }else{
                remainer = tmp;
                flag = 0;
            }

            tmp = 0;
            
            curr.val = remainer;

            l1 = l1.next;
            l2 = l2.next;
            
        }

        if(l1==null){
            while(l2!=null){
                ListNode nextNode = new ListNode(0);
                curr.next = nextNode;
                curr = curr.next;
                int tmp = l2.val + flag;
            int remainer = 0;

            if(tmp>=10){
                flag=1;
                remainer = tmp-10;
            }else{
                remainer = tmp;
                flag = 0;
            }

            tmp = 0;
                
                curr.val = remainer;
    
                l2 = l2.next;
                
            }
        }
        else if(l2==null){
            while(l1!=null){
                ListNode nextNode = new ListNode(0);
                curr.next = nextNode;
                curr = curr.next;

                int tmp = l1.val + flag;
                int remainer = 0;
    
                if(tmp>=10){
                    flag=1;
                    remainer = tmp-10;
                }else{
                    remainer = tmp;
                    flag = 0;
                }
    
                tmp = 0;
                
                curr.val = remainer;
    
                l1 = l1.next;
            }
        }

        if(flag!=0){
            res.val = flag;
        }

        return head;
    }
}
