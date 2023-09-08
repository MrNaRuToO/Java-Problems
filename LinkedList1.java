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

    // Function to find the maximum value node in the linked list
    public Node findMaxNode() {
        if (head == null) {
            return null; // The list is empty
        }

        Node current = head;
        Node maxNode = head;

        while (current != null) {
            if (current.data > maxNode.data) {
                maxNode = current;
            }
            current = current.next;
        }

        return maxNode;
    }

    // Function to find the minimum value node in the linked list
    public Node findMinNode() {
        if (head == null) {
            return null; // The list is empty
        }

        Node current = head;
        Node minNode = head;

        while (current != null) {
            if (current.data < minNode.data) {
                minNode = current;
            }
            current = current.next;
        }

        return minNode;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements into the linked list
        list.head = new Node(10);
        list.head.next = new Node(5);
        list.head.next.next = new Node(8);
        list.head.next.next.next = new Node(2);

        // Find the maximum and minimum value nodes
        Node maxNode = list.findMaxNode();
        Node minNode = list.findMinNode();

        // Display the maximum and minimum value nodes
        if (maxNode != null) {
            System.out.println("Maximum value node: " + maxNode.data);
        } else {
            System.out.println("The list is empty.");
        }

        if (minNode != null) {
            System.out.println("Minimum value node: " + minNode.data);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
