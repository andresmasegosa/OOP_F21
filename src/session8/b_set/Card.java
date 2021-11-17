package session8.b_set;

import java.util.Random;

class Card {
    String name;

    public Card(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return name.equals(card.name);
    }

    @Override
    public int hashCode() {
        Random r = new Random();
        return r.nextInt();
    }
}
