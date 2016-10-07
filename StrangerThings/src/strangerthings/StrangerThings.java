/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strangerthings;

import CITstrangerthings.model.Game;
import CITstrangerthings.model.Player;
import CITstrangerthings.model.Weapons;

/**
 *
 * @author Tibbit13 & RayeAng
 */
public class StrangerThings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Game Class section
        Game gameOne = new Game();
        
        gameOne.setNoPlayers(11);
        gameOne.setTotalTime(100.00);
        
        String gameInfo = gameOne.toString();
        System.out.println("\n" + gameInfo + "\n");
        
        //Weapons Class section
        Weapons weapon1 = new Weapons();
        
        weapon1.setName("Baseball Bat");
        weapon1.setItemNumber(1);
        
        String weaponInfo = weapon1.toString();
        System.out.println("\n" + weaponInfo + "\n");
        
        //Player Class section
        Player newPlayer = new Player();
        
        newPlayer.setName("Archie Tait");
        newPlayer.setPlayerFear("Fish");
        
        String playerInfo = newPlayer.toString();
        System.out.println("\n" + playerInfo + "\n");
    }
    
}
