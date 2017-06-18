
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 戴世琦
 */
public class SandwichApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String loop = "y";
        while (!loop.equalsIgnoreCase("n")){
        Orderline o = new Orderline();
        o.setSandwich(); 
        o.timeStamp();
        o.writeToFile(o.getOrderInfo());
        System.out.println(o.getOrderInfo());
        System.out.print("Continue to order more sandwich? (y/n):");
        loop = sc.nextLine();
        System.out.println();
        }
    }

    
}
