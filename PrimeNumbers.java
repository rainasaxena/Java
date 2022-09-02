import java.util.Scanner;

class PrimeNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums=0;
        for(int i=1;i<51;i++){
            int count=0;
            
            for(int j=1;j<i;j++){
                if(i%j==0){
                    count++;
                } 
            
            if(count<2){
                nums++;
            }              

            }
            
                
            }
            System.out.println(nums + "Prime Numbers");
        }
    }
