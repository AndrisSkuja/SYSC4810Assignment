import java.time.LocalTime;
import java.util.ArrayList;

public class PermissionsMatrixGenerator {

    private ArrayList<ArrayList<Permissions>> permissionsList;




    public void generate(){
        ArrayList<ArrayList<Permissions>> permissionsList = new ArrayList<>();

        ArrayList<Permissions> client = new ArrayList<>();
        Permissions pc1 = new Permissions("Account Balance",true,false,false);
        Permissions pc2 = new Permissions("Investment Portfolio",true,false,false);
        Permissions pc3 = new Permissions("Financial Advisor Contact Details",true,false,false);
        Permissions pc4 = new Permissions("Financial Planner Contact Details",false,false,false);
        Permissions pc5 = new Permissions("Investment Analyst Contact Details",false,false,false);
        Permissions pc6 = new Permissions("Money Market Instruments",false,false,false);
        Permissions pc7 = new Permissions("Private Consumer Instruments",false,false,false);
        Permissions pc8 = new Permissions("Derivatives Trading",false,false,false);
        Permissions pc9 = new Permissions("Interest Instruments",false,false,false);

        client.add(pc1);
        client.add(pc2);
        client.add(pc3);
        client.add(pc4);
        client.add(pc5);
        client.add(pc6);
        client.add(pc7);
        client.add(pc8);
        client.add(pc9);

        permissionsList.add(client);


        ArrayList<Permissions> premiumClient = new ArrayList<>();
        Permissions ppc1 = new Permissions("Account Balance",true,false,false);
        Permissions ppc2 = new Permissions("Investment Portfolio",true,false,false);
        Permissions ppc3 = new Permissions("Financial Advisor Contact Details",true,false,false);
        Permissions ppc4 = new Permissions("Financial Planner Contact Details",true,false,false);
        Permissions ppc5 = new Permissions("Investment Analyst Contact Details",true,false,false);
        Permissions ppc6 = new Permissions("Money Market Instruments",false,false,false);
        Permissions ppc7 = new Permissions("Private Consumer Instruments",false,false,false);
        Permissions ppc8 = new Permissions("Derivatives Trading",false,false,false);
        Permissions ppc9 = new Permissions("Interest Instruments",false,false,false);

        premiumClient.add(ppc1);
        premiumClient.add(ppc2);
        premiumClient.add(ppc3);
        premiumClient.add(ppc4);
        premiumClient.add(ppc5);
        premiumClient.add(ppc6);
        premiumClient.add(ppc7);
        premiumClient.add(ppc8);
        premiumClient.add(ppc9);

        permissionsList.add(premiumClient);


        ArrayList<Permissions> employee = new ArrayList<>();
        Permissions pe1 = new Permissions("Account Balance",true,false,false);
        Permissions pe2 = new Permissions("Investment Portfolio",true,false,false);
        Permissions pe3 = new Permissions("Financial Advisor Contact Details",true,false,false);
        Permissions pe4 = new Permissions("Financial Planner Contact Details",false,false,false);
        Permissions pe5 = new Permissions("Investment Analyst Contact Details",false,false,false);
        Permissions pe6 = new Permissions("Money Market Instruments",false,false,false);
        Permissions pe7 = new Permissions("Private Consumer Instruments",false,false,false);
        Permissions pe8 = new Permissions("Derivatives Trading",false,false,false);
        Permissions pe9 = new Permissions("Interest Instruments",false,false,false);

        employee.add(pe1);
        employee.add(pe2);
        employee.add(pe3);
        employee.add(pe4);
        employee.add(pe5);
        employee.add(pe6);
        employee.add(pe7);
        employee.add(pe8);
        employee.add(pe9);

        permissionsList.add(employee);


        ArrayList<Permissions> technicalSupport = new ArrayList<>();
        Permissions pts1 = new Permissions("Account Balance",true,false,false);
        Permissions pts2 = new Permissions("Investment Portfolio",true,false,false);
        Permissions pts3 = new Permissions("Financial Advisor Contact Details",true,false,false);
        Permissions pts4 = new Permissions("Financial Planner Contact Details",true,false,false);
        Permissions pts5 = new Permissions("Investment Analyst Contact Details",true,false,false);
        Permissions pts6 = new Permissions("Money Market Instruments",false,false,false);
        Permissions pts7 = new Permissions("Private Consumer Instruments",false,false,false);
        Permissions pts8 = new Permissions("Derivatives Trading",false,false,false);
        Permissions pts9 = new Permissions("Interest Instruments",false,false,false);

        technicalSupport.add(pts1);
        technicalSupport.add(pts2);
        technicalSupport.add(pts3);
        technicalSupport.add(pts4);
        technicalSupport.add(pts5);
        technicalSupport.add(pts6);
        technicalSupport.add(pts7);
        technicalSupport.add(pts8);
        technicalSupport.add(pts9);

        permissionsList.add(technicalSupport);


        ArrayList<Permissions> financialAdvisor = new ArrayList<>();
        Permissions pfa1 = new Permissions("Account Balance",true,false,false);
        Permissions pfa2 = new Permissions("Investment Portfolio",true,false,false);
        Permissions pfa3 = new Permissions("Financial Advisor Contact Details",true,false,false);
        Permissions pfa4 = new Permissions("Financial Planner Contact Details",false,false,false);
        Permissions pfa5 = new Permissions("Investment Analyst Contact Details",false,false,false);
        Permissions pfa6 = new Permissions("Money Market Instruments",false,false,false);
        Permissions pfa7 = new Permissions("Private Consumer Instruments",true,false,false);
        Permissions pfa8 = new Permissions("Derivatives Trading",false,false,false);
        Permissions pfa9 = new Permissions("Interest Instruments",false,false,false);

        financialAdvisor.add(pfa1);
        financialAdvisor.add(pfa2);
        financialAdvisor.add(pfa3);
        financialAdvisor.add(pfa4);
        financialAdvisor.add(pfa5);
        financialAdvisor.add(pfa6);
        financialAdvisor.add(pfa7);
        financialAdvisor.add(pfa8);
        financialAdvisor.add(pfa9);

        permissionsList.add(financialAdvisor);


        ArrayList<Permissions> financialPlanner = new ArrayList<>();
        Permissions pfp1 = new Permissions("Account Balance",true,false,false);
        Permissions pfp2 = new Permissions("Investment Portfolio",true,false,false);
        Permissions pfp3 = new Permissions("Financial Advisor Contact Details",true,false,false);
        Permissions pfp4 = new Permissions("Financial Planner Contact Details",false,false,false);
        Permissions pfp5 = new Permissions("Investment Analyst Contact Details",false,false,false);
        Permissions pfp6 = new Permissions("Money Market Instruments",true,false,false);
        Permissions pfp7 = new Permissions("Private Consumer Instruments",true,false,false);
        Permissions pfp8 = new Permissions("Derivatives Trading",false,false,false);
        Permissions pfp9 = new Permissions("Interest Instruments",false,false,false);

        financialPlanner.add(pfp1);
        financialPlanner.add(pfp2);
        financialPlanner.add(pfp3);
        financialPlanner.add(pfp4);
        financialPlanner.add(pfp5);
        financialPlanner.add(pfp6);
        financialPlanner.add(pfp7);
        financialPlanner.add(pfp8);
        financialPlanner.add(pfp9);

        permissionsList.add(financialPlanner);


        ArrayList<Permissions> investmentAnalyst = new ArrayList<>();
        Permissions pia1 = new Permissions("Account Balance",true,false,false);
        Permissions pia2 = new Permissions("Investment Portfolio",true,false,false);
        Permissions pia3 = new Permissions("Financial Advisor Contact Details",true,false,false);
        Permissions pia4 = new Permissions("Financial Planner Contact Details",false,false,false);
        Permissions pia5 = new Permissions("Investment Analyst Contact Details",false,false,false);
        Permissions pia6 = new Permissions("Money Market Instruments",true,false,false);
        Permissions pia7 = new Permissions("Private Consumer Instruments",true,false,false);
        Permissions pia8 = new Permissions("Derivatives Trading",true,false,false);
        Permissions pia9 = new Permissions("Interest Instruments",true,false,false);

        investmentAnalyst.add(pia1);
        investmentAnalyst.add(pia2);
        investmentAnalyst.add(pia3);
        investmentAnalyst.add(pia4);
        investmentAnalyst.add(pia5);
        investmentAnalyst.add(pia6);
        investmentAnalyst.add(pia7);
        investmentAnalyst.add(pia8);
        investmentAnalyst.add(pia9);

        permissionsList.add(investmentAnalyst);


        ArrayList<Permissions> teller = new ArrayList<>();
        Permissions pt1 = new Permissions("Account Balance",true,false,false);
        Permissions pt2 = new Permissions("Investment Portfolio",true,false,false);
        Permissions pt3 = new Permissions("Financial Advisor Contact Details",true,false,false);
        Permissions pt4 = new Permissions("Financial Planner Contact Details",false,false,false);
        Permissions pt5 = new Permissions("Investment Analyst Contact Details",false,false,false);
        Permissions pt6 = new Permissions("Money Market Instruments",false,false,false);
        Permissions pt7 = new Permissions("Private Consumer Instruments",false,false,false);
        Permissions pt8 = new Permissions("Derivatives Trading",false,false,false);
        Permissions pt9 = new Permissions("Interest Instruments",false,false,false);

        teller.add(pt1);
        teller.add(pt2);
        teller.add(pt3);
        teller.add(pt4);
        teller.add(pt5);
        teller.add(pt6);
        teller.add(pt7);
        teller.add(pt8);
        teller.add(pt9);

        permissionsList.add(teller);


        ArrayList<Permissions> complianceOfficer = new ArrayList<>();
        Permissions pcp1 = new Permissions("Account Balance",false,true,false);
        Permissions pcp2 = new Permissions("Investment Portfolio",false,true,false);
        Permissions pcp3 = new Permissions("Financial Advisor Contact Details",false,true,false);
        Permissions pcp4 = new Permissions("Financial Planner Contact Details",false,false,false);
        Permissions pcp5 = new Permissions("Investment Analyst Contact Details",false,false,false);
        Permissions pcp6 = new Permissions("Money Market Instruments",false,false,false);
        Permissions pcp7 = new Permissions("Private Consumer Instruments",false,false,false);
        Permissions pcp8 = new Permissions("Derivatives Trading",false,false,false);
        Permissions pcp9 = new Permissions("Interest Instruments",false,false,false);

        complianceOfficer.add(pcp1);
        complianceOfficer.add(pcp2);
        complianceOfficer.add(pcp3);
        complianceOfficer.add(pcp4);
        complianceOfficer.add(pcp5);
        complianceOfficer.add(pcp6);
        complianceOfficer.add(pcp7);
        complianceOfficer.add(pcp8);
        complianceOfficer.add(pcp9);

        permissionsList.add(complianceOfficer);

        //System.out.println(pcp1);
        permissionsList.forEach(per ->{
            //System.out.println(per);
//            per.forEach(f ->{
//                System.out.println(f.toString());
//            });
        });
        this.permissionsList = permissionsList;
    }

    public StringBuilder listRights(int role){
        StringBuilder rights = new StringBuilder();
        int index = -1;
        switch (role) {
            case 1000 -> //client
                    index = 0;
            case 1001 -> //premClient
                    index = 1;
            case 1002 -> //employee
                    index = 2;
            case 1003 -> //tech
                    index = 3;
            case 1004 -> //financial advisor
                    index = 4;
            case 1005 -> //financial planner
                    index = 5;
            case 1006 -> //investment analyst
                    index = 6;
            case 1007 -> //teller
                    index = 7;
            case 1009 -> //compliance officer
                    index = 8;
            default -> {
            }
        }

        if(index == 7){
            if(!(LocalTime.now().isAfter(LocalTime.of(9,0,0))&&LocalTime.now().isBefore(LocalTime.of(17,0,0)))){
                rights.append("A Teller cannot access the system outside of business hours");
                return rights;
            }
        }

        for(Permissions i : permissionsList.get(index)){
            if(i.isRead()){
                rights.append("read permission on ").append(i.getObject()).append("\n");
            }
            if(i.isWrite()){
                rights.append("write permission on ").append(i.getObject()).append("\n");
            }
            if(i.isExecute()){
                rights.append("execute permission on ").append(i.getObject()).append("\n");
            }
        }
        return rights;

    }

}
