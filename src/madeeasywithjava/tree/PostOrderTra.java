package madeeasywithjava.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTra {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left =  new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(postOrderTraversal(root));

    }
    public static List<Integer> postOrderTraversal(TreeNode root){
        TreeNode prev = null;
        TreeNode current = null;
        Stack<TreeNode>  s = new Stack<>();
        List<Integer> res = new ArrayList<>();
        s.push(root);
        while(!s.isEmpty()){
            current = s.peek();
            if(prev==null || prev.left==current|| prev.right==current){
                if(current.left != null){
                    s.push(current.left);
                }
                else if(current.right != null){
                    s.push(current.right);
                }
            }
            else if(current.left==prev){
                if(current.right != null){
                    s.push(current.right);
                }
            }
            else
            {
              res.add(current.data);
              s.pop();
            }
            prev = current;
        }

      return res;
    }

}
