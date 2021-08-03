import java.awt.*;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.RandomAccess;
import java.util.ArrayList;


public class ArrayListRandAccesFile
{
    private static int charsPerLine;
    private static Object integer;

    public static void main(String[] args)
    {
        String filepath = "test.dat";
        String delimiter = "///!///";
        String dialog = readRandomAccessFile(filepath,2,4,26,delimiter);
        System.out.println(dialog);
    }
    public static String readRandomAccessFile(String filepath, int linestart, int lineEnd, int CharsPerLine, String delimiter) {
        File file = new File(filepath);
        String data = "";
        //ArrayList<String> dialogLinesRead = new ArrayList<String>();
        // String data = "";

        ArrayList<String> dialogLineRead = new ArrayList<String>();
        int bytesPerLine = charsPerLine + 2;

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            for (int i = linestart; i < lineEnd; i++) {
                ArrayListRandAccesFile.seek((integer.bytesPerLine )* 1);
                data = RandomAccessFile.readLine();
                dialogLineRead.add(data);

            }
        } catch (Exception e) {
            System.out.println("Error Occurred");
        }


    }
}

