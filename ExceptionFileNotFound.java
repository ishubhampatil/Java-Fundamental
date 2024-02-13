import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class ExampleFile{
    public static void uploadFile () throws IOException //import java.io.IOException;
    {
        File newFile = new File("Abc.text");   // File<-- Keyword from-> import java.io.File;
        FileInputStream stream= new FileInputStream(newFile);// import java.io.FileInputStream;
    }
}
public class ExceptionFileNotFound {
    public static void main(String[] args) {
        try{
            ExampleFile.uploadFile();
        }
        catch(Exception C){
            System.out.println("Message:-" +C);

        }
    }

}
