package model;

public class Apple extends TinySeeds {
    private Color color;


    public Apple(int weight, Color color) {
        super(weight);

        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color: " + color + "\nWeight: " + weight + "\n";
    }

    //TODO: Implement a comparator of Apple here

}
