/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.model;

/**
 *
 * @author Raye Ang
 */
public class FleeResults {
    private String message;
    private int reason;
    private Character CharacterRemoved = null;

    public FleeResults() {
    }
    

    public FleeResults(String message, int reason, Character CharacterRemoved) {
        this.message = message;
        this.reason = reason;
        this.CharacterRemoved = CharacterRemoved;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getReason() {
        return reason;
    }

    public void setReason(int reason) {
        this.reason = reason;
    }

    public Character getCharacterRemoved() {
        return CharacterRemoved;
    }

    public void setCharacterRemoved(Character CharacterRemoved) {
        this.CharacterRemoved = CharacterRemoved;
    }
    
    
}
