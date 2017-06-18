/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 戴世琦
 */
public class Sandwich {   //will have no main method
    private String bread;
    private String vegetables = "";
    private String vegeSet;
    private String meat;
    private double price;
    
    public Sandwich(){
        
    }
    
    public void setBread(int b){
        switch (b) {
            case 1:
                bread = "White Bread";
                price = price + 1.5;
                break;
            case 2:
                bread = "Wheat Bread";
                price = price + 1.8;
                break;
            case 3:
                bread = "French Bread";
                price = price + 2.0;
                break;
            case 4:
                bread = "Organic Bread";
                price = price + 2.3;
                break;
            default:
                break;
        }
                
    }
    
    public void setVegetables(int v){
        switch (v) {
            case 1:
                vegetables = vegetables + "red onions, ";
                price = price + 0.1;
                break;
            case 2:
                vegetables = vegetables + "olives, ";
                price = price + 0.1;
                break;
            case 3:
                vegetables = vegetables + "pickles, ";
                price = price + 0.1;
                break;
            case 4:
                vegetables = vegetables + "lettuce, ";
                price = price + 0.2;
                break;
            case 5:
                vegetables = vegetables + "green peppers, ";
                price = price + 0.25;
                break;
            case 6:
                vegetables = vegetables + "tomatoes, ";
                price = price + 0.30;
                break;
            case 7:
                vegetables = vegetables + "cheese, ";
                price = price + 0.49;
                break;
            default:
                vegetables = vegetables + ", ";
                price = price + 0;
                break;
        }
    }
    
    public void setMeat(int m){
        switch (m) {
            case 1:
                meat = "Ham";
                price = price + 0.9;
                break;
            case 2:
                meat = "Roasted Chicken Breast";
                price = price + 1.0;
                break;
            case 3:
                meat = "Turkey Breast";
                price = price + 1.1;
                break;
            case 4:
                meat = "Roast Beef";
                price = price + 1.5;
                break;
            default:
                break;
        }
    }
    
    public String getBread(){
        return bread;
    }
    
    public String getVegetables(){
        if ( vegetables.equals(", "))
          return vegetables.substring(0, vegetables.length() - 2);
        else
        return vegetables.substring(0, vegetables.length() - 4) + "\t";
    }
    
    public String getMeat(){
        if (meat != null)
            return meat + "\t";
        else
            return "";
    }

    
    public double getPrice(){
        return price;
    }
}