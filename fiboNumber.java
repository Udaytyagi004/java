import java.util.Scanner;

public class fiboNumber{

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n =  in.nextInt();
        // int result = fibno(n);
        // System.out.println(result);
        for(int i=0;i<11;i++){
            System.out.println(fibno(i));
        }


    }
    static int fibno(int num){
        return (int)((Math.pow(((1 + Math.sqrt(5))/2) , num) - Math.pow(((1 - Math.sqrt(5))/2) , num))/Math.sqrt(5));

    }
}