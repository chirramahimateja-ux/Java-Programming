import java.io.*;
class FileOutputStreamDemo
{
        public static void main(String args[]) throws Exception
        {
             FileOutputStream fos= new FileOutputStream("test.txt");
             fos.write("Hello" .getBytes());
             fos.close();
        }
}