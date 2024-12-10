package com.csc;

public class GenericNode<T> 
{
    T data;
    GenericNode next;

    GenericNode(T data)
    {
        this.data = data;
        this.next = null;
    }
}