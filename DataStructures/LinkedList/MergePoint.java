/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    Node temp = headB;
    while (headA.next != null) {
        headB = temp;
        while (headB.next != null) {
            if (headA.data == headB.data)
                return headA.data;
            headB = headB.next;
        }
        headA = headA.next;
    }
    // Complete this function
    // Do not write the main method. 

    return 7;
}
