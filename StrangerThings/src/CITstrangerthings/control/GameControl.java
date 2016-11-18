/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.control;

import CITstrangerthings.model.Game;
import CITstrangerthings.model.ItemEnum;
import CITstrangerthings.model.Items;
import CITstrangerthings.model.Map;
import CITstrangerthings.model.Player;
import CITstrangerthings.model.Weapons;
import java.util.ArrayList;
import strangerthings.StrangerThings;
import CITstrangerthings.model.Character;
import CITstrangerthings.model.Scene;
import CITstrangerthings.model.SceneEnum;

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

        game.setPlayerPlaying(player);

        Items[] items = GameControl.createItems();
        game.setInventory(items);

        ArrayList<Character> characters= GameControl.createCharacters();
        game.setCharacters(characters);

        Map map = MapControl.createMap();
        game.setMap(map);

    }

    private static Items[] createItems() {
        Items[] items = new Items[6];

        Items nails = new Items();
        nails.setItemType("Nails");
        nails.setItemAmount(0);
        nails.setRequiredAmount(0);
        items[ItemEnum.nails.ordinal()] = nails;

        Items barbedWire = new Items();
        barbedWire.setItemType("Barbed-Wire, ouchy wa wa!");
        barbedWire.setItemAmount(0);
        barbedWire.setRequiredAmount(0);
        items[ItemEnum.barbedWire.ordinal()] = barbedWire;

        Items glassShards = new Items();
        glassShards.setItemType("Glass Shards of death");
        glassShards.setItemAmount(0);
        glassShards.setRequiredAmount(0);
        items[ItemEnum.glassShards.ordinal()] = glassShards;

        Items thorns = new Items();
        thorns.setItemType("Thorns from a tree");
        thorns.setItemAmount(0);
        thorns.setRequiredAmount(0);
        items[ItemEnum.thorns.ordinal()] = thorns;

        Items rocks = new Items();
        rocks.setItemType("Rocks, they hurt in the head!");
        rocks.setItemAmount(0);
        rocks.setItemAmount(0);
        rocks.setRequiredAmount(0);
        items[ItemEnum.rocks.ordinal()] = rocks;

        Items metal = new Items();
        metal.setItemType("Metal, sharpened with a pencil sharpener?!");
        metal.setItemAmount(0);
        metal.setItemAmount(0);
        metal.setRequiredAmount(0);
        items[ItemEnum.metal.ordinal()] = metal;

        return items;
    }

    private static ArrayList<Character> createCharacters() {
        ArrayList<Character> characters = new ArrayList<>();
        
        Character lucas = new Character("Lucas", "A black boy with spunk", "Slingshots like a champ.");
        characters.add(lucas);
        
        characters.add(new Character("Mike", "The main character", "Knows D&D really good"));
        characters.add(new Character("Dustin", "Kid has a lisp.  It's hilarious!", "Charisma and Hope!"));
        characters.add(new Character("Eleven", "Mysterious girl with shaved head.  Kinda cute.", "Telepathy and nosebleeds?!"));
        
        return characters;
        
    }
    private static Map createMap(){
  
        Map map = new Map(5, 5);
        
        SceneEnum[] scenes = createScenes();
        
        GameControl.assignsScenesToLocations(map, scenes);
    
    return map;
    }

    private static SceneEnum[] createScenes() {
        SceneEnum[] scenes = new SceneEnum[SceneEnum.values().length];
        return scenes;
    }


    private static void assignsScenesToLocations(Map map, SceneEnum[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
