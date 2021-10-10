public class Flower implements Comparable {

    private String name;
    private int stemLength;
    private int freshness;


    public Flower(String name, int stemLength, int freshness) {
        this.name = name;
        this.stemLength = stemLength;
        this.freshness = freshness;
    }

    public int getCost() {
        return stemLength + freshness;
    }

    public int getStemLength() {
        return stemLength;
    }

    public String getName() {
        return name;
    }

    public int getFreshness() {
        return freshness;
    }

    public int getHierarchy() {
        return (getCost() + 1) * 2;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", stemLength=" + stemLength +
                ", freshness=" + freshness +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Flower)) return 0;
        Flower flower = (Flower) o;
        if (flower.freshness == this.freshness) {
            return 0;
        }
        if (flower.freshness < this.freshness) {
            return -1;
        }
        if(flower.freshness > this.freshness){
            return 1;
        }
        return 0;
    }
}
