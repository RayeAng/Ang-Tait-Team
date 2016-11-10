/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

import java.util.Scanner;

/**
 *
 * @author Raye Ang
 */
public class MoveView extends View {

    public MoveView() {
        super("\n"
                + "\nN - Move North"
                + "\nS - Move South"
                + "\nW - Move West"
                + "\nE - Move East"
                + "\nQ - Exit move menu");
    }
    
    @Override
    public boolean doAction(String moveOption) {
        moveOption = moveOption.toUpperCase();

        switch (moveOption) {
            case "N":
                this.moveNorth();
                break;
            case "S":
                this.moveSouth();
                break;
            case "W":
                this.moveWest();
                break;
            case "E":
                this.moveEast();
                break;
            default:
                System.out.println("\n*** Invalid Selection, try again. ***");
                break;
        }
        return false;
    }

    private void moveNorth() {
        System.out.println("\nPlayer has moved north!");
    }

    private void moveSouth() {
        System.out.println("\nPlayer has moved south!");
    }

    private void moveWest() {
        System.out.println("\nPlayer has moved west!");
    }

    private void moveEast() {
        System.out.println("\nPlayer has moved east!");
    }
}
