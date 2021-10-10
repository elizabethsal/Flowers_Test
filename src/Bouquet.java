import java.util.ArrayList;
import java.util.Collections;

public class Bouquet {

    public ArrayList<Flower> flowers;
    public ArrayList<Accessory> accessories;

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
            cost += accessory.cost;
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
            if (flower.stemLength >= minLength && flower.stemLength <= maxLength) {
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
