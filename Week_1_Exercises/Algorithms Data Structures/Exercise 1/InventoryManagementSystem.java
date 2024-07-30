public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inventory Management System:");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Retrieve Product");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String addId = scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String addName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int addQuantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double addPrice = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    Product newProduct = new Product(addId, addName, addQuantity, addPrice);
                    inventory.addProduct(newProduct);
                    System.out.println("Product added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Product ID to Update: ");
                    String updateId = scanner.nextLine();
                    Product updateProduct = inventory.getProduct(updateId);
                    if (updateProduct != null) {
                        System.out.print("Enter New Product Name: ");
                        String updateName = scanner.nextLine();
                        System.out.print("Enter New Quantity: ");
                        int updateQuantity = scanner.nextInt();
                        System.out.print("Enter New Price: ");
                        double updatePrice = scanner.nextDouble();
                        scanner.nextLine();  // Consume newline
                        updateProduct.setProductName(updateName);
                        updateProduct.setQuantity(updateQuantity);
                        updateProduct.setPrice(updatePrice);
                        inventory.updateProduct(updateProduct);
                        System.out.println("Product updated successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to Delete: ");
                    String deleteId = scanner.nextLine();
                    inventory.deleteProduct(deleteId);
                    System.out.println("Product deleted successfully.");
                    break;

                case 4:
                    System.out.print("Enter Product ID to Retrieve: ");
                    String retrieveId = scanner.nextLine();
                    Product retrievedProduct = inventory.getProduct(retrieveId);
                    if (retrievedProduct != null) {
                        System.out.println("Product ID: " + retrievedProduct.getProductId());
                        System.out.println("Product Name: " + retrievedProduct.getProductName());
                        System.out.println("Quantity: " + retrievedProduct.getQuantity());
                        System.out.println("Price: " + retrievedProduct.getPrice());
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
