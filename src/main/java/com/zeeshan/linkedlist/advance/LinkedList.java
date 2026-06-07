package com.zeeshan.linkedlist.advance;

public class LinkedList {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null){
            head = temp;
        }else{
            tail.next = temp;
        }
        tail = temp;
    }

    void insertAtStart(int val) {
        Node temp = new Node(val);
        if(head!=null){
            temp.next = head;
        }
        head = temp;
    }

    public int size(){
        Node temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
