package pojo;

public class Book {
    private String title;
    private int pagesNumber;

    public Book(String title, int pagesNumber) {
        this.title = title;
        this.pagesNumber = pagesNumber;
    }

    public String getTitle() {
        return title;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

}
