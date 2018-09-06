import java.util.Objects;

public class Human {
    private int weight;
    private double height;

    @Override
    public String toString() {
        return "Human{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return weight == human.weight &&
                Double.compare(human.height, height) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(weight, height);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Human(int weight, double height) {
        this.weight = weight;
        this.height = height;
    }
}