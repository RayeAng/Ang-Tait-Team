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
import CITstrangerthings.model.Location;
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
        
//        MapControl.moveActorsToStartingLocation(map);
        

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
        
        Scene[] scenes = createScenes();
        
        GameControl.assignsScenesToLocations(map, scenes);
    
    return map;
    }

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneEnum.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
        "You and your friends are in the basement of Mike's house.  It is the \nplace of your fort and meeting place!"
                + "\nThere you are safe from the monsters, government officials, and sherrif.  You've been meeting here"
                + "\nfor weeks, and now you think it is time to rid the town of monsters for good, and to save your friend"
                + "\nWill!  He must be really scared in the Upside-Down. As of right now, your party consists of Mike, Lucas"
                + "\nDustin.");
        startingScene.setMapSign(" FT ");
        startingScene.setRestricted(false);
        scenes[SceneEnum.start.ordinal()] = startingScene;
        
        Scene forestScene = new Scene();
        forestScene.setDescription(
        "The spooky forest.  You and your friends call it Mirkwood, from The Hobbit.  There are weird shadows"
                + "\nflying all around you.  The trees creek and rattle in the chill wind.  Even on a calm"
                + "day, there are unnatural noises all around....BOO!");
        forestScene.setMapSign(" ♣♣ ");
        forestScene.setRestricted(false);
        scenes[SceneEnum.forest.ordinal()] = forestScene;
        
        Scene schoolScene = new Scene();
        schoolScene.setDescription(
        "The school. No child should have to endure such a place.  Necessity has brought you here, and your resolve"
                + "\nreflects your love for your missing friend.  Your party's hearts feel warm.  The building looms up"
                + "\nbefore you, and you are eager break in and look for pudding and other supplies, and then to high-tail"
                + "it out of there.");
        schoolScene.setMapSign(" SC ");
        schoolScene.setRestricted(false);
        scenes[SceneEnum.school.ordinal()] = schoolScene;
        
        Scene weirdNeighborScene = new Scene();
        weirdNeighborScene.setDescription(
        "Beau Radcliffe's old place.  It's been abandoned for years.  Legend has it that"
                + "\n it's haunted, and that the floors are littered with deadly traps.  Your party wonders if"
                + "\nthere are supplies here to upgrade your weapon.  You wouldn't be surprised if this is where"
                + "\nthe portal is either.  Consider exploration here as a recon mission. ");
        weirdNeighborScene.setMapSign(" ◘ ");
        weirdNeighborScene.setRestricted(false);
        scenes[SceneEnum.weirdNeighbor.ordinal()] = weirdNeighborScene;
        
        Scene teacherOfficeScene = new Scene();
        teacherOfficeScene.setDescription(
        "Within the school, you find Mr. Lewdinski's office.  A trusted teacher, you break into his office"
                + "\nlooking for equipment.  He is the one who told you about the Upside-Down, after all."
                + "You break in and find a safe with a note placed on it.");
        teacherOfficeScene.setMapSign(" SC ");
        teacherOfficeScene.setRestricted(false);
        scenes[SceneEnum.school.ordinal()] = teacherOfficeScene;
        
        Scene governmentBuildingScene = new Scene();
        governmentBuildingScene.setDescription(
        "A pristine white building funded by the government. Not much is known about the building, except"
                + "\nit is well-guarded, with security guards and cameras"
                + "\nwatching even the pavement outside the building."
                + "\nThere's no way to sneak into the building.");
        governmentBuildingScene.setMapSign(" $ ");
        governmentBuildingScene.setRestricted(true);
        scenes[SceneEnum.governmentBuilding.ordinal()] = governmentBuildingScene;
        
         Scene sherrifOfficeScene = new Scene();
        sherrifOfficeScene.setDescription(
        "It's the Sherrif's office. You get caught by the sherrif."
                + "\nHe yells at your party saying that kids should"
                + "\nnot be playing with dangerous objects! He takes"
                + "\naway all of your items.");
        sherrifOfficeScene.setMapSign(" SO ");
        sherrifOfficeScene.setRestricted(true);
        scenes[SceneEnum.sherrifOffice.ordinal()] = sherrifOfficeScene;        
               
         Scene portalScene = new Scene();
        portalScene.setDescription(
        "You found the portal! It hums with a terrible energy."
                + "\nYou feel chills up your spines and"
                + "\ncan almost hear screaming from the other"
                + "\nside. The final monster is resting in there. This is your"
                + "\nchance to take it out and save the town! Are you ready to fight"
                + "\nit? You cannot run away from the monster unscratched.");
        portalScene.setMapSign(" ○ ");
        portalScene.setRestricted(false);
        scenes[SceneEnum.upsideDown.ordinal()] = portalScene;        
        
        Scene cliffSideScene = new Scene();
        cliffSideScene.setDescription(
        "This is where they found Will's 'body', but you know it was a fake."
                + "\nMany people have fallen to their deaths here.  BE CAREFUL!"
                + "\nWarning signs line the edge of the gully, but you feel there "
                + "\nmight be clues there.");
        cliffSideScene.setMapSign(" ▲‼ ");
        cliffSideScene.setRestricted(true);
        scenes[SceneEnum.cliffSide.ordinal()] = cliffSideScene; 
        
        return scenes;
    }


    private static void assignsScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations [0][1].setScene(scenes[SceneEnum.school.ordinal()]);
        locations [0][2].setScene(scenes[SceneEnum.school.ordinal()]);
        locations [0][3].setScene(scenes[SceneEnum.forest.ordinal()]);
        locations [0][4].setScene(scenes[SceneEnum.forest.ordinal()]);
        locations [0][5].setScene(scenes[SceneEnum.forest.ordinal()]);
    }
}
