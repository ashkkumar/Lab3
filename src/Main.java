public class Main {
    public static void main(String[] args) {

        BuddyInfo ak = new BuddyInfo("ak", 12345677);
        BuddyInfo sl = new BuddyInfo("sl", 77654321);
        BuddyInfo mc = new BuddyInfo("mc", 55362611);

        AddressBook addresses = new AddressBook();
        addresses.addBuddy(ak);
        addresses.addBuddy(sl);
        addresses.addBuddy(mc);

        addresses.findBuddy(ak);
        addresses.removeBuddy(mc);
        addresses.findBuddy(mc);


        System.out.println("AddressBook");
    }
}