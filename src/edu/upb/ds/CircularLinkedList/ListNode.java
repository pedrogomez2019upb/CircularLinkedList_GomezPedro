package edu.upb.ds.CircularLinkedList;

public class ListNode {
    private Object object;
    public ListNode next;

    public ListNode() {
        this.object = object;
        this.next = null;
    }

    public ListNode(Object object) {
        this.object = object;
        this.next = null;
    }

    public ListNode(Object object,ListNode next){
        this.object=object;
        this.next=next;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void linkNext(ListNode n) {
        next = n;
    }

    @Override
    public String toString() {
        return String.valueOf(object);
        /*
        return "ListNode{" +
                "object=" + object +
                ", next=" + next +
                '}';

         */
    }

}

