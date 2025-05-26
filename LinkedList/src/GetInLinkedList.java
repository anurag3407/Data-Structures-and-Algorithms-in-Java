public class GetInLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.getAt(2));
        System.out.println("Size of list: " + list.size());
    }
}

class LinkedList<T> {
    private Node<T> head;
    private int size;

    // Node class
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor
    public LinkedList() {
        head = null;
        size = 0;
    }

    // Add element to the end of the list
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Get the first element
    public T getFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        return head.data;
    }

    // Get the last element
    public T getLast() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    // Get element at specific index (0-based)
    public T getAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Get the size of the list
    public int size() {
        return size;
    }

    // Check if list is empty
    public boolean isEmpty() {
        return size == 0;
    }
}