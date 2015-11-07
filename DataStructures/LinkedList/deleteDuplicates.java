/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method.
    
    if(head == null || head.next == null)
            return head;
 
        Node runner = head;    
        Node fastRunner = head.next;
 
        while(fastRunner != null){
            if(fastRunner.data == runner.data){
                runner.next = fastRunner.next;
                fastRunner = fastRunner.next;
            }else{
                runner = fastRunner;
                fastRunner = fastRunner.next; 
            }
        }
 
        return head;

}