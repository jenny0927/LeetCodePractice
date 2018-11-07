package firstUniqueCharacter;

import java.util.HashMap;

public class firstuniqueCharacter {

	public static void main(String[] args) {
		// System.out.println("Hello World!");
		String s = "blloomberg";
		int k = 2;
		System.out.println("string: " + s);
		System.out.println("First unique character index: " + FirstUniqChar(s));
		System.out.println(k  + "th unique character: "+  KthUniqChar(s, k));
		System.out.println("First unique character: " +FirstUniq(s));
	}
	
	// return first unique character index
	public static int FirstUniq(String s) {
		if (s == null)
			return -1;

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (map.containsKey(letter))
				map.put(letter, map.get(letter) + 1);
			else
				map.put(letter, 1);
		}

		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (map.get(letter) == 1)
				return i;
		}
		return -1;
	}
	
	// return first unique character 
	public static char FirstUniqChar(String s) {
		if (s == null)
			return ' ';

		HashMap<Character, Integer> table = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (table.containsKey(letter))
				table.put(letter, table.get(letter) + 1);
			else
				table.put(letter, 1);
		}

		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (table.get(letter) == 1) {
					return letter;
			}
		}
		return ' ';
	}
	
	// return kth unique character index
	public static char KthUniqChar(String s, int k) {
		if (s == null)
			return ' ';

		HashMap<Character, Integer> table = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (table.containsKey(letter))
				table.put(letter, table.get(letter) + 1);
			else
				table.put(letter, 1);
		}

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (table.get(letter) == 1) {
				count += 1;
				if (count == k)
					return letter;
			}
		}
		return ' ';
	}

}