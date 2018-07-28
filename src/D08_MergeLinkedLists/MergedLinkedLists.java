package D08_MergeLinkedLists;

public class MergedLinkedLists {

    public static LinkedList mergeLists(LinkedList listA, LinkedList listB) {

        //create size variables to help iterate through each list
//        int aSize = listA.size();
//        int bSize = listB.size();

        //create a new linked list to return the merged list
        LinkedList returnList = new LinkedList();

        //establish root nodes to help rebuild connections to new merged list.
        ListNode currentA = listA.root;
        ListNode currentB = listB.root;



        //with edge cases eliminated start new zipped list with root of first list
        returnList.root = currentA;
        returnList.append(currentB.data);


//        //scenario where both linked lists are empty (but why do that?)
//        //just in case the user doesn't realize the lists are both empty
//        if (aSize == 0 && bSize == 0) {
//            System.out.println("Lists are empty");
//        }
//        //scenario where one of the two lists is empty
//        //just in case a user doesn't realize that one of the two lists is empty
//        if (bSize == 0) {
//            System.out.println("One of your lists is empty. Here is the other list");
//        }
//        if (aSize == 0) {
//            System.out.println("One of your lists is empty. Here is the other list");
//        }


        //checking if above worked
        System.out.println(returnList.toString());

        //loop to build merged list
        while (currentA.next != null && currentB.next != null) {

            //establish new root for the return Linked List as the root
            //of the first list argument in this method and then append
            //the root of the second list argument to the newly created
            //return/merged list
            returnList.append(currentA.next.data);
            returnList.append(currentB.next.data);

            //checking if above worked
            System.out.println(returnList.toString());

            //now that first two nodes are established, move pointers
            //over one node in each list
            currentA = currentA.next;
            currentB = currentB.next;

            //while there are values in the first list, keep appending a value
            //to the newly merged "return" list and moving the pointer
            // over to the next node
            if (currentA.next != null) {
                while (currentA.next != null) {
                    returnList.append((currentA.next.data));
                    currentA = currentA.next;
                }
                //while there are values in the second list, keep appending a value
                //to the newly merged "return" list and moving the pointer
                // over to the next node
            } else {
                while (currentB.next != null) {
                    returnList.append((currentB.next.data));
                    currentB = currentB.next;
                }
            }
        }
        //return method as string for easy readability and testing
        System.out.println(returnList.toString());
        return returnList;
    }
}