/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

import CITstrangerthings.control.PlayerControl;
import CITstrangerthings.exceptions.PlayerControlException;
import java.util.Scanner;

/**
 *
 * @author tibbit13
 */
public class PlayerFleeView extends View {

    public PlayerFleeView() {
        super("\n"
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                + "\n You have found a monster, and have chosen to make like dodge. \n You flee "
                + "at an initial velocity of 7 m/s and a final velocity of 10 m/s \n in 4 seconds. "
                + "Type in the correct acceleration to escape.  The monster \n hates kids who "
                + "can't math good.");

    }

    @Override
    public boolean doAction(String playerFlee) {
        
        try {
            double acc = Double.parseDouble(playerFlee);
            PlayerControl.playerFlee(10, 7, 4, 1.5, acc);
            System.out.println("You ran away from the monster with an acceleration of "
                    + acc + "m/s squared!  The monster is soon lost in the folds of darkness.");
            return true;
        }
       

        catch (PlayerControlException pf){
            System.out.println(pf.getMessage());
            return false;
        }

    }



}

