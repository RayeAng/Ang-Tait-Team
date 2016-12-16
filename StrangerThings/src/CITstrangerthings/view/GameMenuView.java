/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

import CITstrangerthings.control.GameControl;
import CITstrangerthings.control.MapControl;
import CITstrangerthings.model.Game;
import CITstrangerthings.model.Item;
import CITstrangerthings.model.Location;
import CITstrangerthings.model.Map;
import CITstrangerthings.model.Scene;
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
        Item[] inventory = game.getInventory();
        
        Item[] sort_inventory = GameControl.inventory_srt(inventory);
        
        System.out.println("\n       ++++ List of items you have ++++");
        word = new StringBuilder("                                                                      ");
        word.insert(0, "Name");
        word.insert(50, "Quantity");
        System.out.println(word.toString());
                        
        for (Item item : sort_inventory) {
            word = new StringBuilder("                                                                      ");
            word.insert(0, item.getItemType());
            word.insert(50, item.getItemAmount());
            System.out.println(word.toString());
        }
    }

    private void showMap() {
        StringBuilder word;
        System.out.println("\n     The Map of MetroCity");
        word = new StringBuilder("                                                                      ");
        word.insert(6, "1");
        word.insert(13, "2");
        word.insert(20, "3");
        word.insert(27, "4");
        word.insert(34, "5");
        System.out.print(word.toString()); 
        
       Location[][] locations = StrangerThings.getCurrentGame().getMap().getLocations();
           for (int i = 0; i < locations.length; i++) {
            
            System.out.print("\n   ------------------------------------\n");
            System.out.print(i+1);
                for (int j = 0; j < locations[i].length; j++) {
                     System.out.print("  |  ");
                     Location location = locations[i][j];
                     Scene scene = location.getScene();
                     boolean visit = location.getVisit();
                     if (visit == true) {
                         System.out.print(scene.getMapSign()+" ");
                     }
                     else {
                         System.out.print("??");
                     }
                }
            System.out.print("  |");
        }
        System.out.println("\n   ------------------------------------");
    }
    
    private void saveGame() {
        SavingView SavingGame = new SavingView();
        SavingGame.display();
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
