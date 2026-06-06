package com.zeeshan.linkedlist.basic;

public class Basicll {
    public static void main(String[] args) {
        Node node1 = new Node(5);
        Node node2 = new Node(8);
        Node node3 = new Node(3);
        Node node4 = new Node(9);
        node1.next =  node2;
        node2.next =  node3;
        node3.next =  node4;
//        System.out.println(node1.data);
//        System.out.println(node1.next.data);
//        System.out.println(node1.next.next.data);
//        System.out.println(node1.next.next.next.data);

        // improvised way to display LL
        display(node1);
        System.out.println("\nDisplay using recursion");
        // using recursion
        displayRecursion(node1);

    }
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    private static void display(Node head){
        Node temp = head; // temp is created to preserve it's head
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    private static void displayRecursion(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data + " ");
        displayRecursion(head.next);
    }
}
