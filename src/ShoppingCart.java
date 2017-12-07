import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dustin and Angelo on 12/4/2017.
 * shopping cart used to keep grand total of items in cart
 */
public class ShoppingCart {
    //attribute
    private double grandTotal;

    //default constructor
    public ShoppingCart(){
        grandTotal=0;
    }

    //method that takes a list of type Fruit and adds up the total cost of fruits in list and sets grandTotal
    public void addToGrandTotal(List<Fruit> shoppingCart){
        for (Fruit c: shoppingCart) {
            this.grandTotal+=c.getTotalPrice();
        }
    }

    //getter and setter
    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }
}

