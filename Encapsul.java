
class test1{
    private int AccNo;
    private String Name;
    public int getAccNo(){
        return AccNo;
    }
    public String getName(){
        return Name;
    }
    public void setAccNo(int a){
        AccNo= a;
        System.out.println(AccNo);
    }
    public void setName(String a){
        Name=a;
        System.out.println(Name);
    }
}
public class Encapsul {
    public static void main(String[] args) {
        test1 p= new test1();
        System.out.println(p.getAccNo());
        System.out.println(p.getName());
        p.setAccNo(10);
        p.setName("Shubham");
    }
    
}
