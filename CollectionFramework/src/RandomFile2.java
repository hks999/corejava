import java.io.*;
import java.lang.String;

public class RandomFile2 {
    public static void main(String[] args) {
        String[] message = { "H", "e", "M", "A", "N", "T", "H", "",
                            "K", "U", "M", "A", "R" };
        try (RandomAccessFile randomFile = new RandomAccessFile("Message.dat", "rw"))
        {
             for (String letter : message)
                 randomFile.writeChars(letter);
        }
        catch(IOException e)
        {
              System.out.println(e.getMessage());
        }
    }
}

// This program creates a message.dat in the folder "C:\Users\15714\IdeaProjects\Code1\src"
// you can see the output as " H e M A N T H K U M A R"
