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
    public double playerAttack (int userSwing, int weaponStrength) {
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
