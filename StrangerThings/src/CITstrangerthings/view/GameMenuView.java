/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

import java.util.Scanner;

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
        System.out.println("\n*** show inventory working   ***");
    }

    private void showMap() {
        System.out.println("\n*** show map working  ***");
    }

    private void saveGame() {
        System.out.println("\n*** save game working  ***");
    }

    private void showHelp() {
        HelpView helpView = new HelpView();
        helpView.display();
    }

    private void showWeapon() {
        System.out.println("\n*** show weapon working  ***");
    }


    private void playerOptions() {
        PlayerOptionView optionView = new PlayerOptionView();
        optionView.displayPlayerOption();
    }

}
