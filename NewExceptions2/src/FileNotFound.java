// File not found exception and NullPointer exception.


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileNotFound {
    public static void main(String[] args) {
        File file = new File("C:/Java2blog.txt");
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(file);
            while (fis.read()!=-1){
                System.out.println(fis.read());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
/*
When you run above program, you will get below output:
java.io.FileNotFoundException: C:/Java2blog.txt (No such file or directory)
at java.base/java.io.FileInputStream.open0(Native Method)
at java.base/java.io.FileInputStream.open(FileInputStream.java:196)
at java.base/java.io.FileInputStream.(FileInputStream.java:139)
at org.arpit.java2blog.FileReadExample.main(FileReadExample.java:17)
Exception in thread “main” java.lang.NullPointerException
at org.arpit.java2blog.FileReadExample.main(FileReadExample.java:27)
As you can see if file is not present in the path, we are getting FileNotFoundException
 */