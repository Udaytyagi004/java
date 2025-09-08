package Math;

public class PrimeNo {
    public static void main(String[] args) {
        
        boolean ans = isPrime(0);
        System.out.println(ans);
    }
    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        int c = 2;
        while( c * c <= n){
            if(n%c == 0){
                return false;
            }
            c++;

        }
        return true;

    }
    
}
