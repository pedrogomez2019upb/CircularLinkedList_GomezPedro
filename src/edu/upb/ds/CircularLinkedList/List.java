package edu.upb.ds.CircularLinkedList;

import java.util.Iterator;

public class List implements ListInterface,Iterable<ListNode>{
    public ListNode head;
    public ListNode tail;
    public ListNode inode;
    public int size;


    public List(){
        head =null;
        tail=null;
        size=0;
    }

    public List(Object object){
        head = new ListNode(object);
        head.next=head;
        tail=head;
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
        while (counter<0)
        {
            temporalNode=temporalNode.getNext();
        }
        head.next=head;
        tail = head;

        return temporalNode.getObject();
    }

    @Override
    public Object getTail() {
        Object temTail = tail.getObject();
        return temTail;
    }

    @Override
    public Object get(ListNode node) {
        ListNode trace =head;
        while (!trace.equals(node)){
            trace=trace.next;
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
            head.next=head;
            tail = head;
        }
        else
        {
            ListNode temporalNode=head;
            ListNode newNode=new ListNode(object);
            newNode.next=head;
            //newNode.linkNext(temporalNode);
            tail=newNode;
        }
        size ++;
        return true;
    }

    @Override
    public boolean insert(ListNode node, Object object) {
        if(node.next==null){
            add(object);
        }
        else
        {
            ListNode insert = new ListNode(object);
            insert.next=node.next;
            node.next=insert;
            head.next=head;
            tail = head;
            size++;
        }
        return true;
    }

    @Override
    public boolean insert(Object ob, Object object) {
        ListNode trace=(ListNode) this.search(ob);
        if(trace.next==null){
            add(object);
        }
        else
        {
            ListNode insert = new ListNode(object);
            insert.next=trace.next;
            trace.next=insert;
            size++;
        }
        return true;
    }

    @Override
    public boolean insertHead(Object object) {
        try {
            if(isEmpty()) {
                head=new ListNode(object);
                tail=head;
                size++;
            }else {
                ListNode node = new ListNode(object);
                node.next=head;
                head=node;
                tail=head;
                size++;
            }
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean insertTail(Object object) {
        try {
            if (isEmpty()) {
                head = new ListNode(object);
                tail = head;
                size++;
            } else {
                tail.next = new ListNode(object);
                tail.next=tail;
                tail = tail.next;
                size++;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean set(ListNode node, Object object) {
        return false;
    }

    @Override
    public boolean remove(ListNode node)
    {
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
        inode = head;
        Iterator<ListNode> i = new Iterator<ListNode>() {
            @Override
            public boolean hasNext() {
                return inode.next != null ? true : false;
            }

            @Override
            public ListNode next() {
                if (hasNext()) {
                    ListNode tmp = inode;
                    inode = inode.next;
                    return tmp;
                } else {
                    return null;
                }
            }
        };
        return i;
    }

    @Override
    public ListNode rec(ListNode node) {
        if(node.next ==null){
            System.out.println(node.toString());
        }
        else{
            System.out.println(node.toString());
            return rec(node.next);
        }
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] object) {
        ListNode node = head;
        int sizeArray = object.length;
        int x = 0;
        object = new Object[size];
        object[0] = head.getObject();

        do {
            node = node.next;
            x++;
            object[x] = node.getObject();
        } while (x <= sizeArray);
        return object;
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

    public void setHead(ListNode head) {
        this.head = head;
    }

    public void setTail(ListNode tail) {
        this.tail = tail;
    }

    public ListNode getInode() {
        return inode;
    }

    public void setInode(ListNode inode) {
        this.inode = inode;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
