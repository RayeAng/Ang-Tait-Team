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
 * @author tibbit13
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of marbleCount method, of class MapControl.
     */
    @Test
    public void testMarbleCount() {
        System.out.println("marbleCount\n test 1"); 
        int userAnswer = 127;
        int x = 254;
        int y = 64;
        MapControl instance = new MapControl();
        int expResult = 1;
        int result;
        result = instance.marbleCount(userAnswer, x, y);
        assertEquals(expResult, result);
        
        System.out.println("test 2"); 
         userAnswer = 27;
         x = 254;
         y = 64;
         expResult = 0;
         result = instance.marbleCount(userAnswer, x, y);
        assertEquals(expResult, result);
        
        System.out.println("test 3"); 
         userAnswer = -23;
         x = 254;
         y = 14;
         expResult = -1;
         result = instance.marbleCount(userAnswer, x, y);
        assertEquals(expResult, result);
        
        System.out.println("test 4"); 
         userAnswer = 345;
         x = 254;
         y = 14;
         expResult = -1;
         result = instance.marbleCount(userAnswer, x, y);
        assertEquals(expResult, result);
        
        System.out.println("test 5"); 
         userAnswer = 5;
         x = -5;
         y = 50;
         expResult = -1;
         result = instance.marbleCount(userAnswer, x, y);
        assertEquals(expResult, result);
        
        System.out.println("test 6"); 
         userAnswer = 8;
         x = 345;
         y = 52;
         expResult = -1;
         result = instance.marbleCount(userAnswer, x, y);
        assertEquals(expResult, result);
        
        System.out.println("test 7"); 
         userAnswer = 8;
         x = 54;
         y = -25;
         expResult = -1;
         result = instance.marbleCount(userAnswer, x, y);
        assertEquals(expResult, result);
        
        System.out.println("test 8"); 
         userAnswer = 5;
         x = 99;
         y = 124;
         expResult = -1;
         result = instance.marbleCount(userAnswer, x, y);
        assertEquals(expResult, result);
        
        System.out.println("test 9"); 
         userAnswer = 1;
         x = 1;
         y = 1;
         expResult = 1;
         result = instance.marbleCount(userAnswer, x, y);
        assertEquals(expResult, result);
        
        System.out.println("test 10"); 
         userAnswer = 180;
         x = 342;
         y = 100;
         expResult = 1;
         result = instance.marbleCount(userAnswer, x, y);
        assertEquals(expResult, result);
        
        System.out.println("test 11"); 
         userAnswer = 5;
         x = 9;
         y = 3;
         expResult = 1;
         result = instance.marbleCount(userAnswer, x, y);
        assertEquals(expResult, result);
        
        System.out.println("test 12"); 
         userAnswer = 122;
         x = 342;
         y = 12;
         expResult = 1;
         result = instance.marbleCount(userAnswer, x, y);
        assertEquals(expResult, result);
        
        System.out.println("test 13"); 
         userAnswer = 19;
         x = 55;
         y = 1;
         expResult = 1;
         result = instance.marbleCount(userAnswer, x, y);
        assertEquals(expResult, result);
        
        System.out.println("test 14"); 
         userAnswer = 85;
         x = 55;
         y = 100;
         expResult = 1;
         result = instance.marbleCount(userAnswer, x, y);
        assertEquals(expResult, result);
    }
    
}
