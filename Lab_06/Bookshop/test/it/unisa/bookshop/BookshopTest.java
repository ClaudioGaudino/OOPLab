package it.unisa.bookshop;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;

public class BookshopTest {

    @Test
    public void readLibraryTest() {
        File file = Path.of("test\\it\\unisa\\bookshop").resolve("input.txt").toFile();
        Bookshop bookshop = new Bookshop();
        try {
            bookshop.readUserDataFromFile(file);
        }
        catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(4, bookshop.getBookshop().size());
    }

    @Test
    public void findByAuthorTest() {
        File file = Path.of("test/it/unisa/bookshop/").resolve("input.txt").toFile();
        Bookshop bookshop = new Bookshop();
        try {
            bookshop.readUserDataFromFile(file);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(1, bookshop.findByAuthor("Fourth").size(), 0);
    }

    @Test
    public void findByTitleContentTest() {
        File file = Path.of("test/it/unisa/bookshop").resolve("input.txt").toFile();
        Bookshop bookshop = new Bookshop();
        try {
            bookshop.readUserDataFromFile(file);
        }
        catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(2, bookshop.findByTitleContent("F").size(), 0);
    }

    @Test
    public void findMaxAvailabilityTest() {
        File file = Path.of("test/it/unisa/bookshop").resolve("input.txt").toFile();
        Bookshop bookshop = new Bookshop();
        try {
            bookshop.readUserDataFromFile(file);
        }
        catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(1, bookshop.findMaxAvailable().size(), 0);
    }

    @Test
    public void findBelowAvailabilityTest() {
        File file = Path.of("test\\it\\unisa\\bookshop").resolve("input.txt").toFile();
        Bookshop bookshop = new Bookshop();
        try{
            bookshop.readUserDataFromFile(file);
        }
        catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(3, bookshop.findBelowAvailability(40).size(), 0);
    }

}