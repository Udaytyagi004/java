package Searching;

public class Binary_Search {
    public static void main(String[] args) {
        int[] nums = {2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,35,40,45,50,55,60,65,66,70,72,74,76,78,80};
        int start = 0;
        int end = 1;
        int target = 74;
        while(nums[end] < target){
            int temp = end + 1;
            end = end + (end - start + 1);
            start = temp;

        }
        int ind = binarySearch(nums,target,start,end);
        System.out.println(ind);
    }
    public static int binarySearch(int[] a , int t, int start, int end){
        int mid = start + (end - start)/2;
        if(start > end) return -1;
        if(a[mid] == t) return mid;
        if(a[mid] > t) return binarySearch(a, t, start, mid -1);
        return binarySearch(a, t, mid+1, end);


    }
    
}
