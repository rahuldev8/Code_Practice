import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
public class SearchTree {
    public static boolean helper(Node root, int target)
    {
        if(root==null)
        {
            return false;
        }
        else if(root.data == target)
        {
            return true;
        }
        else if(root.data < target)
        {
            return helper(root.right, target);
        }
        else if(root.data > target)
        {
            return helper(root.left, target);
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Node n1 = new Node(10);
        n1.left = new Node(8);
        n1.right = new Node(12);
        n1.left.left = new Node(6);
        n1.left.right = new Node(9);
        n1.right.left = new Node(11);
        n1.right.right = new Node(14);

        //14 is data we need to search
        System.out.println(helper(n1, 9)?"Data Found":"Data Not Found");
    }
}
