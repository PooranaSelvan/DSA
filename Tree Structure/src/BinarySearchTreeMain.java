public class BinarySearchTreeMain {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(15);
        tree.insert(12);
        tree.insert(2);
        tree.insert(5);

        System.out.println("------- InOrder Traversal -------");
        inOrderTraversal(tree.root);

        System.out.println("------- PreOrder Traversal -------");
        preOrderTraversal(tree.root);

        System.out.println("------- PostOrder Traversal -------");
        postOrderTraversal(tree.root);
    }

    public static void inOrderTraversal(Node node){
        if (node != null){
            inOrderTraversal(node.left);
            System.out.println(node.data);
            inOrderTraversal(node.right);
        }
    }

    public static void preOrderTraversal(Node node){
        if(node != null){
            System.out.println(node.data);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public static void postOrderTraversal(Node node){
        if(node != null){
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
            System.out.println(node.data);
        }
    }
}


class BinarySearchTree {
    Node root;
    public void insert(int data){
        root = insertRec(root, data);
    }

    public Node insertRec(Node current, int data){
        if(current == null){
            return new Node(data);
        }

        if(data < current.data){
            current.left = insertRec(current.left, data);
        } else if(data > current.data){
            current.right = insertRec(current.right, data);
        }
        return current;
    }
}