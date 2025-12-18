public class InorderRecursion {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("In Order Traversal : ");
        inOrderTraversal(root);
        System.out.println();

        System.out.println("Pre Order Traversal : ");
        preOrderTraversal(root);
        System.out.println();

        System.out.println("Post Order Traversal : ");
        postOrderTraversal(root);
        System.out.println();
    }

    public static void inOrderTraversal(Node root) {
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }

    public static void preOrderTraversal(Node root) {
        if(root == null){
            return;
        }
        System.out.println(root.data);
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
    }

    public static void postOrderTraversal(Node root) {
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        System.out.println(root.data);
    }
}
