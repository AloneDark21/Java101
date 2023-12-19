package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7,5,1,8,3,6,0,9,4,2};

        System.out.println("Binary Search Tree");

        BinarySearchTree binarySarchTree = new BinarySearchTree();

        for (int i : arr) {
            binarySarchTree.insert(i);
        }

        System.out.print("\nBST Ağacı İnorder Sıralama : ");
        binarySarchTree.inorder();

        //System.out.print("\nBST Ağacı Postorder Sıralama : ");
        //binarySarchTree.postorder();

        //System.out.print("\nBST Ağacı Preorder Sıralama : ");
        //binarySarchTree.preorder();
    }
}
