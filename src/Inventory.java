//IMPORT ARRAYLIST 
import java.util.ArrayList;

public class Inventory {
    //Fields 
    ArrayList<Product> productList = new ArrayList<>();

    //Constructors
    public Inventory() {
    //populating arraylist
    productList.add(new Book("Doug Dimmadome: How to be the best Dimmadome", 9.99, "Doug Dimmadome", 50, "Book" ));
    productList.add(new Book("Doctor Dimmadome: How to be the best Dimmadome", 9.99, "Doctor Dimmadome", 50, "Book" ));
    productList.add(new CD("Shrek",12.99,"Shrek", 6, "CD"));
    productList.add(new CD("Sam udon noodle soup",20.99,"Sam", 3, "CD"));
    productList.add(new CD("Niko cheese of fury",10.99,"Niko", 2, "Podcast"));
    productList.add(new CD("Clint Chai",16.99,"Clint", 4, "Podcast"));
        
}

 //GETTERS (get stuff)

}