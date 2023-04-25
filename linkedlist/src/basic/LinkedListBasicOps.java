package basic;

public class LinkedListBasicOps {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insert(linkedList,100);
        linkedList.insert(linkedList,200);
        linkedList.insert(linkedList,300);
        linkedList.insert(linkedList,400);
        linkedList.insert(linkedList, 500);

        System.out.println("LinkedList length:- "+linkedList.calculateLLLength(linkedList));

        System.out.println("LinkedList traversal elements:- ");
        linkedList.traverse(linkedList);

        LinkedList newLikedList = linkedList.reverseLLUsingStack(linkedList);
        System.out.println("LinkedList traversal elements after reverse using stack:- ");
        linkedList.traverse(newLikedList);

        System.out.println("LinkedList delete 300");
        linkedList.deleteByKey(linkedList,300);

        System.out.println("LinkedList length:- "+linkedList.calculateLLLength(linkedList));
        System.out.println("LinkedList traversal elements:- ");
        linkedList.traverse(linkedList);

        System.out.println("LinkedList delete 1000");
        linkedList.deleteByKey(linkedList,1000);

        linkedList.insertAtHead(linkedList, 1000);
        System.out.println("LinkedList traversal elements:- ");
        linkedList.traverse(linkedList);

        linkedList.insertAtKPosition(linkedList, 900, 3);
        System.out.println("LinkedList traversal elements:- ");
        linkedList.traverse(linkedList);


        System.out.println("Is cycle detected:- "+linkedList.detectCycle(linkedList));

        LinkedList newLikedList1 = linkedList.reverseLLUsingRecursion(linkedList);
        System.out.println("LinkedList traversal elements after reverse using recursion:- ");
        linkedList.traverse(newLikedList1);

        LinkedList.Node head = linkedList.reverseLLUsingIterative(newLikedList1.head);
        System.out.println("LinkedList traversal elements after reverse using iterative:- ");
        linkedList.traverse(head);

        System.out.println("LinkedList cycle created:- ");
        newLikedList1.head.next = newLikedList1.head;

        System.out.println("Is cycle detected:- "+linkedList.detectCycle(newLikedList1));
    }
}
