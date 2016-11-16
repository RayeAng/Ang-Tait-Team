    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.model;

import java.io.Serializable;
import java.util.Objects;



/**
 *
 * @author tibbit13
 */
public enum Weapons implements Serializable {
    
    BaseballBat("Baseball bat", 12, "A baseball bat belonging to the Baseball team. It is worn out."),
    Plank("2x4 Wooden Plank", 5, "This is a piece of wood."),
    TennisRacket("Tennis Racket", 10, "Once owned by Rod Laver!"),
    CricketPaddle("Cricket Paddle", 12, "It's a long stick."),
    Broom("Broom", 8, "Stolen from the janitor's closet. I bet you didn't know you had one.");
    
    private final String name;
    private final double strength;
    private final String description;

    Weapons(String name, double strength, String description) {
        this.name = name;
        this.strength = strength;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getStrength() {
        return strength;
    }
    
    public String getDescription() {
        return description;
    }
}
