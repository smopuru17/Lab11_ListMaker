import java.util.Scanner;
public class SafeInput {

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print('\n' + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;

    }

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user to get an int
     * @return a int response that is not a String
     */
    public static int getInt(Scanner pipe, String prompt) {
        int value = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.println(" " + prompt + ": ");
            if(pipe.hasNextInt()){
                value = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }else{
                trash = pipe.nextLine();
                System.out.println("Invalid input try again");
            }
        }while(!done);
        return value;
    }
    public static double getDouble(Scanner pipe, String prompt) {
        double finalDouble = 0;
        boolean doubleDone = false;
        String trash = "";
        do {
            System.out.println('\n' + prompt + ": ");
            if(pipe.hasNextDouble()){
                finalDouble = pipe.nextDouble();
                pipe.nextLine();
                doubleDone = true;
            }else{
                trash = pipe.nextLine();
                System.out.println("\nInvalid input try again");
            }
        }while(!doubleDone);
        return finalDouble;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high){
        int RangedInt = 0;
        boolean rangedIntDone = false;
        String trash = "";
        do {
            System.out.println('\n' + prompt + ": ");
            if(pipe.hasNextInt()){
                RangedInt = pipe.nextInt();
                pipe.nextLine();
                if (RangedInt >= low && RangedInt <= high){
                    rangedIntDone = true;
                }else
                {
                    System.out.println("You must enter a value in range [" + low + " - " + high + "]: " + RangedInt);
                }

            }else{
                trash = pipe.nextLine();
                System.out.println("You must enter a value in range [" + low + " - " + high + "]: " + RangedInt);
            }
        }while(!rangedIntDone);
        return RangedInt;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high){
        double RangedDouble = 0;
        boolean RangedDouDone = false;
        String trash = "";
        do {
            System.out.println('\n' + prompt + ": ");
            if(pipe.hasNextDouble()){
                RangedDouble = pipe.nextDouble();
                pipe.nextLine();
                if (RangedDouble >= low && RangedDouble <= high){
                    RangedDouDone = true;
                }else
                {
                    System.out.println("You must enter a value in range [" + low + " - " + high + "]: " + RangedDouble);
                }

            }else{
                trash = pipe.nextLine();
                System.out.println("You must enter a value in range [" + low + " - " + high + "]: " + RangedDouble);
            }
        }while(!RangedDouDone);
        return RangedDouble;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt){
        String retYN = "";
        do {
            System.out.println('\n' + prompt + ": ");
        }while(!pipe.hasNext() && !pipe.next().equals("Y") && !pipe.next().equals("y") && !pipe.next().equals("N")&& !pipe.next().equals("n"));
        retYN = pipe.next();
        if (retYN.equalsIgnoreCase("Y")){
            return true;
        }else{
            return false;
        }

    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx){
        String get = "";
        boolean exDone = false;

        do
        {
            System.out.println(" " + prompt + ": ");
            get = pipe.nextLine();
            if(get.matches(regEx)){
                exDone = true;

            }
            else
            {
                System.out.println(" Invalid input: " + get);
            }
        }while(!exDone);
        return get;
    }




}