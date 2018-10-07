import java.util.HashMap;
/*
 * 387. First Unique Character in a String
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	Examples:
	s = "leetcode"
	return 0.
	
	s = "loveleetcode",
	return 2.
	Note: You may assume the string contain only lowercase letters.
 */
class Solution {
    public int firstUniqChar(String s) { 
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i= 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if(map.containsKey(letter)) map.put(letter,map.get(letter) +1);
            else map.put(letter,1);
            
        }
        for(int i = 0; i<s.length(); i++){
            char letter = s.charAt(i);
            if(map.get(letter) ==1) return i;
        }
        return -1;
    }
}