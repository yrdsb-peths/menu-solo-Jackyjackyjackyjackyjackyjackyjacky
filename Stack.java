public class Stack<Type> {
    public class Node {
        private Type item;
        private Node next;
    }

    Node first;
    int length = 0;

    public void add(Type item) {
        length += 1;
        if(first == null) {
            first = new Node();
        }
        else {
            Node second = first;
            first = new Node();
            first.next = second;
        }
        first.item = item;
    }

    public Type pop() {
        length -= 1;
        Node toRemove = first;
        first = first.next;
        return toRemove.item;
    }

    public int getLength() {
        return length;
    }
}