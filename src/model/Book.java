package model;
import java.util.Calendar;

/**
 * Class representing a book, which is a subclass of BibliographicProduct.
 */
public class Book extends BibliographicProduct {
    private String review;
    private double saleValue;
    private int copiesSold;

    /**
     * Constructor for the Book class.
     *
     * @param publicationDate Publication date of the book.
     * @param id              Identifier of the book.
     * @param name            Name of the book.
     * @param pages           Total number of pages of the book.
     * @param readedPages     Number of read pages of the book.
     * @param url             URL of the book.
     * @param review          Review of the book.
     * @param saleValue       Sale value of the book.
     * @param copiesSold      Number of copies sold of the book.
     */
    public Book(Calendar publicationDate, String id, String name, int pages, int readedPages, String url, String review, double saleValue, int copiesSold) {
        super(publicationDate, id, name, pages, readedPages, url);
        this.review = review;
        this.saleValue = saleValue;
        this.copiesSold = copiesSold;
    }

    /**
     * Get the review of the book.
     *
     * @return Review of the book.
     */
    public String getReview() {
        return review;
    }

    /**
     * Set the review of the book.
     *
     * @param review Review to set.
     */
    public void setReview(String review) {
        this.review = review;
    }

    /**
     * Get the sale value of the book.
     *
     * @return Sale value of the book.
     */
    public double getSaleValue() {
        return saleValue;
    }

    /**
     * Set the sale value of the book.
     *
     * @param saleValue Sale value to set.
     */
    public void setSaleValue(double saleValue) {
        this.saleValue = saleValue;
    }

    /**
     * Get the number of copies sold of the book.
     *
     * @return Number of copies sold of the book.
     */
    public int getCopiesSold() {
        return copiesSold;
    }

    /**
     * Set the number of copies sold of the book.
     *
     * @param copiesSold Number of copies sold to set.
     */
    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void displayInformation() {
        System.out.println("Información del Libro:");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getName());
        System.out.println("Fecha de Publicación: " + getPublicationDate().getTime());
        System.out.println("Páginas: " + getPages());
        System.out.println("Páginas Leídas: " + getReadedPages());
        System.out.println("URL: " + getUrl());
        System.out.println("Reseña: " + review);
        System.out.println("Valor de Venta: " + saleValue);
        System.out.println("Copias Vendidas: " + copiesSold);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void read(int numPages) {
        if (numPages > 0 && numPages <= (getPages() - getReadedPages())) {
            setReadedPages(getReadedPages() + numPages);
            System.out.println("Readed " + numPages + " pages of the book.");
        }
    }
}