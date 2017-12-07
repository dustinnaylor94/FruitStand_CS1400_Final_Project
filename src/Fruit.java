/**
 * Created by Dustin and Angelo on 12/4/2017.
 * Fruit Parent class for all fruit items
 */
public class Fruit {

    //attributes
    private String name;
    private double pricePerUnit;
    private double totalPrice;
    private int amount;

    //default constructor
    public Fruit(){
        name="fruit";
        pricePerUnit=0;
        totalPrice=0;
        amount=0;
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

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
