package Recursion_Array;

public class IsSortedArray {
    public static void main(String[] args) {
        int[] nums = {10,2,4,4,7,9};
        System.out.println(isSort(nums, 0));
        
    }
    public static boolean isSort(int[] arr , int s){
        if(s == arr.length -1) return true;
         boolean a = false;
          if(arr[s] <= arr[s+1])  { 
            a = true;
          }
       return a && isSort(arr, s+1);
    }
    
}
