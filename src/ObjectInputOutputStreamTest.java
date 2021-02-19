import org.junit.Test;

import java.io.*;

public class ObjectInputOutputStreamTest {
    /**
     * 序列化过程,将内存中的java对象保存到磁盘中或从网络传输出去
     * ObjectOutputStream
     */
    @Test
    public void testObjectOutputStream(){
        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new FileOutputStream("object.dat"));
            oos.writeObject(new String("我爱你"));
            oos.writeObject(new Person("张三",4));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 反序列化 将磁盘中的对象还原为内存当中的对象  ObjectInputStream
     */
    @Test
    public void objectInputStreamTest(){
        ObjectInputStream ois=null;
        try {
            ois=new ObjectInputStream(new FileInputStream("object.dat"));
            Object obj=ois.readObject();
            String str=(String)obj;
            Person p=(Person)ois.readObject();
            System.out.println(p);
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
