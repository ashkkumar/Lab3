import java.util.ArrayList;

public class AddressBook {

    ArrayList<BuddyInfo> infoBook;

    public AddressBook(){
        infoBook = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        infoBook.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        infoBook.remove(buddy);
    }

    public void findBuddy(BuddyInfo buddy){
        if (infoBook.contains(buddy)){
            System.out.println("Buddy is in address book");

        } else {
            System.out.println("Buddy is not in address book");
        }

    }

}
