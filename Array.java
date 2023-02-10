import java.util.*;
public class Array {
    public static void main(String[]args){
        int Marathi= 78;
        int Hindi=89;
        int English=97;
        
        int[] Marks= new int[3];
        Marks[0]=78;
        Marks[1]=89;
        Marks[2]=97;
        System.out.println(Marks [2]);        //Output  97
//---------------------------------------------------------------------------------------------
        int[] RollNo={5,7,10,24,25};
        System.out.println(RollNo[0]);        //Output    5
//---------------------------------------------------------------------------------------------
        /*Multidimesional */

        int[][] FinalMarks={{78,89,97},{57,65,48}};
        System.out.println(FinalMarks[1][0]);           //Output  57
    }
       
    }