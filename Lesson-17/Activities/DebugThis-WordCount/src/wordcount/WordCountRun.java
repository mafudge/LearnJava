/*
 * DEBUG THIS! Exercise - Word Cound of an input file
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program simply counts the words in the data.txt input file. 
 * 
 * SAMPLE OUTPUT: 
 * 
...
this
Constitution
for
the
United
States
of
America.
Word Count: 52
*/

package wordcount;

public class WordCountRun {

    public static void main(String[] args) {
        String word;
        int wordCount = 0;
        try {
            File file = new File("data.txt");
            Scanner input = Scanner();
            while (hasNext()) {
                word = input.next;
                System.out.println(word);
            }
            System.out.printf("Word Count: %d\n",wordCount);
        } catch (Exception e) {
            System.out.printf("ERROR: %s\n", e);
        }

    }
}
