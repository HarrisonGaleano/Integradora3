package model;
import java.util.Calendar;

/**
 * Class representing a magazine, which is a subclass of BibliographicProduct.
 */
public class Magazine extends BibliographicProduct {
    private double subscriptionValue;
    private Calendar publicationPeriod;
    private int activeSubscription;

    /**
     * Constructor for the Magazine class.
     *
     * @param publicationDate    Publication date of the magazine.
     * @param id                 Identifier of the magazine.
     * @param name               Name of the magazine.
     * @param pages              Total number of pages of the magazine.
     * @param readedPages        Number of read pages of the magazine.
     * @param url                URL of the magazine.
     * @param subscriptionValue  Subscription value of the magazine.
     * @param publicationPeriod  Publication period of the magazine.
     * @param activeSubscription Active subscription count of the magazine.
     */
    public Magazine(Calendar publicationDate, String id, String name, int pages, int readedPages, String url, double subscriptionValue, Calendar publicationPeriod, int activeSubscription) {
        super(publicationDate, id, name, pages, readedPages, url);
        this.subscriptionValue = subscriptionValue;
        this.publicationPeriod = publicationPeriod;
        this.activeSubscription = activeSubscription;
    }

    /**
     * Get the subscription value of the magazine.
     *
     * @return Subscription value of the magazine.
     */
    public double getSubscriptionValue() {
        return subscriptionValue;
    }

    /**
     * Set the subscription value of the magazine.
     *
     * @param subscriptionValue Subscription value to set.
     */
    public void setSubscriptionValue(double subscriptionValue) {
        this.subscriptionValue = subscriptionValue;
    }

    /**
     * Get the publication period of the magazine.
     *
     * @return Publication period of the magazine.
     */
    public Calendar getPublicationPeriod() {
        return publicationPeriod;
    }

    /**
     * Set the publication period of the magazine.
     *
     * @param publicationPeriod Publication period to set.
     */
    public void setPublicationPeriod(Calendar publicationPeriod) {
        this.publicationPeriod = publicationPeriod;
    }

    /**
     * Get the active subscription count of the magazine.
     *
     * @return Active subscription count of the magazine.
     */
    public int getActiveSubscription() {
        return activeSubscription;
    }

    /**
     * Set the active subscription count of the magazine.
     *
     * @param activeSubscription Active subscription count to set.
     */
    public void setActiveSubscription(int activeSubscription) {
        this.activeSubscription = activeSubscription;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void displayInformation() {
        System.out.println("Información de la Revista:");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getName());
        System.out.println("Fecha de Publicación: " + getPublicationDate().getTime());
        System.out.println("Páginas: " + getPages());
        System.out.println("Páginas Leídas: " + getReadedPages());
        System.out.println("URL: " + getUrl());
        System.out.println("Valor de la Suscripción: " + subscriptionValue);
        System.out.println("Período de Publicación: " + publicationPeriod.getTime());
        System.out.println("Suscripciones Activas: " + activeSubscription);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void read(int numPages) {
        if (numPages > 0 && numPages <= (getPages() - getReadedPages())) {
            setReadedPages(getReadedPages() + numPages);
            System.out.println("Se han leído " + numPages + " páginas de la revista.");
        } else {
            System.out.println("Número de páginas inválido. No se pudo leer la revista.");
        }
    }
}