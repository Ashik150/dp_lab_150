package org.example.Bevarage;

abstract public class Bevarage {
    String description = "Unknown Beverage";

    public String getDescription()
    {
        return description;
    }

    public abstract double cost();
}
