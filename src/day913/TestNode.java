package day913;

import javax.swing.tree.TreeNode;

/**
 * @author taoxuefeng
 * @create 2018-10-04 4:27 PM
 * @desc
 **/

public class TestNode {
    int val;
    TreeNode left;
    TreeNode right;
    TestNode(int x) {
        val = x;
    }
    @Override
    public String toString() {
        return "val:" + val;
    }

    public void visit(TestNode node) {
        System.out.println(node.val + " ");
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
