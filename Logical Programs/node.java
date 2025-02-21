package com.studenttribe.tasks;

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

    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;  // Store the next node
            current.next = prev;  // Reverse the current node's pointer
            prev = current;       // Move the pointers one position forward
            current = next;
        }
        head = prev;  // Update the head to the new front
    }

    void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);

        System.out.println("Original Linked List:");
        ll.printList();

        ll.reverse();

        System.out.println("Reversed Linked List:");
        ll.printList();
    }
}
