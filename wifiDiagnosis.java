// * Class: CMSC203
// * Instructor: Dr. Ahmed Tarek
// * Description: Make a wifi diagnosis program that determines  if the users wifi is working or not; providing solutions to if not.
// * Due: 2/09/2021
// * Platform/compiler: IntelliJ Ji
// * I pledge that I have completed the programming assignment independently.
//   I have not copied the code from a student or any source.
//   I have not given my code to any student.
//   Print your Name here: __Navid Misaghian________


import java.util.Scanner; //Import Scanner Class
import java.lang.*; //Import Java Language Packages

public class wifiDiagnosis {


    public static void main(String[] args){
        //Scanner Declaration and Initialization
        Scanner myObj = new Scanner(System.in); //Created a scanner object

        //Intro
        System.out.println("===================================================");
        System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work. ");
        System.out.println("\nFirst step: reboot your computer");
        System.out.println("Are you able to connect with the internet? (yes or no)");



        //*Asking for Reboot Computer input*
        String userRebootCom = myObj.nextLine();

        //Reboot Computer Argument
        if (userRebootCom.equals("no")){

            System.out.println("Second step: reboot your router");
            System.out.println("Now are you able to connect with the internet? (yes or no)");
        }
        //Reboot Computer Argument
        else if (userRebootCom.equals("yes")) {

            System.out.println("Rebooting your computer seemed to work");
            System.out.println("\n===================================================");
            //Terminates Program
            System.exit(0);
        }



        //*Asking for Reboot Router input*
        String userRebootRouter = myObj.nextLine();

        //Reboot Router Argument
        if (userRebootRouter.equals("no")){

            System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
            System.out.println("Now are you able to connect with the internet? (yes or no)");
        }
        //Reboot Router Argument
        else if (userRebootRouter.equals("yes")){

            System.out.println("Rebooting your router seemed to work");
            System.out.println("\n===================================================");
            //Terminates Program
            System.exit(0);
        }


        //*Asking for Cable's Plugged in input*
        String userCablePlugs = myObj.nextLine();

        //Cable's Plugged in Argument
        if (userCablePlugs.equals("no")){

            System.out.println("Fourth step: move your computer closer to your router");
            System.out.println("Now are able to connect with the internet? (yes or no)");
        }
        //Cable's Plugged in Argument
        else if (userCablePlugs.equals("yes")){

            System.out.println("Making sure your router and cables were working properly seemed to work");
            System.out.println("\n===================================================");
            //Terminates Program
            System.exit(0);
        }


        //*Moving computer closer to your router*
        String userDistanceRouter = myObj.nextLine();

        //Move Computer Closer Argument
        if (userDistanceRouter.equals("no")){

            System.out.println("Fifth Step: contact your ISP");
            System.out.println("Make sure your ISP is hooked up to your router.");
            System.out.println("\n===================================================");
            //Terminate Program
            System.exit(0);
        }
        //Move Computer Closer Argument
        else if (userDistanceRouter.equals("yes")){

            System.out.println("Moving your computer closer to your router seemed to work");
            System.out.println("\n===================================================");
            //Terminates Program
            System.exit(0);
        }


    }

}

