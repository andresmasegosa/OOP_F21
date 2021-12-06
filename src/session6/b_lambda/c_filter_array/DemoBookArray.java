package session6.b_lambda.c_filter_array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoBookArray {
    public static void main(String[] args) {

        ArrayList<Book> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(new Book("Book_"+i, i));
        }

        ArrayList<Book> filteredArray = Array.filter(array, book -> book.getNumberOfCopies()<3);

        for (Book book: filteredArray){
            System.out.println(book);
        }
    }
}
