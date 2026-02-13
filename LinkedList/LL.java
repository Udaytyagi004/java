package LinkedList;

public class LL {
    public Node head;
    public Node tail;
    public int size;
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





    // Inserting the Node using recursion
    public Node insertRecursive(int val , int index){
        
        return helper(val, index, head);
    }
    public Node helper(int val , int index , Node curr){
        if(index == 0){
           return new Node(val , curr);
        }
        curr.next =  helper(val, --index, curr.next);
        return curr;
    }






// merge two sorted lists
public static void merge_list(LL list1 , LL list2){
    Node f = list1.head;
    Node s = list2.head;
    LL list = new LL();
    while(f != null && s != null){
        if(f.value < s.value){
           list.insertLast(f.value);
           f = f.next;
        }else{
            list.insertLast(s.value);
            s = s.next;
        }
    }
    while(f != null){
        list.insertLast(f.value);
        f = f.next;
    }
    while(s != null){
        list.insertLast(s.value);
        s =  s.next;
    }


    list.display();
}


// cycle length detection


 static int cycleLength(LL list){
        Node slow = list.head;
        Node fast = list.head;
        int count = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
                 do{
                    count++;
                    slow = slow.next;
                 }while(fast != slow);
                 return count;
            }
        }
        return 0;
    }




    public class Node{
        public int value;
        public Node next;

        public Node(int n){
            this.value = n;
        }
        public Node(int n , Node next){
            this.value = n;
            this.next = next;
        }

    }
    
}
