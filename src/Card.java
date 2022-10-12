import java.util.Objects;

public class Card {
    private String suit;

    private String number;

    public Card(String number, String suit) {

        this.suit = suit;

        this.number = number;

    }

    public String getSuit() {
        return suit;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(suit, card.suit) && Objects.equals(number, card.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, number);
    }
}
                             