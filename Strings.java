import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        //Strings are immutable
        
        // String name=sc.next();
        // System.out.println("Your name: "+name);

        // String name_full=sc.nextLine();
        // System.out.println("Your name: "+name_full);
        // System.out.println("----------------------------");



//-------------------------------------------------------------------------
        String firstName=sc.next();
        String lastName=sc.next();

        //String Concatentation
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);

        //Length of String
        System.out.println(fullName.length());

        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        //Compare two strings

        /* s1>s2 +ve value
         * s1==s2 :0
         * s1<s2 -ve value
        */
        String a="Shivangi";
        String b="Raina";
        if(a.compareTo(b)==0){ //== can also be written but in some cases it fails
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        //In java strings are objects, variables have other fucntioning and objects have other fucntions, and hence we need a string builder class to know the reason why this gives a wrong answer
        if(new String("Tony")== new String("Tony")){
            System.out.println("Equal");
        }

        else{
            System.out.println("Not Equal");
        }

        //Substring
        String sentence="My name is Raina";
        String beech=sentence.substring(11,16);
        String beeches=sentence.substring(11); //endIndex not required in some cases
         System.out.println(beech);
         System.out.println(beeches);



    }
    
}
