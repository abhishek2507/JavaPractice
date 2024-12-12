package Day4.arrays;

import java.util.HashMap;

public class LongestSubstringWORepeating {

    public static int lenOfLongSubStr (String s) {
        HashMap<Character,Integer> store = new HashMap<>();
        int left = 0, right = 0;
        int length = 0;
        while(right < s.length()){
            left = Math.max(store.getOrDefault(s.charAt(right),-1)+1,left);
            store.put(s.charAt(right),right);
            length= Math.max(length,right-left+1);
            right++;
        }
        return length;
    }

    public static void  main(String[] args){
        System.out.println(new LongestSubstringWORepeating().lenOfLongSubStr("abcabcbb"));
    }
}
