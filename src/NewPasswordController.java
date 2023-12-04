import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class NewPasswordController {

    private static ArrayList<String> commonPasswords;
    private static ArrayList<String> Months;

    public NewPasswordController() throws IOException {
        commonPasswords = new ArrayList<>();
        Months = new ArrayList<>();
        Months.add("January");
        Months.add("February");
        Months.add("March");
        Months.add("April");
        Months.add("May");
        Months.add("June");
        Months.add("July");
        Months.add("August");
        Months.add("September");
        Months.add("October");
        Months.add("November");
        Months.add("December");
        loadCommons();
    }

    //method to validate a newly input password
    public boolean newPass(String inputpassword, String inputUser){
        Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%?*])");
        Matcher m = p.matcher(inputpassword);
        if(!m.find()){
            return false;
        }
        if(inputpassword.length()>12 || inputpassword.length()<8){
            return false;
        }
        if(inputpassword.contains(inputUser)){
            return false;
        }
        for (String j : Months){
            if(inputpassword.contains(j))
                return false;
        }
        for (String i : commonPasswords){
            if(i.equals(inputpassword+":"))
                return false;
        }
        return true;
    }

    //method to load the common passwords file and store its contents locally so that they can be checked against
    public void loadCommons() throws IOException {
        String temp = FileAccessor.readFile("C:\\Andris\\Programming stuff\\sysc4810\\assignment\\commonpasswd.txt");
        Stream<String> lines = temp.lines();
        lines.forEach(req ->{
            commonPasswords.add(req);
        });
    }

    //method to add entries to the common weak passwords file
    public void addCommon(String newCommon) throws IOException {
        String commons = FileAccessor.readFile("commonpasswd.txt");
        commons += newCommon+":"+System.getProperty("line.separator");
        FileAccessor.writeFile("C:\\Andris\\Programming stuff\\sysc4810\\assignment\\commonpasswd.txt",commons);
    }

    //method to check if a given username for a new user matches any existing ones.
    public boolean userNameChecker(String newUser) throws IOException {
        AtomicBoolean exit = new AtomicBoolean(true);
        String temp = PasswordController.readPasswords();
        Stream<String> lines = temp.lines();
        lines.forEach(req ->{
            if(req.contains(newUser))
                exit.set(false);
        });
        return exit.get();
    }

    public void writeNewPass(String userName, String password, String role) throws IOException {
        String completed = "";
        completed += userName+":";

        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);

        MessageDigest md = null;
        try{
            md = MessageDigest.getInstance("SHA-512");
            md.update(salt);
        }catch (NoSuchAlgorithmException e){
            //shouldn't be a concern hopefully
        }

        assert md != null;
        byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));


        completed += Arrays.toString(salt)+":";
        completed += Arrays.toString(hashedPassword) +":";

        completed += role+":";

        PasswordController.writePasswords(completed);
    }
}
