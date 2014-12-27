package arraysofobjects;

import java.util.Scanner;

public class ArraysOfObjects {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // A bank of 5 students named grads
        //Student[] grads = new Student[5]; 
        // then assign
        //grads[0] = new Student("Larry",99);
        
        // or explicitly define it.
        //Student[] students = { new Student("Tom",77), new Student("Ed",84), new Student("Joe",80), new Student("Bob",96) };
        
        String name;
        int grade;
        Student[] students = new Student[4];
        for(int i=0;i<students.length;i++) {
            System.out.printf("Enter GRADE then NAME for student #%d ==> ",i);
            grade = input.nextInt();
            name = input.nextLine();
            students[i] = new Student(name, grade);
        }
        

        System.out.printf("#\tStudent\tGrade\n");
        System.out.printf("-\t-------\t-----\n");

        for(int i=0; i<students.length;i++) {
            System.out.printf("%d\t%s\t%d\n", i,students[i].Name(), students[i].Grade());
        }
            
    }
}
