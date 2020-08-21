package edu.upb.ds.CircularLinkedList;

import java.util.Iterator;

public class List implements ListInterface,Iterable<ListNode>{
    private ListNode head;
    private ListNode tail;
    private ListNode inode;
    private int size;


    public void List(){
        head =null;
        tail=null;
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return head ==null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        head=null;
        tail=null;
    }

    @Override
    public Object getHead() {
        int counter=0;
        ListNode temporalNode=head;
        while (counter<0){
            temporalNode=temporalNode.getNext();
        }
        return temporalNode.getObject();
    }

    @Override
    public Object getTail() {
        int counter=0;
        ListNode temporalNode=tail;
        while (counter<0){
            temporalNode=temporalNode.getNext();
        }
        return temporalNode.getObject();

    }

    @Override
    public Object get(ListNode node) {
        ListNode trace =head;
        while (!trace.equals(node)){
            trace=trace.getNext();
        }
        return trace;
    }

    @Override
    public Object search(Object object) {
        Iterator<ListNode> i = this.iterator();
        ListNode inode;
        while (i.hasNext()) {

            inode = i.next();
            if (inode.getObject().toString().equals(object.toString())) {
                return inode;
            }
        }
        return null;
    }

    @Override
    public boolean add(Object object) {
        if(head==null){
            head = new ListNode(object);
            tail = head;
        }
        else
        {
            ListNode temporalNode=head;
            ListNode newNode=new ListNode(object);
            newNode.linkNext(temporalNode);
            head=newNode;
        }
        size ++;
        return true;
    }

    @Override
    public boolean insert(ListNode node, Object object) {
        return false;
    }

    @Override
    public boolean insert(Object ob, Object object) {
        return false;
    }

    @Override
    public boolean insertHead(Object object) {
        return false;
    }

    @Override
    public boolean insertTail(Object object) {
        return false;
    }

    @Override
    public boolean set(ListNode node, Object object) {
        return false;
    }

    @Override
    public boolean remove(ListNode node) {
        return false;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public boolean isEquals(Object object) {
        return false;
    }

    @Override
    public Iterator<ListNode> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] object) {
        return new Object[0];
    }

    @Override
    public Object getBeforeTo() {
        return null;
    }

    @Override
    public Object getBeforeTo(ListNode node) {
        return null;
    }

    @Override
    public Object getNextTo() {
        return null;
    }

    @Override
    public Object getNextTo(ListNode node) {
        return null;
    }

    @Override
    public List subList(ListNode from, ListNode to) {
        return null;
    }

    @Override
    public List sortList() {
        return null;
    }
}
