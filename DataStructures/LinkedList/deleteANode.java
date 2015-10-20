Node Delete(Node head, int position) {
  // Complete this method
    
    if (position == 0) {
        Node headP = new Node();
        headP = head.next;
        head.next = null;
        head = headP;
        return head;
    }
    Node runner = new Node();
    runner = head;
    Node pre = new Node();
    pre = head;
    for (int i = 0; i< position; i++) {
        pre = runner;
        runner = runner.next;
    }
    
    pre.next = runner.next;
    return head;

}