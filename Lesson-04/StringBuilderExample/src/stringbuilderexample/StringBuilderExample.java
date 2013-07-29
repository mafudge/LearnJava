package stringbuilderexample;

public class StringBuilderExample {

    public static void main(String[] args) {
        // demonstrates StringBuilder class
        StringBuilder sb = new StringBuilder();
        sb.append("This is a test!");
        String forward = sb.toString();
        String reverse = sb.reverse().toString();
        
        System.out.println(forward);
        System.out.println(reverse);
        
    }
}
