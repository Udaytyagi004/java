package Math;

public class SquareRoot {
    public static void main(String[] args) {
        double a = sqrt(40,3);
        System.out.println(a);
        
    }
    static double sqrt(int n , int p){
        int start = 0;
        int end = n;
        double ans = 0.0;
        while(end>=start){
            int mid  = (start + end)/2;
            if(mid * mid == n){
                return  mid;
            }
            else if(mid * mid > n){
                end = mid - 1;
                ans = end;
               
            }
            else{
                start = mid + 1;
                
            }
        }
       double incr = 0.1;
       for(int i =0;i<p;i++){
         while( ans * ans <= n){
            ans += incr;
        }
        ans -= incr;
        incr /= 10;
       }
        return ans;
    }
    
}
