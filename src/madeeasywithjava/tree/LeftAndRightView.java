package madeeasywithjava.tree;

public class LeftAndRightView {
    public static void main(String[] args) {
        CharNode root = new CharNode('a');
        root.left = new CharNode('b');
        root.right = new CharNode('c');

        root.left.right = new CharNode('e');
        root.left.left = new CharNode('d');
        root.right.left = new CharNode('f');
        root.right.right = new CharNode('g');
        
    }
}
