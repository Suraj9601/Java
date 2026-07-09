package com.LinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    void insertLast(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void display() {
        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class CreateLL {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);

        list.insertLast(40);
        list.insertLast(50);

        list.display();
    }
}