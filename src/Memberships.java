//IMPORT ARRAYLIST 
import java.util.ArrayList;

public class Memberships {
    //Initalizes 
    ArrayList<Free> memberList = new ArrayList<>();
    
    public Memberships() {
        //populating arraylist
        memberList.add(new Free("Brandon Hach"));
        memberList.add(new Premium("Dookie Brown",  "333444555", 27));
        memberList.add(new Free("Joe Joe"));
        
    }

    //GETTERS (get stuff)
    public ArrayList<Free> getMemberList() {
        return this.memberList;
    }

    //SETTERS (set stuff)
    public void setMemberList(ArrayList<Free> memberList) {
        this.memberList = memberList;
    }

}



