import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void test1() throws IOException {
        File file=new File("F:\\idea\\File");
        System.out.println(file.exists());
        File f2=new File("test1.txt");
        System.out.println("f2="+f2.exists());
        File f3=new File("test2.txt");
        f3.createNewFile();
        File d=new File("d:/");
        for(File f:d.listFiles()){
            System.out.println(f.getPath());
        }
    }
    public static  void test2(){
        File f4=new File("F:\\作业");
        listFiles(f4);
    }
    public static void listFiles(File file){
            System.out.println(file.getPath());
            if(file.isDirectory()){
        for (File f:file.listFiles()) {
            if (f.isDirectory()) {
                listFiles(f);
            }else{
                System.out.println(f.getPath());
            }
        }
        }
    }

    public static void main(String[] args) throws IOException {
        test1();
        test2();
    }
}
