/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.control;

import CITstrangerthings.model.Map;

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

    public static Map createMap() {

        System.out.println("     The Map of MetroCity");
        System.out.println("    1    2    3    4    5   ");

        System.out.println("++++++++++++++++++++++++++++++++++");

        for (int i = 0; i < 4; i++) {
            System.out.print("|");

            System.out.print("??");
            System.out.print("|");
            for (int j = 0; j < 5; j++) {
                System.out.println("------------------------------");
            }
        }
        return null;
    }
}
