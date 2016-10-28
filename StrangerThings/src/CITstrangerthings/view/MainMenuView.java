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
public class MainMenuView {
    private String menu;
    
    public void displayMainMenuView() {
        
        boolean done = false;
        do{ 
            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
    }
    
    
public MainMenuView(){
    this.menu = "\n"
            + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
            + "\n| Main Menu"
            + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
            + "\nN - Start New Game"
            + "\nL - Load Previous Game"
            + "\nS - Save Current Game"
            + "\nQ - Quit Game"
            + "\nH - Help Menu"
            + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";
    }

    private String getMenuOption() {
       
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.menu);

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\nInvalid valude: value can not be blank");
                continue;
            }
            break;
        }
        return value;

    }

    private boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        
        switch (menuOption){
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
            default: 
                System.out.println("\n*** Invalid Selection, try again. ***");
                break;
                   
        }
        return false;
    }

    private void startNewGame() {
        
        GameControl.createNewGame(StrangerThings.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
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
        System.out.println("*** help me successful ***");
    }
    
}
