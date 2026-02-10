package LinkedList;

public class Main_DLL {
    public static void main(String[] args) {
        DLL list  = new DLL();

        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(5);
        list.display();
        list.display_rev();
    }
    
}
