package DataStructures.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        System.out.println("Root = " + myBST.root);

        myBST.insert(20);
        myBST.insert(89);
        myBST.insert(54);
        myBST.insert(2);
        myBST.insert(89);
        myBST.insert(65);
        myBST.insert(43);
        myBST.insert(3);

        System.out.println(myBST.root.left.right.value);

        System.out.println(myBST.contains(100));

        System.out.println(myBST.rContains(2));


    }
}
