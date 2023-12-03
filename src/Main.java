import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private ArrayList<String> commonPasswords;
    public static void main(String[] args) throws IOException {


        /*
        PermissionsMatrixGenerator myMatrix = new PermissionsMatrixGenerator();
        //myMatrix.generate();



        String password = "test123";



        assert md != null;
        byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));


        String stringToSave = "JsmithNoToString:";
        stringToSave += salt+":";
        stringToSave += hashedPassword+":";
        stringToSave += "1001:1000:";


        //System.out.println(PasswordController.readPasswords());

        //System.out.println(NewPasswordController.newPass("Password123!"));

        String testpass = "Password123!";
        NewPasswordController temp = new NewPasswordController();
        //System.out.println(temp.newPass(testpass));

         */

        UIController myUI = new UIController();
        myUI.UI();

        /*

        String password = "test123";
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

        //System.out.println("first hash: "+ Arrays.toString(hashedPassword));

        LoginController loginController = new LoginController();

        byte[] temp = new byte[16];
        byte[] newsalt = loginController.decrypter(Arrays.toString(salt).substring(1),temp,0);


        md = null;
        try{
            md = MessageDigest.getInstance("SHA-512");
            md.update(newsalt);
        }catch (NoSuchAlgorithmException e){
            //shouldn't be a concern hopefully
        }

        assert md != null;
        byte[] hashedpart2 = md.digest(password.getBytes(StandardCharsets.UTF_8));

        //System.out.println("first hash: "+ Arrays.toString(hashedPassword));
        //System.out.println("new hash: "+ Arrays.toString(hashedpart2));

        String line = "user:[-98, -22, -19, 106, -119, -41, 49, 67, -66, 17, 88, -4, 103, 109, 77, 108]:[42, -107, -91, -46, 63, 42, 61, 120, -115, -100, 123, -44, -110, -117, -6, -99, 123, 69, -116, 3, 2, -72, -16, -61, 48, 60, 105, 73, -97, -11, -102, 29, -73, 9, -122, -116, -92, -93, 93, 51, -81, 54, -3, -75, -56, 121, 113, -17, 22, -55, 48, 107, 121, -35, 27, 119, -66, 97, 65, 1, 78, -19, 114, -114]:1000:\n";

        String temp2 = line.substring(line.indexOf(":")+1);

        System.out.println(temp2);

         */


    }


}