package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @ToString
public class FlowerBucket extends Item{
    List<FlowerPack> flowerPacks = new ArrayList<>();

    public FlowerBucket() {
    }

    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            price += flowerPacks.get(i).getPrice();
        }
        return price;
    }

    @Override
    public double getDescription() {
        return 0;
    }

    public void setFlowerPacks(FlowerPack flowerPacks) {
        this.flowerPacks.add(flowerPacks);
    }

}
