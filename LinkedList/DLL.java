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

  public void insert(int val , int idx){
    if(idx == 0){
        insertFirst(val);
        return;
    }
    Node node = get_node(idx - 1);
    Node new_node = new Node(val , node.next);
    new_node.prev = node;
    node.next = new_node;
    new_node.next.prev = new_node;


  }

  public void insertLast(int val){
    if(head == null){
        insertFirst(val);
        return;
    }
    Node last = head;
    while(last.next != null){
        last = last.next;
    }
    Node node = new Node(val);
    last.next = node;
    node.next = null;
    node.prev = last;
    last = node;
  }
 public Node get_node(int index){
    Node temp = head;
    for(int i = 0;i < index; i++){
        temp = temp.next;
    }
    return temp;
 }



    public class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
        Node(int val , Node next){
            this.val = val;
            this.next = next;
            
        }
        Node(int val , Node next  , Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    
}
