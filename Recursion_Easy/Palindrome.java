package Recursion_Easy;

public class Palindrome {
    public static void main(String[] args) {
        String s1 = "abcba";
        System.out.println(isPalin(s1, 0, s1.length()-1));
        
    }
    public static boolean isPalin(String str , int s , int e){
        if(s>e) return true;
        if(str.charAt(s) != str.charAt(e))   return false;
        return isPalin(str, s+1, e-1);   
    }
    
}
