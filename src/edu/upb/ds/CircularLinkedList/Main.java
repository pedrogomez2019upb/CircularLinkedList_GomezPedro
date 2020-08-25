package edu.upb.ds.CircularLinkedList;

public class Main {

    public static void main(String[] args) {
        List list1=new List();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        /*
        System.out.println("\n###################");
        System.out.println("\n"+list1.getHead());
        System.out.println("\n###################");
        System.out.println("\n###################");
        System.out.println("\n"+list1.getTail());
        System.out.println("\n###################");

        for(int i=0;i<10;i++){
            list1.add(i);
        }

         */
        System.out.println(list1.getHead());
        System.out.println(list1.getTail());

/*
        for(ListNode node=list1.head;node != list1.tail ;node=node.next)
        {
            System.out.println(node.toString());
        }

 */





    }
}
