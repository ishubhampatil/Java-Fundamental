import java.util.Scanner;

class MulDiArray
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr1[][]= new int[3][3];                    //{{4,2,3}, {3,6,2}, {1,2,5}};
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]= sc.nextInt();
            }
        } 
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j]);
            }System.out.println();
        }
    }
}