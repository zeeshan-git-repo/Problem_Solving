package com.zeeshan.linkedlist.advance;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(4);
        list.insertAtEnd(90);
        list.insertAtEnd(20);
        list.insertAt(9, 101);
        list.insertAtStart(2);
        list.insertAt(0, 100);
        System.out.println("Size of list is: " + list.size());
        list.display();
    }
}
