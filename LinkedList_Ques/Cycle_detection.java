package LinkedList_Ques;



public class Cycle_detection {
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public boolean isCyclePresent(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    

     public int cycleLength(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        boolean first_meet = true;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(!first_meet){
                count++;
            }
            if(slow == fast && first_meet){
                first_meet = false;
                continue;
                
            }
            if(fast == slow){
                 return count;
            }
        }
        return -1;
    }
}
