class LocationNode {
    String name;
    LocationNode left, right;

    public LocationNode(String name) {
        this.name = name;
    }
}

class LocationTree {
    private LocationNode root;

    public void insert(String name) {
        root = insertRec(root, name);
    }

    private LocationNode insertRec(LocationNode root, String name) {
        if (root == null) return new LocationNode(name);
        if (name.compareTo(root.name) < 0)
            root.left = insertRec(root.left, name);
        else if (name.compareTo(root.name) > 0)
            root.right = insertRec(root.right, name);
        return root;
    }

    public void display() {
        System.out.println("\n--- Locations in Tree (Alphabetical) ---");
        inorder(root);
        System.out.println();
    }

    private void inorder(LocationNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.name + " ");
            inorder(node.right);
        }
    }
}
