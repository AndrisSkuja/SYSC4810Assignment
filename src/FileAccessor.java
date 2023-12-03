import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileAccessor {


    public static String readFile(String filename) throws IOException {
        File file = new File(filename);
        Scanner myReader = new Scanner(file);
        StringBuilder returnS = new StringBuilder();
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            returnS.append(data).append(System.getProperty("line.separator"));
            //System.out.println(data);
        }
        //return new String(bytes, StandardCharsets.UTF_8);\
        return returnS.toString();
    }

    public static void writeFile(String filename, String text) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filename);
            fos.write(text.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            assert fos != null;
            fos.close();
            throw e;
        }
    }

}
