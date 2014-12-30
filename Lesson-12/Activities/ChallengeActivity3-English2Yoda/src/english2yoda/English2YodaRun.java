/** Challenge Activity 3 - Simple English to Yoda translator.
 * 
 * This activity will translate an English sentence (of up to 4 words) into
 * Yoda-Speak https://en.wikipedia.org/wiki/Yoda 
 * 
 * The rules behind Yoda-Speak are complicated so in this version we've 
 * simplified them to these 4 cases:
 * 1 word sentence = same
 * 2 word sentence = swap words
 * 3 word sentence = place last word in the beginning of the sentence
 * 4 work sentence = exchange the first two words with the last two words
 * 
 * Your goal is to implement the English2Yoda() method in this program by taking 
 * the array of words and placing them in the proper order depending on the
 * number of words in the sentence.
 * 
 * SAMPLE RUN:
 * 
 * ---=== English-Yoda Translator 1.0 ===---
 * This will translate any English sentence of up to 4 words into Yoda-Speak.
 * Press type 'yoda' to quit
 * English : hi
 * Yoda    : hi
 * English : eat cheese
 * Yoda    : cheese eat 
 * English : you are stubborn
 * Yoda    : stubborn you are
 * English : you must try harder
 * Yoda    : try harder you must
 * English : yoda
 * 
 */
package english2yoda;

import java.util.Scanner;
import java.util.Arrays;

public class English2YodaRun {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("---=== English-Yoda Translator 1.0 ===---\n");
       System.out.print("This will translate any English sentence of up to 4 words into Yoda-Speak.\n");
       System.out.print("Press type 'yoda' to quit\n");
       while (true) {
           System.out.print ("English : ");
           String english = input.nextLine();
           if (english.equals("yoda")) break;
           String yoda = English2Yoda(english);
           System.out.printf("Yoda    : %s\n", yoda);
       }
    }
    
    /**
     * Parses a sentence into an array of words
     * @param sentence the string sentence to parse
     * @return an array of words (in the sentence)
     */
    public static String[] GetWords(String sentence) {
        return sentence.split("[ ]+");
    }
    
    /**
     *  Combines the words back into a sentence
     * @param words an array of strings
     * @return those strings, in order as once sentence.
     */
    public static String CombineWords(String[] words) {
        String sentence = "";
        for (String w : words) {
            sentence += w + " ";
        }
        return sentence;
    }
     
    /**
     * Translates from english to yoda
     * @param english a string sentence in english
     * @return the same sentence translated into yoda
     */
    public static String English2Yoda(String english) {
        String[] words = GetWords(english);
        String yoda ="";
        // TODO: Write Code to complete this method below
        // note: how you translate depends on the number of words (size of the array)
        //       once you manipulate the words[] array, use CombineWords() to put
        //        in back into a sentence.
        
        return yoda;
    }
}
