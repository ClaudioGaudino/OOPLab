package it.unisa.bookshop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Bookshop {

    final private List<Book> bookshop;

    public Bookshop() {
        bookshop = new ArrayList<>();
    }

    public List<Book> findByAuthor(String author) {
        List<Book> booksFound = new ArrayList<Book>();

        for(Book b : bookshop)
            if(b.getAuthor().equals(author))
                booksFound.add(b);

        return booksFound;
    }

    public List<Book> findByTitleContent(String titleContent) {
        List<Book> booksFound = new ArrayList<Book>();

        for(Book b : bookshop)
            if(b.getTitle().contains(titleContent))
                booksFound.add(b);

        return booksFound;
    }

    public List<Book> findMaxAvailable() {
        int max = bookshop.get(0).getNumberOfCopies();
        List<Book> booksFound = new ArrayList<Book>();

        for(Book b : bookshop)
            if(max < b.getNumberOfCopies())
                max = b.getNumberOfCopies();
        for(Book b : bookshop)
            if(max == b.getNumberOfCopies())
                booksFound.add(b);

        return booksFound;
    }

    public List<Book> findBelowAvailability(int threshold) {
        List<Book> booksFound = new ArrayList<Book>();

        for(Book b : bookshop)
            if(b.getNumberOfCopies() < threshold)
                booksFound.add(b);

        return booksFound;
    }

    public List<Book> getBookshop() {
        return bookshop;
    }

    public void readUserDataFromFile(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);

        while(in.hasNextLine())
        {
            String type = in.nextLine();
            String title = in.nextLine();
            String author = in.nextLine();
            String editor = in.nextLine();
            int numberOfCopies = Integer.parseInt(in.nextLine());
            if(type.equals("AudioBook"))
            {
                int length = Integer.parseInt(in.nextLine());
                String format = in.nextLine();
                AudioBook b = new AudioBook(title, author, editor, length, format);
                b.setNumberOfCopies(numberOfCopies);
                bookshop.add(b);
            }
            else
            {
                Book b = new Book(title, author, editor);
                b.setNumberOfCopies(numberOfCopies);
                bookshop.add(b);
            }
        }
    }
}
