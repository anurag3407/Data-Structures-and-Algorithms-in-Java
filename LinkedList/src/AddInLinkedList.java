public class AddInLinkedList {
    public static class LinkedList {

        private class Node {
            int data;
            Node next;
        }
        private Node head;
        private Node tail;
        private int size;

        public void display() {

            System.out.println ("_______________________________");
            Node temp = this.head;


            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("________________________________");

        }
        public void addLast(int item){

            //create a new node;
            Node newNode = new Node();
            newNode.data = item;
            newNode.next = null;

            //attach
            if (this.size >= 1 ) {
                this.tail.next = newNode;
            }
            if (this.size == 0) {
                this.head = newNode;
                this.tail = newNode;
                this.size++;
            }
            else {
                this.tail.next = newNode;
                this.size++;
            }
        }
        public void addFirst(int item){

            //create a new node
            Node newNode = new Node();
            newNode.data = item;
            newNode.next = null;

            //attach
            if (this.size >= 1 ) {
                this.tail.next = newNode;
            }
            if (this.size == 0) {
                this.head = newNode;
                this.tail = newNode;
                this.size++;
            }
            else {
                this.head= newNode;
                this.size++;

            }
        }



    }

    public static void main(String[] args){
         LinkedList list = new LinkedList();
         list.addLast(1);
         list.addLast(2);
         list.addFirst(3);
         list.addLast(4);
         list.addFirst(5);
         list.addFirst(6);
         list.display();
    }
}
