public class AddInLinkedList {
    public static class LinkedList {
        private class Node {
            int data;
            Node next;
        }

        private Node head;
        private Node tail;
        private int size;

        // Add to the end of the list
        public void addLast(int item) {
            Node newNode = new Node();
            newNode.data = item;
            newNode.next = null;

            if (this.size == 0) {
                this.head = newNode;
                this.tail = newNode;
            } else {
                this.tail.next = newNode;
                this.tail = newNode;
            }
            this.size++;
        }

        // Add to the beginning of the list
        public void addFirst(int item) {
            Node newNode = new Node();
            newNode.data = item;
            newNode.next = null;

            if (this.size == 0) {
                this.head = newNode;
                this.tail = newNode;
            } else {
                newNode.next = this.head;
                this.head = newNode;
            }
            this.size++;
        }



        // Get the first element
        public int getFirst() {
            if (this.size == 0) {
                throw new IllegalStateException("List is empty");
            }
            return this.head.data;
        }

        // Get the last element
        public int getLast() {
            if (this.size == 0) {
                throw new IllegalStateException("List is empty");
            }
            return this.tail.data;
        }

        // Get element at specific index (0-based)
        public int getAt(int index) {
            if (index < 0 || index >= this.size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }

            Node temp = this.head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // Display the list contents
        public void display() {
            System.out.println("_______________________________");
            Node temp = this.head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("\n_______________________________");
            System.out.println("Size: " + this.size);
            System.out.println("First: " + (this.size > 0 ? this.getFirst() : "N/A"));
            System.out.println("Last: " + (this.size > 0 ? this.getLast() : "N/A"));
            System.out.println("_______________________________");
        }

        // Get the size of the list
        public int size() {
            return this.size;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements
        list.addLast(1);
        list.addLast(2);
        list.addFirst(3);
        list.addLast(4);
        list.addFirst(5);
        list.addFirst(6);

        // Display the list
        list.display();

        // Test get methods
        System.out.println("\nTesting get methods:");
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.getAt(2));
        System.out.println("Element at index 4: " + list.getAt(4));
    }
}