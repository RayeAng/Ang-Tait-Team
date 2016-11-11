/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

import CITstrangerthings.control.MapControl;
import java.util.Random;

/**
 *
 * @author Raye Ang
 */
public class CountMarbleView extends View {

    public CountMarbleView() {
        super("\nHow many marbles are left?");

        Random rand1 = new Random();
        int x = rand1.nextInt(342) + 1;
        Random rand2 = new Random();
        int y = rand2.nextInt(100) + 1;
        
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                + "\nYou came across a lock door. After"
                + "\nsearching the area, you find a"
                + "\npaper that says:"
                + "\nAndrew had " + x + " number of "
                + "\nmarbles. He lost half of them in"
                + "\na match, gained "+ y +" more in "
                + "\nhis next match but lost a third"
                + "\nof his final. ");
    }

    @Override
    public boolean doAction(String userAns) {
        userAns = userAns.toUpperCase();
        int playerAns = Integer.parseInt(userAns);
        MapControl.marbleCount(playerAns, x, y);
        return false;
    }
    private void moveNorth() {
        System.out.println("\nPlayer has moved north!");
    }

}
