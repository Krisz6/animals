public class Chicken implements Animal {
    private int eggPerSec;
    private double weight;

    public Chicken(int eggPerSec, double weight) {
        this.eggPerSec = eggPerSec;
        this.weight = weight;
    }

    public int getEggPerSec() {
        return eggPerSec;
    }

    public void setEggPerSec(int eggPerSec) {
        this.eggPerSec = eggPerSec;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "eggPerSec=" + eggPerSec +
                ", weight=" + weight +
                '}';
    }
}
