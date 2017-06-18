
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
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
public class Orderline {  // have no main method
    private String customerName;
    private Sandwich s;
    private String time;
    
    public Orderline(){
        
    }

    public void setSandwich(){
        Scanner sc = new Scanner(System.in);
        s = new Sandwich();
        
//Set bread
        System.out.println("=== Select Sandwich Bread: ==="
                            + "\n1 White Bread $1.5"
                            + "\n2 Wheat Bread $1.8"
                            + "\n3 French Bread $2.0"
                            + "\n4 Organic Bread $2.3");
        int bNum = Validator.getInt(sc, "Select a bread [1, 4]: ", 1, 4);
        s.setBread(bNum);
        
//Set veggies
        for (int n=0; n < n+1; n++){
        System.out.println("=== Select Sandwich Vegetables: ===\n" +
                            " 1 red onions $0.10\n" +
                            " 2 olives $0.10\n" +
                            " 3 pickles $0.10\n" +
                            " 4 lettuce $0.20\n" +
                            " 5 green peppers $0.25\n" +
                            " 6 tomatoes $0.30\n" +
                            " 7 cheese $0.49\n" +
                            " 8 Quit vegetable selection");
        int vNum = Validator.getInt(sc, "Select vegetables [1, 8]: ", 1, 8);
        if (vNum != 8)
        {
            s.setVegetables(vNum);
        }
        else{
            s.setVegetables(vNum);
            break;
        }
        }
        
//Set meat and Ask name
        System.out.println("=== Select Sandwich Meat: ===\n" +
                            " 1 Ham $0.9\n" +
                            " 2 Roasted Chicken Breast $1.0\n" +
                            " 3 Turkey Breast $1.1\n" +
                            " 4 Roast Beef $1.5\n" +
                            " 5 Quit meat selection");
        int mNum = Validator.getInt(sc, "Select meat [1, 5]: ", 1, 5);
        if (mNum != 5)
        {
            s.setMeat(mNum);
            customerName = Validator.getString(sc, "Enter customer's name: ");
        }
        else
            customerName = Validator.getString(sc, "Enter customer's name: ");
    }
    
    public String timeStamp(){
    Date now = new Date();
    DateFormat defaultDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
    return time = defaultDate.format(now);
    }
    
    public String getOrderInfo(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return time + "\t" + customerName + "\t" + s.getBread() + "\t" + s.getVegetables() + 
                    s.getMeat() + currency.format(s.getPrice());
    }
    
    public void writeToFile(String info){
        try{ 
            File orderFile = new File("orderline.txt");
            if (!orderFile.exists())
            orderFile.createNewFile();
            PrintWriter out = new PrintWriter(
                                new BufferedWriter(
                                    new FileWriter(orderFile, true)));
            out.println(info);
            out.close();
        }
        catch (IOException e)
        {
                System.out.println(e);
        }

    }
    
}


