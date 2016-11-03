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
public class PlayerAttackView {
    private String game;

    public void displayAttack() {

        boolean done = false;
        do {
            String playerChoice = this.getPlayerChoice();
            if (playerChoice.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(playerChoice);

        } while (!done);
    }

    public PlayerAttackView() {
        this.game = "\n"
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                + "\n You have found a monster, and have chosen to attack.  How fast should" 
               + "you swing your weapon?"
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";
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

    private boolean doAction(String playerChoice) {
        //call control function PlayerAttack()
        int swing = Integer.parseInt(playerChoice);
        double value = PlayerControl.playerAttack(swing, 5);
        //if the return value is -1, then
        if (value==-1){
            System.out.println("Error, your input was terrible.");
            return false;
        }
        
        else {
            System.out.println("You hit the monster with " + value + "! He is dead.");
            return true;
            
        }
       

    
        
}
}