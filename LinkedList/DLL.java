package LinkedList;

public class DLL {
   private Node head;

  public void insertFirst(int val){
    Node node = new Node(val);
    node.next = head;
    node.prev = null;
    if(head != null){
        head.prev = node;
    }
    head = node;
  }
  public void display(){
     Node temp = head;
     while(temp != null){
        System.out.print(temp.val + " => ");
        temp = temp.next;
     }
     System.out.println("END");
  }
  public void display_rev(){
    Node node = head;
    while(node.next != null){
       node = node.next;
    }
    while(node != null){
        System.out.print(node.val + " <= ");
        node = node.prev;
    }
    System.out.println("START");
  }




    public class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
        Node(int val , Node next  , Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    
}
