package com.csc;

public class SinglyLinkedList
{
    Node head;

    static class Node
    {
        //ChainLink data = new ChainLink();
        ChainLink data;
        Node next;

        Node(ChainLink data)
        {
            this.data = data;
            this.next = null;
        }
    }

    SinglyLinkedList()
    {
        this.head = null;
    }

    public void createSinglyLinkedList()
    {
        ChainLink linkOne = new ChainLink("red");
        Node node1 = new Node(linkOne);
        this.head = node1;

        ChainLink linkTwo = ChainLink("blue");
        Node node2 = new Node(linkTwo);
        node1.next = node2;

        ChainLink linkThree = ChainLink("green");
        Node node3 = new Node(linkThree);
        node2.next = node3;
    }

    public void append(Node newNode)
    {
        Node current = this.head;

        if(current == null){
            this.head = newNode;
        } else { 
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void displaySinglyLinkedList()
    {
        Node current = this.head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}