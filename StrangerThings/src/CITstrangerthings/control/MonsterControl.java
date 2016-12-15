/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.control;

import CITstrangerthings.exceptions.PlayerControlException;

/**
 *
 * @author tibbit13
 */
public class MonsterControl {
    public static double monsterAttack (int attackPower) throws PlayerControlException{
        if (attackPower < 1 || attackPower > 75) {
            throw new PlayerControlException("Monster's attack is invalid");
         }
        double totalForce = attackPower /60;
        return totalForce;
    }
}
