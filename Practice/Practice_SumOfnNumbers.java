import java.util.Scanner;
public class Practice_SumOfnNumbers {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.print("Input 'n':");
    int n=sc.nextInt();

    int i;
    int sum=0;
    for(i=0;i<=n;i++){
        sum=sum+i;
    }

    System.out.println("The sum of first "+n+" numbers is: "+sum);

   } 
}
