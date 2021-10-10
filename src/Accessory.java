public class Accessory {

    public String name;
    public int cost;

    public Accessory(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
