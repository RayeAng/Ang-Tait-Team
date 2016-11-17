/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.model;

import java.io.Serializable;

/**
 *
 * @author tibbit13
 */
public class Game implements Serializable{
    private double noPlayers;
    private double totalTime;
    
    private Player playerplaying;
    private Items[] inventory;
    
    
    private Map mappy;

    public Map getMappy() {
        return mappy;
    }

    public void setMappy(Map mappy) {
        this.mappy = mappy;
    }
    private Weapons chosenWeapon;

    public Weapons getChosenWeapon() {
        return chosenWeapon;
    }

    public void setChosenWeapon(Weapons chosenWeapon) {
        this.chosenWeapon = chosenWeapon;
    }
    
    
    public Game() {
    }
    
    

    public double getNoPlayers() {
        return noPlayers;
    }

    public void setNoPlayers(double noPlayers) {
        this.noPlayers = noPlayers;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }
    
    public Player getPlayerplaying() {
        return playerplaying;
    }

    public void setPlayerplaying(Player playerplaying) {
        this.playerplaying = playerplaying;
    }
    
    public Items[] getInventory() {
        return inventory;
    }

    public void setInventory(Items[] inventory) {
        this.inventory = inventory;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.noPlayers) ^ (Double.doubleToLongBits(this.noPlayers) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "noPlayers=" + noPlayers + ", totalTime=" + totalTime + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.noPlayers) != Double.doubleToLongBits(other.noPlayers)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        return true;
    }
    
    
}
