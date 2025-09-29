package Recursion_Array;

import java.util.ArrayList;

public class Linear_Search {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,64,3,6,9,3};
         System.out.println(Search2(nums, 0, 3));
        
    }
    public static int Search(int[] arr , int i , int target){
        if(i == arr.length) return -1;
        if(arr[i] == target) return i;
        return Search(arr, i+1, target);
    }

    //FOR MULTIPLE OCCURENCES WE CAN RETURN AN LIST , JUST SIMPLY ADD THE INDEX IN THE LIST IF TARGET IS FOUND UNTILL WE REACH THE END , AND IN THE END RETURN THE LIST
    // static ArrayList<Integer> list = new ArrayList<>();
    public static  ArrayList<Integer> Search1(int[] arr , int i , int target , ArrayList<Integer> list){
        if(i == arr.length) return list;
        if(arr[i] == target) list.add(i);
        return Search1(arr, i+1, target , list);
    }

 // this approach is not optimize 
     public static ArrayList<Integer> Search2(int[] arr , int i , int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length) return list;
        if(arr[i] == target)  list.add(i);
        ArrayList<Integer> ansFromBelowCalls = Search2(arr, i+1, target);
        list.addAll(ansFromBelowCalls);
        return  list;
    }
    
}
