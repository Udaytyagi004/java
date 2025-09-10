package Math;

public class NewtonMethod {
    public static void main(String[] args) {
        int n =36;
        System.out.println(sqrt(40));

       

        }
        static double sqrt(double n){
            double x = n;
            double root;
            while(true){
                 root = (x +(n/x))/2;
                if(Math.abs(root - x )<0.50){
                    break;
                }
                x = root;
            }
            
            return root;
           
        }
    }
    

