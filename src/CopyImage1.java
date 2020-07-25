import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyImage1 {

    public static void main(String[] args) throws IOException {
        File inFile = new File("F:\\1.jpg");
        File outFile = new File("E:\\2.jpg");

        FileReader fileReader = new FileReader(inFile);
        FileWriter fileWriter = new FileWriter(outFile);

        char[] buf = new char[1024];
        int length = 0;
        while((length = fileReader.read(buf))!=-1) {
            fileWriter.write(buf,0,length);
        }

        fileWriter.close();
        fileReader.close();
    }

}