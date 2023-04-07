public class Subtree {
    public static boolean isSubTree(Node root, Node subtree)
    {
        return false;
    }
    public static void main(String[] args)
    {
        Node n1 = new Node(10);
        n1.left = new Node(8);
        n1.right = new Node(12);
        n1.left.left = new Node(6);
        n1.left.right = new Node(9);
        n1.right.left = new Node(11);
        n1.right.right = new Node(14);

        Node subtree = new Node(10);
        subtree.left = new Node(8);
        subtree.right = new Node(12);

        System.out.println(isSubTree(n1, subtree)?"Yes is is Subtree":"No, it is Not a Subtree");
    }
}
