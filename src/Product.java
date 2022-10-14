public class Product {
    //Fields 
    String Title; 
    double price; 
    String Author; 
    int Stock;
    String type; 

    //Constructors 
    public Product (String Title, double price, String Author, int Stock, String type ) {
        this.Title = Title;
        this.price = price;
        this.Author = Author; 
        this.Stock = Stock; 
        this.type = type;
    }
    
    public String getTitle() {
        return this.Title;
    }

    public double getPrice() {
        return this.price;
    }

    public String getAuthor() {
        return this.Author;
    }

    public int getStock() {
        return this.Stock;
    }

    public String getType() {
         return this.type;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    @Override
    public String toString() {
        return "{" + " Title='" + getTitle() + "'" + ", price='" + getPrice() + "'" + ", Author='" + getAuthor() + "'" + ", Stock='" + getStock() + "'" + "\n" + "}";
    
    
     }
}
