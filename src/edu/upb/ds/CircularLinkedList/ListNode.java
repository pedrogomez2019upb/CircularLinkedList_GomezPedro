package edu.upb.ds.CircularLinkedList;

public class ListNode {
    private Object object;
    private ListNode next;

    public ListNode(){}

    public void ListNode(){
        this.object=object;
        this.next=null;
    }
    public void ListNode(Object object){
        this.object=object;
        this.next=null;
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

    public void linkNext(ListNode n){
        next=n;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "object=" + object +
                ", next=" + next +
                '}';
    }
}
