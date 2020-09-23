package Ex08;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        OneTwoThree player = new OneTwoThree();
        OneTwoThree machine = new OneTwoThree();

        player.setMyHand("Rock");
        machine.setMyHand();

        System.out.print("Your hand shape: " + player.getMyHand() + " vs ");
        System.out.println("Machine's hand shape: " + machine.getMyHand());
        player.checkWin(machine);
    }
}
