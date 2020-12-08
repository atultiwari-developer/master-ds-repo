package madeeasywithjava.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left =  new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(inOrderIterative(root));
    }
    public static List<Integer> inOrderIterative(TreeNode root){
        TreeNode current = root;
        boolean done = false;
        Stack<TreeNode> s = new Stack<>();
       List<Integer> res = new ArrayList<>();

        while(!done){
            if(current != null){
                s.push(current);
                current = current.left;
            }
            else{
                if(s.isEmpty()){
                    done = true;
                }
                else{
                    current = s.pop();
                    res.add(current.data);
                    current = current.right;
;                }
            }
        }
       return res;
    }

}
