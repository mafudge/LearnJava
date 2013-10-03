/*
 * DEBUG THIS! Exercise - The Chuck Norris Fact API
 *                          http://www.icndb.com/
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program uses the ChuckNorrisFact java class to call the Chuck Norris 
 * Web API and retrive a random "fact" about Karate Superstar Actor Chuck 
 * Norris.  NOTE: These are not facts per-se as much as they are jokes. Enjoy.
 * 

SAMPLE RUN:  (note: 2nd fact is the random fact)

CHUCK NORRIS FACT #100:
Chuck Norris grinds his coffee with his teeth and boils the water with his own rage.
CHUCK NORRIS RANDOM FACT:
Chuck Norris's brain waves are suspected to be harmful to cell phones.
 
 */

package chucknorrisfact;

public class ChuckNorrisFactRun {

    public static void main(String[] args) {
        chuckNorrisFact c = new ChuckNorrisFact;
        System.out.println("CHUCK NORRIS FACT #100:");
        System.out.println(cnf.getJoke(100));
        System.out.println("CHUCK NORRIS RANDOM FACT:");
        System.out.println(cnf.getJokeAsRandom());
    }

}

