package org.example.Condiment;

import org.example.Bevarage.Bevarage;
import org.example.Condiment.CondimentDecorator;

public class Milk extends CondimentDecorator {
   Bevarage bevarage;

   public Milk(Bevarage bevarage)
   {
       this.bevarage = bevarage;
   }

   public String getDescription()
   {
       return bevarage.getDescription()+", Milk";
   }

   public double cost()
   {
       return cost()+100;
   }

}

