
/**
 * Write a description of class Output here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Output
{
    public static void clearScreen()
    {
      System.out.print('\u000C');
    }
    
    public static void menu(String[] codes, double[] prices, String[] menu, int ctr) {
        System.out.print("+-------------------------------------------------------------------------------+\n");
        System.out.print("|                             ANGEL'S BURGER MENU                               |\n");
        System.out.print("+-----------------------+-------------------------------------------------------+\n");
        System.out.print("|         CODE          |        PRICE          |             BURGER            |\n");
        System.out.print("+-----------------------+-----------------------+-------------------------------+\n");
        for(int i = 0; i < menu.length - ctr; i++) {
            System.out.print("|\t" + codes[i] + "\t|\t" + prices[i] + "\t\t|\t" + menu[i] + "\t\t|\n");
        }
        System.out.print("+-----------------------+-----------------------+-------------------------------+\n");
    }
    
    public static void actions(String[] actions, int choice) {
        if(choice == 5) {
            System.out.print("+-----------------------------------------------------+\n");
            System.out.print("+               WELCOME TO ANGEL'S BURGER             +\n");
            System.out.print("+-----------------------------------------------------+\n\n");
        }
        
        for(int i = 0; i < actions.length; i++) {
            if(i == choice) {
                System.out.print("[*] - " + actions[i] + " << you are here\n");
            }
            else {
                System.out.print("[" + i + "] - " + actions[i] + "\n");
            }
        }
        
        System.out.print("\nChoose a number from the following: ");
    } 
    
    public static void cart(String [] code, int[] qty, double[] prices, String[] menu) {
        System.out.print("+--------------------------------------------------------------------------------------------------------------------+\n");
        System.out.print("|                                                         CART                                                       +\n");
        System.out.print("+-----------------------+-----------------------+-----------------------+-----------------------+--------------------+\n");
        System.out.print("|         CODE          |         BURGER        |           QTY         |        PRICE          |        TOTAL       |\n");
        System.out.print("+-----------------------+-----------------------+-----------------------+-----------------------+--------------------+\n");
        
            for(int i = 0; i < menu.length; i++) {
                if(i == 0) {
                    System.out.print("|\t" + code[i] + "\t|\t" + menu[i] + "\t\t|\t" + qty[i] + " pcs.\t\t|\t" + prices[i] + "\t\t|\t" + (qty[i] * prices[i]) + "\t     |\n");
                }
                else {
                    System.out.print("|\t" + code[i] + "\t|\t" + menu[i] + "\t|\t" + qty[i] + " pcs.\t\t|\t" + prices[i] + "\t\t|\t" + (qty[i] * prices[i]) + "\t     |\n");
                }
        }
        
        System.out.print("+-----------------------+-----------------------+-----------------------+-----------------------+--------------------+\n");
    }
}
