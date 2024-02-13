
public class ThrowException{
    public static int ValidateAge(int age)
    {
        if (age<0)
        {
            throw new ArithmeticException(); // ArithmeticException
        }
        return age;
    }
    public static void main(String[] args) {
        try{
            int result= ThrowException.ValidateAge(-7);
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println(" Enter Valid Age");
        }
    }
}
