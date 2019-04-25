package pl.waw.sgh.bank;

public class Customer {

    private Integer customerID;

    private String firstName;

    private String lastName;

    private String email;

    public Customer(Integer customerID, String firstName, String lastName, String email) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + customerID +
                ", '" + firstName + '\'' +
                ", '" + lastName + '\'' +
                //", email='" + email + '\'' +
                '}';
    }
}


/*
package pl.waw.sgh.bank;

public class Customer {

    //pojo class which represent data doesn't really contaijn any logic, it's puare data

    private Integer customerID;

    private String firstName;

    private String lastName;

    private String email;

    // generate -> constructor

    public Customer(Integer customerID, String firstName, String lastName, String email) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //generate-> getter and setter

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    // generate -> toString
    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", '" + firstName + '\'' +
                ", '" + lastName + '\'' +
               // ", email='" + email + '\'' +
                '}';
    }
}
*/


