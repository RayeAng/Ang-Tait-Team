/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strangerthings;

import CITstrangerthings.model.Game;
import CITstrangerthings.model.Player;
import CITstrangerthings.model.Weapons;
import CITstrangerthings.model.Character;
import CITstrangerthings.model.Items;
import CITstrangerthings.model.Location;
import CITstrangerthings.model.Map;
import CITstrangerthings.model.Scene;
import CITstrangerthings.model.Monster;
import CITstrangerthings.model.ResourceTypeScene;
import CITstrangerthings.view.StartProgramView;

/**
 *
 * @author Tibbit13 & RayeAng
 */
public class StrangerThings {

    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        StrangerThings.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        StrangerThings.player = player;
    }

    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }

}
