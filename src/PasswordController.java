import java.io.IOException;

public class PasswordController {

    public static String readPasswords() throws IOException {
        return FileAccessor.readFile("C:\\Andris\\Programming stuff\\sysc4810\\assignment\\passwd.txt");
    }

    public static void writePasswords(String stringToSave) throws IOException {
        String passwd = readPasswords();
        FileAccessor.writeFile("passwd.txt",passwd+stringToSave+System.getProperty("line.separator"));
    }
}
