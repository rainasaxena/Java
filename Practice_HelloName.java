import java.util.Scanner;

public class Practice_HelloName {
    public static void main(String[] args) {
        System.out.println("Hello! What is your name?");

        Scanner ab = new Scanner(System.in);
        String name=ab.next();

        System.out.println("Hello!, " + name);
        
    }
}
