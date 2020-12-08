package madeeasywithjava.tree;

public class MaxTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left =  new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(maxValInTree(root));

    }
    public static int  maxValInTree(TreeNode root){
        int max = Integer.MIN_VALUE;
        if(root != null){
            int leftMax = maxValInTree(root.left);
            int rightMax = maxValInTree(root.right);
            if(leftMax>rightMax){
                max = leftMax;
            }
            else{
                max = rightMax;
            }
            if(root.data>max){
                max = root.data;
            }
        }
        return max;
    }

}
