/*
  Detect cycle in the list
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int HasCycle(Node head) {
    
     Node Runner = head;
     Node fastRunner = head;  
   
    while(fastRunner!= null) {  
        fastRunner = fastRunner.next.next;  
        Runner = Runner.next;  
        if(fastRunner == Runner){  
            return 1;  
        }
         
    }
    return 0; 
}
