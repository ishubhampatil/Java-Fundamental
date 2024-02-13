/* Linked List:-- present in 'java.util' package.
*Every element is a separate object with a "data part & address part". 
*|Shubham|123|,     |Vaibhav|456|<--   Hare 'Shubham & Vaibhav' are values and 123, 456 are their address.
*contain duplicate elements & maintains insertion order. */
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<String> li= new LinkedList<String>();
        li.add(null);            // T
        li.add("Pune");          // T
        li.add("Mumbai");        // T
        li.add("Latur");         // T
        li.add("Osmanabad");     // T
        li.add("Solapur");       // F-- here "hasNext" will stops due to next value not find.
        System.out.println("The list is given as:- " +li);
/* "Iterable"(Interface)contains--> [1. Iterator(), 2. foreach()]   -->
    * 'Iterator' contains functions--> 
        [1].remove;  
        [2].hasNext:- check T,F. if value is present in next address it will be true and go to next addres till get value false.
        [3].next:- jump to next address
        [4].foreachremaining 
    * We can traverse only in the forward direction using iterator
    * Using ListIterator which extends Iterator, can traverse in both directions 
    * Both read and remove operations can be performed by the iterator interface.
        */
        Iterator itr= li.iterator(); 
        while (itr.hasNext()) {
            System.out.println(itr.next());            
        }
        itr.remove();
        System.out.println("After the remove() method is called : " +li);// Removes the last element. 
    
        
        
        // for(String s:li){
        //     System.out.println(s);
        // }

        
    }
    
}
