/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

import CITstrangerthings.control.GameControl;
import java.io.IOException;
import strangerthings.StrangerThings;

/**
 *
 * @author Raye Ang
 */
public class SavingView extends View{

    public SavingView() {
        super("\nEnter your game name: ");
    }


    @Override
    public boolean doAction(String value) {
        try {
            GameControl.saveGame(value, StrangerThings.getCurrentGame());
            System.out.println("\nYour game has been saved!");
            return true;
        }
        catch (IOException sv){
            System.out.println(sv.getMessage());
            return false;
        }
    }
    
}
