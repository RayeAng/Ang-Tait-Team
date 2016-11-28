/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Raye Ang
 */
public class Location implements Serializable {
    private double row;
    private double column;
    private boolean visit;
    private Scene scene;
    private ArrayList<Character> characters;
    private Scene setting;

    public Scene getSetting() {
        return setting;
    }

    public void setSetting(Scene setting) {
        this.setting = setting;
    }

    public Location() {
    }

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public boolean getVisit() {
        return visit;
    }

    public void setVisit(boolean visit) {
        this.visit = visit;
    }
    
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
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
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.visit);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visit=" + visit + '}';
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        if (!Objects.equals(this.visit, other.visit)) {
            return false;
        }
        return true;
    }
    
    
}
