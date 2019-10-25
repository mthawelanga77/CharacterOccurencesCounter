/**
   Purposose: How do you count the occurrence of a given character in a string? 
*/

package za.co.macbytes.coding.exercises;

import static java.lang.Character.toLowerCase;

public class CharacterOccurencesCounter {

    public static long countCharacterOccurences(char ch, String str) {
        return str.chars()
               .filter(character -> toLowerCase(character) == toLowerCase(ch))
               .count();
    }

    public static void main(String[] args) {
        System.out.println(CharacterOccurencesCounter.countCharacterOccurences('m', "Mthawelanga"));
    }
}
