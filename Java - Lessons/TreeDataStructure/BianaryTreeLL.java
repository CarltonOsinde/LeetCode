package TreeDataStructure;

public class BianaryTreeLL {
    BinaryNode root;

    public void BinaryTreeLL(){
        this.root = null;
    }

    //Pre-Order Traversal (R.L.R |  Root Node -->Left Subtree -->Right Subtree ) 
    void preOrderTraversal(BinaryNode node){
        if (node == null){ //O(1)
            return;//O(1)
        }
        System.out.println(node.value + " "); //O(1)
        preOrderTraversal(node.left);//O(n/2)
        preOrderTraversal(node.right);//O(n/2)

        //Time Complexity is O(n)
    }


    //In Order Traversal (L.R.R | Left subtree -> Root Node -> Right Subtree)
    void inOrderTraversal(BinaryNode node){
        if(node != null){ //O(1)
            inOrderTraversal(node.left);//O(n/2)
            System.out.println(node.value + " "); //O(1)
            inOrderTraversal(node.right); //O(n/2)
        }

        //Time Complexity is O(n)
    }




    //Post Order Traversal (L.R.R | Left subtree -> Right subtree -> Root Subtree)
    void postOrderTraversal(BinaryNode node){
        if (node != null){ //O(1)
            postOrderTraversal(node.left); //O(n/2)
            postOrderTraversal(node.right);//O(n/2)
            System.out.print(node.value + " ");//O(1)


            //Time Complexity is O(n)
        }
    }
}
