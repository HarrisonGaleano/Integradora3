package model;
import java.util.Calendar;

/**
 * Abstract class representing a user.
 */
public abstract class User {
    private String name;
    private String id;
    private Calendar bindingDate;
    private String type;

    /**
     * Constructor for the User class.
     *
     * @param name        Name of the user.
     * @param id          ID of the user.
     * @param bindingDate Binding date of the user.
     * @param type        Type of the user.
     */
    public User(String name, String id, Calendar bindingDate, String type) {
        this.name = name;
        this.id = id;
        this.bindingDate = bindingDate;
        this.type = type;
    }

    /**
     * Get the name of the user.
     *
     * @return Name of the user.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the user.
     *
     * @param name Name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the ID of the user.
     *
     * @return ID of the user.
     */
    public String getId() {
        return id;
    }

    /**
     * Set the ID of the user.
     *
     * @param id ID to set.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get the binding date of the user.
     *
     * @return Binding date of the user.
     */
    public Calendar getBindingDate() {
        return bindingDate;
    }

    /**
     * Set the binding date of the user.
     *
     * @param bindingDate Binding date to set.
     */
    public void setBindingDate(Calendar bindingDate) {
        this.bindingDate = bindingDate;
    }

    /**
     * Get the type of the user.
     *
     * @return Type of the user.
     */
    public String getType() {
        return type;
    }

    /**
     * Set the type of the user.
     *
     * @param type Type to set.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Método abstracto para mostrar información del usuario.
     */
    public abstract void displayInformation();
}
