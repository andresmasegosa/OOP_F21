package session6.b_lambda.filter_array;

import java.util.ArrayList;

public class DemoBookArray {
    public static void main(String[] args) {

        ArrayList<Book> array = new ArrayList<Book>();
        for (int i = 0; i < 10; i++) {
            array.add(new Book("Book_"+i, i));
        }

        ArrayList<Book> filteredArray = Array.filter(array, book -> book.getNumberOfCopies()<3);

        for (Book book: filteredArray){
            System.out.println(book);
        }
    }
}
