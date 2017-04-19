package example.codeclan.com.listviewhomework;

/**
 * Created by user on 19/04/2017.
 */

public class Book {

    private int ranking;
    private String title;
    private String author;
    private int year;

    public Book(Integer ranking, String title, String author, Integer year) {
        this.ranking = ranking;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

}
