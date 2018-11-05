import java.util.LinkedList;
import java.util.Queue;

// "static void main" must be defined in a public class.
public class Tree {
          
            public static class Node {
                Node left;
                Node right;
                int value;

                public Node (int val){
                    value = val;
                }

             }
             static Node root;
            
        
    
    
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6};
        root = levelOrderTree(arr);
        inorderPrint(root);
        System.out.println();
        BFSPrint(root);
        
    }
    
    
    public static Node levelOrderTree(int[] arr){
        Node root = levelOrderTree(arr, 0);
        return root;
    }
    public static Node levelOrderTree(int[] arr, int start){
        Node current = new Node(arr[start]);
        int left = 2*start +1;
        int right = 2*start+2;
        if(left < arr.length)
        current.left = levelOrderTree(arr, left);
         if(right < arr.length)
        current.right = levelOrderTree(arr, right);
        
        return current;
    }

    public static void inorderPrint(Node curr){
        if(curr != null){
          inorderPrint(curr.left);
          System.out.print(curr.value + " ");
          inorderPrint(curr.right);
          
        }
     
    }
    public static void BFSPrint( Node curr){
        Queue<Node> queue = new LinkedList<>();
        queue.add(curr);
        while(!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.print(temp.value + " " );
            if(temp.left != null) queue.add(temp.left);
            if(temp.right != null) queue.add(temp.right);
        }
    }
}