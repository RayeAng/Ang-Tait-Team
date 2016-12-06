/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.control;

import CITstrangerthings.exceptions.MapControlException;
import strangerthings.StrangerThings;

/**
 *
 * @author tibbit13
 */
public class MapControl {

    public static void marbleCount(int userAnswer, int x, int y) throws MapControlException {

        if (userAnswer < 1 || userAnswer > 342) {
            throw new MapControlException("Either you're answering less marbles"
                    + "\nor more marbles than you can carry.");
        }
        if (x < 1 || x > 342) {
            throw new MapControlException("Random x-value out of range");
        }
        if (y < 1 || y > 100) {
            throw new MapControlException("Random y-value out of range");
        }
        int compAns = (int) (((((double) x / 2) + (double) y) / 3) * 2);

        if (userAnswer != compAns) {
            throw new MapControlException("Your answer is quite false");
        } 

    }
    

    
}
