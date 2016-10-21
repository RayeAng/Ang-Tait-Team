/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Raye Ang
 */
public class PlayerControlTest {
    
    public PlayerControlTest() {
    }

    /**
     * Test of playerAttack method, of class PlayerControl.
     */
    @Test
    public void testPlayerAttack() {
        System.out.println("Test case #1");
        int userSwing = 25;
        int weaponStrength = 5;
        PlayerControl instance = new PlayerControl();
        double expResult = 2.0;
        double result = instance.playerAttack(userSwing, weaponStrength);
        assertEquals(expResult, result, 0);
        
        System.out.println("Test case #2");
        userSwing = -5;
        weaponStrength = 5;
        expResult = -1;
        result = instance.playerAttack(userSwing, weaponStrength);
        assertEquals(expResult, result, 0);
        
        System.out.println("Test case #3");
        userSwing = 80;
        weaponStrength = 5;
        expResult = -1;
        result = instance.playerAttack(userSwing, weaponStrength);
        assertEquals(expResult, result, 0);
        
        System.out.println("Test case #4");
        userSwing = 0;
        weaponStrength = 5;
        expResult = -1;
        result = instance.playerAttack(userSwing, weaponStrength);
        assertEquals(expResult, result, 0);
        
        System.out.println("Test case #5");
        userSwing = 25;
        weaponStrength = 0;
        expResult = -1;
        result = instance.playerAttack(userSwing, weaponStrength);
        assertEquals(expResult, result, 0);
        
        System.out.println("Test case #6");
        userSwing = 75;
        weaponStrength = 5;
        expResult = 6;
        result = instance.playerAttack(userSwing, weaponStrength);
        assertEquals(expResult, result, 0);
        
        System.out.println("Test case #7");
        userSwing = 1;
        weaponStrength = 5;
        expResult = 0;
        result = instance.playerAttack(userSwing, weaponStrength);
        assertEquals(expResult, result, 0);
        
        System.out.println("Test case #8");
        userSwing = 25;
        weaponStrength = 1;
        expResult = 0;
        result = instance.playerAttack(userSwing, weaponStrength);
        assertEquals(expResult, result, 0);
    }
    
}
