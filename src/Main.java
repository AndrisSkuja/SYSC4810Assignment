import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Permissions>> permissionsList = new ArrayList<>();

        ArrayList<Permissions> client = new ArrayList<Permissions>();
        Permissions pc1 = new Permissions(true,false,false);
        Permissions pc2 = new Permissions(true,false,false);
        Permissions pc3 = new Permissions(true,false,false);
        Permissions pc4 = new Permissions(false,false,false);
        Permissions pc5 = new Permissions(false,false,false);
        Permissions pc6 = new Permissions(false,false,false);
        Permissions pc7 = new Permissions(false,false,false);
        Permissions pc8 = new Permissions(false,false,false);
        Permissions pc9 = new Permissions(false,false,false);

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


        ArrayList<Permissions> premiumClient = new ArrayList<Permissions>();
        Permissions ppc1 = new Permissions(true,false,false);
        Permissions ppc2 = new Permissions(true,false,false);
        Permissions ppc3 = new Permissions(true,false,false);
        Permissions ppc4 = new Permissions(true,false,false);
        Permissions ppc5 = new Permissions(true,false,false);
        Permissions ppc6 = new Permissions(false,false,false);
        Permissions ppc7 = new Permissions(false,false,false);
        Permissions ppc8 = new Permissions(false,false,false);
        Permissions ppc9 = new Permissions(false,false,false);

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


        ArrayList<Permissions> employee = new ArrayList<Permissions>();
        Permissions pe1 = new Permissions(true,false,false);
        Permissions pe2 = new Permissions(true,false,false);
        Permissions pe3 = new Permissions(true,false,false);
        Permissions pe4 = new Permissions(false,false,false);
        Permissions pe5 = new Permissions(false,false,false);
        Permissions pe6 = new Permissions(false,false,false);
        Permissions pe7 = new Permissions(false,false,false);
        Permissions pe8 = new Permissions(false,false,false);
        Permissions pe9 = new Permissions(false,false,false);

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


        ArrayList<Permissions> technicalSupport = new ArrayList<Permissions>();
        Permissions pts1 = new Permissions(true,false,false);
        Permissions pts2 = new Permissions(true,false,false);
        Permissions pts3 = new Permissions(true,false,false);
        Permissions pts4 = new Permissions(true,false,false);
        Permissions pts5 = new Permissions(true,false,false);
        Permissions pts6 = new Permissions(false,false,false);
        Permissions pts7 = new Permissions(false,false,false);
        Permissions pts8 = new Permissions(false,false,false);
        Permissions pts9 = new Permissions(false,false,false);

        technicalSupport.add(ppc1);
        technicalSupport.add(ppc2);
        technicalSupport.add(ppc3);
        technicalSupport.add(ppc4);
        technicalSupport.add(ppc5);
        technicalSupport.add(ppc6);
        technicalSupport.add(ppc7);
        technicalSupport.add(ppc8);
        technicalSupport.add(ppc9);

        permissionsList.add(technicalSupport);


        ArrayList<Permissions> financialAdvisor = new ArrayList<Permissions>();
        Permissions pfa1 = new Permissions(true,false,false);
        Permissions pfa2 = new Permissions(true,false,false);
        Permissions pfa3 = new Permissions(true,false,false);
        Permissions pfa4 = new Permissions(false,false,false);
        Permissions pfa5 = new Permissions(false,false,false);
        Permissions pfa6 = new Permissions(false,false,false);
        Permissions pfa7 = new Permissions(true,false,false);
        Permissions pfa8 = new Permissions(false,false,false);
        Permissions pfa9 = new Permissions(false,false,false);

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


        ArrayList<Permissions> financialPlanner = new ArrayList<Permissions>();
        Permissions pfp1 = new Permissions(true,false,false);
        Permissions pfp2 = new Permissions(true,false,false);
        Permissions pfp3 = new Permissions(true,false,false);
        Permissions pfp4 = new Permissions(false,false,false);
        Permissions pfp5 = new Permissions(false,false,false);
        Permissions pfp6 = new Permissions(true,false,false);
        Permissions pfp7 = new Permissions(true,false,false);
        Permissions pfp8 = new Permissions(false,false,false);
        Permissions pfp9 = new Permissions(false,false,false);

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


        ArrayList<Permissions> investmentAnalyst = new ArrayList<Permissions>();
        Permissions pia1 = new Permissions(true,false,false);
        Permissions pia2 = new Permissions(true,false,false);
        Permissions pia3 = new Permissions(true,false,false);
        Permissions pia4 = new Permissions(false,false,false);
        Permissions pia5 = new Permissions(false,false,false);
        Permissions pia6 = new Permissions(true,false,false);
        Permissions pia7 = new Permissions(true,false,false);
        Permissions pia8 = new Permissions(true,false,false);
        Permissions pia9 = new Permissions(true,false,false);

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


        ArrayList<Permissions> teller = new ArrayList<Permissions>();
        Permissions pt1 = new Permissions(true,false,false);
        Permissions pt2 = new Permissions(true,false,false);
        Permissions pt3 = new Permissions(true,false,false);
        Permissions pt4 = new Permissions(false,false,false);
        Permissions pt5 = new Permissions(false,false,false);
        Permissions pt6 = new Permissions(false,false,false);
        Permissions pt7 = new Permissions(false,false,false);
        Permissions pt8 = new Permissions(false,false,false);
        Permissions pt9 = new Permissions(false,false,false);

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


        ArrayList<Permissions> complianceOfficer = new ArrayList<Permissions>();
        Permissions pcp1 = new Permissions(false,true,false);
        Permissions pcp2 = new Permissions(false,true,false);
        Permissions pcp3 = new Permissions(false,true,false);
        Permissions pcp4 = new Permissions(false,false,false);
        Permissions pcp5 = new Permissions(false,false,false);
        Permissions pcp6 = new Permissions(false,false,false);
        Permissions pcp7 = new Permissions(false,false,false);
        Permissions pcp8 = new Permissions(false,false,false);
        Permissions pcp9 = new Permissions(false,false,false);

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
            System.out.println(per);
//            per.forEach(f ->{
//                System.out.println(f.toString());
//            });
        });

        //System.out.println(complianceOfficer);
    }
}