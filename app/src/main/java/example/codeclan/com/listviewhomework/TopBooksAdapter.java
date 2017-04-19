package example.codeclan.com.listviewhomework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by user on 19/04/2017.
 */

public class TopBooksAdapter extends ArrayAdapter<Book> {

    public TopBooksAdapter(Context context, ArrayList<Book> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.books_item, parent, false);
        }

        Book currentBook = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentBook.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentBook.getTitle());

        TextView author = (TextView) listItemView.findViewById(R.id.author);
        author.setText(currentBook.getAuthor());

        TextView year = (TextView) listItemView.findViewById(R.id.year);
        year.setText(currentBook.getYear().toString());

        listItemView.setTag(currentBook);

        return listItemView;
    }
}