package arraysofobjects;

public class ArraysOfObjects {

    public static void main(String[] args) {
        // A bank of 5 students named grads
        Student[] grads = new Student[5]; 
        grads[0] = new Student("Larry",99);
        
        // or explicitly define it.
        Student[] students = { new Student("Tom",77), new Student("Ed",84), new Student("Joe",80), new Student("Bob",96) };
        
        System.out.printf("#\tStudent\tGrade\n");
        System.out.printf("-\t-------\t-----\n");

        for(int i=0; i<students.length;i++) {
            System.out.printf("%d\t%s\t%d\n", i,students[i].Name, students[i].Grade);
        }
            
    }
}
