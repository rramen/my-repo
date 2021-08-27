/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Input: s = "anagram", t = "nagaram"
Output: true

Runtime of O(n)
*/
import java.util.Map;

class validAnagram{
    public boolean isAnagram(string s, string t){
        int[] alphabet = new int[26];
        for(int i = 0; i < s.length(); i++) {alphabet[s.charAt(i) - 'a']++;}
        for(int i = 0; i < t.length(); i++) {alphabet[t.charAt(i) - 'a']--;}
        
        for(int i : alphabet) {
            if(i != 0 ) {return false;}
        }
        return true;
    }    
};