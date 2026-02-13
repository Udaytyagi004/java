package LinkedList_Ques;

public class Merge_two_List {


     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 public ListNode mergeLists(ListNode list1 , ListNode list2){
    ListNode ansHead = new ListNode();
    ListNode tail = ansHead;


    while(list1 != null && list2 != null){
        if(list1.val < list2.val){
            tail.next = list1;
            list1 = list1.next;
        }else{
            tail.next = list2;
            list2 = list2.next;
        }
        tail = tail.next;
    }

    while(list1 != null){
        tail.next = list1;
        list1 = list1.next;
        tail = tail.next;
    }
    while(list2 != null){
        tail.next = list2;
        list2 = list2.next;
        tail = tail.next;
    }
    return ansHead.next;
 }
    
}
