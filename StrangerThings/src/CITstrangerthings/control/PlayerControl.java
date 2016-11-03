/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.control;

/**
 *
 * @author tibbit13
 */
public class PlayerControl {

    public static int playerFlee(double fVel, double initVel, double time, double acc, double ans) {
        if (fVel < 1.0 || initVel < 1.0 || time < 1.0) {
            return -1;
        }
        if (fVel > 15.0 || initVel > 15.0 || time > 5.0) {
            return -1;
        }

        acc = ((fVel - initVel) / time);
//Acceleration = ((Final Velocity - Initial Velocity)/Time);

        if (acc != ans){
            return 0;
        }

        else {
            return 1;
        }
    }

    public static double playerAttack (int userSwing, int weaponStrength) {
        if (userSwing < 1 || userSwing > 75) {
            return -1;
         }
        if (weaponStrength < 1) {
            return -1;
        }

        double totalForce = weaponStrength * userSwing /60;
        return totalForce;

    }
}
