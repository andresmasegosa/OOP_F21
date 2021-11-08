package session6.b_lambda.c_filter_array;

public class Book {
    String name;
    int numberOfCopies;

    public Book(String name, int numberOfCopies) {
        this.name = name;
        this.numberOfCopies = numberOfCopies;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}
