package example.codeclan.com.listviewhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopBooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books_list);

        TopBooks topBooks = new TopBooks();
        ArrayList<Book> list = topBooks.getList();

        TopBooksAdapter booksAdapter = new TopBooksAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(booksAdapter);
    }

    public void getBook(View listItem) {
        Book book = (Book) listItem.getTag();
        Log.d("Book title: ", book.getTitle());
        Log.d("Author: ", book.getAuthor());
    }
}

