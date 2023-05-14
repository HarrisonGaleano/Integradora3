package model;
import java.util.Calendar;

/**
 * Abstract class representing a bibliographic product.
 */
public abstract class BibliographicProduct {
    protected Calendar publicationDate;
    protected String id;
    protected String name;
    protected int pages;
    protected int readedPages;
    protected String url;

    /**
     * Constructor for the BibliographicProduct class.
     *
     * @param publicationDate Publication date of the bibliographic product.
     * @param id              Identifier of the bibliographic product.
     * @param name            Name of the bibliographic product.
     * @param pages           Total number of pages of the bibliographic product.
     * @param readedPages     Number of readed pages of the bibliographic product.
     * @param url             URL of the bibliographic product.
     */
    public BibliographicProduct(Calendar publicationDate, String id, String name, int pages, int readedPages, String url) {
        this.publicationDate = publicationDate;
        this.id = id;
        this.name = name;
        this.pages = pages;
        this.readedPages = readedPages;
        this.url = url;
    }

    /**
     * Abstract method to record the readed pages of the bibliographic product.
     * The implementation of this method should be provided in the subclasses.
     *
     * @param numPages Number of readed pages to record.
     */
    public abstract void read(int numPages);

    /**
     * Get the publication date of the bibliographic product.
     *
     * @return Publication date.
     */
    public Calendar getPublicationDate() {
        return publicationDate;
    }

    /**
     * Set the publication date of the bibliographic product.
     *
     * @param publicationDate Publication date to set.
     */
    public void setPublicationDate(Calendar publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * Get the identifier of the bibliographic product.
     *
     * @return Identifier of the bibliographic product.
     */
    public String getId() {
        return id;
    }

    /**
     * Set the identifier of the bibliographic product.
     *
     * @param id Identifier to set.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get the name of the bibliographic product.
     *
     * @return Name of the bibliographic product.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the bibliographic product.
     *
     * @param name Name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the total number of pages of the bibliographic product.
     *
     * @return Total number of pages.
     */
    public int getPages() {
        return pages;
    }

    /**
     * Set the total number of pages of the bibliographic product.
     *
     * @param pages Total number of pages to set.
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

    /**
     * Get the number of readed pages of the bibliographic product.
     *
     * @return Number of readed pages.
     */
    public int getReadedPages() {
        return readedPages;
    }

    /**
     * Set the readed pages of the bibliographic product.
     * 
     * @param readedPages Readed pages to set.
     */
    public void setReadedPages(int readedPages) {
        this.readedPages = readedPages;
    }

    /**
     * Get the URL of the bibliographic product.
     *
     * @return URL of the bibliographic product.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set the URL of the bibliographic product.
     *
     * @param url URL to set.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Abstract method to display the information of the bibliographic product.
     * The implementation of this method should be provided in the subclasses.
     */
    public abstract void displayInformation();
}
