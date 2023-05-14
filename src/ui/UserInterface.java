package ui;

import java.util.Scanner;
import model.Controller;

public class UserInterface {
    private Controller controller;

    public UserInterface(Controller controller) {
        this.controller = controller;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- MENÚ PRINCIPAL -----");
            System.out.println("1. Registrar usuarios (regular y premium)");
            System.out.println("2. Gestionar productos bibliográficos");
            System.out.println("3. Generar objetos automáticamente");
            System.out.println("4. Permitir a un usuario comprar un libro");
            System.out.println("5. Permitir a un usuario suscribirse a una revista");
            System.out.println("6. Permitir a un usuario simular una sesión de lectura (regular y premium)");
            System.out.println("0. Salir");

            System.out.print("Ingrese la opción deseada: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    registerUsers();
                    break;
                case 2:
                    manageBibliographicProducts();
                    break;
                case 3:
                    generateObjects();
                    break;
                case 4:
                    buyBook();
                    break;
                case 5:
                    subscribeToMagazine();
                    break;
                case 6:
                    simulateReadingSession();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar el sistema. ¡Hasta pronto!");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    private void registerUsers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n----- REGISTRO DE USUARIOS -----");
        System.out.println("1. Regular");
        System.out.println("2. Premium");
        System.out.print("Seleccione el tipo de usuario: ");
        int userType = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Ingrese el nombre del usuario: ");
        String name = scanner.nextLine();

        System.out.print("Ingrese la cédula del usuario: ");
        String id = scanner.nextLine();

        controller.registerUser(name, id, userType);
    }

    private void manageBibliographicProducts() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- GESTIÓN DE PRODUCTOS BIBLIOGRÁFICOS -----");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Modificar Producto");
            System.out.println("3. Borrar Producto");
            System.out.println("0. Volver al Menú Principal");

            System.out.print("Ingrese la opción deseada: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    registerBibliographicProduct();
                    break;
                case 2:
                    updateBibliographicProduct();
                    break;
                case 3:
                    deleteBibliographicProduct();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    private void registerBibliographicProduct() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("\n----- REGISTRO DE PRODUCTO BIBLIOGRÁFICO -----");
        System.out.println("1. Libro");
        System.out.println("2. Revista");
        System.out.print("Seleccione el tipo de producto: ");
        int productType = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
    
        System.out.print("Ingrese el nombre del producto: ");
        String name = scanner.nextLine();
    
        System.out.print("Ingrese la fecha de publicación (formato: dd/mm/aaaa): ");
        String publicationDate = scanner.nextLine();
    
        System.out.print("Ingrese el número de páginas: ");
        int pages = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
    
        System.out.print("Ingrese el número de páginas leídas: ");
        int readedPages = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
    
        System.out.print("Ingrese la URL: ");
        String url = scanner.nextLine();
    
        if (productType == 1) {
            System.out.print("Ingrese la reseña: ");
            String review = scanner.nextLine();
    
            System.out.print("Ingrese el valor de venta: ");
            double saleValue = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
    
            System.out.print("Ingrese el número de copias vendidas: ");
            int copiesSold = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
    
            controller.registerBook(name, publicationDate, pages, readedPages, url, review, saleValue, copiesSold);
        } else if (productType == 2) {
            System.out.print("Ingrese el valor de la suscripción: ");
            double subscriptionValue = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
    
            System.out.print("Ingrese el período de publicación (formato: mm/aaaa): ");
            String publicationPeriod = scanner.nextLine();
    
            System.out.print("Ingrese el número de suscripciones activas: ");
            int activeSubscription = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
    
            controller.registerMagazine(name, publicationDate, pages, readedPages, url, subscriptionValue, publicationPeriod, activeSubscription);
        } else {
            System.out.println("Opción inválida. No se pudo registrar el producto bibliográfico.");
        }
    }

    private void updateBibliographicProduct() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("\n----- MODIFICACIÓN DE PRODUCTO BIBLIOGRÁFICO -----");
        System.out.print("Ingrese el ID del producto a modificar: ");
        String productId = scanner.nextLine();
    
        System.out.println("¿Qué desea modificar?");
        System.out.println("1. Nombre");
        System.out.println("2. Fecha de publicación");
        System.out.println("3. Número de páginas");
        System.out.println("4. Número de páginas leídas");
        System.out.println("5. URL");
    
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
    
        switch (option) {
            case 1:
                System.out.print("Ingrese el nuevo nombre: ");
                String newName = scanner.nextLine();
                controller.updateProductName(productId, newName);
                break;
            case 2:
                System.out.print("Ingrese la nueva fecha de publicación (formato: dd/mm/aaaa): ");
                String newPublicationDate = scanner.nextLine();
                controller.updateProductPublicationDate(productId, newPublicationDate);
                break;
            case 3:
                System.out.print("Ingrese el nuevo número de páginas: ");
                int newPages = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                controller.updateProductPages(productId, newPages);
                break;
            case 4:
                System.out.print("Ingrese el nuevo número de páginas leídas: ");
                int newReadedPages = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                controller.updateProductReadedPages(productId, newReadedPages);
                break;
            case 5:
                System.out.print("Ingrese la nueva URL: ");
                String newUrl = scanner.nextLine();
                controller.updateProductUrl(productId, newUrl);
                break;
            default:
                System.out.println("Opción inválida. No se pudo modificar el producto bibliográfico.");
                break;
        }
    }
    