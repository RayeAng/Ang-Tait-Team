/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

/**
 *
 * @author Raye Ang
 */
public class MainMenuView {
    private String menu;
    
    public void displayMainMenuView() {
        
        boolean done = false;
        do{ 
            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
    }
    
    
public MainMenuView(){
    this.menu = "\n"
            + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
            + "\n| Main Menu"
            + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
            + "\nN - Start New Game"
            + "\nL - Load Previous Game"
            + "\nS - Save Current Game"
            + "\nQ - Quit Game"
            + "\nH - Help Menu"
            + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";
    }

    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() function has been called***");
        return "N";
    }

    private boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() function has been called***");
        return true;
    }
    
}
