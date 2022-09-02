import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter number 1");
            int a = sc.nextInt();

            System.out.println("enter number 2");
            int b = sc.nextInt();

            System.out.println("the sum of these numbers is:");
            System.out.println(a+b);

            System.out.println("Enter the string");
            String str = sc.next();
            System.out.println(str);

            System.out.println("Enter the string");
            String strr = sc.nextLine();
            System.out.println(strr);
        }



        
        
    }
}
