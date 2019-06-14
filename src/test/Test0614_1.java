package test;

/**
 * @ program: java_study
 * @ author:  TaoXueFeng
 * @ create: 2019-06-14 01:58
 * @ desc: 链表：一种常见的基础数据结构，是一种线性表，但并不会按照线性的顺序存储
 *          而是在每一个节点里存到下一个节点的指针（pointer）
 **/

public class Test0614_1 {
    public static void main(String[] args) {

    }
}

class NodeManager{
    private Node root;//根节点


    private class Node{
        private int data;
        private Node next;//把当前类型作为属性
        public Node(int data){
            this.data = data;
        }
        public void setData(int data){
            this.data = data;
        }
        public int getData(){
            return data;
        }
        //添加节点
        public void addNode(int data){

        }
        //删除节点
        public void delNode(int data){

        }
        //输出所有节点
        public void printNode(){

        }
        public boolean findNode(int data){
            return false;
        }
        //更新节点
        public void updateNode(int oldData, int newData){

        }
        //插入数据
        public void insert(int index, int data){

        }
    }
}
