import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class longestPalindrome {
    public String longestPal(String s) {
        if(s == null || s.length() == 1) return "";
        int start = 0, end = 0;

        for(int i = 0; i < s.length(); i++) {
            
        }

    }
    
    public int expander(String s, int left, int right) {
        if(s == null || left > right) return 0;
        while((left >= 0 && right < s.length()) && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left + 1;
    }
}
