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
public class Items implements Serializable{
    
    private String itemType;
    private double itemAmount; 
    private double requiredAmount;

    public Items() {
    }
    
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public double getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(double itemAmount) {
        this.itemAmount = itemAmount;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.itemType);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.itemAmount) ^ (Double.doubleToLongBits(this.itemAmount) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Items{" + "itemType=" + itemType + ", itemAmount=" + itemAmount + ", requiredAmount=" + requiredAmount + '}';
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
        final Items other = (Items) obj;
        if (Double.doubleToLongBits(this.itemAmount) != Double.doubleToLongBits(other.itemAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        return true;
    }

  
    
    
    
}
