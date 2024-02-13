/*  Collection--> Interface 
 *  Collections--> Class
*/
import java.util.ArrayList;
import java.util.Collection;

public class CollectionFramework {
    public static void main(String[] args) {
        ArrayList<Integer> c= new ArrayList<Integer>();   // ArrayList includes 'get' method
        //Collection c= new ArrayList();
        c.add(5);   // Object type
        c.add(44);
        c.add(7);
        c.add(4);
        c.add(9);
        c.add(1);
        //c.add('c');           //If we Declare <Integer> then allow only Integer value.
        c.remove(1);    // It remove the value of 1 Index i,e. '4'
        System.out.println(c);
        System.out.println(c.get(2));// Output= 7   (Indexing-- get value)
//---------------------------------------------------------------------------------------------------------
        ArrayList<String> A= new ArrayList<String>();
        A.add("Pune");  // Object type
        A.add("Mumbai");
        A.add("Latur");
        A.add("Nashik");
        A.add("Osmanabad");
        A.set(4,"Dharashiv");   // Osmanabad set to = "Dharashiv"
        System.out.println(A);
        System.out.println(A.get(2));   // Output= Latur
        System.out.println(A.size());   // Array Size is "5"
//--------------------------------------------------------------------------------------------------------
        for (String s:A)            // For Each loop (Iterable class include "for each loop")
        {
            System.out.println(s);  // It will print one by one
        }
//--------------------------------------------------------------------------------------------------

        Collection<Character> X= new ArrayList<Character>();
        X.add('E');
        X.add('D');
        X.add('C');
        X.add('B');
        X.add('A');

        System.out.println(X);
        //Collections.sort(X);
        //public static void sort(ArrayList<Character>X){}

    }    
}
