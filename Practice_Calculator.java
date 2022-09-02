import java.util.*;

public class Practice_Calculator {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("Enter the second number:");
        int b=sc.nextInt();

        System.out.println("Enter the operation: *, /, -, %");
        String key=sc.next();

        switch (key) {
            case "*": System.out.println(a*b);
                break;
         
            case "-": System.out.println(a-b);
                break;

            case "/": System.out.println(a/b);
                break;

            case "%": System.out.println(a%b);
                break;


            default: System.out.println("invalid");
                break;
        }
    }
    
}
