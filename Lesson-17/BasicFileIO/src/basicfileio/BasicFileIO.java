package basicfileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BasicFileIO {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        
        try {
            // Basic Java File IO Demo
            PrintWriter output = new PrintWriter(file);
            output.println("Testing");
            output.println("123");
            output.close();
        } catch (IOException ex) {
            System.out.printf("ERROR: %s!\n", ex);
        }
        
        try {
            Scanner input = new Scanner( file );
            String message1  = input.nextLine();
            String message2  = input.nextLine();
            System.out.println(message1);
            System.out.println(message2);
        
        } catch (FileNotFoundException ex) {
            System.out.printf("ERROR: %s!\n", ex);
        }
        
        
        
    }
}
