package com.datastructure;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.push(30);
        linkedList1.print();

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(56);
        linkedList2.add(30);
        linkedList2.add(70);
//        linkedList2.print();
//        System.out.println(linkedList2.popLast());
//        linkedList2.print();

        if(linkedList2.search(30) != null){
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }

        System.out.println(linkedList2.insertAfter(30,40));
        System.out.println();
        linkedList2.print();

        System.out.println();
        linkedList2.popNode(40);
        linkedList2.print();
        System.out.println();

        System.out.println("Size of Array is : " + linkedList2.size());
    }

}

