package model.russet_potatoes;

import model.Potato;
import model.PotatoType;

public class RussetBurbank extends Potato {
    public RussetBurbank(double weight) {
        super(weight);
        this.type = PotatoType.RUSSET;
    }
}
