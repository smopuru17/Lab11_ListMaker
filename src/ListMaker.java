import java.util.ArrayList;
import java.util.Scanner;
public class ListMaker {

    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args)
    {

    Scanner in = new Scanner(System.in);
    boolean done = false;
    String cmd = "";
    displayList();

    do
    {
        System.out.println();
        System.out.println();
        final String menu = "A - Add  D - Delete  P - Print  Q - Quit";
        String listAddition = "";
        cmd = SafeInput.getRegExString(in, "\n" + menu, "[AaDdPpQq]");
        cmd = cmd.toUpperCase();

        if(cmd.equalsIgnoreCase("A"))
        {
            System.out.print("Enter item to add: ");
            listAddition = in.nextLine();
            list.add(listAddition);

        }
        else if(cmd.equalsIgnoreCase("D"))
        {
            System.out.print("Enter item index to delete: ");
            int listDeletion = SafeInput.getRangedInt(in, "Which item index do you want to delete?", 1, list.size());
            list.remove(listDeletion-1);
        }
        else if(cmd.equalsIgnoreCase("P"))
        {
            displayList();
        }
        else if(cmd.equalsIgnoreCase("Q"))
        {
            SafeInput.getYNConfirm(in, "Are you sure you want to quit? [Y/N] ");
            System.exit(0);
            done = true;
        }

    }while(!done);


}

    private static void displayList()
    {
        if (list.size() != 0)
        {
            for (int i = 0; i < list.size(); i++)
            {
                System.out.println("");
                System.out.printf("%3d%35s", i+1, list.get(i) );
            }
        }
        else
        {
            System.out.println("******************************************");
            System.out.println("***           Enter numbers            ***");
            System.out.println("******************************************");
        }
    }
}