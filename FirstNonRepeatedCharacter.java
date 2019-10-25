/**
   Purposose: How do you print the first non-repeated character from a string?
*/

package za.co.macbytes.coding.exercises;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static char getFirstNonRepeatedCharacter(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char ch : str.toCharArray()) {
            map.put(ch, map.containsKey(ch)? map.get(ch) + 1 : 1);
        }
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("There are no repeating characters found.");
    }
    
    public static void main(String[] args) {
        System.out.println(FirstNonRepeatedCharacter.getFirstNonRepeatedCharacter("Zamani"));
    }
}
