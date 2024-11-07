package org.example.Bevarage;

import org.example.Bevarage.Bevarage;

public class Cappuccino extends Bevarage {
    public Cappuccino()
    {
        description = "Cappuccino";
    }

    @Override
    public double cost()
    {
        return 700;
    }
}
