package basic;

public class TraverseLL {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insert(linkedList,100);
        linkedList.insert(linkedList,200);
        linkedList.insert(linkedList,300);
        linkedList.insert(linkedList,400);
        linkedList.insert(linkedList, 500);

        System.out.println("LinkedList traversal elements:- ");
        linkedList.traverse(linkedList);

        System.out.println("LinkedList length:- "+linkedList.calculateLLLength(linkedList));

        System.out.println("Is cycle detected:- "+linkedList.detectCycle(linkedList));

        System.out.println("LinkedList cycle created:- ");
        linkedList.head.next.next.next.next.next = linkedList.head;

        System.out.println("Is cycle detected:- "+linkedList.detectCycle(linkedList));
    }
}
