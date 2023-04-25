package basic;

public class TraverseLL {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList = linkedList.insert(linkedList,100);
        linkedList = linkedList.insert(linkedList,200);
        linkedList = linkedList.insert(linkedList,300);
        linkedList = linkedList.insert(linkedList,400);
        linkedList = linkedList.insert(linkedList, 500);

        linkedList.traverse(linkedList);


    }
}
