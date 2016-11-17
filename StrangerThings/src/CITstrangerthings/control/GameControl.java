/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.control;

import CITstrangerthings.model.Game;
import CITstrangerthings.model.Map;
import CITstrangerthings.model.Player;
import strangerthings.StrangerThings;

/**
 *
 * @author tibbit13
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);

        StrangerThings.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game();
        StrangerThings.setCurrentGame(game);
        
        game.setPlayerplaying(player);
        
        Map map = MapControl.createMap();
        
    }

}
