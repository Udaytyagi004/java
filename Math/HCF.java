package Math;

public class HCF {
    public static void main(String[] args) {
        int ans = hcf(21,7);
        System.out.println(ans);
        System.out.println(lcm(10,25));
        
    }
    public static int hcf(int a, int b){
        if(a == 0){
            return b;

        }
        return hcf(b%a ,a);
    }
    public static int lcm(int a, int b){
        return (a*b)/hcf(a,b);

    }
    
}
