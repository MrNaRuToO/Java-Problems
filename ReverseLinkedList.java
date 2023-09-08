package pages;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Function to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node nextNode = null;

        while (current != null) {
            nextNode = current.next; // Store the next node
            current.next = prev; // Reverse the pointer direction

            // Move the pointers forward
            prev = current;
            current = nextNode;
        }

        head = prev; // Update the head to the last node (new first node)
    }

    // Function to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert some elements into the linked list
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        list.display();

        // Reverse the linked list
        list.reverse();

        System.out.println("\nReversed Linked List:");
        list.display();
    }
}
