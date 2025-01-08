public class StackA<E> implements StackI<E> {
    private E[] stack;    // Array to hold stack elements
    private int top;      // Index to track the top of the stack
    private int capacity; // Maximum capacity of the stack

    // Default constructor with a capacity of 255
    public StackA() {
        this(255); // Calls the constructor with a default capacity
    }

    // Constructor with a specified capacity
    public StackA(int capacity) {
        this.capacity = capacity;
        stack = (E[]) new Object[capacity]; // Create an array of type E
        this.top = -1; // Initialize top to -1, meaning the stack is empty
    }

    // Adds an element to the stack
    @Override
    public void push(E obj) {
        if (isFull()) {
            System.out.println("Stack is full"); // Stack is full, no more elements can be added
            return;
        }
        stack[++top] = obj; // Add element to the stack and increment top
    }

    // Removes and returns the element from the top of the stack
    @Override
    public E pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack"); // Stack is empty, nothing to pop
            return null;
        }
        return stack[top--]; // Return the top element and decrement top
    }

    // Returns the element at the top of the stack without removing it
    @Override
    public E peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack"); // Stack is empty, nothing to peek at
            return null;
        }
        return stack[top]; // Return the top element without removing it
    }

    // Returns the current number of elements in the stack
    @Override
    public int size() {
        return top + 1; // Size is top + 1, since top is the last index
    }

    // Returns the maximum capacity of the stack
    @Override
    public int capacity() {
        return capacity; // Return the stack's maximum capacity
    }

    // Checks if the stack is empty
    @Override
    public boolean isEmpty() {
        return top == -1; // Stack is empty if top is -1
    }

    // Checks if the stack is full
    @Override
    public boolean isFull() {
        return top == capacity - 1; // Stack is full if top is at the last index
    }

    // Returns a string representation of the stack
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("-top-\n"); // Start of the stack display
        for (int i = top; i >= 0; i--) {
            str.append("|").append(stack[i]).append("|\n"); // Add each element to the string
        }
        return str.append("-bot-").toString(); // Return the string with stack's top and bottom markers
    }
}
