import com.sun.source.tree.ReturnTree;

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
        String filepath = "C:\\Users\\15714\\IdeaProjects\\Code1\\CollectionFramework\\src\\test.dat";
        String delimiter = "///!///";
        String dialog = readRandomAccessFile(filepath,2,4,28,delimiter);
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
                randomAccessFile.seek(bytesPerLine * 1);
                data = randomAccessFile.readLine();
                dialogLineRead.add(data);

            }
            randomAccessFile.close();
        } catch (Exception e) {
            System.out.println("Error Occurred");
        }
        String returnData = "";
        for (int i =0; i < dialogLineRead.size(); i++)
        {
            returnData+= dialogLineRead.get(i);
            returnData+= delimiter;
        }
        if (dialogLineRead.isEmpty()){
            data = " Subscription is maximum or Empty";

        }
        return returnData;
    }
}

