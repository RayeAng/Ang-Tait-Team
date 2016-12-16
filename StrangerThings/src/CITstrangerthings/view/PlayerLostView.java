/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

/**
 *
 * @author Raye Ang
 */
public class PlayerLostView extends View{

    public PlayerLostView() {
        super("\nYou have lost your entire party. Game Over."
                + "\nDo you wish to start over?");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
        case "Y":
            this.newGame();
            break;

        default:
            System.out.println("\n*** Invalid Selection, try again. ***");
            break;
        }
    return false;
    }
    
    private void newGame() {
        MainMenuView StartNewGame = new MainMenuView();
        StartNewGame.display();
    }
}
