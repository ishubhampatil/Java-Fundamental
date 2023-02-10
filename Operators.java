public class Operators {
public static void main(String[]args){
    int a=20;
    int b=4;
    int c= a+b;                                 //      output
    System.out.println(c);                      //       24
    System.out.println(a-b);                    //       16
    System.out.println(a*b);                    //       80
    System.out.println(a/b);                    //       5

    //Modulo Operator:--  Used to Reminder in Division
    System.out.println(a%b);                    //        0
//---------------------------------------------------------------------------------------------
    /* Assignment Operator[=]-- Used for Assign Value */
     int i=1;  //Here we assign value 1 in i

     /* Unary Operator
      * Increment [++]      Decrement [--]*/
      i++;
      System.out.println(i);
      System.out.println(i++);         //postfix [ i++,  i-- ]   when increment or decrement later
      System.out.println(i--);         // prefix [ ++i,  --i ] when increment or decrement before
      System.out.println(--i);
      System.out.println(++i);
} 
}
