/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.control;

import CITstrangerthings.exceptions.MapControlException;
import CITstrangerthings.model.Location;
import CITstrangerthings.model.Character;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Raye Ang
 */
public class MoveControl {

    public static Location move(ArrayList<Character> characters, Location[][] locations, String direction) throws MapControlException {
        
        Location oldLocation = null;
        Location newLocation = null;
        Character characterOne = characters.get(0);

        if (characters == null) {
            throw new MapControlException("You don't have a character to move!");
        }
        if (locations == null) {
            throw new MapControlException("We cannot pinpoint your party.");
        }
        
        
        if (direction.equals("S")) {
            if (characterOne.getCoordinates().x == 5) {
                throw new MapControlException("You cannot move anymore south");
            }
            else {
            oldLocation = locations[characterOne.getCoordinates().x][characterOne.getCoordinates().y];
            newLocation = locations[characterOne.getCoordinates().x + 1][characterOne.getCoordinates().y];
            }
        } else if (direction.equals("N")) {
            if (characterOne.getCoordinates().x == 0) {
                throw new MapControlException("You cannot move anymore north");
            }
            else {
            oldLocation = locations[characterOne.getCoordinates().x][characterOne.getCoordinates().y];
            newLocation = locations[characterOne.getCoordinates().x - 1][characterOne.getCoordinates().y];
            }
        } else if (direction.equals("E")) {
            if (characterOne.getCoordinates().y == 4) {
                throw new MapControlException("You cannot move anymore east");
            }
            else{
            oldLocation = locations[characterOne.getCoordinates().x][characterOne.getCoordinates().y];
            newLocation = locations[characterOne.getCoordinates().x][characterOne.getCoordinates().y + 1];
            }
        } else if (direction.equals("W")) {
            if (characterOne.getCoordinates().y == 0) {
                throw new MapControlException("You cannot move anymore west");
            }
            else {
            oldLocation = locations[characterOne.getCoordinates().x][characterOne.getCoordinates().y];
            newLocation = locations[characterOne.getCoordinates().x][characterOne.getCoordinates().y - 1];
            }
        } else {
            throw new MapControlException("Invalid Direction");
        }
        for (Character partyMember : characters) {
            newLocation.getCharacters().add(partyMember);
            oldLocation.getCharacters().remove(partyMember);
            partyMember.setCoordinates(new Point(newLocation.getRow(), newLocation.getColumn()));
        }
        newLocation.setVisit(true);
        return newLocation;
    }
}
