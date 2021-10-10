import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Random;

public class Main {


    static public void main(String... args) {

        Random random = new Random();
        int flowerCount = random.nextInt(Utils.MAX_FLOWER_COUNT - Utils.MIN_FLOWER_COUNT) + Utils.MIN_FLOWER_COUNT;
        int accessoriesCount = random.nextInt(Utils.MAX_ACCESSORIES_COUNT);

        ArrayList <Flower> flowers = new ArrayList<>();

        for (int i = 0; i <= flowerCount; i++) {
            int freshness = random.nextInt(Utils.MAX_FRESHNESS);
            int stemLength = random.nextInt(Utils.MAX_STEM_LENGTH - Utils.MIN_STEM_LENGTH) + Utils.MIN_STEM_LENGTH;
            String randomName = Utils.FLOWERS_NAMES[random.nextInt(Utils.FLOWERS_NAMES.length)];

            flowers.add(new Flower(randomName, stemLength,freshness));
        }

        ArrayList <Accessory> accessories = new ArrayList<>();

        for(int i = 0; i <= accessoriesCount; i++){

            String randomNameAccessory = Utils.ACCESSORIES[random.nextInt(Utils.ACCESSORIES.length)];
            int costRandom = random.nextInt(Utils.MAX_ACCESSORY_VALUE - Utils.MIN_ACCESSORY_VALUE) + Utils.MIN_ACCESSORY_VALUE;

            accessories.add(new Accessory(randomNameAccessory,costRandom));


        }

        Bouquet chamomile = new Bouquet(flowers,accessories);

        System.out.println(chamomile);
        System.out.println("\nsorted == " + chamomile.getSortedFlowersList());
        System.out.println("\ncost == " + chamomile.getCost());
        System.out.println("\nstemLength == " + chamomile.getFlowersByStemLength(23,50));
    }

}
