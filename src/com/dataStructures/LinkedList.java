package com.dataStructures;

public class LinkedList implements LinkedLists {

    Node head;
    Node tail;
    int count;

    public LinkedList(){
        head=tail=null;
        count=0;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public void addToTail(Object el) {
        //create a new node
        Node n = new Node(el);
        //check if the list is empty
        if (isEmpty()) {
            //if empty
            //since list has no elements assigning both head and tail to new element
            head=tail=n;
        }else {
            //if not empty
            //add current tails next refference to the new element
            tail.next=n;
            //make new element as tail
            tail=n;
        }
        //increment the count
        count++;
    }
//this also right
//    @Override
//    public void addToHead(Object el) {
//        //create a new node
//        Node n = new Node(el);
//        //check if the list is empty
//        if (isEmpty()){
//            //if empty
//            //since list has no elements assigning both head and tail to new element
//            head=tail=n;
//        }else{
//            //if not empty
//            n.next=head;
//            n=head;
//        }
//    }
    @Override
    public void addToHead(Object el) {
        //check if the list is empty
        if (isEmpty()){
            //if empty
            Node n=new Node(el);
            //since list has no elements assigning both head and tail to new element
            head=tail=n;
        }else{
            //if not empty
            Node n =new Node(el,head);
            head=n;
        }
        count++;
    }

    @Override
    public Node search(Object el) {
        Node temp;
        if (!isEmpty()) {
            for (temp = head; temp != null; temp = temp.next) {
                if (el == temp) break;
            }
            return temp;
        }else {
            return null;
        }
    }

    @Override
    public int getLength() {
        return count;
    }
    //**********************************
    @Override
    public int getElement(int index) {
        return 0;
    }
    //**********************************
    @Override
    public int getIndex(Object el) {
        return 0;
    }

    @Override
    public void printAll() throws Exception {
        if (isEmpty()){
           for (Node temp=head;temp!=null;temp=temp.next){
               System.out.print(temp.val+" ");
           }
        }else {
            throw new Exception("No elements..Empty LinkedList");
        }
    }

    @Override
    public void addAfter(Object elexist,Object el) throws Exception {
        if (isEmpty()){
            throw new Exception("Empty LinkedList");
        }else{
            Node temp = search(elexist);
            temp.next=new Node(el,temp.next);
        }
    }

    @Override
    public void addBefore(Object elexist,Object el) throws Exception {
//        if (isEmpty()){
//            throw new Exception("Empty LinkedList");
//        }else{
//            Node temp = search(elexist);
//            temp.next=new Node(el,temp.next);
//        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void deleteFromTail() throws Exception {
        if (isEmpty()){
            throw new Exception("Empty LinkedList");
        }else{
            if (head==tail){head=tail=null;}
            else {
                Node temp;
                for (temp=head;temp.next.next!=null;temp=temp.next);
                temp.next=null;
                tail=temp;
            }
        }
    }

    @Override
    public void deleteFromHead() throws Exception {
        if (isEmpty()){
            throw new Exception("Empty LinkedList");
        }else{
            if (head==tail){head=tail=null;}
            else {
                head=head.next;
            }
        }
    }
}
