public class Main {
    public static void main(String[] args) {
        StackStructure stack = new StackStructure(3);

        System.out.println("# Sebelum push #");

        System.out.println("Size: " + stack.size());
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Is Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.display();

        System.out.println("# Melakukan Push 3x dan Pop 1x#");

        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.pop();

        System.out.println("Size: " + stack.size());
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Is Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.display();
    }
}
