package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    public void insertLast(int val){
       if(tail == null){
        insertFirst(val);
        return;
       }
       Node node = new Node(val);
       tail.next = node;
       tail = node;
       size += 1;
   }
   public void insert(int  val , int idx){
      if(idx == 0){
        insertFirst(val);
        return;
      }
      if(idx == size){
        insertLast(val);
        return;
      }
      
      Node temp = head;
      for(int i = 1; i < idx; i++){
          temp = temp.next;

      }
      Node node = new Node(val , temp.next);
      temp.next = node;
      
   }
    public void display(){
        Node temp = head;
        while(temp != null){
          System.out.print(temp.value + " => ");
          temp = temp.next;
        }
        System.out.println();
    }
    public Node get_node(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null) tail = null;
        size--;
        return val;
    }
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        int val = tail.value;
        tail = get_node(size-2);
        tail.next = null;
        size--;
        return val;
    }
    public int delete(int idx){
        if(idx == 0) return deleteFirst();
        if(idx == size-1) return deleteLast();

        Node prev = get_node(idx - 1);
        Node cur = get_node(idx);
        prev.next = prev.next.next;

        return cur.value;
    }

    // finding the node that conatains the particular value 
    public Node find(int val){
        Node node =  head;
        while(node.next != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return node;
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int n){
            this.value = n;
        }
        public Node(int n , Node next){
            this.value = n;
            this.next = next;
        }

    }
    
}
