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
        System.out.println("\n*** Show goal success");
    }

    private void showBackStory() {
        System.out.println("\n*** Show backstory success");
    }

    private void movement() {
        System.out.println("\n*** Show movement success");
    }

    private void showInventory() {
        System.out.println("\n*** Show inventory success");
    }

    private void upgradeWeaponHelp() {
        System.out.println("\n*** Show upgrade weapon success");
    }
}

   
