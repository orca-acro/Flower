package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @ToString @Setter
public class FlowerBucket extends Item{
    List<FlowerPack> flowerPacks = new ArrayList<>();

    public FlowerBucket() {
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    @Override
    public void setPrice(double price) {

    }

    public void setFlowerPacks(FlowerPack flowerPacks) {
        this.flowerPacks.add(flowerPacks);
    }

}
