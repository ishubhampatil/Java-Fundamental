/*"HashSet" class-->Set(implements)-->Collection(extends).
 * It contains 'unique' elements only(not duplicate value). & allow 'null' value.
 * insertion order does not matter
 * Best choice for Searching(Easy to search).
 * does not support index value. 
 */
import java.util.HashSet;
import java.util.Iterator;

public class HashsetCollection {
    public static void main( String[]args){
        HashSet<String> S= new HashSet<String>();
        S.add("Yes Bank");
        S.add("SBI");
        S.add("HDFC");
        S.add("Axis");
        S.add("PNB");
        S.add("ICICI");
        S.add("Yes Bank");  // It is duplicate
        S.add(null);

        S.remove("SBI");// removes SBI from the HashList
        //S.clear();;           // <-- It will clear the whole Values from HashSet

        Iterator bank= S.iterator();
        while(bank.hasNext()){
            System.out.println(bank.next());
        }

        
    } 
    
}
