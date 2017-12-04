/**
 * Created by dustm on 12/4/2017.
 */
public class Apple extends Fruit{
    private String name = "Apple";
    private double pricePerUnit =.50;
    private double totalPrice;
    private int amount;

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
