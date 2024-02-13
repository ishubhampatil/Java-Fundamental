import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int i= sc.nextInt();
        int c=0;
        for(int n=2; n<i; n++){   /// 2<51
            if(i%n==0){
                c++;   
            }
        } if(c==0){System.out.println("Prime No");
    }else{System.out.println("Not Prime");}
        
    }    // 1757051/ 1291=1361
}
