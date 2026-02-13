package LinkedList;

public class Main_CLL {

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertLast(12);
        list.insertLast(15);
        list.insertLast(20);
        list.insertLast(24);
        list.insertLast(34);
        list.display();
        list.delete(12);
        list.display();
    }

    
}
