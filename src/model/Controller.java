package model;
import java.util.ArrayList;
import java.util.List;

/**
 * Class representing the controller for user and bibliographic product registration.
 */
public class Controller {
    private List<User> users;
    private BibliographicProduct[][] products;

    /**
     * Constructor for the Controller class.
     */
    public Controller() {
        users = new ArrayList<>();
        products = new BibliographicProduct[5][5];
    }

    /**
     * Register a user.
     *
     * @param user The user to register.
     */
    public void registerUser(String name, String id, int userType) {
        User user;
    
        if (userType == 1) {
            user = new RegularUser(name, id);
            regularUsers.add((RegularUser) user);
        } else if (userType == 2) {
            user = new PremiumUser(name, id);
            premiumUsers.add((PremiumUser) user);
        } else {
            System.out.println("Tipo de usuario inválido. No se pudo registrar el usuario.");
            return;
        }
    
        System.out.println("Usuario registrado exitosamente:");
        System.out.println("Nombre: " + user.getName());
        System.out.println("ID: " + user.getId());
        System.out.println("Fecha de vinculación: " + user.getBindingDate().getTime());
        System.out.println("Tipo: " + user.getType());
    }
    

    /**
     * Register a bibliographic product.
     *
     * @param product The bibliographic product to register.
     */
    public void registerProduct(BibliographicProduct product) {
        int row = -1;
        int col = -1;
        boolean productAdded = false;

        if (product instanceof Book) {
            for (int i = 0; i < products.length; i++) {
                for (int j = 0; j < products[i].length; j++) {
                    if (products[i][j] == null) {
                        row = i;
                        col = j;
                        productAdded = true;
                        break;
                    }
                }
                if (productAdded) {
                    break;
                }
            }
        } else if (product instanceof Magazine) {
            for (int i = 0; i < products.length; i++) {
                for (int j = 0; j < products[i].length; j++) {
                    if (products[i][j] == null) {
                        row = i;
                        col = j;
                        productAdded = true;
                        break;
                    }
                }
                if (productAdded) {
                    break;
                }
            }
        }

        if (productAdded) {
            products[row][col] = product;
            System.out.println("Producto registrado sactisfactoriamente.");
        } else {
            System.out.println("El producto no ha sido registrado. El inventario está lleno.");
        }
    }

    /**
     * Get the list of registered users.
     *
     * @return The list of registered users.
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * Get the array of registered products.
     *
     * @return The array of registered products.
     */
    public BibliographicProduct[][] getProducts() {
        return products;
    }
}
