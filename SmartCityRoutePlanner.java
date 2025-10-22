import java.util.Scanner;

public class SmartCityRoutePlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph();
        RoadManager manager = new RoadManager(graph);
        LocationTree tree = new LocationTree();

        while (true) {
            System.out.println("\n--- Smart City Route Planner ---");
            System.out.println("1. Add a new location");
            System.out.println("2. Remove a location");
            System.out.println("3. Add a road between locations");
            System.out.println("4. Remove a road");
            System.out.println("5. Display all connections");
            System.out.println("6. Display all locations (using a tree)");
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
                    System.out.print("Enter location to remove: ");
                    String rem = sc.nextLine();
                    manager.removeLocation(rem);
                    break;
                case 3:
                    System.out.print("Enter source: ");
                    String src = sc.nextLine();
                    System.out.print("Enter destination: ");
                    String dest = sc.nextLine();
                    manager.addRoad(src, dest);
                    break;
                case 4:
                    System.out.print("Enter source: ");
                    src = sc.nextLine();
                    System.out.print("Enter destination: ");
                    dest = sc.nextLine();
                    manager.removeRoad(src, dest);
                    break;
                case 5:
                    graph.displayConnections();
                    break;
                case 6:
                    tree.display();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
