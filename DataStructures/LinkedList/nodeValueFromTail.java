/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method.
    Node runner = head;
    if (head == null) {
        return 0;
    }
    int count  = 1;
    while(runner.next != null) {
        runner = runner.next;
        count++;
    }
    
    runner = head;
    for(int i = 0; i< count - n -1; i++) {
        runner = runner.next;
    }
    return runner.data;
}