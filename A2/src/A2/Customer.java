/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

/**
 *
 * @author 戴世琦
 */
public class Customer {
    private int customerID;
    private String firstName;
    private String lastName;
    
    public Customer(){
        customerID = 0;
        firstName = null;
        lastName = null;
    }
    
    public Customer(int cID, String fName, String lName){
        customerID = cID;
        firstName = fName;
        lastName = lName;
    }
    
    public int getCustomerID(){
        return customerID;
    }
    
    public void setCustomerID(int cID){
        customerID = cID;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String fName){
        firstName = fName;
    }

    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lName){
        lastName = lName;
    }
    
    public String toString(){
        String message = "Customer ID: " + customerID + "\nName: " + firstName + " " + lastName;
        return message;
    }
}
