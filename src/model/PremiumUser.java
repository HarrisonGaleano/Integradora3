package model;
import java.util.Calendar;

/**
 * Class representing a premium user.
 */
public class PremiumUser extends User {
    private static final int MAX_BOOKS = Integer.MAX_VALUE;
    private static final int MAX_MAGAZINES = Integer.MAX_VALUE;
    private static final boolean ADS_ENABLED = false;

    /**
     * Constructor for PremiumUser class.
     *
     * @param name        Name of the user.
     * @param id          ID of the user.
     * @param bindingDate Binding date of the user.
     */
    public PremiumUser(String name, String id, Calendar bindingDate) {
        super(name, id, bindingDate, "Premium");
    }

    /**
     * Check if the premium user can purchase more books.
     *
     * @param currentBooks Number of books currently owned by the user.
     * @return Always returns True for premium user.
     */
    public boolean canPurchaseBooks(int currentBooks) {
        return true;
    }

    /**
     * Check if the premium user can subscribe to more magazines.
     *
     * @param currentMagazines Number of magazines currently subscribed by the user.
     * @return Always returns True for premium user.
     */
    public boolean canSubscribeMagazines(int currentMagazines) {
        return true;
    }

    /**
     * Check if the premium user has ads enabled.
     *
     * @return Always returns False for premium user.
     */
    public boolean hasAdsEnabled() {
        return ADS_ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void displayInformation() {
        System.out.println("Información del Usuario:");
        System.out.println("Nombre: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Fecha de Vinculación: " + getBindingDate().getTime());
        System.out.println("Tipo: " + getType());
        System.out.println("Anuncios Habilitados: " + hasAdsEnabled());
        System.out.println("Máximo de Libros: " + MAX_BOOKS);
        System.out.println("Máximo de Revistas: " + MAX_MAGAZINES);
    }
}
