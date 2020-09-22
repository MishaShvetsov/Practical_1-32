package PracticalThree.Ex.Ex3;

public class Hand {
    private boolean which_hand;
    private double hand_weight;
    private double hand_length;

    public Hand(boolean which_hand, double hand_weight, double hand_length) {
        this.which_hand = which_hand;
        this.hand_weight = hand_weight;
        this.hand_length = hand_length;
    }

    public void setWhichHand(boolean which_hand) {
        this.which_hand = which_hand;
    }
    public boolean getWhichHand(){
        return this.which_hand;
    }

    public double getHandWeight(){
        return this.hand_weight;
    }
    public void setHandWeight(double hand_weight){
        this.hand_weight = hand_weight;
    }

    public double getHandLength(){
        return this.hand_length;
    }
    public void setHandLength(double hand_length){
        this.hand_length = hand_length;
    }


    @Override
    public String toString() {
        return "Hand{" +
                "which_hand=" + which_hand +
                ", hand_weight=" + hand_weight +
                ", hand_length=" + hand_length +
                '}';
    }
}