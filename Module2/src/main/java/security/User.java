package security;

public class User {

    private String firstName;

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printFirstName() {
        System.out.println(getFirstName());
    }

    public void printLastName() {
        System.out.println(getLastName());
    }

    public void check() {
        System.out.println("!!!!Checked!!!!");
    }

}
