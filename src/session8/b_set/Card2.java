package session8.b_set;

import java.util.Objects;

class Card2 {
    String name;

    public Card2(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card2 card2 = (Card2) o;
        return Objects.equals(name.toLowerCase(), card2.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase());
    }
}
