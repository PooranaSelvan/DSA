import java.util.Stack;

public class InorderStack {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

//        inOrderTraversal(root);
        preOrderTraversal(root);
    }

    public static void inOrderTraversal(Node root){
        Stack<Node> stack = new Stack<>();
        Node currentNode = root;

        while (currentNode != null || !stack.isEmpty()){

//            This loop is used to iterate over the full left side, It will go to the bottom.
            while (currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            }

            currentNode = stack.pop(); // last element stores in currentNode
            System.out.println(currentNode.data); // prints the last element
            currentNode = currentNode.right; // stores the right element (Sibling of that left element)
        }
    }

    public static void preOrderTraversal(Node root){
        Stack<Node> stack = new Stack<>();
        Node currentNode = root;

        while (currentNode != null || !stack.isEmpty()){

            while (currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            }

            System.out.println(currentNode.data);
            currentNode = stack.pop();
            currentNode = currentNode.right;
        }
    }
}
