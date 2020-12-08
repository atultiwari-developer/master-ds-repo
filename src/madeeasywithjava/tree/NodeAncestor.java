package madeeasywithjava.tree;

public class NodeAncestor {

    public static void main(String[] args) {
        CharNode root = new CharNode('a');
        root.left = new CharNode('b');
        root.right = new CharNode('c');
        root.left.left = new CharNode('d');
        root.left.right = new CharNode('e');
        root.left.right.left = new CharNode('h');
        root.left.right.right = new CharNode('i');
        root.right.left = new CharNode('f');
        root.right.right = new CharNode('g');
        root.right.right.left = new CharNode('j');
        root.right.right.right = new CharNode('k');
        CharNode targetNode = new CharNode('h');

        printAllAncestor(root,targetNode);


    }

    public static boolean printAllAncestor(CharNode root,CharNode target){
        if(root != null){
           if(root.ch== target.ch){
               return true;
           }
           if(printAllAncestor(root.left,target) || printAllAncestor(root.right,target)){
               System.out.println(root.ch+" ");
               return  true;
           }
        }
        return false;

    }

}
