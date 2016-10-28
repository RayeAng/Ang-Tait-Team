/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

import java.util.Scanner;

/**
 *
 * @author tibbit13
 */
public class HelpView {
    private String help;
    
    public void displayHelpView() {
        
        boolean done = false;
        do{ 
            
            String helpOption = this.getHelpOption();
            if (helpOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(helpOption);
            
        } while (!done);
    }
    
    
public HelpView(){
    this.help = "\n"
            + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
            + "\n| Help Menu"
            + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
            + "\nG - Goal/Objective"
            + "\nS - See Backstory of Stranger Things"
            + "\nM - How to Move"
            + "\nL - List of Inventory"
            + "\nB - How to Upgrade Weapons"
            + "\nQ - Exit Help Menu"
            + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";
    }

    private String getHelpOption() {
       
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.help);

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\nInvalid valude: value can not be blank");
                continue;
            }
            break;
        }
        return value;

    }

    private boolean doAction(String helpOption) {
        helpOption = helpOption.toUpperCase();
        
        switch (helpOption){
            case "G":
                this.showGoal();
                break;
            case "S":
                this.showBackStory();
                break;
            case "M":
                this.movement();
                break;
            case "L": 
                this.showInventory();
                break;
            case "B":
                this.upgradeWeaponHelp();
                break;
            default: 
                System.out.println("\n*** Invalid Selection, try again. ***");
                break;
                   
        }
        return false;
    }

    private void showGoal() {
        System.out.println("\n*********************************"
                + "\n*  The three main characters are   *"
                + "\n*  Mike, Dustin, and Lucas are     *"
                + "\n*  out on an Adventure because     *"
                + "\n*  they lost \"Eleven\". They      *"
                + "\n*  are out in the woods with the   *"
                + "\n*  monster, other creatures, and   *"
                + "\n*  other obstacles such as         *"
                + "\n*  government officials and the    *"
                + "\n*  Sheriff. You will explore the   *"
                + "\n*  map seeking required items in   *"
                + "\n*  order to destroy the monster    *"
                + "\n*  while avoiding the Sheriff and  *"
                + "\n*  the government. Using simple    *"
                + "\n*  commands you will move your     *"
                + "\n*  characters in order to complete *"
                + "\n*  the tasks that are needed to    *"
                + "\n*  complete the game. Take one     *"
                + "\n*  wrong turn the game is OVER!    *"
                + "\n**********************************");
    }

    private void showBackStory() {
        System.out.println("\n**********************************"
                + "\n*  Stranger things is an American  *"
                + "\n*  science fiction-horror web      *"
                + "\n*  television series created by    *"
                + "\n*  the Duffer Brothers. The plot   *"
                + "\n*  follows the disappearance of a  *"
                + "\n*  young boy, and a telekinetic    *"
                + "\n*  girl who helps his friends in   *"
                + "\n*  their search, while the boy's   *"
                + "\n*  older brother, his mother, and  *"
                + "\n*  the town police chief start     *"
                + "\n*  their own investigations.       *"
                + "\n**********************************");
    }

    private void movement() {
        System.out.println("\n**********************************"
                + "\n*  Characters will all be moving   *"
                + "\n*  together one space at a time.   *"
                + "\n*  The arrow keys on the keyboard  *"
                + "\n*  will be used to move the team   *"
                + "\n*  or characters.                  *"
                + "\n**********************************");
    }

    private void showInventory() {
        System.out.println("\n**********************************"
                + "\n*  The list of inventory on the    *"
                + "\n*  map shows you what items you    *"
                + "\n*  have on the map to make weapons *"
                + "\n*  but doesn’t show you the        *"
                + "\n*  location of these items on the  *"
                + "\n*  map.                            *"
                + "\n**********************************");
    }

    private void upgradeWeaponHelp() {
        System.out.println("n**********************************"
                + "\n*  Throughout the game, objects for"
                + "\n*  making weapons will be at      *"
                + "\n*  randomized places on the map.  *"
                + "\n*  You are to gather as many      *"
                + "\n*  objects as possible without    *"
                + "\n*  getting caught by government   *"
                + "\n*  and monster. The more objects  *"
                + "\n*  you have, the more powerful    *"
                + "\n*  your weapon becomes.           *"
                + "\n**********************************");
    }
}

   
