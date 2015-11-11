 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value)
    {   
    
     if (root == null) {
         Node newAdd = new Node();
         newAdd.data = value;
         return newAdd;
     }
     if (root.data > value) {
         if (root.left != null) {
             Insert(root.left, value);
         }
         else {
             Node addNew = new Node();
             addNew.data = value;
             addNew.left = null;
             addNew.right = null;
             root.left = addNew;
         }
     }
     else {
         if (root.right != null) {
             Insert(root.right,value);
         }
         else {
             Node addNew = new Node();
             addNew.data = value;
             addNew.left = null;
             addNew.right = null;
             root.right = addNew;
         }
     }
    return root;  
    }
