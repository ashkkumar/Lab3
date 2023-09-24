import java.util.ArrayList;

public class AddressBook {

    ArrayList<BuddyInfo> infoBook;
    // factssss

    public AddressBook(){
        infoBook = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        infoBook.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        infoBook.remove(buddy);
    }

}
