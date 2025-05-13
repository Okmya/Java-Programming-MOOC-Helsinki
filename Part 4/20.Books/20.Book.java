/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m.brzyska
 */
public class Book {

    private String title;
    private int pages;
    private int year;

    public Book(String bookTitle, int bookPages, int publicationYear) {
        this.title = bookTitle;
        this.pages = bookPages;
        this.year = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year ;
    }

}
