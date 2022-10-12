//IMPORT ARRAYLIST 
import java.util.ArrayList;

public class Inventory {
    //Fields 
    ArrayList<Product> Stock = new ArrayList<>();

    //Constructors
    public Inventory() {
        //populating arraylist
        Stock.add(new Product("DVD"));
        Stock.add(new Product("CD"));
        Stock.add(new Product("Books"));
        
        
}

 //GETTERS (get stuff)
 public ArrayList<Product> getStock() {
    return this.Stock;
}

//SETTERS (set stuff)
public void setStock(ArrayList<Product> Stock) {
    this.Stock = Stock;
}

}