/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2;

import java.text.NumberFormat;

/**
 *
 * @author 戴世琦
 */
public class Account {
    private int accountNO;
    private Customer customer;
    private double balance;
    
    public Account(int aNO, Customer cus, double bal){
        accountNO = aNO;
        customer = cus;
        balance = bal;
    }   
    
    public int getAccountNO(){
        return accountNO;
    }
    
    public void setAccountNO(int aNO){
        accountNO = aNO;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public void setCustomer(Customer cus){
        customer = cus;
    }

    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double bal){
        balance = bal;
    }
    
    public void deposit(double bal){
        balance = balance + bal;
    }
    
    public boolean withdraw(double amt){
        if (balance >= amt){
            balance = balance - amt;
            return true;
        }
        else {
            return false;
        }
    }
    
    public String toString(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
    String formattedBalance = currency.format(balance);
        return customer.toString() + "\nAccount Number: " + accountNO + "\nBanlance: " + formattedBalance;
    }
}
