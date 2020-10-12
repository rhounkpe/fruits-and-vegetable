package model.russet_potatoes;

import model.Potato;
import model.PotatoType;

public class RussetNugget extends Potato {
    public RussetNugget(double weight) {
        super(weight);
        this.type = PotatoType.RUSSET;
    }
}
