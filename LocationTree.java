public class LocationTree {
    class Node {
        String location;
        Node left, right;

        Node(String location) {
            this.location = location;
            left = right = null;
        }
    }

    private Node root;

    // Insert a new location into the tree
    public void insert(String location) {
        root = insertRec(root, location);
    }

    private Node insertRec(Node root, String location) {
        if (root == null) {
            root = new Node(location);
            return root;
        }
        if (location.compareToIgnoreCase(root.location) < 0)
            root.left = insertRec(root.left, location);
        else if (location.compareToIgnoreCase(root.location) > 0)
            root.right = insertRec(root.right, location);
        return root;
    }

    // Display all locations (in-order traversal)
    public void display() {
        System.out.println("Locations in alphabetical order:");
        inorder(root);
        System.out.println();
    }

    private void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.location + " ");
            inorder(root.right);
        }
    }
}
