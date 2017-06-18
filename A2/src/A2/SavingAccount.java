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
public class SavingAccount extends Account{
    private double interestRate;
    public SavingAccount(int aNO, Customer cus, double bal, double ir){
        super(aNO, cus, bal);
        interestRate = ir;
    };
    public double getInterestRate(){
        return interestRate;
    }
    
    public void setInterestRate(double ir){
        interestRate = ir;
    }
    
    public String toString(){
        String message = super.toString() + "\nInterest Rate: " + this.simplifyDoubleToThreeDecimalPlaces(interestRate) + "%";
        return message;
    }
    
    public String simplifyDoubleToThreeDecimalPlaces(double value){
        int temp = (int) (value * 1000);
        double threeDecimalPlaces = temp / 1000.0;
        return "" + threeDecimalPlaces;
    }
}
