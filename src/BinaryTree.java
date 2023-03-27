public class BinaryTree {
    static class Node {
        char data;
        Node left;
        Node right;

        Node(char data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }

        //inorder
        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }

        //preorder
        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }

        //postorder
        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.println(root.data);
            postorder(root.left);
            postorder(root.right);
        }

        public static void main(String[] args) {
            Node root = new Node('A');
            root.left = new Node('B');
            root.right = new Node('C');
            root.left.left=new Node('d');
            root.left.right=new Node('e');
            root.right.left=new Node('f');
            root.right.right=new Node('g');
            System.out.println("inorder");
            inorder(root);
            System.out.println("preorder");
            preorder(root);
            System.out.println("postorder");
            postorder(root);
        }
    }
}