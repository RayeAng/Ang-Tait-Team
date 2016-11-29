/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.model;
import java.io.Serializable;

/**
 *
 * @author Raye Ang
 */
public class Map implements Serializable {
    private int rowCount;
    private int columnCount;
    
    Location[][] locations;

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
   

    public Map(int rows, int columns) {
       if (rows < 1 || columns <1){
           System.out.println("rows and columns must be greater than 0!");
       return;
    }
       this.rowCount = rowCount;
       this.columnCount = columnCount;
       this.locations = new Location[rowCount][columnCount];
       
       for (int row = 0; row < rowCount; row++){
           for (int column = 0; column < columnCount; column++){
               
               Location location = new Location();
               location.setColumn(column);
               location.setRow(row);
               location.setVisit(false);
               
               this.locations[row][column] = location;
           }
       }
    }

    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        return true;
    }
    
}
