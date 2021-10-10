import java.util.ArrayList;
import java.util.Collections;

public class Bouquet {

    private ArrayList<Flower> flowers;
    private ArrayList<Accessory> accessories;

    public Bouquet(ArrayList<Flower> flowers, ArrayList<Accessory> accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
    }


    public ArrayList<Flower> getSortedFlowersList() {
        Collections.sort(flowers);
        return flowers;
    }

    public int getCost() {
        int cost = 0;
        for (Flower flower : flowers) {
            cost += flower.getCost();
        }
        for (Accessory accessory : accessories) {
            cost += accessory.getCost();
        }
        return cost;
    }


    public ArrayList<Flower> getFlowersByStemLength(int minLength, int maxLength) {
        if (minLength < 0 || maxLength < 0) {
            throw new IllegalArgumentException("Min and Max must be positive");
        }
        if(minLength >= maxLength){
            throw new IllegalArgumentException("Max must be greater than Min");
        }

        ArrayList<Flower> rv = new ArrayList<>();

        for (Flower flower : flowers) {
            if (flower.getStemLength() >= minLength && flower.getStemLength() <= maxLength) {
                rv.add(flower);
            }
        }
        return rv;

    }


    @Override
    public String toString() {
        return "Bouquet{" +
                "flower=" + flowers +
                ", accessories=" + accessories +
                '}';
    }


}
