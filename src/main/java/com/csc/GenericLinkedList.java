package com.csc;

public class GenericLinkedList<T> 
{
    GenericNode<T> head;

    public GenericLinkedList() 
    {
        this.head = null;
    }

    public void createLinkedList() 
    {
        GenericNode<T> node1 = new GenericNode<>((T) "red");
        this.head = node1;

        GenericNode<T> node2 = new GenericNode<>((T) "blue");
        node1.next = node2;

        GenericNode<T> node3 = new GenericNode<>((T) "green");
        node2.next = node3;
    }

    public GenericNode<T> next()
    {
        GenericNode<T> current = this.head;
        if(current == null) {
            return null;
        } else {
            return current.next;
        }
    }

    public void append(GenericNode<T> newNode)
    {
        GenericNode<T> current = this.head;

        if(current == null){
            this.head = newNode;
        } else {
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void displayLinkedList()
    {
        GenericNode<T> current = this.head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}