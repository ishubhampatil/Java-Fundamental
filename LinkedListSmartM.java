import java.util.LinkedList;
import java.util.Iterator;

class SmartP{
    int IMEI;
    String name;
    public SmartP(int IMEI, String name){
        this.IMEI= IMEI;
        this.name= name;
    }
}
public class LinkedListSmartM {
    public static void main(String[] args) {
        SmartP M1= new SmartP(123,"Samsung");
        SmartP M2= new SmartP(456,"Nokia");
        SmartP M3= new SmartP(789, "Vivo");
        SmartP M4= new SmartP (874,"Realme");
        SmartP M5= new SmartP(385,"Iphone");

        LinkedList<SmartP> P= new LinkedList<SmartP>();
        P.add(M1);
        P.add(M2);
        P.add(M3);
        P.add(M4);
        P.add(M5);
        P.removeLast(); // removes Last value in ArrayList
        P.removeFirst(); // removes First value in ArrayList
        for(SmartP p: P){
            System.out.println(p.IMEI+" is: "+ p.name);
        }

        // Iterator s= P.iterator();
        // while(s.hasNext()){
        //     System.out.println(s.next(s.IMEI+ s.name));
        // }
    }
}