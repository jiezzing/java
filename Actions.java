
/**
 * Write a description of class Actions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Actions
{
    public static void buy(String[] code, String[] menu, int[] qty) { 
        Scanner scan = new Scanner(System.in);
        Output output = new Output();
        int temp = 0;
        String input;
        
        System.out.print("Please use the code above, what menu would you like to buy: ");
        input = scan.next();
        
        for(int i = 0; i < code.length; i++) {
            if(code[i].equalsIgnoreCase(input)) {
                temp = i;
                break;
            }
        }
        
        System.out.println("\nHow many " + menu[temp] + " would you like to buy: ");
        int quantity = scan.nextInt();
        
        output.clearScreen();
        System.out.print((qty[temp] += quantity) + " pcs. of " + menu[temp] + " has been added to the cart.\n\n");
    } 
    
    public static void returnFood(String[] code, String[] menu, int[] qty) { 
        Scanner scan = new Scanner(System.in);
        Output output = new Output();
        int temp = 0;
        String input;
        
        System.out.print("Please use the code above, what menu would you like to return: ");
        input = scan.next();
        
        for(int i = 0; i < code.length; i++) {
            if(code[i].equalsIgnoreCase(input)) {
                temp = i;
                break;
            }
        }
        
        System.out.println("\nHow many " + menu[temp] + " would you like to return: ");
        int quantity = scan.nextInt();
        
        output.clearScreen();
        System.out.print((qty[temp] -= quantity) + " pcs. of " + menu[temp] + " has been return.\n\n");
    } 
    
    public static void delete(String[] code, String[] menu, int[] qty, double[] prices, int ctr) { 
        Scanner scan = new Scanner(System.in);
        Output output = new Output();
        int temp = 0;
        String input;
        
        System.out.print("Please use the code above, what menu would you like to delete: ");
        input = scan.next();
        
        for(int i = 0; i < code.length; i++) {
            if(code[i].equalsIgnoreCase(input)) {
                temp = i;
                break;
            }
        }
        
        output.clearScreen();
        System.out.println("\n" + menu[temp] + " has been successfully deleted.\n");
        
        for(int i = temp; i < code.length - ctr; i++) {
            code[i] = code[i + 1];
            menu[i] = menu[i + 1];
            prices[i] = prices[i + 1];
            qty[i] = qty[i + 1];
        }
    }
    
    public static String [] addCode(String[] code) { 
        Scanner scan = new Scanner(System.in);
        String [] addedCode = new String[code.length + 1];
        Boolean exist;
        String input;
        
        do {
            System.out.print("Please enter item code: \n");
            input = scan.next();
            
            exist = false;
            for(int i = 0; i < code.length; i++) {
                if(code[i].equalsIgnoreCase(input)) {
                    exist = true;
                    System.out.print("Code already exist!\n");
                    break;
                }
            }
            
        } while(exist == true);
        
        for(int i = 0; i < code.length; i++) {
            addedCode[i] = code[i];
        }
        
        addedCode[code.length] = input;
        
        return addedCode;
    } 

    public static String [] addMenu(String[] menu) { 
        Scanner scan = new Scanner(System.in);
        String [] addedMenu = new String[menu.length + 1];
        
        System.out.print("Please enter item name: \n");
        String input = scan.next();
        
        for(int i = 0; i < menu.length; i++) {
            addedMenu[i] = menu[i];
        }
        
        addedMenu[menu.length] = input;
        
        return addedMenu;
    }  

    public static double [] addPrice(double[] price) { 
        Scanner scan = new Scanner(System.in);
        double [] addedPrice = new double[price.length + 1];
        
        System.out.print("Please enter item price: \n");
        double input = scan.nextDouble();
        
        for(int i = 0; i < price.length; i++) {
            addedPrice[i] = price[i];
        }
        
        addedPrice[price.length] = input;
        
        return addedPrice;
    }  
}
