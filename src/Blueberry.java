/**
 * Created by dustm on 12/4/2017.
 */
public class Blueberry extends Fruit {
    private String name;
    private double pricePerUnit;
    private double totalPrice;
    private int amount;

    public Blueberry(){
        name = "Blueberries";
        pricePerUnit = 2.50;
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
}
