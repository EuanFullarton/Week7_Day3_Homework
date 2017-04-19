package example.codeclan.com.listviewhomework;

import java.util.ArrayList;

/**
 * Created by user on 19/04/2017.
 */

public class TopBooks {

    private ArrayList<Book> list;

    public TopBooks() {
        list = new ArrayList<Book>();
        list.add(new Book(1, "Anna Karenina", "Leo Tolstoy", 1877));
        list.add(new Book(2, "Madame Bovary", "Gustave Flaubert", 1856));
        list.add(new Book(3, "War and Peace", "Leo Tolstoy", 1869));
        list.add(new Book(4, "The Great Gatsby", "F. Scott Fitzgerald", 1925));
        list.add(new Book(5, "Lolita", "Vladimir Nabokov", 1955));
        list.add(new Book(6, "Middlemarch", "George Eliot", 1872));
        list.add(new Book(7, "The Adventures of Huckleberry Finn", "Mark Twain", 1884));
        list.add(new Book(8, "The Stories of Anton Chekhov", "Anton Chekhov", 1979));
        list.add(new Book(9, "In Search of Lost Time", "Marcel Proust", 1913));
        list.add(new Book(10, "Hamlet", "William Shakespeare", 1609));

    }

    public ArrayList<Book> getList() {
        return new ArrayList<Book>(list);
    }
}
