import java.io.*;

public class FileHandling2 {
    public static void FileRead()
    {
        try {
            FileInputStream f1 = new FileInputStream("Abhi.txt");

            int x = 0;
            while ((x = f1.read()) != -1) {
                System.out.print((char) x);
            }

            f1.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public static void main(String ...s)
    {
        FileRead();
    }
}
