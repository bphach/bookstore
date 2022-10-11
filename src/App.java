import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        //CREATE CLASS AS OBJECT IN ORDER TO USE IT 
        Memberships Membership = new Memberships();
        
        boolean on = true;
        Scanner scan = new Scanner(System.in); 
        while(on == true) {
            System.out.println("\nWelcome to the Bookstore!");
            System.out.println("\t1.Purchase items.");
            System.out.println("\t2.Check the stock of each item.");
            System.out.println("\t3.Register Membership");
            System.out.println("\t4.Check Membership List");
            System.out.println("\t5.Exit.");
            int userInput = scan.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("What would you like to purchase?");
                    System.out.println("1. Shrek | CD | $12.99");
                    System.out.println("2. Sam udon noodle soup | CD | $20.99");
                    System.out.println("3. Clint Chai | MP4 | $16.99");
                    System.out.println("4. Niko Cheese of fury | MP4 | $10.99");
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
                            //Adds Free Membership to Arraylist "memberList". See Membership Class for details.
                            Membership.memberList.add(new Free(nameInput));
                            loading(); 
                            System.out.println("Thank you for registering!");
                            break;
                        case 2:
                            System.out.println("Enter your first and last name.");
                            Scanner name1 = new Scanner(System.in); 
                            String name1Input = name1.nextLine();
                            System.out.println("Enter your debit/credit number.");
                            String cardInput = scan.next();
                            int IDInput = (int) Math.random()*50;
                            System.out.println("You will be billed $12.99 as of this month.");
                            //Adds Premium Membership to Arraylist "memberList". See Membership Class for details.
                            Membership.memberList.add(new Premium(name1Input, cardInput, IDInput));
                            loading(); 
                            System.out.println("Thank you for registering!");
                            break;
                    
                        default:
                        System.out.println("You must enter number 1-2.");
                            break;
                    }
                    break;
                case 4:
                    System.out.println(Membership.memberList);
                    break;
                case 5:
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
