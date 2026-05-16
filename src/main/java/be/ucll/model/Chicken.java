package be.ucll.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("chicken")
public class Chicken extends Animal {

    private boolean laysEggs;

    protected Chicken () {}

    public Chicken(boolean b) {
        laysEggs = b;
    }
}
