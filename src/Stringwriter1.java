import java.io.*;

public class Stringwriter1 {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("E:\\BIT\\bit.txt");
        BufferedReader bReader=new BufferedReader(reader);
        FileWriter writer=new FileWriter(":\\BIT\\bit2.txt");
        BufferedWriter bWriter=new BufferedWriter(writer);
        String content="";
        //readLine一行一行的读取
         while((content=bReader.readLine())!=null){         //\r\n换行
             bWriter.write(content+"\r\n");
         }
         /**      
         * 关闭流的顺序：      
         * * 当A依赖B的时候先关闭A，再关闭B      
         * * 带缓冲的流后关闭的时候会执行一次flush      
         * */
         reader.close();
         bReader.close();
         bWriter.close();
         writer.close();
    }
    }