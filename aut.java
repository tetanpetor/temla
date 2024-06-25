class LinkedList {
    Node head; // head of the linked list

    // Node class
    class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Create the first node with data 1
        list.head = list.new Node(1);

        // Create a new node and make it the head of the list
        list.head = list.new Node(2);

        // The new head node points to the previous head node
        list.head.next = list.new Node(1);
    }
}
