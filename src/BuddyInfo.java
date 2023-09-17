public class BuddyInfo {


    private String name;
    private int phoneNumber;

    public static void main(String[] args) {

        BuddyInfo homer = new BuddyInfo("Homer", 555777888);
        System.out.println("Hello " + homer.getName());
    }

    public BuddyInfo(String name, int phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    private void setPhoneNumber(int number){
        this.phoneNumber = number;
    }
}
