package Searching;

public class Revere_String {
    public static void main(String[] args) {
        String str = "uday";
        StringBuilder rev = new StringBuilder();
        for(int i = str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            rev.append(ch);
        }
        System.out.println(rev);
    }
    
}
