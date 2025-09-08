package Math;

public class Sieve {
    public static void main(String[] args) {
        int n = 40;
        boolean[] nums = new boolean[n+1];
        sieve(n, nums);
        
    }
    public static void sieve(int n , boolean[] arr)
{
    for(int i =2; i*i<=n; i++){
        if(!arr[i]){
            for(int j = 2*i;j<n;j += i){
                arr[j] = true;
            }
        }
    }
    for(int i = 2; i<n;i++){
        if(!arr[i]) System.out.println(i);
    }

}    
}   
