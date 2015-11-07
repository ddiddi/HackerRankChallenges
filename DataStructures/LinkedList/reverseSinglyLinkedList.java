/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    Node temp1 = new Node();
    Node temp2 = new Node();
    Node curr = new Node();
        curr = head;
        temp1 = curr.next;
        curr.next = null;
        while (temp1 != null) {
            temp2 = temp1.next;
            temp1.next = curr;
            curr = temp1;
            temp1 = temp2;
        }
    return curr;

}