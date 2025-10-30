package Recursion_Array;

public class RotatedBS {
     public static void main(String[] args) {
       int[] nums = {5,6,1,2,3,4};
       int ans = search(nums , 0 , nums.length - 1, 6);
       System.out.println(ans);
    }
    public static int search(int[] arr , int start , int end , int target){
        if(start > end ) return -1;
        int mid = (start + end)/2;
        if(arr[mid] == target) return mid;
        
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target < arr[mid]) return search(arr, start , mid-1 , target);
            else return search(arr , mid+1 , end , target);
        }
        if(target > arr[mid] && target <= arr[end]) return search(arr , mid+1 , end , target);
        return search(arr, start , mid-1 , target);
        
        
    }
    
}
