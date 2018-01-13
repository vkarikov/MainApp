package security;

import static org.junit.Assert.*;

public class UserTest {

    @org.junit.Test
    public void printFirstName() {
        User user = new User();
        user.setFirstName("!!!!FirstName");
        user.printFirstName();
    }

    @org.junit.Test
    public void printLastName() {
        User user = new User();
        user.setLastName("!!!!LastName");
        user.printLastName();
    }
}