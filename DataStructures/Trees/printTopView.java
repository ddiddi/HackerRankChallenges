/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void left_part(Node root) {
    if (root != null) {
        left_part(root.left);
        System.out.print(root.data + " ");
    }
}


void right_part(Node root) {
    if (root != null) {
        System.out.print(root.data + " ");
        right_part(root.right);
    }
}

void top_view(Node root)
{
    left_part(root.left);
    System.out.print(root.data + " ");
    right_part(root.right);
  
}