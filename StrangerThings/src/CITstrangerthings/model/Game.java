/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.model;

import java.io.Serializable;

/**
 *
 * @author tibbit13
 */
public class Game implements Serializable{
    private double noPlayers;
    private double totalTime;

    public double getNoPlayers() {
        return noPlayers;
    }

    public void setNoPlayers(double noPlayers) {
        this.noPlayers = noPlayers;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }
    
    
}
