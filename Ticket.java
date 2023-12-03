import javax.swing.JOptionPane;

public class Ticket {
    public static void main (String [] args) {
        operator();
    }

    public static void operator() {
        String Cname, Dname, Vnum;

        JOptionPane.showMessageDialog(null, "       Good Day Ma'am/Sir");
        Vnum = JOptionPane.showInputDialog("Enter Vehicle No. :");
        Dname = JOptionPane.showInputDialog("Enter Driver's Name :");
        Cname = JOptionPane.showInputDialog("Enter Conductor's Name :");
        fromTo(Vnum, Dname, Cname);
        displayOpe(Vnum, Dname, Cname);  
        
    }

    public static void displayOpe(String Vnum, String Dname, String Cname) {
        fromTo(Vnum, Dname, Cname);
        displayOpe(Vnum, Dname, Cname);
    }

    public static void fromTo(String Vnum, String Dname, String Cname){
        int locate;
        String loc;

        int destin;
        String des;
        int tokm;
        
        int quanT;
        int passen;
       
        locate = Integer.parseInt(JOptionPane.showInputDialog("      CHOOSE YOUR LOCATION \n" 
        + "\n   [1] Cabanatuan Terminal \n"
        + "   [2] Jollibee Circum / SM Cabanatuan \n"  
        + "   [3] N.E Pacific Mall / OLFU \n"
        + "   [4] Sumacab / NEUST \n" 
        + "   [5] Sta. Rosa Municipal Plaza" 
        + "\n\n INPUT CHOICE NO. HERE : "));

        destin = Integer.parseInt(JOptionPane.showInputDialog("      CHOOSE YOUR DESTINATION \n" 
        + "\n   [1] Cabanatuan Terminal \n"
        + "   [2] Jollibee Circum / SM Cabanatuan \n"  
        + "   [3] N.E Pacific Mall / OLFU \n"
        + "   [4] Sumacab / NEUST \n" 
        + "   [5] Sta. Rosa Municipal Plaza" 
        + "\n\n INPUT CHOICE NO. HERE : "));

        passen = Integer.parseInt(JOptionPane.showInputDialog("          PASSENGER PAY RATE \n" 
        + "\n   [1] Regular \n" 
        + "   [2] Student \n"
        + "   [3] Senior Citizen \n" 
        + "   [4] PWD" 
        + "\n\n INPUT CHOICE NO. HERE : "));

            
        quanT = Integer.parseInt(JOptionPane.showInputDialog("Enter Passenger Quantity : "));

        for(int a = 1; a <=quanT; a++){ 
            GTicket(locate, destin, passen, Vnum, Dname, Cname);
        }

        int change = JOptionPane.showOptionDialog( null,
            "  Do You Want To Change The Operator's Name ?",
            "Choose Your Answer",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            new String[]{"YES", "NO"},
            "YES")
        ;

        if(change == 0){
            operator();
        }
            

    }

    public static void GTicket(int locate, int destin, int passen, String Vnum, String Dname, String Cname) {
        // Bus Stop
        String bs1 = "Cabanatuan Terminal";
        String bs2 = "Jollibee Circum / SM Cabanatuan";
        String bs3 = "N.E Pacific Mall / OLFU";
        String bs4 = "Sumacab / NEUST";
        String bs5 = "Sta. Rosa Municipal Plaza";

        String loc;
        if (locate == 1) {
            loc = bs1;
            go(loc, locate, destin, passen, Vnum, Dname, Cname);
        } else if (locate == 2) {
            loc = bs2;
            go(loc, locate, destin, passen, Vnum, Dname, Cname);
        } else if (locate == 3) {
            loc = bs3;
            go(loc, locate, destin, passen, Vnum, Dname, Cname);
        } else if (locate == 4) {
            loc = bs4;
            go(loc, locate, destin, passen, Vnum, Dname, Cname);
        } else if (locate == 5) {
            loc = bs5;
            go(loc, locate, destin, passen, Vnum, Dname, Cname);
        } else {
            JOptionPane.showMessageDialog(null, "INVALID INPUT");

        }

    }

    public static void go(String loc, int locate, int destin, int passen, String Vnum, String Dname, String Cname) {

        String pu1 = "Cabanatuan Terminal";
        String pu2 = "Jollibee Circum / SM Cabanatuan";
        String pu3 = "N.E Pacific Mall / OLFU";
        String pu4 = "Sumacab / NEUST";
        String pu5 = "Sta. Rosa Municipal Plaza";

        int tokm;
        String des;
        if (locate == 1 && destin == 1) {
            des = pu1;
            tokm = 0;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 1 && destin == 2) {
            des = pu2;
            tokm = 2;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 1 && destin == 3) {
            des = pu3;
            tokm = 4;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 1 && destin == 4) {
            des = pu4;
            tokm = 5;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 1 && destin == 5) {
            des = pu5;
            tokm = 8;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);

            // option 2
        } else if (locate == 2 && destin == 1) {
            des = pu1;
            tokm = 2;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 2 && destin == 2) {
            des = pu2;
            tokm = 0;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 2 && destin == 3) {
            des = pu3;
            tokm = 2;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 2 && destin == 4) {
            des = pu4;
            tokm = 4;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 2 && destin == 5) {
            des = pu5;
            tokm = 6;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);

            // option 3
        } else if (locate == 3 && destin == 1) {
            des = pu1;
            tokm = 4;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 3 && destin == 2) {
            des = pu2;
            tokm = 2;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 3 && destin == 3) {
            des = pu3;
            tokm = 0;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 3 && destin == 4) {
            des = pu4;
            tokm = 2;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 3 && destin == 5) {
            des = pu5;
            tokm = 4;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);

            // option 4
        } else if (locate == 4 && destin == 1) {
            des = pu1;
            tokm = 5;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 4 && destin == 2) {
            des = pu2;
            tokm = 4;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 4 && destin == 3) {
            des = pu3;
            tokm = 2;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 4 && destin == 4) {
            des = pu4;
            tokm = 0;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 4 && destin == 5) {
            des = pu5;
            tokm = 2;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);

            // option 5
        } else if (locate == 5 && destin == 1) {
            des = pu1;
            tokm = 8;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 5 && destin == 2) {
            des = pu2;
            tokm = 6;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 5 && destin == 3) {
            des = pu3;
            tokm = 4;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 5 && destin == 4) {
            des = pu4;
            tokm = 2;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else if (locate == 5 && destin == 5) {
            des = pu5;
            tokm = 0;
            passenger(loc, des, tokm, passen, Vnum, Dname, Cname);
        } else {
            JOptionPane.showMessageDialog(null, "INVALID INPUT");

        }

    }

    public static void passenger(String loc, String des, int tokm, int passen, String Vnum, String Dname, String Cname){
       
        if(passen == 1){
            payment(passen, loc, des, tokm, Vnum, Dname, Cname);

        }else if(passen == 2){       
            payment(passen, loc, des, tokm, Vnum, Dname, Cname);

        }else if(passen == 3 ){   
            payment(passen, loc, des, tokm, Vnum, Dname, Cname);

        }else if(passen == 4){  
            payment(passen, loc, des, tokm, Vnum, Dname, Cname);

        }
    }

    public static void payment(int passen, String loc, String des, int tokm, String Vnum, String Dname, String Cname) {
        double regpay = 14.0;
        double dispay = 10.0;
        double payrate;
        if(passen == 1 && tokm == 0 || tokm == 2){
            String person = "REGULAR";
            payrate = regpay ;
            ticket(person, loc, des, tokm, payrate, Vnum, Dname, Cname);

        }else if(passen == 1 && tokm == 4){
            String person = "REGULAR";
            payrate = (regpay + 2) ;
            ticket(person, loc, des, tokm, payrate, Vnum, Dname, Cname);

        }else if(passen == 1 && tokm == 5 || tokm == 6){
            String person = "REGULAR";
            payrate = (regpay + 4) ;
            ticket(person, loc, des, tokm, payrate, Vnum, Dname, Cname);

        }else if(passen == 1 && tokm == 8){
            String person = "REGULAR";
            payrate = (regpay + 6);
            ticket(person, loc, des, tokm, payrate, Vnum, Dname, Cname);

            //option 2
        }else if(tokm == 0 || tokm == 2 && passen == 2 ){       
            String person = "STUDENT";    
            payrate = dispay ;
            ticket(person, loc, des, tokm, payrate, Vnum, Dname, Cname);

        }else if(tokm == 4 && passen == 2 ){
            String person = "STUDENT";
            payrate = (dispay + 2);
            ticket(person, loc, des, tokm, payrate, Vnum, Dname, Cname);

        }else if(tokm == 5 || tokm == 6 && passen == 2 ){
            String person = "STUDENT";
            payrate = (dispay + 4);
            ticket(person, loc, des, tokm, payrate, Vnum, Dname, Cname);

        }else if(tokm == 8 && passen == 2 ){
            String person = "STUDENT";
            payrate = (dispay + 6);
            ticket(person, loc, des, tokm, payrate, Vnum, Dname, Cname);

            //option 3
        }else if(tokm == 0 || tokm == 2 && passen == 3){    
            String person = "SENIOR CITIZEN";       
            payrate = dispay ;
            ticket(person, loc, des, tokm, payrate, Vnum, Dname, Cname);

        }else if(tokm == 4 && passen == 3 ){
            String person = "SENIOR CITIZEN";
            payrate = (dispay + 2);
            ticket(person, loc, des, tokm, payrate, Vnum, Dname, Cname);

        }else if(tokm == 5 || tokm == 6 && passen == 3 ){
            String person = "SENIOR CITIZEN";
            payrate = (dispay + 4);
            ticket(person, loc, des, tokm, payrate, Vnum, Dname, Cname);

        }else if(tokm == 8 && passen == 3 ){
            String person = "SENIOR CITIZEN";
            payrate = (dispay + 6);
            ticket(person, loc, des, tokm, payrate, Vnum, Dname, Cname);

            //option4
        }if(tokm == 0 || tokm == 2 && passen == 4 ){ 
            String person = "PWD";          
            payrate = dispay ;
            ticket(person, loc, des, tokm, payrate, Vnum, Dname, Cname);

        }else if(tokm == 4 && passen == 4 ){
            String person = "PWD";
            payrate = (dispay + 2);
            ticket(person, loc, des, tokm, payrate, Vnum, Dname, Cname);

        }else if(tokm == 5 || tokm == 6 && passen == 4 ){
            String person = "PWD";
            payrate = (dispay + 4);
            ticket(person, loc, des, tokm, payrate, Vnum, Dname, Cname);

        }else if(tokm == 8 && passen == 4 ){
            String person = "PWD";
            payrate = (dispay + 6);
            ticket(person, loc, des, tokm, payrate, Vnum, Dname, Cname);

        }

    }

    public static void ticket(String person, String loc, String des, int tokm, double payrate, String Vnum, String Dname, String Cname){
        JOptionPane.showMessageDialog(null, "                   SUMMARY \n" 
            + "\nPassenger  : " + person
            + "\nFrom             : " + loc 
            + "\nTo                  : " + des 
            + "\nDistance      : " + tokm + "KM" 
            + "\nPayment      : Php. " + payrate)
        ;

        int paymentOption = JOptionPane.showOptionDialog( null,
        "  Choose a Payment Method",
        "Payment Options",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        new String[]{"Card", "Cash"},
        "Cash");

        String paymentType;
        if(paymentOption == 0){
            paymentType = "CARD";
            //cardNum = Integer.parseInt(JOptionPane.showInputDialog("Enter Card Number : "));
            JOptionPane.showMessageDialog(null, "Please Place Your Card at the Scanner to Scan to Pay");
            JOptionPane.showInternalMessageDialog(null, "         Thank you for Booking." 
            + "\nYou Have Successfully Pay Your Ticket");


        }else{
            paymentType = "CASH";
            JOptionPane.showInternalMessageDialog(null, "      Thank you for Booking." 
            + "\nPlease Pay Your Ticket in Cash" 
            + "\n                  Php. " + payrate);
        }

        System.out.println("\n\t=================================================================");
        System.out.println("\t\t\t      CABANATUAN TO STA. ROSA");
        System.out.println("\t\t\t          TICKET PAYMENT");
        System.out.println("\t-----------------------------------------------------------------");
        System.out.println("\t\t     PASSENGER             : " + person);
        System.out.println("\t\t     VEHICLE NO            : " + Vnum); 
        System.out.println("\t\t     FROM                  : " + loc );
        System.out.println("\t\t     TO                    : " + des );
        System.out.println("\t\t     DISTANCE              : " + tokm + "KM");
        System.out.println("\t\t     TYPE OF PAYMENT       : " + paymentType);
        System.out.println("\t\t     DRIVER                : " + Dname);
        System.out.println("\t\t     CONDUCTOR             : " + Cname);
        System.out.println("\t-----------------------------------------------------------------");
        System.out.println("\t\t     TOTAL PAYMENT         :   PHP. " + payrate);    
        System.out.println("\t================================================================= \n");
        

    }
}
