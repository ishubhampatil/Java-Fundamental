class ValidateAge extends Exception{    // inherited Exception Parent Class
    public String toString() // Inbuilt Method 1: toString()
    {
        return " Age can not Negative";
    }
    public String getMessage(){ // Inbuilt Method 2: getMessage()      <-- It's Optional
        return " age can't -ve ";
    }
}
public class CustomException {
    public static int valid (int age) throws ValidateAge    // Custome throw Declaration
    {
        if (age<0){
            throw new ValidateAge();
        }
        return age;
    }
    public static void main(String[] args) {
        try{
            int result= CustomException.valid(1);       // static method called
            System.out.println(result);
        }catch( Exception S){
            System.out.println("Message:- " +S);
        }
    }
}
