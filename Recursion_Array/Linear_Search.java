package Recursion_Array;

public class Linear_Search {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,64,3,6,9};
        System.out.println(Search(nums, 0, 19));
        
    }
    public static int Search(int[] arr , int i , int target){
        if(i == arr.length) return -1;
        if(arr[i] == target) return i;
        return Search(arr, i+1, target);
    }
    
}
