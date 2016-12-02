/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

import CITstrangerthings.control.GameControl;
import java.util.Scanner;
import strangerthings.StrangerThings;

/**
 *
 * @author Raye Ang
 */
public class MainMenuView extends View{
   
    public MainMenuView(){
                super("\n"
            + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
            + "\n| Main Menu"
            + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
            + "\nN - Start New Game"
            + "\nL - Load Previous Game"
            + "\nS - Save Current Game"
            + "\nQ - Quit Game"
            + "\nH - Help Menu"
            + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
    @Override
    public boolean doAction (String value){
        value = value.toUpperCase();{
    }
        
        switch (value){
            case "N":
                this.startNewGame();
                break;
            case "L":
                this.loadExistingGame();
                break;
            case "S":
                this.saveGame();
                break;
            case "Q": 
                this.quitGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "M":
                System.out.println("\n*** Temporary function. ***");
                this.MapView();
                break;
            default: 
                System.out.println("\n*** Invalid selection, try using an available selection. ***");
                break;
                   
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(StrangerThings.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadExistingGame() {
        System.out.println("*** load game successful ***");
    }

    private void saveGame() {
        System.out.println("*** save game successful ***");
    }

    private void quitGame() {
        System.out.println("*** quit game successful ***");
    }

    private void displayHelpMenu() {
        HelpView helpView = new HelpView();
        helpView.display();
    }

    private void MapView() {
        MoveView moveView = new MoveView();
        moveView.display();
    }
}
