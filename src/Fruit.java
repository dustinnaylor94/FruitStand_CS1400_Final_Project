/**
 * Created by dustm on 12/4/2017.
 */
public class Fruit {
    private String name;
    private double pricePerUnit;
    private double totalPrice;
    private int amount;

    public void totalFruitPrice(){
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
