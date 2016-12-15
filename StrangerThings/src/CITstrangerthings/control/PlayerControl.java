/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.control;

import CITstrangerthings.exceptions.PlayerControlException;
import CITstrangerthings.model.Character;
import CITstrangerthings.model.Game;
import java.util.ArrayList;
import strangerthings.StrangerThings;

/**
 *
 * @author tibbit13
 */
public class PlayerControl {

    public static boolean playerFlee(double fVel, double initVel, double time, double ans) throws PlayerControlException {
        if (fVel < 1.0 || initVel < 1.0 || time < 1.0) {
            throw new PlayerControlException("You can't run that slow, flee again!");
        }
        if (fVel > 15.0 || initVel > 15.0 || time > 5.0) {
            throw new PlayerControlException("You can't run that fast either, flee again!");
        }
        if (initVel > fVel) {
            playerFlee(fVel, initVel, time, ans);
        }

        double acc = ((fVel - initVel) / time);
//Acceleration = ((Final Velocity - Initial Velocity)/Time);
        ans = (int) (ans * 100) / 100;
        acc = (int) (acc * 100) / 100;
        if (acc != ans) {
            StrangerThings.getCurrentGame().getCharacters().remove(0);

            if (StrangerThings.getCurrentGame().getCharacters().size() == 0) {
                return true;

            }
            
            throw new PlayerControlException("Your answer was wrong, flee again or the monster will get you.");
        } return false;
    }

    public static double playerAttack(int userSwing, int weaponStrength) throws PlayerControlException {
        if (userSwing < 1 || userSwing > 75) {
            throw new PlayerControlException("Cannot swing weapon that slow.");
        }
        if (weaponStrength < 1) {
            throw new PlayerControlException("Invalid weapon strength.");
        }
        double totalForce = (weaponStrength * userSwing) / 60;
        return totalForce;
    }
}
