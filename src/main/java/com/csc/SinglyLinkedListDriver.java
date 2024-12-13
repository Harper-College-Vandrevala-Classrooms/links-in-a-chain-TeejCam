package com.csc;

public class SinglyLinkedListDriver
{
    public static void main(String[] args)
    {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.createSinglyLinkedList();

        ChainLink link1 = new ChainLink("purple");
        Node node1 = new Node(link1);

        ChainLink link2 = new ChainLink("navy");
        Node node2 = new Node(link2);

        list1.append(node1);
        list1.displaySinglyLinkedList();

        list1.prepend(node2);
        list1.displaySinglyLinkedList();

        GenericLinkedList<String> list2 = new GenericLinkedList<>();
        list2.append(new GenericNode<>("red"));
        list2.append(new GenericNode<>("blue"));
        list2.append(new GenericNode<>("green"));

        list2.displayLinkedList();
    }
}