import java.util.Scanner;
public class Practice_KmsToMiles {
    public static void main(String[] args) {
        System.out.print("Enter the Kms: ");
         Scanner sc = new Scanner(System.in);

         float kms=sc.nextInt();

         System.out.println("There are " + kms*0.62 + " miles");
    }
    
}
