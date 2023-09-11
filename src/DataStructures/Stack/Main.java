package DataStructures.Stack;

public class Main {
    public static void main(String[] args) {
        //LIFO

        Stack myStack = new Stack(4);
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);

        myStack.pop();

        myStack.printStack();
    }
}
