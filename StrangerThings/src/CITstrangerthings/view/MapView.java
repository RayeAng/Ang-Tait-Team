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
public class MapView {
    private String mapOption;
    
    public void displayMapView() {
        boolean done = false;
        do{
            String mapOption = this.getMapOption();
        
        if (mapOption.toUpperCase().equals("Q"))
            return;
        done = this.doAction(mapOption);
        } while (!done);
    }
    
    
    public MapView(){
        this.mapOption = "\n++++++++++++++++++++++++++++++++"
            + "\n++++++++ I am the map ++++++++++"
            + "\n++++++++++++++++++++++++++++++++"
            + "\n"
            + "\nN - Move North"
            + "\nS - Move South"
            + "\nW - Move West"
            + "\nE - Move East";
    }

    private String getMapOption() {
       
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.mapOption);

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() > 1) {
                System.out.println("\nInvalid answer: Pick a letter to move.");
                continue;
            }
            break;
        }
        return value;

    }

    private boolean doAction(String mapOption) {
        mapOption = mapOption.toUpperCase();
        
        switch (mapOption){
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