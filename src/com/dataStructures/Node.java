package com.dataStructures;

public class Node <T>{
    T val;
    Node next;

    public Node(T val){
        this(val,null);
    }

    public Node (T val, Node next){
        this.val = val;
        this.next = next;
    }
}
