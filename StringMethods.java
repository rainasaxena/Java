import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    String name=sc.nextLine();//Inputs the string from user
    String special_char="J&%av*a P@r*o$gra&m$mi#n#g";

    System.out.println(name.length()); //length of string
    System.out.println(name.toLowerCase()); //all chars to lower case
    System.out.println(name.toUpperCase()); //all chars to UPPER case
    System.out.println(name.trim()); //removes LEADING and TRAILING spaces
    System.out.println(name.substring(1)); //prints everything AFTER that index
    System.out.println(name.substring(1,4)); //prints everything AFTER and BEFORE those indices respectively
    System.out.println(name.replace('R', 'N')); //Replaces the chars
    System.out.println(name.startsWith("Ra")); //Returns TRUE or FALSE
    System.out.println(name.endsWith("sa")); //Returns TRUE or FALSE
    System.out.println(name.charAt(0)); //Returns the character at that index
    System.out.println(name.indexOf('a')); //Returns the index of that char
    System.out.println(name.lastIndexOf('a')); //Return the index of last occurance of that char
    System.out.println(name.equals("Raina Saxena")); //Compares this string to the specified object. The result is true if and only if the argument is not null and is a String
    System.out.println(name.equalsIgnoreCase("raina saxena")); //Compares this String to another String, ignoring case considerations.
    System.out.println(special_char.replaceAll("[^a-zA-z0-9]",""));//"Except this replaceAll with","this");

    char character_array[]=name.toCharArray(); //Converts the string into a character array
    int i;
    for(i=0;i<name.length();i++){
        System.out.println(character_array[i]);
    }

    }


         
}
