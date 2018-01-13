package domain;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTestFast {

    @Test
    public void printName() {
        Customer cust = new Customer();
        cust.setName("Fast--------Name");
        cust.printName();
        Assert.fail();
    }

    @Test
    public void printOrgForm() {
        Customer cust = new Customer();
        cust.setOrgForm("Fast--------OOO");
        cust.printOrgForm();
    }
}