package security;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTestIT {

    @Test
    public void check() {
        User user = new User();
        user.check();
    }
}