package Recursion_String;

public class Remove_a {
    public static void main(String[] args) {
    //    System.out.println( fun2("baccdaswea"));
    System.out.println(skipApple("absdapplewqr"));
        
    }
    public static void fun(String ans , String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a') {
            fun(ans, str.substring(1));
        }
        else{
            fun(ans + ch , str.substring(1));
        }
    }
     public static String fun2( String str){
        if(str.isEmpty()){
            
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a') {
           return  fun2(str.substring(1));
        }
        else{
          return  ch + fun2( str.substring(1));
        }
    }
    public static String skipApple( String str){
        if(str.isEmpty()){
            
            return "";
        }
        char ch = str.charAt(0);
        if(str.startsWith("apple")) {
           return  skipApple(str.substring(5));
        }
        else{
          return  ch + skipApple( str.substring(1));
        }
    }
    
}
