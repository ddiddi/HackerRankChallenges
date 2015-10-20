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

Node InsertNth(Node head, int data, int position) {
    
    if (head == null || position == 0) {
        Node newNode = new Node();
        newNode.next = head;
        newNode.data = data;
        head = newNode;
        return head;
    }
    
    Node pre = new Node();
    Node runner = new Node();
    pre = head;
    runner = head;
    for (int i = 0; i<position;i++) {
        pre = runner;
        runner = runner.next;
    }
    
    Node newNode = new Node();
    pre.next = newNode;
    newNode.data = data;
    newNode.next = runner;
    return head;

}
