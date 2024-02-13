
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char h= sc.next().charAt(1);

        switch(h)
        {
           case 'Y':{System.out.println("Yesterday");}
           break;
           case 'T': {System.out.println( "Today");}
           break;
           case 't': { System.out.println("Tommorow");}
           break;
           default: System.out.println("Day");
           break;
           
        }

        
    }
    
}
