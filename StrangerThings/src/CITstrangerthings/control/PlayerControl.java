/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.control;

import CITstrangerthings.exceptions.PlayerControlException;
import CITstrangerthings.model.Character;
import CITstrangerthings.model.FleeResults;
import CITstrangerthings.view.PlayerLostView;
import java.util.ArrayList;
import strangerthings.StrangerThings;

/**
 *
 * @author tibbit13
 */
public class PlayerControl {

    public static FleeResults playerFlee(double fVel, double initVel, double time, double ans) throws PlayerControlException {
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

        ArrayList<Character> party = StrangerThings.getCurrentGame().getCharacters();
        FleeResults fleeresult = new FleeResults();

        if (acc != ans) {
            Character LostMember = party.get(0);
            StrangerThings.getCurrentGame().getCharacters().remove(0);
            fleeresult.setCharacterRemoved(LostMember);
            fleeresult.setMessage("\nYour answer was wrong. The monster grabs \n"
                    + LostMember.getCharacterName() + " from your team! The rest of you"
                    + "\ncontinues to run.\n"
                    + "\nFlee again or the monster will get you.");
            if (party.isEmpty()) {
                fleeresult.setReason(-2);
            } else {
                fleeresult.setReason(-1);
            }
        } else {
            fleeresult.setMessage("You ran away from the monster with an acceleration of "
                    + ans + "m/s squared!  The monster is soon lost in the folds of darkness.");
            fleeresult.setReason(0);
        }
        return fleeresult;
    }

    public static double playerAttack(int userSwing, int weaponStrength) throws PlayerControlException {
        if (userSwing < 1 || userSwing > 75) {
            throw new PlayerControlException("You cannot swing weapon that slow or that fast.");
        }
        if (weaponStrength < 1) {
            throw new PlayerControlException("Invalid weapon strength.");
        }
        double totalForce = (weaponStrength * userSwing) / 60;
        return totalForce;
    }
}
