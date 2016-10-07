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
public class Weapons implements Serializable {
    
    private String name;
    private double itemNumber;

    public Weapons() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(double itemNumber) {
        this.itemNumber = itemNumber;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.itemNumber) ^ (Double.doubleToLongBits(this.itemNumber) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Weapons{" + "name=" + name + ", itemNumber=" + itemNumber + '}';
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
        final Weapons other = (Weapons) obj;
        if (Double.doubleToLongBits(this.itemNumber) != Double.doubleToLongBits(other.itemNumber)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
  
}
