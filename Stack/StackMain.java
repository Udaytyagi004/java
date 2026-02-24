package Stack;

import javax.management.Query;

public class StackMain {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());;
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        CustomQueue q = new CustomQueue();
        q.insert(5);
        q.insert(15);
        q.insert(25);
        q.insert(35);

        // System.out.println(q.delete());
        // System.out.println(q.delete());
        q.display();
        stack.display();
    }

    
}
