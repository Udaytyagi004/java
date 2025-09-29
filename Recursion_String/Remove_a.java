package Recursion_String;

public class Remove_a {
    public static void main(String[] args) {
        fun("", "baccdaswea");
        
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
    
}
