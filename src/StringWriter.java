import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class StringWriter {
    public static void test1(){
        try {
            throw new RuntimeException("出错了");
        } catch (RuntimeException e) {
           // e.printStackTrace();
            System.out.println(e.getMessage());
            StringWriter sw=new StringWriter();
            PrintWriter pw= null;
            try {
                pw = new PrintWriter(String.valueOf(sw));
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace(pw);
            System.out.println(pw);
        }
    }

    public static void main(String[] args) {
        test1();
    }
}
