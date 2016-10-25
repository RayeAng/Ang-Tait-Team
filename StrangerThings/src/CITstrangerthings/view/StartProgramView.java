///+
// + To change this license header, choose License Headers in Project Properties.
// + To change this template file, choose Tools | Templates
// + and open the template in the editor.
// +/
package CITstrangerthings.view;

///++
// +
// + @author Raye Ang
// +/
public class StartProgramView {

    private String promptMessage;

    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "\n+++++++++++++++++++++++++++++++++++++++++++++"
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
        );
    }

    public void displayStartProgramView() {
        boolean done = false;
        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
            return; 
        
        done = this.doAction(playersName);
    }


        while (!done);  
    }

    private String getPlayersName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean doAction(String playersName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
