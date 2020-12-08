package madeeasywithjava.tree;

public class NodeCalc {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left =  new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
       // System.out.println(numberOfNodes(root));
        System.out.println(searchData(root,17));

    }
    public static int numberOfNodes(TreeNode root){
        if(root==null)
            return 0;
        return numberOfNodes(root.left) + numberOfNodes(root.right)+1;
    }

    public static boolean searchData(TreeNode root,int data){

        if(root==null){
            return false;
        }
        if(root.data==data){
            return true;
        }
        return searchData(root.left,data) || searchData(root.right,data);

    }

}
