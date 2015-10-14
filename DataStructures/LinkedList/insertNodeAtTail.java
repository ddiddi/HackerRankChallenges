/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    
    Node headPointer = new Node();
    headPointer = head;
    while (headPointer.next!= null) {
        headPointer = headPointer.next;
    }
    Node newNode = new Node();
    headPointer.next = newNode;
    newNode.next = null;
    newNode.data = data;
    
    return head;
  
}