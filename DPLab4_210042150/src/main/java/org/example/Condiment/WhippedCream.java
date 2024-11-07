package org.example.Condiment;

import org.example.Bevarage.Bevarage;
import org.example.Condiment.CondimentDecorator;

public class WhippedCream extends CondimentDecorator {
    Bevarage bevarage;

    public WhippedCream(Bevarage bevarage)
    {
        this.bevarage = bevarage;
    }

    public String getDescription()
    {
        return bevarage.getDescription()+", WhippedCream";
    }

    public double cost()
    {
        return cost()+150;
    }

}


