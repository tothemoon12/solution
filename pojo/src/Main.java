import pojo.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    private static final int PAGES_COUNT = 450;

    public static void main(String[] args) {
        // Solution with POJO
        List<Book> booksList = new ArrayList<>();
        booksList.add(new Book("Eloquent JavaScript, Second Edition", 472));
        booksList.add(new Book("Learning JavaScript Design Patterns", 254));
        booksList.add(new Book("Speaking JavaScript", 460));
        booksList.add(new Book("Programming JavaScript Applications", 254));
        booksList.add(new Book("Tricky JavaScript", 450));
        booksList.add(new Book("Broken JS", 450));

        System.out.println(getBooksTitlesByPages(booksList, PAGES_COUNT));

//        Solution with MAP
        Map<String, Integer> books = new HashMap<>();
        books.put("Eloquent JavaScript, Second Edition", 472);
        books.put("Learning JavaScript Design Patterns", 254);
        books.put("Speaking JavaScript", 460);
        books.put("Programming JavaScript Applications", 254);
        books.put("Tricky JavaScript", 450);
        books.put("Broken JS", 450);

        System.out.println(getBooksTitlesByPages(books, PAGES_COUNT));

    }

    public static List<String> getBooksTitlesByPages(List<Book> books, int pages) {
        return books.stream()
                .filter(b -> b.getPagesNumber() >= pages)
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    public static List<String> getBooksTitlesByPages(Map<String, Integer> books, int pages) {
        return books.entrySet().stream()
                .filter(e -> e.getValue() >= pages)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

}
