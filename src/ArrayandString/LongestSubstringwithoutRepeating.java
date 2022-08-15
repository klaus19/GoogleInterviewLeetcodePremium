package ArrayandString;

import java.util.HashSet;

public class LongestSubstringwithoutRepeating {

    public int longestSubstring(String s){


      // "abcabcbb"

        int count=0;
        int i=0;
        int j=0;

        HashSet<Integer>set = new HashSet<>();

        while (j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add((int) s.charAt(j));
                j++;
                count  =Math.max(set.size(),count);
            }else {
                set.remove(s.charAt(j));
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LongestSubstringwithoutRepeating lsd = new LongestSubstringwithoutRepeating();
        String str = "abcabcbb";
        System.out.println(lsd.longestSubstring(str));
    }
}
