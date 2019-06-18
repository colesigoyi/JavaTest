package test.com.qf.API.BinaryTree;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-18 15:51
 * @ desc: 二叉树
 **/

public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(8);
        bt.add(3);
        bt.add(10);
        bt.add(1);
        bt.add(6);
        bt.add(14);
        bt.add(4);
        bt.add(7);
        bt.add(13);

        bt.print();
    }
}
