 /*
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   int height(Node root)
    {
       int hL = 0; // Height of left subtree
       int hR = 0; // Height of right subtree
       
       // If leaf node
       if (root.left == null && root.right == null) {
             return 1;
       }
       // If left exists
       if (root.left != null) {
           hL = 1+height(root.left);
       }
       // If right exists
       if (root.right != null) {
           hR = 1+height(root.right);
       }
       
       // Return whichever is greater
       if (hL > hR) {
           return hL;
       }
       return hR;
    }
