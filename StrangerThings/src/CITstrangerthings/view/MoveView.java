/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

import CITstrangerthings.control.MoveControl;
import CITstrangerthings.exceptions.MapControlException;
import CITstrangerthings.model.Location;
import CITstrangerthings.model.Character;
import CITstrangerthings.model.Game;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import strangerthings.StrangerThings;

/**
 *
 * @author Raye Ang
 */
public class MoveView extends View {

    public MoveView() {
        super("\n"
                + "\nN - Move North"
                + "\nS - Move South"
                + "\nW - Move West"
                + "\nE - Move East"
                + "\nQ - Exit move menu");
    }
    
    @Override
    public boolean doAction(String direction) {
        try {
             ArrayList<Character> characters = StrangerThings.getCurrentGame().getCharacters();
            Location[][] locations = StrangerThings.getCurrentGame().getMap().getLocations();
            direction = direction.toUpperCase();
            Location newPlace = MoveControl.move(characters, locations, direction);
            System.out.println(newPlace.getScene().getDescription());
            
        }
        catch (MapControlException ex) {
            System.out.println(ex.getMessage());
            
        }
        return false;
    }



 
}
