/**
* Write a description of class Burger here.
*
* @author (your name)
* @version (a version number or a date)
*/
import java.util.*;
public class Burger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp = 0;
        String code;
        int choice = 0;
        int ctr = 0;
        
        Actions action = new Actions();
        Output output = new Output();
        
        int [] qty = {0, 0, 0, 0, 0};
        
        String [] codes = {
            "ANG-0001",
            "ANG-0002",
            "ANG-0003",
            "ANG-0004",
            "ANG-0005",
        };
        
        String [] menu = {
            "Crabby Patty", 
            "Cheese Burger",
            "Footlong",
            "Yum Burger",
            "Chicken Burger"
        };
        
        double [] prices = {
            10.00, 
            20.25,
            30.50,
            50.00,
            45.75
        };
        
        String [] actions = {
            "Exit program",
            "View menu",
            "View cart",
            "Buy food",
            "Return bought food",
            "Go to home",
            "Delete product",
            "Add product"
        };
        
        output.clearScreen();
        output.actions(actions, 5);
        
        do  {
            choice = scan.nextInt();
            switch(choice) {
                case 0: 
                    System.out.print("\nClosing program...\n");
                        break;
                case 1:
                    output.clearScreen();
                    output.menu(codes, prices, menu, ctr);
                    output.actions(actions, choice);
                        break;
                case 2:
                    output.clearScreen();
                    output.cart(codes, qty, prices, menu);
                    output.actions(actions, choice);
                        break;
                case 3:
                    output.clearScreen();
                    output.menu(codes, prices, menu, ctr);
                    action.buy(codes, menu, qty);
                    output.actions(actions, choice);
                        break;
                case 4:
                    output.clearScreen();
                    output.cart(codes, qty, prices, menu);
                    action.returnFood(codes, menu, qty);
                    output.actions(actions, choice);
                        break;
                case 5:
                    output.clearScreen();
                    output.actions(actions, choice);
                        break;
                case 6:
                    output.clearScreen();
                    output.menu(codes, prices, menu, ctr);
                    ctr += 1;
                    action.delete(codes, menu, qty, prices, ctr);
                    output.actions(actions, choice);
                        break;
                case 7:
                    output.clearScreen();
                    codes = action.addCode(codes);
                    menu = action.addMenu(menu);
                    prices = action.addPrice(prices);
                    output.actions(actions, choice);
                        break;
                default: 
                    System.out.print("\nInvalid choice, please try again.\n");
                        break;
            }
        }
        while(choice != 0);
        
        System.out.print("Thank you for purchasing from Angel's Burger. =)");
    }
}