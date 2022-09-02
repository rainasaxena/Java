import java.util.Scanner;

class Practice_Fibonacci{
    public static void main(String[] args) {
        int n=10;
        int f=1;
        int s=1;
        int  i;

        System.out.println(f);
        System.out.println(s);

        for(i=3;i<n;i++){
            int t=f+s;
            System.out.println(t);
            f=s;
            s=t;
        }

    }
}