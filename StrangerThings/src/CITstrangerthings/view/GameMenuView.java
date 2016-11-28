/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

import CITstrangerthings.control.GameControl;
import CITstrangerthings.model.Game;
import CITstrangerthings.model.Items;
import CITstrangerthings.model.Location;
import CITstrangerthings.model.Map;
import java.util.Scanner;
import strangerthings.StrangerThings;

/**
 *
 * @author tibbit13
 */
public class GameMenuView extends View{

   public GameMenuView(){
   super(  "\n"
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                + "\n| Game Menu"
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                + "\nM - Move"
                + "\nI - Inventory"
                + "\nV - View Map"
                + "\nS - Save Game"
                + "\nH - Help"
                + "\nW - Weapon Manufacture/Status"
                + "\nP - Player Options"
                + "\nMarble - Solve the marble riddle"
                + "\nQ - Exit Game Menu"
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

   
    @Override
    public boolean doAction(String gameOption) {
        gameOption = gameOption.toUpperCase();

        switch (gameOption) {
            case "M":
                this.showMove();
                break;
            case "I":
                this.showInventory();
                break;
            case "V":
                this.showMap();
                break;
            case "S":
                this.saveGame();
                break;
            case "H":
                this.showHelp();
                break;
            case "W":
                this.showWeapon();
                break;
            case "P":
                this.playerOptions();
                break;
            case "MARBLE":
                this.showMarble();
                break;

            default:
                System.out.println("\n*** Invalid Selection, try again. ***");
                break;

        }
        return false;
    }

    private void showMove() {
        MoveView moveView = new MoveView();
        moveView.display();

    }

    private void showInventory() {
        StringBuilder word;
        
        Game game = StrangerThings.getCurrentGame();
        Items[] inventory = game.getInventory();
        
        System.out.println("\n++++ List of items you have ++++");
        word = new StringBuilder("                                                                      ");
        word.insert(0, "Name");
        word.insert(50, "Quantity");
        System.out.println(word.toString());
                        
        for (Items item : inventory) {
            word = new StringBuilder("                                                                      ");
            word.insert(0, item.getItemType());
            word.insert(50, item.getItemAmount());
            
            System.out.println(word.toString());
        }
    }

    private void showMap() {
       
        
       
        System.out.println("     The Map of MetroCity");
        StringBuilder mapDemo;
        mapDemo = new StringBuilder ("                                    ");
        mapDemo.insert(4,  "1");
        mapDemo.insert(11, "2");
        mapDemo.insert(19, "3");
        mapDemo.insert(26, "4");
        mapDemo.insert(33, "5");
        System.out.println(mapDemo.toString());
        
        //Work here
    }
    private void saveGame() {
        System.out.println("\n*** save game working  ***");
    }

    private void showHelp() {
        HelpView helpView = new HelpView();
        helpView.display();
    }

    private void showWeapon() {
        ShowWeaponView showWeaponView = new ShowWeaponView();
        showWeaponView.display();
    }


    private void playerOptions() {
        PlayerOptionView optionView = new PlayerOptionView();
        optionView.displayPlayerOption();
    }

    private void showMarble() {
        CountMarbleView marbleQuestion = new CountMarbleView();
        marbleQuestion.display();}

}
