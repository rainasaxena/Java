import java.util.Scanner;
public class Practice_TableofN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n:");
        int n=sc.nextInt();

        int i=1;
        while(i<11){
            System.out.println(n+" x "+ i +" = "+ (n*i));
            i++;
        }
    }
    
}
