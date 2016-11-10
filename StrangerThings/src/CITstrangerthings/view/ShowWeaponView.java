/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CITstrangerthings.view;

/**
 *
 * @author tibbit13
 */
public class ShowWeaponView extends View {

    public ShowWeaponView() {
        super("\n==================================="
                + "\nWeapons you have:"
                + "\n♦BB - Baseball Bat"
                + "\n♦T - Tennis Raquet"
                + "\n♦W - 2x4"
                + "\n♦C - Cricket Paddle"
                + "\n♦BR - Broom"
                + "\n"
                + "\n"
                + "\nItems you have:"
                + "\n♦N - Nails"
                + "\n♦G - Glass Shards"
                + "\n♦BW - Barbed Wire"
                + "\n♦R - Rocks"
                + "\n===================================");
    }

    @Override
    public boolean doAction(String inventoryOption) {
        inventoryOption = inventoryOption.toUpperCase();

        switch (inventoryOption) {
            case "BB":
                this.showBaseballBat();
                break;
            case "T":
                this.showTennisRaquet();
                break;
                 case "W":
                this.showTwoByFour();
                break;
            case "C":
                this.showCricketPaddle();
                break;
            case "BR":
                this.showBroom();
                break;

            case "N":
                this.showNailsAmount();
                break;
            case "G":
                this.showGlassAmount();
                break;
            case "BW":
                this.showBarbedAmount();
                break;
            case "R":
                this.showRocksAmount();
                break;
            default:
                System.out.println("\n*** Invalid Selection, try again. ***");
                break;

        }

        return false;
    }

    private void showBaseballBat() {
        System.out.println("/n++++Working Baseball Bat++++");
    }

    private void showTennisRaquet() {
        System.out.println("/n++++Working tennis++++");
    }

    private void showCricketPaddle() {
        System.out.println("/n++++Working cricket++++");
    }

    private void showBroom() {
        System.out.println("/n++++Working Broom++++");

    }

    private void showNailsAmount() {
        System.out.println("/n++++Nails++++");
    }

    private void showGlassAmount() {
        System.out.println("/n++++Glass++++");
    }

    private void showBarbedAmount() {
        System.out.println("/n++++Barbed++++");

    }

    private void showRocksAmount() {
        System.out.println("/n++++Rocks++++");

    }

    private void showTwoByFour() {
        System.out.println("\n++++2X4+++");
    }

}
