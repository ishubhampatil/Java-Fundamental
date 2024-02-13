/* Exception Handling:- Used for Handle the Errors using "try" & "catch" block.
 * It read code line by line and stop execution when first Exception found
 */

public class ExceptionHand{
    public static void main(String[] args) {
        int a=0;
        int b=0;
        String s= null;  // Error--NullPointerException
        int num[]=new int [5]; // array size is "5"
        try{
            b=10/a; //Critical Statement
            System.out.println(b);  // Error-- ArithmeticException
            System.out.println(s.length()); // String s= null; <-- Error 
            System.out.println(num[6]); // Error--ArrayIndexOutOfBoundsException
        }
        catch(ArithmeticException e)
        {
            System.out.println("Number can not be Divided by Zero");
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Enter Valid Array Size");
        }catch(NullPointerException e)
        {
            System.out.println("NullPointerException");
        }catch( Exception e)   // All Exception Parent Class
        {
            System.out.println("This Parent Class Of all Exceptions");
        }
        finally         
        {
            System.out.println("Thank You");
        }
    }
}