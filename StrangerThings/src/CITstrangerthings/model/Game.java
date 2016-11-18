/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import CITstrangerthings.model.Character;
/**
 *
 * @author tibbit13
 */
public class Game implements Serializable{
    private double noPlayers;
    private double totalTime;
    
    private Player playerPlaying;
    private Items[] inventory;
    private Map map;
    private ArrayList<Character> characters;
    

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

    public Player getPlayerPlaying() {
        return playerPlaying;
    }

    public void setPlayerPlaying(Player playerPlaying) {
        this.playerPlaying = playerPlaying;
    }

    public Items[] getInventory() {
        return inventory;
    }

    public void setInventory(Items[] inventory) {
        this.inventory = inventory;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.noPlayers) ^ (Double.doubleToLongBits(this.noPlayers) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.playerPlaying);
        hash = 53 * hash + Arrays.deepHashCode(this.inventory);
        hash = 53 * hash + Objects.hashCode(this.map);
        hash = 53 * hash + Objects.hashCode(this.characters);
        return hash;
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
        if (!Objects.equals(this.playerPlaying, other.playerPlaying)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.characters, other.characters)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "noPlayers=" + noPlayers + ", totalTime=" + totalTime + ", playerPlaying=" + playerPlaying + ", inventory=" + inventory + ", map=" + map + ", characters=" + characters + '}';
    }
    
    
   


}
