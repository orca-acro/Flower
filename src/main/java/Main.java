import flowerstore.*;

public class Main {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];
        int[] color = {127, 0, 0};
        for (int i=0; i < flowers.length; i++) {
            flowers[i] = new Flower(FlowerType.ROSE);
            flowers[i].setColor(color);
        }
        //for (int i=0; i< flowers.length; i++) {
            //System.out.println(flowers[i]);
            //System.out.println(flowers[i].getColor());
        //}
        FlowerPack pack = new FlowerPack();
        flowers[0].setPrice(56.90);
        pack.setFlower(flowers[0]);
        pack.setAmount(10);
        //System.out.println(pack);
        FlowerBucket bucket = new FlowerBucket();
        bucket.setFlowerPacks(pack);
        //for (int i=0; i < bucket.getFlowerPacks().size(); i++) {
            //System.out.println(bucket.getFlowerPacks().get(i));

        //}
        Item flower = new Flower(FlowerType.ROSE);
        System.out.println(flower);
        flower.setPrice(10);
        System.out.println(flower.getPrice());
        System.out.println(flower);

        //strategy.setStrategy(DHLDeliveryStrategy());

    }
}
