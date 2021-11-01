package delivery;

import flowerstore.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public void deliver(List<Item> items) {
        System.out.println("The items will be delivered via DHL post service");
    }
}
