public class main {

    public static void main(String[] args) {
        LinkedList myLinkedList= new LinkedList(4);

         myLinkedList.append(10); //calling the append method to add node
         myLinkedList.printList();

         myLinkedList.removeLast();
         myLinkedList.printList();
    }
}
