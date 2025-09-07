package Bitwise_operator;
// we have an array where every element occurs twice except one find that number
public class UniqueNumber {
    
 /**
 *
 */
public static void main(String[] args) {
    int[] arr = {2,3,4,1,2,1,3,9,4};
 int ans = 0;
 for(int n : arr){
    ans = ans^n;
 }
 System.out.println(ans);
}
}
