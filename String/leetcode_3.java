package String;

public class leetcode_3 {
    class Solution {
    public int lengthOfLongestSubstring(String s) {
      int count = 0;
      int l = 0;
      StringBuilder ans = new StringBuilder();
      for(int r = 0; r < s.length(); r++){
        String ch = String.valueOf(s.charAt(r));
        if(ans.indexOf(ch) != -1){
             l++;
             int idx = ans.indexOf(ch);
             ans.setLength(0);
            
        }
        ans.append(ch);
       count = Math.max(count , r-l+1);
      }
      return count;
    }
}
    
}
