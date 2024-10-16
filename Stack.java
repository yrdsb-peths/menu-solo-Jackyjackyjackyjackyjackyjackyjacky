public class Stack<Type> {
    public class Node {
        private Type item;
        private Node next;
    }
    Node first;

    public void add(Type item) {
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

    public Type remove() {
        Node toRemove = first;
        first = first.next;
        return toRemove.item;
    }
}