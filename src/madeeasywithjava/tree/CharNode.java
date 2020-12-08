package madeeasywithjava.tree;

public class CharNode {

    char ch;
    CharNode left;
    CharNode right;

    public CharNode(char ch) {
        this.ch = ch;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public CharNode getLeft() {
        return left;
    }

    public void setLeft(CharNode left) {
        this.left = left;
    }

    public CharNode getRight() {
        return right;
    }

    public void setRight(CharNode right) {
        this.right = right;
    }
}
