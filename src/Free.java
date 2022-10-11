class Free {
    //Initalizes 
    String name;

    //Constructors
    public Free (String name) {
        this.name = name; 
    }

    //GETTERS (get stuff)
    public String getName() {
        return this.name;
    }
    //SETTERS (set stuff)
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return  "\nName: " + getName() + " | " + "Membership Type: Free" + "\n";
    }
    
}