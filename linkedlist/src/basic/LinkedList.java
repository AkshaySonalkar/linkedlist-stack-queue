package basic;

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
