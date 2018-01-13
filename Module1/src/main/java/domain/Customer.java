package domain;

public class Customer {

    private String name;

    private String orgForm;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgForm() {
        return orgForm;
    }

    public void setOrgForm(String orgForm) {
        this.orgForm = orgForm;
    }

    public void printName() {
        System.out.println(getName());
    }

    public void printOrgForm() {
        System.out.println(getOrgForm());
    }

    public void sendReport() {
        System.out.println("!!!SendingReport!!!");
    }

}
