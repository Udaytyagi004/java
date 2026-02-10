package LinkedList;

public class Main {
    public static void main(String[] args) {
       LL list = new LL();
       list.insertFirst(2);
       list.insertFirst(3);
       list.insertFirst(6);
       list.insertFirst(8);
       list.insertLast(69);

       list.insert(100, 3);
    //    int del_val = list.deleteFirst();
       list.display();
    //    System.out.println("deleted value is :" + del_val);
      int del = list.delete(2);
      System.out.println(del);
      list.display();
      System.out.println(list.find(2));;
   
       
    }
    
}
