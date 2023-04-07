import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("snow.txt");
        }catch(FileNotFoundException e) {
            System.out.println("File enga daa!");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
