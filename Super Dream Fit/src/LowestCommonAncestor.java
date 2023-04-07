//import java.util.*;
//
//public class LowestCommonAncestor {
//    public static Node LCA(Node root, int l1, int l2)
//    {
//        if(root==null) return null;
//
//        if(root.data == l1 || root.data == l2)
//                return root;
//
//        Node left_sub = LCA(root.left, l1, l2);
//        Node right_sub = LCA(root.right, l1, l2);
//
//        if(left_sub.data == l1 || right_sub.data ==l2)
//        {
//
//        }
//
//        return Node;
//
//    }
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        Node n1 = new Node(10);
//        n1.left = new Node(8);
//        n1.right = new Node(12);
//        n1.left.left = new Node(6);
//        n1.left.right = new Node(9);
//        n1.right.left = new Node(11);
//        n1.right.right = new Node(14);
//
//        //14 is data we need to search
//        //System.out.println(helper(n1, 9)?"Data Found":"Data Not Found");
//        System.out.println(LCA(n1, 6,9));
//    }
//}
