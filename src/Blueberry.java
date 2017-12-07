/**
 * Created by Dustin and Angelo on 12/4/2017.
 */
public class Blueberry extends Fruit {

    //attributes
    private String name;
    private double pricePerUnit;
    private double totalPrice;
    private int amount;

    //default constructor
    public Blueberry(){
        name = "Blueberries";
        pricePerUnit = 2.50;
        totalPrice = 0;
        amount = 0;
    }

    //getters and setters
    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

