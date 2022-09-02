import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        int sum_even=0;
        int sum_odd=0;
        int x;

        while(a!=0){
            x=a%10;

            if(x%2==0){
                sum_even=sum_even+x;
            }

            else{
                sum_odd=sum_odd+x;
            }           
            a=a/10;
        }

        System.out.println(sum_even);
        System.out.println(sum_odd);

    }
}
