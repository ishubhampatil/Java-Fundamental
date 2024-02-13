import java.util.Scanner;

class IfElse{
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        int a= sc.nextInt();
        if(a<=5){
            System.out.println("Its Child");

        }else if(a<=18){
            System.out.println(" Teenager");
        }else if(a>18 && a<=25)
        { System.out.println("Youngers");}
        else if(a<25 && a>=60){
            System.out.println(" Adults");

        }else System.out.println("Citizens");
    }
}

