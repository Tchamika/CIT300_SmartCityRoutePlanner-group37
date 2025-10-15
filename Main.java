import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        LocationManager manager = new LocationManager(graph);
        AVLTree tree = new AVLTree();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Smart City Route Planner ---");
            System.out.println("1. Add a new location");
            System.out.println("2. Remove a location");
            System.out.println("3. Add a road between locations");
            System.out.println("4. Remove a road");
            System.out.println("5. Display all connections");
            System.out.println("6. Display all locations (AVL Tree)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter location name: ");
                    String loc = sc.nextLine();
                    manager.addLocation(loc);
                    tree.insert(loc);
                    break;
                case 2:
                    System.out.print("Enter location name to remove: ");
                    manager.removeLocation(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter start location: ");
                    String src = sc.nextLine();
                    System.out.print("Enter destination location: ");
                    String dest = sc.nextLine();
                    manager.addRoad(src, dest);
                    break;
                case 4:
                    System.out.print("Enter start location: ");
                    src = sc.nextLine();
                    System.out.print("Enter destination location: ");
                    dest = sc.nextLine();
                    manager.removeRoad(src, dest);
                    break;
                case 5:
                    manager.showConnections();
                    break;
                case 6:
                    System.out.println("All Locations (In-order from AVL Tree):");
                    tree.inorder();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
