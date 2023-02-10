import java.util.Scanner;
public class ScannerInput {
    public static void main(String[]args){
        Scanner abc= new Scanner(System.in);
        System.out.println("Input Your Age:");
        int age= abc.nextInt();
         // float age= abc.nextFloat();
        // double age= abc.nextDouble();
        // string name= abc.nextString();

        System.out.println(age + "  what is Your Name ?");
        abc.nextLine();  // when we take int first before string input then we must add one empty input string. 
        String name= abc.nextLine();  // multiple string line
        System.out.println(name);
        

        
        /* using Terminal we can take input and print output
         *Step 1: pwd   ---- write current path name of directory
          Step 2: cd Sam    ------ enter in folder or path.   Here Sam is folder name 
          Step 3: ls      -------- Showing list in the path
          Step 4: javac ScannerInput.java  ----- entered  "javac Filename.extension" which we want to be open
          Step 5: java ScannerInput   ------  entering into input using "java Classname"
           So we show the option input 
         */
        
    }
    
}
