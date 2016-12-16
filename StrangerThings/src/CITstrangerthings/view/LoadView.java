/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

import CITstrangerthings.control.GameControl;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import strangerthings.StrangerThings;

/**
 *
 * @author tibbit13
 */
public class LoadView extends View{

    public LoadView() {
        super("\nEnter your game name: ");
    }


    @Override
    public boolean doAction(String value) {
        try {
            GameControl.loadGame(value);
            System.out.println("\nYour game has been loaded!");
            GameMenuView gamemenuview = new GameMenuView();
            gamemenuview.display();
            return true;
        }
        catch (IOException sv){
            System.out.println(sv.getMessage());
            return false;
        } catch (ClassNotFoundException ex) {
            
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
}

