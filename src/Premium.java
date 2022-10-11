class Premium extends Free{
    //Intialize
    String cardNumber;
    String gender; 
    int ID;
    

    //Constructor
    public Premium (String name, String cardNumber, int ID ) {
        super(name);
        this.cardNumber = cardNumber;
        this.ID = ID;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    @Override
    public String toString() {
        return  "\nName: " + getName() + " | " + "Membership Type: Premium" + " | " + getID() +   "\n";
    }

}