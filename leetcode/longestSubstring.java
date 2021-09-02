import java.util.HashMap;
import java.util.Map;

/*
Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "dvdf"
Output: 3
Explanation: The answer is "vdf", with the length of 3.
*/
public class longestSubstring {
    public int lengthSubString(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int count = 0;
        int j = 0;
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), i);
            count = Math.max(count, i-j+1);
        }
        return count;
    }
}
