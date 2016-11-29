/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.control;

import CITstrangerthings.model.Location;
import CITstrangerthings.model.Map;
import CITstrangerthings.model.Scene;
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

    public static Map displayMap() {
       Location[][] locations = StrangerThings.getCurrentGame().getMap().getLocations();
        System.out.println("\n     The Map of MetroCity");
        System.out.println("\n    1       2       3       4       5");

       

        for (int i = 0; i < locations.length; i++) {
            
           System.out.println("----------------------");
           System.out.println(i+1);
            for (int j = 0; j < locations[i].length; j++) {
                 System.out.print("|");
                 Location location = locations[i][j];
                 Scene scene = location.getScene();
                 boolean visit = location.getVisit();
                 if (visit) {
                     System.out.print(scene.getMapSign());
                 }
                 else {
                     System.out.print("??");
                 }
                 

            }
            System.out.print("|");
            
            
        }
        System.out.println("\n------------------------------");
        return null;
    }
}
