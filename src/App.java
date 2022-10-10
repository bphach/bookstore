import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean on = true;
        Scanner scan = new Scanner(System.in); 
        while(on == true) {
            System.out.println("Welcome to the Bookstore!");
            System.out.println("1. Purchase items.");
            System.out.println("2.Check the stock of each item.");
            System.out.println("3.Register as new member.");
            System.out.println("4. Exit.");
            int userInput = scan.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("What would you like to purchase?");
                    System.out.println("1. Shrek | CD | $12.99");
                    System.out.println("2. Shrek | CD | $12.99");
                    System.out.println("3. Shrek | CD | $12.99");
                    int purchaseInput = scan.nextInt();
                    System.out.println("Thank you!");
                    break;
                case 2:
                    System.out.println("Enter item ID.");
                    int idInput = scan.nextInt();
                    break;
                case 3:
                    System.out.println("What membership would you like to register for?");
                    System.out.println("1. Free Membership.");
                    System.out.println("2. Premium Membership");
                    int memberInput = scan.nextInt();
                    switch (memberInput) {
                        case 1:
                            System.out.println("Enter your first and last name.");
                            break;
                        case 2:
                            System.out.println("You will be billed $12.99 as of this month.");
                            System.out.println("Enter your first and last name.");  
                            String nameInput = scan.nextLine();
                            System.out.println("Enter your debit/credit number.");
                            String cardInput = scan.nextLine();
                            System.out.println("Thank you for registering!");
                            break;

                    
                        default:
                        System.out.println("You must enter number 1-2.");
                            break;
                    }
                    break;
                case 4:
                System.out.println("Now exiting...");
                    on = false; 
                    break;
                
                default:
                System.out.println("Error: You must enter number 1-4.");
                    break;
            }
        }
    }
}
