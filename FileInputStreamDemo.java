import java.io.*;

class FileInputStreamDemo
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis = new FileInputStream("test.txt");
        int i;

        while((i = fis.read()) != -1)
        {
            System.out.println((char)i);
        }

        fis.close();
    }
}