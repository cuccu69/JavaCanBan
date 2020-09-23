package Ex08;

import java.util.Date;

public class OneTwoThree {
    private final String[] handShape = {"Paper", "Rock", "Scissors"};
    private String myHand;

    private int randomIndex() {
        return (int) (Math.random() * 3);
    }

    public void setMyHand() {
        myHand = handShape[randomIndex()];
    }

    public void setMyHand(String myHand){
        this.myHand = myHand;
    }

    public String getMyHand() {
        return myHand;
    }

    public void checkWin(OneTwoThree player2) {
        if (myHand.equals("Paper")) {
            if (player2.getMyHand().equals("Paper")) {
                System.out.println("Battle tie");
            } else if (player2.getMyHand().equals("Rock")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        } else if (myHand.equals("Rock")) {
            if (player2.getMyHand().equals("Rock")) {
                System.out.println("Battle tie");
            } else if (player2.getMyHand().equals("Scissors")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        } else {
            if (player2.getMyHand().equals("Scissors")) {
                System.out.println("Battle tie");
            } else if (player2.getMyHand().equals("Paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
    }
}
