import java.util.Arrays;
import java.util.Scanner;

public class EcommercePlatform {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 150.75),
            new Order("O002", "Bob", 200.50),
            new Order("O003", "Charlie", 99.99),
            new Order("O004", "Dave", 250.00)
        };

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose sorting algorithm:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Bubble Sort:");
                    Order[] bubbleSortedOrders = Arrays.copyOf(orders, orders.length);
                    BubbleSort.bubbleSort(bubbleSortedOrders);
                    for (Order order : bubbleSortedOrders) {
                        System.out.println(order.getCustomerName() + ": " + order.getTotalPrice());
                    }
                    break;
                case 2:
                    System.out.println("Quick Sort:");
                    Order[] quickSortedOrders = Arrays.copyOf(orders, orders.length);
                    QuickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
                    for (Order order : quickSortedOrders) {
                        System.out.println(order.getCustomerName() + ": " + order.getTotalPrice());
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
