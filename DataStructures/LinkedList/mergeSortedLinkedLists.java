/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    Node listHead = new Node();
    if (headA == null){
        return headB;
    }
    else if (headB == null){
        return headA;
    }
    if (headA.data < headB.data){
        headA.next = MergeLists(headA.next, headB);
        listHead = headA;
    }
    else {
        headB.next = MergeLists(headA, headB.next);
        listHead = headB;
    }
    return listHead;
}