package Stack;

public class CustomStack {

    protected int[] data;
    private int ptr = -1;
    private static final int DEFAULT_SIZE = 10;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }
    

    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public boolean push(int val) throws Exception{
        if(isFull()){
            throw new  Exception("Stack OverFlow");
        }
        data[++ptr] = val;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return data[ptr--];
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return data[ptr];
    }

    public void display(){
        for(int i = ptr; i >= 0; i--){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
