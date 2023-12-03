public class User {
    private String userName;
    private int role;

    public void parse(String line){
        userName = line.substring(0,line.indexOf(":"));
        role = Integer.parseInt(line.substring(line.length()-5,line.length()-1));
    }



    public String getUserName() {
        return userName;
    }



    public int getRole() {
        return role;
    }


}
