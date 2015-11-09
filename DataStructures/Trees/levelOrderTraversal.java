 /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
        Queue<Node> level=new LinkedList<Node>();  
        level.add(root);  
        while(!level.isEmpty()) {  
           Node temp=level.poll();  
           System.out.print(temp.data + " ");  
           
           if(temp.left!=null) {  
                level.add(temp.left);
           }
           if(temp.right!=null) {  
                level.add(temp.right);
           }
        }
   }
