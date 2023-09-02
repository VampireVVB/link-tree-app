class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int value) {
        if (!isFull()) {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " onto the stack.");
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int value = stackArray[top--];
            System.out.println("Popped " + value + " from the stack.");
            return value;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
    }
}

class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
