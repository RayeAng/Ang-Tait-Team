/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.control;

import strangerthings.StrangerThings;

/**
 *
 * @author tibbit13
 */
public class MapControl {

    public static int marbleCount(int userAnswer, int x, int y) {

        if (userAnswer < 1 || userAnswer > 342) {
            return -1;
        }
        if (x < 1 || x > 342) {
            return -1;
        }
        if (y < 1 || y > 100) {
            return -1;
        }
        int compAns = (int) (((((double) x / 2) + (double) y) / 3) * 2);

        if (userAnswer != compAns) {
            return 0;
        } else {
            return 1;
        }

    }

    
}
