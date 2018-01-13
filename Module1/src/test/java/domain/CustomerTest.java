package domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @org.junit.Test
    public void printName() {
        Customer cust = new Customer();
        cust.setName("!!!!!!!Name!!!!!!!!!");
        cust.printName();
    }

    @Test
    public void printOrgForm() {
        Customer cust = new Customer();
        cust.setOrgForm("!!!!!!!OOO!!!!!!!!!");
        cust.printOrgForm();
    }
}