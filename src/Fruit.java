/**
 * Created by dustm on 12/4/2017.
 */
public class Fruit {
    private String name;
    private double pricePerUnit;
    private double totalPrice;
    private int amount;

    public void totalFruitPice(){
        this.totalPrice=pricePerUnit*amount;
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
}
