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
public class AccountApp {
    public static void main(String[] args){
        Customer customer = new Customer(4838156, "John", "Smith");
        System.out.println("\n================\nCustomer information:\n----------------");
        System.out.println(customer.toString());
        Account account = new Account(5820389, customer, 5280.05);
        account.deposit(1000);
        System.out.println("\n================\nAfter deposit $1000:\n----------------");
        System.out.println(account.toString());
        account.withdraw(1000);
        System.out.println("\n================\nAfter withdraw $1000:\n----------------");
        System.out.println(account.toString());
    }
}
