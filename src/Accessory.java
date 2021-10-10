public class Accessory {

    private String name;
    private int cost;

    public Accessory(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
