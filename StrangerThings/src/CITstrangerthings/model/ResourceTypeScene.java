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
public class ResourceTypeScene implements Serializable {

private String itemType;
private double amountAvailable;

    public ResourceTypeScene() {
    }



    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.itemType);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.amountAvailable) ^ (Double.doubleToLongBits(this.amountAvailable) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "ResourceTypeScene{" + "itemType=" + itemType + ", amountAvailable=" + amountAvailable + '}';
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
        final ResourceTypeScene other = (ResourceTypeScene) obj;
        if (Double.doubleToLongBits(this.amountAvailable) != Double.doubleToLongBits(other.amountAvailable)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        return true;
    }
    
    


        
}
