package BaekJoon;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Stack {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        java.util.Stack stack=new java.util.Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.pop();
        stack.pop();

        System.out.println(stack);
    }
}