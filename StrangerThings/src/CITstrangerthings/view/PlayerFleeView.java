/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

import CITstrangerthings.control.PlayerControl;
import CITstrangerthings.exceptions.PlayerControlException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tibbit13
 */
public class PlayerFleeView extends View {
    
    Random rand1 = new Random();
    int init;
    Random rand2 = new Random();
    int finV;
    Random rand3 = new Random();
    int time;

    public PlayerFleeView() {
        super();
        finV = rand2.nextInt(15) + 1;
        init = rand1.nextInt(finV) + 1;
        
        time = rand3.nextInt(5) + 1;
        
        
        this.displayMessage= "\n"
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                + "\n You have found a monster, and have chosen to make like dodge. \n You flee "
                + "at an initial velocity of" + init + "m/s and a final velocity of "+ finV + "m/s \n in " +time+ " seconds. "
                + "Type in the correct acceleration to escape.  The monster \n hates kids who "
                + "can't math good.";

    }

    @Override
    public boolean doAction(String playerFlee) {
        
        try {
            double ans = Double.parseDouble(playerFlee);
            PlayerControl.playerFlee(this.finV, this.init, this.time, ans);
            System.out.println("You ran away from the monster with an acceleration of "
                    + ans + "m/s squared!  The monster is soon lost in the folds of darkness.");
            return true;
        }
       

        catch (PlayerControlException pf){
            System.out.println(pf.getMessage());
            return false;
        }

    }



}

