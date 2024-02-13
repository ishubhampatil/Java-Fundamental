/*The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
 * Primitive Type--> int, float, boolean      to      Wrapper Class--> Integer, Float, Boolean
 */
public class WrapperClass {
    public static void main(String[] args) {
//---------------Boxing (Primitive type to Object type)--------------------------------------------------------

        int i=10;   // Primitive Type
        Integer I= new Integer(i);          // Boxing Method 1
        Integer J= Integer.valueOf(i);      // Boxing Method 2
        Integer K=i;        //AutoBoxing
        System.out.println(I);
        System.out.println(J);
        System.out.println(K);

        char j= 'P';   // Primitive Type
        Character A= new Character(j);      // Boxing Method 1
        Character B= Character.valueOf(j);  // Boxing Method 2
        Character C= j;        //AutoBoxing
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

//---------------UnBoxing (Object type to Primitive type)------------------------------------------------------

        Float S= 15.75F; // Object Type
        float P= S.floatValue();    // UnBoxing
        float Q= S;                 // AutoUnBoxing
        System.out.println(P);
        System.out.println(Q);

        Boolean W= false; // Object Type
        boolean X= W.booleanValue();   // UnBoxing
        boolean Y= W;                  // AutoUnBoxing
        System.out.println(X);
        System.out.println(Y);
//------------------------------------------------------------------------------------------------------------
        String F="50";  // 
        int G=Integer.parseInt(F);  // we can convert 'String F="50"' into 'Integer =50' using parseInt
        System.out.println(G*2);            // Here we Multiplied  G*2             
        //System.out.println(F*2);          // here we can not multiply 'F' coz its String type data

    }
}