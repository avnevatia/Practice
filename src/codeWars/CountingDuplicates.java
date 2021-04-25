package codeWars;

/**
 * Count the number of Duplicates
 * Write a function that will return the count of distinct case-insensitive alphabetic characters 
 * and numeric digits that occur more than once in the input string. 
 * The input string can be assumed to contain only alphabets (both uppercase and lowercase)
 * and numeric digits.
 *
 *  Example
 *   "abcde" -> 0 # no characters repeats more than once
 *   "aabbcde" -> 2 # 'a' and 'b'
 *   "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
 *   "indivisibility" -> 1 # 'i' occurs six times
 *   "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
 *   "aA11" -> 2 # 'a' and '1'
 *   "ABBA" -> 2 # 'A' and 'B' each occur twice
 */
public class CountingDuplicates {

  public static void main(String[] args) {
    System.out.println(duplicateCount("aA11"));
  }

  public static int duplicateCount(String text) {
    int count = 0;
    int[] charCountArr = new int[100];
    char[] charArr;
    
    //Converting text to uppercase as case is of no matter
    text = text.toUpperCase();
    //Converting string to char array to take ascii advantange
    charArr = text.toCharArray();
    
    //Using ascii char as index for a int array and 
    //Mainting occurence count.
    for(int i=0; i<text.length(); i++) {
      charCountArr[charArr[i]]++;
    }
    
    //Counting number of duplicate numbers.
    for(int i=48; i<58; i++) {
      if(charCountArr[i] > 1) {
        count++;
      }
    }    

    //Counting number of duplicate character.
    for(int i=65; i<91; i++) {
      if(charCountArr[i] > 1) {
        count++;
      }
    }    
    
    return count;
  }
}
