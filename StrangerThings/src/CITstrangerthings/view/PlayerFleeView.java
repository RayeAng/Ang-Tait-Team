/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

import CITstrangerthings.control.PlayerControl;
import java.util.Scanner;

/**
 *
 * @author tibbit13
 */
public class PlayerFleeView {
    private String game;

    public void displayFlee() {

        boolean done = false;
        do {
            String playerChoice = this.getPlayerChoice();
            if (playerChoice.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(playerChoice);

        } while (!done);
    }

    public PlayerFleeView() {
        this.game = "\n"
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                + "\n You have found a monster, and have chosen to make like dodge. \n You flee "
                + "at an initial velocity of 7 m/s and a final velocity of 10 m/s \n in 4 seconds. "
                + "Type in the correct acceleration to escape.  The monster \n hates kids who "
                + "can't math good.";
  
    }
    private String getPlayerChoice() {
        Scanner keyboard = new Scanner(System.in);

        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.game);

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

    private boolean doAction(String playerFlee) {
        //call control function PlayerAttack()
        double acc = Double.parseDouble(playerFlee);
        double value = PlayerControl.playerFlee(10, 7, 4, 1.5, acc );
        //if the return value is -1, then
        if (value==-1){
            System.out.println("Error, your input was terrible.");
            return false;
        }
        
        else {
            System.out.println("You ran away from the monster with an acceleration of "
                    + value + "m/s squared!  The monster is soon lost in the folds of darkness.");
            return true;
            
        }
       

    
}
}
