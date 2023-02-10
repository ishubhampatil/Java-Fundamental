import java.util.Scanner;

public class DataType {  //Class Name and File Name should be same
    
    public static void main(String[] args) {
        String name1 = "Shubham";
        String name2= "Vaibhav";
        String name3= name1 + " and " +  name2;
        String name4= name1 + name2;
        System.out.println(name4);
        System.out.println(name3);
        System.out.println(name1.charAt(6)); //Find the position of String 
        System.out.println(name1.length());         // Find the length of String
        System.out.println(name1.replace('S','V')); // Replace the word
        System.out.println(name1.substring(0,5)); // substring used to remove character which we want to sub-string


    }
}
