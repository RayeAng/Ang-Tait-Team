/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 
 * @author tibbit13
 */
public class PlayerControlTest {

    public PlayerControlTest() {
    }

    /**
     * Test of playerFlee method, of class PlayerControl.
     */
    @Test
    public void testPlayerFlee() {
        System.out.println("playerFlee\n \bTest 1");
        double fVel = 12.0;
        double initVel = 2.0;
        double time = 4.0;
        double acc = 2.50;
        double ans = 2.50;
        PlayerControl instance = new PlayerControl();
        int expResult = 1;
        int result = instance.playerFlee(fVel, initVel, time, acc, ans);
        assertEquals(expResult, result);

        System.out.println("Test 2");
        fVel = 10.0;
        initVel = 4.0;
        time = 2.0;
        acc = 3;
        ans = 18.52;

        expResult = 0;
        result = instance.playerFlee(fVel, initVel, time, acc, ans);
        assertEquals(expResult, result);

        System.out.println("Test 3");
        fVel = 10.0;
        initVel = -7.05;
        time = 3.0;
        acc = 0.98;
        ans = 0.98;
        expResult = -1;
        result = instance.playerFlee(fVel, initVel, time, acc, ans);
        assertEquals(expResult, result);

//System.out.println("Test 4");
//fVel = 10;
//initVel = 6;
//time = 4;
//acc = 5;
//ans = 5;
//expResult = -1;
//result = instance.playerFlee(fVel, initVel, time, acc, ans);
//assertEquals(expResult, result);
        System.out.println("Test 4");
        fVel = 4.0;
        initVel = 25.0;
        time = 5.0;
        acc = 3.22;
        ans = 3.22;
        expResult = -1;
        result = instance.playerFlee(fVel, initVel, time, acc, ans);
        assertEquals(expResult, result);

        System.out.println("Test 5");
        fVel = 54.0;
        initVel = 5.0;
        time = 4.5;
        acc = 3.8;
        ans = 3.8;
        expResult = -1;
        result = instance.playerFlee(fVel, initVel, time, acc, ans);
        assertEquals(expResult, result);

        System.out.println("Test 6");
        fVel = 8.0;
        initVel = 6.0;
        time = 124.0;
        acc = 5.0;
        ans = 5.0;
        expResult = -1;
        result = instance.playerFlee(fVel, initVel, time, acc, ans);
        assertEquals(expResult, result);

        System.out.println("Test 7");
        fVel = 1.0;
        initVel = 1.0;
        time = 1.0;
        acc = 0.0;
        ans = 0.0;
        expResult = 1;
        result = instance.playerFlee(fVel, initVel, time, acc, ans);
        assertEquals(expResult, result);

        System.out.println("Test 8");
        fVel = 15.0;
        initVel = 15.0;
        time = 5.0;
        acc = 0.0;
        ans = 0.0;
        expResult = 1;
        result = instance.playerFlee(fVel, initVel, time, acc, ans);
        assertEquals(expResult, result);

        System.out.println("Test 9");
        fVel = 9.0;
        initVel = 15.0;
        time = 3.0;
        acc = -2.0;
        ans = -2.0;
        expResult = 1;
        result = instance.playerFlee(fVel, initVel, time, acc, ans);
        assertEquals(expResult, result);

        System.out.println("Test 10");
        fVel = 15.0;
        initVel = 12.0;
        time = 2.0;
        acc = 1.5;
        ans = 1.5;
        expResult = 1;
        result = instance.playerFlee(fVel, initVel, time, acc, ans);
        assertEquals(expResult, result);

        System.out.println("Test 11");
        fVel = 5.0;
        initVel = 8.0;
        time = 5.0;
        acc = -0.6;
        ans = -0.6;
        expResult = 1;
        result = instance.playerFlee(fVel, initVel, time, acc, ans);
        assertEquals(expResult, result);

        System.out.println("Test 12");
        fVel = 5.0;
        initVel = 1.0;
        time = 4.0;
        acc = 1.0;
        ans = 1.0;
        expResult = 1;
        result = instance.playerFlee(fVel, initVel, time, acc, ans);
        assertEquals(expResult, result);

    }

 

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
