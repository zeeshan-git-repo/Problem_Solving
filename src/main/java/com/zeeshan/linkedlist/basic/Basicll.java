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
        Node temp = node1;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
}
