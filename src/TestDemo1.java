import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.OutputStream;

public class TestDemo1 {
    public static void main(String[] args) {
        // 定义字节输出流的对象System.out        
        OutputStream out = System.out;
        // 定义字符流的对象        
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            //通过OutputStreamWriter将字符转流换为字节流对象            
            // bw = new BufferedWriter(new OutputStreamWriter(out));            
            br = new BufferedReader(new FileReader("a.txt"));
            // 定义读取行的字符串            
            String line = null;
            // 读取数据            
            while ((line = br.readLine()) != null) {
                // 输出到控制台              
                bw.write(line);
                // 新的一行                
                bw.newLine();
                // 刷新缓冲                
                bw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源            
            try {
                if (bw != null)
                    bw.close();
                if (br != null)
                    br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}