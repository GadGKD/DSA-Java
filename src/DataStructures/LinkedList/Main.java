package DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(2);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

//        myLinkedList.append(2);
        myLinkedList.append(3);

//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast());

        myLinkedList.prepend(1);
        myLinkedList.prepend(4);

        myLinkedList.set(1,4);

        myLinkedList.insert(2,9);

        myLinkedList.remove(3);

        myLinkedList.printList();





    }
}