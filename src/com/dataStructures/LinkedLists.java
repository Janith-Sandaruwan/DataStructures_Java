package com.dataStructures;

public interface LinkedLists<T>{

    public boolean isEmpty();

    public void addToTail(T el);
    public void addToHead(T el);

    public Node search(T el);
    public int getLength();
    public int getElement(int index);
    public int getIndex(T el);
    public void printAll() throws Exception;

    public void addAfter(T elexist,T el) throws Exception;
    public void addBefore(T elexist,T el) throws Exception;

    public void delete();
    public void deleteFromTail() throws Exception;
    public void deleteFromHead() throws Exception;

}
