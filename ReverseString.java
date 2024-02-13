public class ReverseString {
    public static void main(String[] args) {
        String input= "Shubham";
        // StringBuilder input1 = new StringBuilder();
        // input1.append(input);
        // input1.reverse();
        // System.out.println(input1);

  // []{'S'' h' 'u' 'b''h'' a' 'm'}
     //  0   1   2   3  4   5   6
       char[] b= input.toCharArray(); 
        for(int i= b.length-1; i>=0;i--)
        {System.out.print(b[i]);}
    }
}
