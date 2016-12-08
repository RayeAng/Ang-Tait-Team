/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.control;

import CITstrangerthings.model.Location;
import CITstrangerthings.model.Character;
/**
 *
 * @author Raye Ang
 */
public class MoveControl {
    public void move (CITstrangerthings.model.Character character, Location[][] locations, String direction) {
        if (direction == "S") {
            Location oldlocation = locations[character.getCoordinates().x][character.getCoordinates().y];
            Location newLocation = locations[character.getCoordinates().x + 1][character.getCoordinates().y];
        }
        else if (direction == "N") {
            Location oldlocation = locations[character.getCoordinates().x][character.getCoordinates().y];
            Location newLocation = locations[character.getCoordinates().x - 1][character.getCoordinates().y];
        }
        else if (direction == "E") {
            Location oldlocation = locations[character.getCoordinates().x][character.getCoordinates().y];
            Location newLocation = locations[character.getCoordinates().x][character.getCoordinates().y + 1];
        }
        else if (direction == "W") {
            Location oldlocation = locations[character.getCoordinates().x][character.getCoordinates().y];
            Location newLocation = locations[character.getCoordinates().x][character.getCoordinates().y - 1];
        }
        else {
            System.out.println("Where did you want to go??");
        }
        
    }
}
