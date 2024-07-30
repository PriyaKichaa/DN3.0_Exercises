import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductId().compareTo(targetId);

            switch (Integer.signum(comparison)) {
                case 0:
                    return products[mid]; // Target found
                case -1:
                    left = mid + 1; // Target is in the right half
                    break;
                case 1:
                    right = mid - 1; // Target is in the left half
                    break;
            }
        }
        return null;  // Product not found
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Shoes", "Footwear"),
            new Product("P004", "Shirt", "Clothes")
        };

        // Sort products array for binary search
        Arrays.sort(products, Comparator.comparing(Product::getProductId));

        // Binary search
        Product resultBinary = binarySearch(products, "P002");
        if (resultBinary != null) {
            System.out.println("Binary Search - Product Found: " + resultBinary.getProductName());
        } else {
            System.out.println("Binary Search - Product Not Found");
        }
    }
}
