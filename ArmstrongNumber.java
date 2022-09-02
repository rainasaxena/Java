import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num=sc.nextInt();
        int a=num;
        int x;
        int num2=0;

        while(num!=0){
            x=num%10;

            num2=num2+ (x*x*x); 
            
            num=num/10;
        }

        if(num2==a){
            System.out.println("Armstrong Number");

        }

        else{
            System.out.println("Not Armstrong Number");
        }


    }
    
    
    
}
