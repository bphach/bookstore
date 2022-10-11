import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        boolean on = true;
        Scanner scan = new Scanner(System.in); 
        while(on == true) {
            System.out.println("\nWelcome to the Bookstore!");
            System.out.println("\t1. Purchase items.");
            System.out.println("\t2.Check the stock of each item.");
            System.out.println("\t3.Register as new member.");
            System.out.println("\t4. Exit.");
            int userInput = scan.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("What would you like to purchase?");
                    System.out.println("1. Shrek | CD | $12.99");
                    System.out.println("2. Sam udon noodle soup | CD | $20.99");
                    System.out.println("3. Clint Chai | MP4 | $16.99");
                    System.out.println("4. Niko Cheese of fury | Film | $10.99");
                    System.out.println("5. Doug Dimmadome: How to be the best Dimmadome | Book | $9.99");
                    System.out.println("6. Doctor Dimmadome: How to be the best Dimmadome | Book | $9.99");
                    int purchaseInput = scan.nextInt();
                    loading(); 
                    System.out.println("Thank you!");
                    break;
                case 2:
                    System.out.println("Enter item ID.");
                    System.out.println("1. Shrek");
                    System.out.println("2. Sam udon noodle soup");
                    System.out.println("3. Clint Chai");
                    System.out.println("4. Niko Cheese of fury");
                    System.out.println("5. Doug Dimmadome: How to be the best Dimmadome");
                    System.out.println("6. Doctor Dimmadome: How to be the best Dimmadome");
                    int idInput = scan.nextInt();
                    System.out.println("Fully in Stock!");
                    break;
                case 3:
                    System.out.println("What membership would you like to register for?");
                    System.out.println("1. Free Membership.");
                    System.out.println("2. Premium Membership");
                    int memberInput = scan.nextInt();
                    switch (memberInput) {
                        case 1:
                            System.out.println("Enter your first and last name.");
                            Scanner name = new Scanner(System.in); 
                            String nameInput = name.nextLine();
                            loading(); 
                            System.out.println("Thank you for registering!");
                            break;
                        case 2:
                            System.out.println("Enter your debit/credit number.");
                            String cardInput = scan.next();
                            System.out.println("You will be billed $12.99 as of this month.");
                            loading(); 
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

    public static void loading() throws InterruptedException{
        System.out.println("Loading..."); 
        Thread.sleep(1500);
        System.out.println("Loading Successful!");
        Thread.sleep(1500);
    }
}
