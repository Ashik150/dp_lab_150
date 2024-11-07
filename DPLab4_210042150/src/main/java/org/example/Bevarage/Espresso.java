package org.example.Bevarage;

import org.example.Bevarage.Bevarage;

public class Espresso extends Bevarage {
    public Espresso()
    {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 500;
    }
}
