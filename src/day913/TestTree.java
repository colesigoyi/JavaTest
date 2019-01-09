package day913;


import org.junit.Test;

import javax.swing.tree.*;

/**
 * @author taoxuefeng
 * @create 2018-10-09 00:00
 * @desc 二叉树实现
 **/

/*
*   public class Node {
*       private int index;    //树节点标号
*       private T date;         //数据
*       private TreeNode leftChild;   //左子树
*       private TreeNode rightChile;  //右子树
*       public TreeNode(int date, T date) {
*           this.index = index;
*           this.date = date;
*           this.leftChild = null;
*           this.rightChile = null;
*       }
*       //getter and setter;
*   }
 */
public class TestTree<T> {
    private int index;    //树节点标号
    private T date;         //数据
    public TestTree<T> leftChild;   //左子树
    public TestTree<T> rightChild;  //右子树



    public TestTree(int index, T date) {
       this.index = index;
       this.date = date;
       this.leftChild = null;
       this.rightChild = null;
   }
   //getter and setter;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public TreeNode getLeftChild() {
        return (TreeNode) leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = (TestTree<T>) leftChild;
    }

    public TestTree<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TestTree<T> rightChild) {
        this.rightChild = rightChild;
    }
}

class BinaryTree<T> {
    //二叉树的构建首先需要跟节点，一般在构造方法里面创建
    private static TestTree<String> root = null;
    public BinaryTree() {
        root = new TestTree<>(1, "A");
    }
    public void createBinaryTree() {
        TestTree<String> nodeB = new TestTree<>(1, "B");
        TestTree<String> nodeC = new TestTree<>(1, "C");
        TestTree<String> nodeD = new TestTree<>(1, "D");
        TestTree<String> nodeE = new TestTree<>(1, "E");
        TestTree<String> nodeF = new TestTree<>(1, "F");
        TestTree<String> nodeG = new TestTree<>(1, "G");
        root.leftChild = nodeB;
        root.rightChild = nodeC;
        nodeB.leftChild = nodeD;
        nodeB.rightChild = nodeE;
        nodeC.leftChild = nodeF;
        nodeC.rightChild = nodeG;
    }
    public int getHeight() {
        return getHeight((TestTree<String>) root);
    }
    public int getHeight(TestTree<String> node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeight(node.leftChild);
        int rightHeight = getHeight(node.rightChild);
        return leftHeight > rightHeight ? (leftHeight + 1) : (rightHeight + 1);
    }
    public int getSize() {
        return getSize((TestTree) root);
    }
    public int getSize(TestTree node) {
        if (node == null) {
            return 0;
        }
        int leftSize = getSize(node.leftChild);
        int rightSize = getSize(node.rightChild);
        return leftSize + rightSize + 1;
    }

    public void beforeOrder(TestTree<String> node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getDate() + " ");
        beforeOrder(node.leftChild);
        beforeOrder(node.rightChild);
    }
    public void midOrder(TestTree<String> node) {
        if (node == null) {
            return;
        }
        midOrder(node.leftChild);
        System.out.print(node.getDate() + " ");
        midOrder(node.rightChild);
    }
    public void afterOrder(TestTree<String> node) {
        if (node == null) {
            return;
        }
        afterOrder(node.leftChild);
        afterOrder(node.rightChild);
        System.out.print(node.getDate() + " ");
    }
    public static void main(String[] args){

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        System.out.print("前序遍历：");
        binaryTree.beforeOrder(root);
        System.out.println();
        System.out.print("中序遍历：");
        binaryTree.midOrder(root);
        System.out.println();
        System.out.print("后序遍历：");
        binaryTree.afterOrder(root);
        System.out.println();
        int height = binaryTree.getHeight();
        System.out.println("treeHeihgt: "+height);
        int size = binaryTree.getSize();
        System.out.println("treeSize: "+size);
    }
}

