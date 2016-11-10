///+
// + To change this license header, choose License Headers in Project Properties.
// + To change this template file, choose Tools | Templates
// + and open the template in the editor.
// +/
package CITstrangerthings.view;

///++
import CITstrangerthings.control.GameControl;
import CITstrangerthings.model.Player;
import java.util.Scanner;
import strangerthings.StrangerThings;

// +
// + @author Raye Ang
// +/
public class StartProgramView extends View{
    
    

    public StartProgramView(){
        
                super("\n+++++++++++++++++++++++++++++++++++++++++++++"
                + "\n+ This is the game of Stranger Things!    +"
                + "\n+ In this game, you will help a group of  +"
                + "\n+ boys resuce their missing friend, Will. +"
                + "\n+ Along the way, you will find Eleven, a  +"
                + "\n+ girl with extraordinary abilities.      +"
                + "\n+ Together, you will traverse the town of +"
                + "\n+ Metrocity. +"
                + "\n"
                + "\n+ Along the way, you will learn more      +"
                + "\n+ about the disappearance of Will and     +"
                + "\n+ about the UpsideDown universe where     +"
                + "\n+ Eleven came from.                       +"
                + "\n+                                         +"
                + "\n+ There is a monster you have to defeat,  +"
                + "\n+ a sherrif to avoid and you're going to  +"
                + "\n+ build a weapon to defeat the monster!   +"
                + "\n+                                         +"
                + "\n+ You'll have to find items to upgrade    +"
                + "\n+ your weapon to defeat the monster. Then +"
                + "\n+ your friend Will will be be free.       +"
                + "\n+++++++++++++++++++++++++++++++++++++++++++"
                + "\nPlease Enter Your Name: "
                        
        );
    }

    @Override
    public boolean doAction(String playersName) {

        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character"
                    + "in length");
            return false;
        }
        Player player = GameControl.createPlayer(playersName);

        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        this.displayNextView();
        return true;
    }

    private void displayNextView() {
        System.out.println("\n ++++++++++++++++++++++++++++++++++"
                + "\n Welcome to the game, " + StrangerThings.getPlayer().getName() +"!"
                + "\n It's time to get down to cracking this case and solve the mystery!"
                + "\n ++++++++++++++++++++++++++++++++++"
        );
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}