import java.util.HashMap;

public class StoneAndJewels {

	public static void main(String[] args) {
		// System.out.println("Hello World!");
		String S = "aAAbbbbB";
		String J = "aA";
			System.out.println("How many jewlry in your hand: "	+ numJewelsInStones(J,S));
	}
    public static int numJewelsInStones(String J, String S) {
        if(J == null || S == null) return -1;
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        //put all unique character to hashmap
        for(int i = 0; i < J.length(); i++){
            char letter = J.charAt(i);
            map.put(letter,0);
            
        }
        //print out map key and value
        for(Character key : map.keySet()){
        	System.out.println("key " + key + ", value " + map.get(key));
        }
        //count the jewels in my hand
        for(Character i : S.toCharArray()){
        	if(map.containsKey(i)) {
        		//map.put(i, map.get(i)+1);
        		count ++;
        	}
        	
        }
//        
//        for(Character key : map.keySet()){
//        	System.out.println("key " + key + ", value " + map.get(key));
//        
//        }
        System.out.println("count " + count);
        for(int i = 0; i < S.length(); i++){
            char letter = S.charAt(i);
         
          //  if( map.containsKey(letter)) count++;
           // return count;
        }
        return count;
    }
}