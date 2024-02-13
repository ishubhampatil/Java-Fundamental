import java.util.ArrayList;
class cars{
    String cName;
    int g;
    public cars( int gear, String CarName){        
        this.cName= CarName;
        this.g= gear;
    }
}
public class ConstructorArrayListCar {
    public static void main(String[] args) {
        cars c1= new cars(4,"Ford");
        cars c2= new cars(5, "Tata");
        cars c3= new cars(6,"Jaguar");
        cars c4= new cars(3, "Mahindra");

        ArrayList<cars> P= new ArrayList<cars>();
        P.add(c1);
        P.add(c2);
        P.add(c3);
        P.add(c4);

        for (cars R:P){
            System.out.println(R.cName +": "+ R.g);
        }
    }
    
}
