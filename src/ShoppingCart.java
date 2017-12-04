import java.util.ArrayList;
import java.util.List;

/**
 * Created by dustm on 12/4/2017.
 */
public class ShoppingCart {
    private double grandTotal;

    public void setGrandTotal(List<Fruit> shoppingCart){
        for (Fruit c: shoppingCart) {
            this.grandTotal+=c.getTotalPrice();
        }
    }
}

