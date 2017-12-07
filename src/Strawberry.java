/**
 * Created by dustm on 12/4/2017.
 */
public class Strawberry extends Fruit {
    private String name;
    private double pricePerUnit;
    private double totalPrice;
    private int amount;

    public Strawberry(){
        name = "Strawberries";
        pricePerUnit = 2.99;
        totalPrice = 0;
        amount = 0;
    }

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
