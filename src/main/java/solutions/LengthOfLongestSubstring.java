package solutions;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring{
    public int solution(String s) {
        Set<Character> window = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++){
            if(!window.contains(s.charAt(right))){
                window.add(s.charAt(right));
                maxLength = Math.max(maxLength, right-left+1);
            }
            else{
                while(s.charAt(left) != s.charAt(right)){
                    window.remove(s.charAt(left));
                    left++;
                }
                window.remove(s.charAt(left));left++;
                window.add(s.charAt(right));
            }
        }
        return maxLength;
    }
}
