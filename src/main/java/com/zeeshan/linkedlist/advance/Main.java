package com.zeeshan.linkedlist.advance;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(4);
        list.insertAtEnd(90);
        list.insertAtEnd(20);

        list.insertAtStart(2);
        list.insertAt(5, 100);
        list.insertAt(6, 101);
        System.out.println("Size of list is: " + list.size());
        list.display();
        System.out.println("Tail: "+list.tail.data);
        System.out.println("Head: "+list.head.data);
    }
}
