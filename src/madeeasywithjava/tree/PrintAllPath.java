package madeeasywithjava.tree;

import java.util.Stack;

public class PrintAllPath {
    static Stack<Character> s = new Stack<>();
    public static void main(String[] args) {
        CharNode root = new CharNode('a');
        root.left = new CharNode('b');
        root.right = new CharNode('c');
        root.left.left =  new CharNode('d');

        root.left.right =  new CharNode('e');
        root.left.right.left = new CharNode('h');
        root.left.right.right = new CharNode('i');
        root.left.right.right.left = new CharNode('j');
        root.left.right.right.right = new CharNode('k');


        root.right.left = new CharNode('f');
        root.right.right = new CharNode('g');
        root.right.right.right = new CharNode('m');

    }
    public static void pritAllPath(CharNode root){
        if(root==null){
            return;
        }
        s.push(root.ch);
        pritAllPath(root.left);
        if(root.left==null && root.right==null){
            printStack(s);
        }
        pritAllPath(root.right);
        s.pop();

    }

    private static void printStack(Stack<Character> s) {

        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
