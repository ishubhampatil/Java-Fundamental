/*'"HashMap"':- Used for Storing Key & Value
 * Instead of add we use "put()" function:-
 * # put():-> 
 * # search--> get():->
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class HashMapCollection {
    public static void main(String[] args) {
        HashMap<Integer, String> H= new HashMap<Integer, String>();
        H.put(01,"Rajesh");
        H.put(02,"Shubham");
        H.put(03,"Rahul");
        H.put(04,"Vaibhav");
        H.put(01,"Sam"); // hare, update value with-> 01(key)=Sam(value)(insted of Shubham(value)).
        H.put(06,null);
        H.put(06,null);

        System.out.println(H);

        for(Map.Entry M:H.entrySet())   //  import java.util.Map;
        {
            System.out.println(M.getKey()+":"+M.getValue());
        }
        //Search
        if (H.containsKey(04))
        {
            System.out.println("Key is Present");
        }
        else
        {
            System.out.println("Key is not Present");
        }
    }
}