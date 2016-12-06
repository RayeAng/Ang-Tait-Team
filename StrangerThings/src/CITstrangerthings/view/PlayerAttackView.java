/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

import CITstrangerthings.control.PlayerControl;
import CITstrangerthings.exceptions.PlayerControlException;

/**
 *
 * @author tibbit13
 */
public class PlayerAttackView extends View {
    public PlayerAttackView() {
        super("\n"
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                + "\nYou have found a monster, and have"
                + "\nchosen to attack.  How fast would"
                + "\nyou swing your weapon?"
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    @Override
    public boolean doAction(String playerChoice) {
        playerChoice = playerChoice.toUpperCase();
        int swing = Integer.parseInt(playerChoice);
        try {
            double value = PlayerControl.playerAttack(swing, 5);
            System.out.println("You hit the monster with " + value + "! He is dead.");
            return true;
        }
        catch (PlayerControlException pa) {
            System.out.println(pa.getMessage());
            return false;
        }
    }
}