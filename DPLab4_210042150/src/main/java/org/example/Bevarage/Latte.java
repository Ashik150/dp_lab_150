package org.example.Bevarage;

import org.example.Bevarage.Bevarage;

public class Latte extends Bevarage {
    public Latte()
    {
        description = "Latte";
    }

    @Override
    public double cost() {
        return 600;
    }
}
