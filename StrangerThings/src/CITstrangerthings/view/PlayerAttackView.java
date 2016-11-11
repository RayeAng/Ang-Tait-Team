/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

import CITstrangerthings.control.PlayerControl;

/**
 *
 * @author tibbit13
 */
public class PlayerAttackView extends View {
    public PlayerAttackView() {
        super("\n"
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                + "\n You have found a monster, and have chosen to attack.  How fast should you swing your weapon?"
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    @Override
    public boolean doAction(String playerChoice) {
        playerChoice = playerChoice.toUpperCase();
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