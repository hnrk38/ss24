import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        String hello1 = "Hello ";
        String hello2 = "! These lines represent my ";
        String hello3 = "st semester of coding experience.";
        int ttlnmbrs = 1;
        String usrname = System.getProperty("user.name");
        // Opening Ceremony
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(hello1 + usrname + hello2 + ttlnmbrs + hello3);
        System.out.println("--------------- Please chose one of the options below: ------------------");
        System.out.println("-------- 1 sysinfo | 2 calculator | 3 explode computer | 4 exit ---------");
            // Program Loop
            boolean keepgoing = true;
            while (keepgoing) {
                boolean keepgoing2 = true;
                Scanner scanner1 = new Scanner(System.in);
                int menu1choice = scanner1.nextInt();

                while (scanner1.hasNextInt()); {    // start if loop (test input)

                    switch (menu1choice) {

                        case 1:
                            /* SYSINFO PANEL
                            ----------------
                            Features:
                            user.home; os.arch; os.version; os.name; java.specification.version) 
                            ----------------
                            */
                            String homepath = System.getProperty("user.home");
                            String osarch = System.getProperty("os.arch");
                            String osvers = System.getProperty("os.version");
                            String osname = System.getProperty("os.name");
                            String jvversion = System.getProperty("java.specification.version");
                            System.out.println("");
                            System.out.println("Your system stats are:");
                            System.out.println("");
                            System.out.println("OS/arch: " + osarch);
                            System.out.println("OS name: " + osname);
                            System.out.println("OS version: " + osvers);
                            System.out.println("home path: " + homepath);
                            System.out.println("Java version: " + jvversion);
                            System.out.println("");
                            System.out.println("-------------------- Where do you want to go next? ----------------------");
                            System.out.println("-------- 1 sysinfo | 2 calculator | 3 explode computer | 4 exit ---------");
                            break;
                        case 2:
                            /* CALCULATOR
                            -------------------
                            Features Overview:
                            1. ints
                            2. floats
                            3. TBD
                            4. back to main menu
                            Default: ask again for menu input value
                            -------------------
                            */
                            keepgoing2 = true;
                            while (keepgoing2) {

                                System.out.println("");
                                System.out.println("------------------- What do you want to calculate? ----------------------");
                                System.out.println("------- 1 int only | 2 floats | 3 booleans | 4 back to main menu --------");
                                Scanner calcchoice = new Scanner(System.in);
                                int calcchoiceinput = calcchoice.nextInt();

                                switch (calcchoiceinput) {
                                    case 1:
                                        /* INTEGER CALCULATIONS
                                        -------------------
                                        work in progress
                                        -------------------
                                        */
                                        System.out.println("First number: ");
                                        Scanner scancase2_1 = new Scanner(System.in);
                                        int a1 = scancase2_1.nextInt();
                                        System.out.println("Second number: ");
                                        Scanner scancase2_2 = new Scanner(System.in);
                                        int b1 = scancase2_2.nextInt();
                                        System.out.println("Your numbers are " + a1 + " and " + b1 + ". Results below:");
                                    break;

                                    case 2:
                                        /* FLOAT CALCULATIONS
                                        -------------------
                                        work in progress
                                        -------------------
                                        */
                                        System.out.println("#### option 2 under construction ####");
                                    break;

                                    case 3:
                                        /* BOOLEAN COMPARISONS
                                        -------------------
                                        work in progress
                                        -------------------
                                        */
                                        System.out.println("#### option 3 under construction ####");
                                    break;

                                    case 4:
                                        /* EXIT CALCULATOR (BACK TO MAIN MENU)
                                        -------------------
                                        Closes the calculator loop and sends the user back to the main menu.
                                        ------------------- */
                                        keepgoing2 = false;
                                        System.out.println("--------------- Welcome back! Please make your choice: ------------------");
                                        System.out.println("-------- 1 sysinfo | 2 calculator | 3 explode computer | 4 exit ---------");
                                    break;
                                    /* DEFAULT CALCULATOR MENU SCENARIO
                                    ------------------- 
                                    Ask again for calcmenu input value. 
                                    ------------------- 
                                    */ 
                                    default:
                                    break;
                                }   // closing bracket: switch (calculator menu input 1-4)
                            calcchoice.close(); // closing calculator menu option input scanner
                            }   // closing bracket: while (calculator menu input rotation)  

                        default:
                            /* MAIN MENU DEFAULT SCENARIO
                            ------------------- 
                            ### IMPORTANT: needs to be placed below menu options to ###
                            ### trigger when user wants to go back to main menu!    ###
                            ------------------- 
                            Keep menu active unless user goes for case 4 (exit option). 
                            ------------------- 
                            */ 
                            keepgoing = true;
                        break;

                        case 3:
                            /* EXPLODE COMPUTER (TIMER)
                            -------------------
                            work in progress
                            -------------------
                            */ 
                            System.out.println("10..");
                            System.out.println("9...");
                            System.out.println("8...");
                            System.out.println("7...");
                            System.out.println("6...");
                            System.out.println("5...");
                            System.out.println("4...");
                            System.out.println("3...");
                            System.out.println("2...");
                            System.out.println("1...");
                            System.out.println("boom :)");
                            keepgoing = true;
                        return;

                        case 4:
                            /* EXIT MAIN MENU
                            -------------------
                            ### EXIT PROGRAM ###
                            -------------------
                            */
                            System.out.println("Exiting...");
                            keepgoing = false;
                        break;

                    }   // closing bracket: switch (main menu input options 1-4)


                }   // test ende for schleife
                scanner1.close();   // closing main menu options input scanner
            }   // closing bracket: while (main menu input options rotation)
    }   // closing bracket: public static void
}   // closing bracket: public class [file name].