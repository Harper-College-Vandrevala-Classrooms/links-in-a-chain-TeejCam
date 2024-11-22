package com.csc;

public class Node
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