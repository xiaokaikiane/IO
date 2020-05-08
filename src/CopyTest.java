
import java.io.*;

public class CopyTest {
    public void test3(){
        try {
            FileInputStream fis = null;
            FileOutputStream fos = null;
            BufferedInputStream bis=null;
            BufferedOutputStream bos=null;
            try {
                File f = new File("D:\\比特科技\\HowComputersWork.zip");
                fis = new FileInputStream(f);
                bis=new BufferedInputStream(fis);
                File dest = new File("D:/1.zip");
                fos = new FileOutputStream(dest);
                bos=new BufferedOutputStream(fos);
                byte[] bytes = new byte[1024];
                int len = 0;
                while((len=fis.read(bytes))!=-1){
                    fos.write(bytes, 0, len);
                }
            } finally {
                if(fis != null)
                    fis.close();
                if(fos != null)
                    fos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void test2(){
        try {
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                File f = new File("F:\\Test.java");
                fis = new FileInputStream(f);
                File dest = new File("D:/1.zip");
                fos = new FileOutputStream(dest);
                byte[] bytes = new byte[1024];
                int len = 0;
                while((len=fis.read(bytes))!=-1){
                    fos.write(bytes, 0, len);
                }
            } finally {
                if(fis != null)
                    fis.close();
                if(fos != null)
                    fos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void test1(){
        try {
            FileInputStream fis=null;
            BufferedOutputStream fos=null;
            try {
                File f=new File("F:\\Test.java");
                fis =new FileInputStream(f);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        test2();
    }
}
