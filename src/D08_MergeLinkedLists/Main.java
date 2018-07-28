package D08_MergeLinkedLists;

public class Main {
    public static void main(String[] args) {
        LinkedList listA = new LinkedList();
        LinkedList listB = new LinkedList();

        //build two lists to test in main method before testing
        listA.prepend(5);
        listA.prepend(3);
        listA.prepend(1);

        listB.prepend(6);
        listB.prepend(4);
        listB.prepend(2);

        //verify order of original two linked lists
        System.out.println(listA.toString());
        System.out.println(listB.toString());

        //use method to create merged linked list
        LinkedList listC = MergedLinkedLists.mergeLists(listA, listB);

        //verify final order of merged linked list (and method working correctly)
        System.out.println(listC.toString());
    }
}
