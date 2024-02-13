public class Fibnacci {
    public static void main(String []args){
        int a=10;
        int b=1;
        {
            for( int i=0; i<a; i++ ){
                System.out.print("0 ");
                int sum= a+ b;
                a=b;
                b=sum;
            }
        }
            
    
    
    }
    
}
