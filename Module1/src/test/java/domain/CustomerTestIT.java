package domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTestIT {

    @Test
    public void sendReport() {
        Customer cust = new Customer();
        cust.sendReport();
    }
}