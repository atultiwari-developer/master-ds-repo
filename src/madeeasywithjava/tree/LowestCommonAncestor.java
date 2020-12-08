package madeeasywithjava.tree;

public class LowestCommonAncestor {

    public static void main(String[] args) {
        CharNode root = new CharNode('a');
        root.left = new CharNode('b');
        root.right = new CharNode('c');
        root.left.left =  new CharNode('d');
        root.left.left.left =  new CharNode('h');

        root.left.right =  new CharNode('e');
        root.left.left.right = new CharNode('i');

        root.right.left = new CharNode('f');
        root.right.left.left = new CharNode('j');
        root.right.left.right = new CharNode('k');
        root.right.right = new CharNode('g');
        root.right.right.right = new CharNode('l');

       CharNode res =  getLca(root,new CharNode('e'),new CharNode('c'));
        System.out.println("the answer is "+res.ch);

    }

    public static CharNode getLca(CharNode root,CharNode p,CharNode q){
        if(root==null)
            return null;
        if(root.ch==p.ch || root.ch==q.ch){
            return root;
        }
        CharNode left = getLca(root.left,p,q);
        CharNode right = getLca(root.right,p,q);
        if(left != null && right != null){
            return root;
        }

       return left!=null?left:right;
    }

}
