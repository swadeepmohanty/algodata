package com.ds.linkedlist;

public class LinkedListDemo {
    private Node head;
    private Node tail;
    private int length;

    public LinkedListDemo(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Printing Value " + temp.value);
            temp = temp.next;
        }
    }

    public void getHeadValue () {
        System.out.println("Printing Head Value "+ head.value);
    }

    public void getTailValue () {
        System.out.println("Printing Tail Value "+ tail.value);
    }

    public void getLength () {
        System.out.println("Printing Length "+ length);
    }
}
