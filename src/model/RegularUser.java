package model;
import java.util.Calendar;

/**
 * Class representing a regular user.
 */
public class RegularUser extends User {
    private static final int MAX_BOOKS = 5;
    private static final int MAX_MAGAZINES = 2;
    private static final boolean ADS_ENABLED = true;

    /**
     * Constructor for RegularUser class.
     *
     * @param name        Name of the user.
     * @param id          ID of the user.
     * @param bindingDate Binding date of the user.
     */
    public RegularUser(String name, String id, Calendar bindingDate) {
        super(name, id, bindingDate, "Regular");
    }

    /**
     * Check if the regular user can purchase more books.
     *
     * @param currentBooks Number of books currently owned by the user.
     * @return True if the regular user can purchase more books, False otherwise.
     */
    public boolean canPurchaseBooks(int currentBooks) {
        return currentBooks < MAX_BOOKS;
    }

    /**
     * Check if the regular user can subscribe to more magazines.
     *
     * @param currentMagazines Number of magazines currently subscribed by the user.
     * @return True if the regular user can subscribe to more magazines, False otherwise.
     */
    public boolean canSubscribeMagazines(int currentMagazines) {
        return currentMagazines < MAX_MAGAZINES;
    }

    /**
     * Check if the regular user has ads enabled.
     *
     * @return True if the regular user has ads enabled, False otherwise.
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
