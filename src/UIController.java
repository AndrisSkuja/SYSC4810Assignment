import java.io.IOException;
import java.util.Scanner;

public class UIController {

    private NewPasswordController newPasswordController;
    private User activeUser;
    private LoginController loginController;
    private PermissionsMatrixGenerator permissionsMatrixGenerator;


    public UIController() throws IOException {
        newPasswordController = new NewPasswordController();
        loginController = new LoginController();
        permissionsMatrixGenerator = new PermissionsMatrixGenerator();
        permissionsMatrixGenerator.generate();
        activeUser = new User();
    }
    public void UI() throws IOException {
        Scanner myObj = new Scanner(System.in);
        boolean exit = false;
        do{
            System.out.println("Press 1 to login, 2 to enroll new user");
            String input = myObj.nextLine();
            if(input.equals("1")){
                login();
                exit=true;
            }
            else if(input.equals("2")){
                newUserUI();
                //exit=true;
            }
            else {
                System.out.println("not a valid input. press 9 to exit or anything else to try again");
                input = myObj.nextLine();
                if(input.equals("9")){
                    exit=true;
                }
            }
        }while(!exit);

    }

    public void newUserUI() throws IOException {
        Scanner myObj = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.println("enter a username");
            String user = "";
            String input = myObj.nextLine();
            if(this.newPasswordController.userNameChecker(input)){
                user = input;
                System.out.println("enter password");
                input = myObj.nextLine();
                if(this.newPasswordController.newPass(input,user)){
                    System.out.println("password and user accepted, welcome new user. please proceed to enter information about yourself");
                    this.newUserRoles(user,input);
                    exit=true;
                }
                else {
                    System.out.println("password invalid, review password policy. press 9 to exit or anything else to try again");
                    input = myObj.nextLine();
                    if(input.equals("9")){
                        exit=true;
                    }
                }
            }
            else {
                System.out.println("username taken. press 9 to exit or anything else to try again");
                input = myObj.nextLine();
                if(input.equals("9")){
                    exit=true;
                }
            }
        }while(!exit);
    }

    public void newUserRoles(String user, String pass) throws IOException {
        Scanner myObj = new Scanner(System.in);
        //boolean exit = true;
        System.out.println("What role do you have? press 1 for Client, 2 for Premium Client, 3 for Employee, 4 for Technical Support, " +
                "5 for Financial Advisor, 6 for Financial Planner, 7 for Investment Analyst, 8 for Teller, and 9 for Compliance Officer.");
        System.out.println("Press something else to exit without saving new user");
        String input = myObj.nextLine();
        switch (input) {
            case "1" -> //client
                    newPasswordController.writeNewPass(user, pass, "1000");
            case "2" -> //premClient
                    newPasswordController.writeNewPass(user, pass, "1001");
            case "3" -> //employee
                    newPasswordController.writeNewPass(user, pass, "1002");
            case "4" -> //tech
                    newPasswordController.writeNewPass(user, pass, "1003");
            case "5" -> //financial advisor
                    newPasswordController.writeNewPass(user, pass, "1004");
            case "6" -> //financial planner
                    newPasswordController.writeNewPass(user, pass, "1005");
            case "7" -> //investment analyst
                    newPasswordController.writeNewPass(user, pass, "1006");
            case "8" -> //teller
                    newPasswordController.writeNewPass(user, pass, "1007");
            case "9" -> //compliance officer
                    newPasswordController.writeNewPass(user, pass, "1009");
            default -> {
            }
        }
    }

    public void login() throws IOException {
        Scanner myObj = new Scanner(System.in);
        boolean exit = false;
        do{
            System.out.println("please enter your username");
            String input = myObj.nextLine();
            String userCheck = loginController.userCheck(input);
            if(!userCheck.isEmpty()){
                System.out.println("Found username, please enter password");
                input = myObj.nextLine();
                if(loginController.passCheck(input,userCheck)){
                    System.out.println("password accepted, welcome");
                    this.loggedInUI(userCheck);
                    exit = true;
                }
                else {
                    System.out.println("Password not recognized");
                }
            }
            else {
                System.out.println("Unable to find username, press 1 to try again press else to exit");
                input = myObj.nextLine();
                if(!input.equals("1"))
                    exit=true;
            }
        }while(!exit);
    }

    public void loggedInUI(String line){
        activeUser.parse(line);
        System.out.println("welcome to the system "+activeUser.getUserName());
        System.out.println("your role is: "+this.parseRole(activeUser.getRole()));
        System.out.println("This role grants you access to the following:");
        System.out.println(permissionsMatrixGenerator.listRights(activeUser.getRole()));
    }

    public String parseRole(int id){
        switch (id) {
            case 1000 -> { //client
                return "client";
            }
            case 1001 -> //premClient
            {
                return "Premium Client";
            }
            case 1002 -> //employee
            {
                return "Employee";
            }
            case 1003 -> //tech
            {
                return "Technical Support";
            }
            case 1004 -> //financial advisor
            {
                return "Financial Advisor";
            }
            case 1005 -> //financial planner
            {
                return "Financial Planner";
            }
            case 1006 -> //investment analyst
            {
                return "Investment Analyst";
            }
            case 1007 -> //teller
            {
                return "Teller";
            }
            case 1009 -> //compliance officer
            {
                return "Compliance Officer";
            }
            default -> {
                return "ERROR: ROLE NOT FOUND";
            }
        }
    }
}
