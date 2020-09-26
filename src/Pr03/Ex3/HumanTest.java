package Pr03.Ex3;

public class HumanTest {
    public static void main(String[] args) {

        Leg leg = new Leg(false, 27, 54);
        Hand hand = new Hand(false, 7, 27);
        Head head = new Head(15, 21);
        Human human = new Human(head, leg, hand);

        String out_info = human.toString();
        System.out.println(out_info);
    }
}