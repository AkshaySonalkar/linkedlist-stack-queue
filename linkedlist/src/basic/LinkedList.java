package basic;

import java.util.Stack;

public class LinkedList {

    Node head;

    public boolean detectCycle(LinkedList linkedList) {
        Node slow = linkedList.head;
        Node fast = linkedList.head;

        while(slow != null && fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    public int calculateLLLength(LinkedList linkedList) {
        Node head = linkedList.head;
        int count = 1;
        while (head.next != null) {
            count+=1;
            head = head.next;
        }

        return count;
    }

    public LinkedList deleteByKey(LinkedList linkedList, int key) {
        Node currentNode = linkedList.head;
        Node previousNode = null;

        // key at head position
        if(currentNode != null && currentNode.val == key){
            linkedList.head = currentNode.next;
            System.out.println(key + " found and deleted");
        }

        while(currentNode != null && key != currentNode.val){
            previousNode = currentNode;
            currentNode = currentNode.next;
        }


        if(currentNode != null){
            if (currentNode.val == key){
                previousNode.next = currentNode.next;
                System.out.println(key+" found and deleted");
            }
        }

        if(currentNode == null){
            System.out.println(key+" not found");
        }

        return linkedList;
    }

    public LinkedList insertAtHead(LinkedList linkedList, int val) {

        Node node = new Node(val);
        node.next = linkedList.head;
        linkedList.head = node;
        return linkedList;
    }

    public LinkedList insertAtKPosition(LinkedList linkedList, int val, int pos) {
        int count = 1;
        Node currentNode = linkedList.head;
        Node previousNode = null;
        if(count == pos){
            Node node = new Node(val);
            node.next = linkedList.head;
            linkedList.head = node;
        }

        while(pos != count && currentNode.next != null){
            previousNode = currentNode;
            currentNode = currentNode.next;
            count+=1;
        }

        if (pos == count){
            Node node = new Node(val);
            previousNode.next = node;
            node.next = currentNode;
            System.out.println("At "+pos+ " position inserted new node");
        }else {
            System.out.println(pos+" greater that existing LL length");
        }

        return linkedList;
    }

    public LinkedList reverseLLUsingStack(LinkedList linkedList) {

        Stack<Integer> stack = new Stack<>();
        Node currentNode = linkedList.head;
        while(currentNode.next != null){
            stack.push(currentNode.val);
            currentNode = currentNode.next;
        }
        stack.push(currentNode.val);

        LinkedList newLinkdedList = new LinkedList();

        while(!stack.isEmpty()){
            int val = stack.pop();
            Node node1 = new Node(val);
            if(newLinkdedList.head == null){
                newLinkdedList.head = node1;
            }else{
                Node newCurrentNode = newLinkdedList.head;
                while(newCurrentNode.next != null){
                    newCurrentNode = newCurrentNode.next;
                }
                newCurrentNode.next = node1;
            }
        }

        return newLinkdedList;
    }

    public LinkedList reverseLLUsingRecursion(LinkedList linkedList) {
        LinkedList newLinkedList = new LinkedList();
        Node head = linkedList.head;
        newLinkedList.head = reverseLL(head);
        return newLinkedList;
    }

    private Node reverseLL(Node head) {
        if(head == null) return null;
        if(head.next == null) return head;
        Node newHead = reverseLL(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public LinkedList insert(LinkedList linkedList,int data){
        Node node = new Node(data);
        if(linkedList.head == null){
            linkedList.head = node;
        }else{
            Node last = linkedList.head;
            while(last.next !=null){
                last = last.next;
            }
            last.next = node;
        }
        return linkedList;
    }




    public void traverse(LinkedList list){

        Node head = list.head;

        while(head.next != null){
            System.out.println("Element :"+head.val);
            head = head.next;
        }

        System.out.println("Element :"+head.val);

    }


}
