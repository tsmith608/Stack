public class StackADemo {
    public static void main(String[] args) {
        // Create a new stack of Integers
        StackA<Integer> stacka = new StackA<>();

        // Push some values onto the stack
        stacka.push(10);
        stacka.push(20);
        stacka.push(30);
        stacka.push(40);

        // Print the stack after pushing the values
        System.out.println("Stack after pushing 10, 20, 30, 40:");
        System.out.println(stacka);

        // Pop the top value from the stack
        int popped = stacka.pop();
        System.out.println("\nPopped value: " + popped);

        // Print the stack after popping one element
        System.out.println("\nStack after popping one value:");
        System.out.println(stacka);

        // Push 100 values onto the stack (multiples of 10)
        for (int i = 0; i < 100; i++) {
            stacka.push(i * 10);
        }

        // Print the stack after pushing 100 values
        System.out.println("\nStack after pushing 100 values:");
        System.out.println(stacka);
    }
}
