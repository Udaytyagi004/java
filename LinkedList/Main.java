package LinkedList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
      //  LL list = new LL();
      //  list.insertFirst(2);
      //  list.insertFirst(3);
      //  list.insertFirst(6);
      //  list.insertFirst(8);
      //  list.insertLast(69);
      //  list.display();

      //  list.insertRecursive(100, 3);
    //    int del_val = list.deleteFirst();  
     
      //  list.display();
    //    System.out.println("deleted value is :" + del_val);
      // int del = list.delete(2);
      // System.out.println(del);
      // list.display();
      // System.out.println(list.find(2));;
   

      // LL list1 = new LL();
      // LL list2 = new LL();

      // list1.insertLast(11);
      // list1.insertLast(2);
      // list1.insertLast(4);
      // list1.display();

      // list2.insertLast(1);
      // list2.insertLast(3);
      // list2.insertLast(4);
      // list2.display();

      // LL.merge_list(list1 , list2);
       


      LL list = new LL();
      list.insertLast(1);
      list.insertLast(2);
      list.insertLast(3);
      list.insertLast(4);
      // list.insertLast(5);
      // list.insertLast(6);
      // list.insertLast(7);
      list.insertLast(8);
      list.display();
      LL.Node n = list.find(4);
      list.tail.next = list.head;
      int a = LL.cycleLength(list);
      System.out.println(a);

    }
    
}
