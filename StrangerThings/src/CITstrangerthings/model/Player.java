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
 * @author Raye Ang
 */
public class Player implements Serializable{
    private String name;
    private String playerFear;
    
    private Character[] party; 

    public Character[] getParty() {
        return party;
    }

    public void setParty(Character[] party) {
        this.party = party;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerFear() {
        return playerFear;
    }

    public void setPlayerFear(String playerFear) {
        this.playerFear = playerFear;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.playerFear);
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", playerFear=" + playerFear + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.playerFear, other.playerFear)) {
            return false;
        }
        return true;
    }
    
    
}
