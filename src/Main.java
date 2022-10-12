import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> cards = new HashSet<>();


        cards.add("Spades");


        System.out.println(cards.contains("Spades"));


        Set<Card> playingCards = new HashSet<>();


        System.out.println(playingCards.contains(new Card("3", "Spades")));

        System.out.println(playingCards.size());


    }
}