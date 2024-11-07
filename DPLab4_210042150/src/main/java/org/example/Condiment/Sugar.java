package org.example.Condiment;

import org.example.Bevarage.Bevarage;

public class Sugar extends CondimentDecorator{
    Bevarage bevarage;

    public Sugar(Bevarage bevarage)
    {
        this.bevarage = bevarage;
    }

    public String getDescription()
    {
        return bevarage.getDescription()+", Sugar";
    }

    public double cost()
    {
        return cost()+50;
    }
}
