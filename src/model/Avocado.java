package model;

public class Avocado extends LargeSeed {
    private boolean hybrid;

    public Avocado(int weight) {
        super(weight);
    }

    // Java Bean
    public boolean isHybrid() {
        return hybrid;
    }

    public void setHybrid(boolean hybrid) {
        this.hybrid = hybrid;
    }
}
