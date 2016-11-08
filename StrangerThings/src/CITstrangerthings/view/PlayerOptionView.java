/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

import CITstrangerthings.control.PlayerControl;
import java.util.Scanner;

/**
 *
 * @author tibbit13
 */
public class PlayerOptionView {
    private String action;
public void displayPlayerOption() {

        boolean done = false;
        do {
            String gameOption = this.getGameOption();
            if (gameOption.toUpperCase().equals("MASTERQ")) {
                return;
            }

            done = this.doAction(gameOption);

        } while (!done);
    }

    public PlayerOptionView() {
        this.action = "\n"
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                + "\n| Player Options per Screen"
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
                + "\nA - Attack a monster"
                + "\nF - Flee from monster, like a coward"
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";
    }

    private String getGameOption() {
        Scanner keyboard = new Scanner(System.in);

        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.action);

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

    private boolean doAction(String gameOption) {
        gameOption = gameOption.toUpperCase();

        switch (gameOption) {
            case "A":
                this.attackMonster();
                break;
            case "F":
                this.fleeMonster();
                break;

            default:
                System.out.println("\n*** Invalid Selection, try again. ***");
                break;

        }
        return false;
    }

    private void attackMonster() {
       PlayerAttackView playerChoice = new PlayerAttackView();
        playerChoice.displayAttack();
       
    }

    private void fleeMonster() {
      PlayerFleeView playerFlee = new PlayerFleeView();
      playerFlee.display();
        
    }

   
}
