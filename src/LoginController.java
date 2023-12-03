import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

public class LoginController {

    public String userCheck(String user) throws IOException {
        ArrayList<String> myList = new ArrayList<>();
        String temp = PasswordController.readPasswords();
        Stream<String> lines = temp.lines();
        lines.forEach(myList::add);

        for(String i : myList){
            String retrivedUser = i.substring(0,i.indexOf(":"));
            if(retrivedUser.equals(user)){
                return i;
            }
        }
        return "";
    }

    public boolean passCheck(String pass, String line){
        String temp = line.substring(line.indexOf(":")+1);
        String saltString = temp.substring(0,temp.indexOf(":"));
        String temp2 = temp.substring(temp.indexOf(":")+1);
        String passString = temp2.substring(0,temp2.indexOf(":"));

        byte[] b = new byte[16];
        byte[] salt = decrypter(saltString.substring(1),b,0);

        MessageDigest md = null;
        try{
            md = MessageDigest.getInstance("SHA-512");
            md.update(salt);
        }catch (NoSuchAlgorithmException e){
            //shouldn't be a concern hopefully
        }

        assert md != null;
        byte[] hashedPassword = md.digest(pass.getBytes(StandardCharsets.UTF_8));

        return passString.equals(Arrays.toString(hashedPassword));
    }

    //decrypts the salt that was converted to a string so it could be stored in passwd.txt
    public byte[] decrypter(String s, byte[] b,int index){
        //System.out.println("decryptor loop");
        if(s.isEmpty())
            return b;
        else {
            String subS = "";
            if(!s.contains(",")){
                subS = s.substring(0,s.indexOf("]"));
                b[index] = (byte) Integer.parseInt(subS);
                index++;
                return decrypter("",b,index);
            }
            else {
                //System.out.println("decryptor loop2");
                subS = s.substring(0,s.indexOf(","));
                b[index] = (byte) Integer.parseInt(subS);
                index++;
                return decrypter(s.substring(s.indexOf(",")+2),b,index);
            }

        }
    }
}
