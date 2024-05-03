public class StackStructure {
    public final int min = -1;
    private final int[] stack;
    private final int capacity;
    private int top;

    public StackStructure(int capacity) {
        super();
        stack = new int[capacity];
        this.capacity = capacity;
        top = min;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }

        top++;
        stack[top] = data;

    }

    public void pop() {
        int temp;
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        temp = stack[top];
        top--;
    }

    public boolean isEmpty() {
        return top == min;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return stack[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Element: ");

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
