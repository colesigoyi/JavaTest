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
        NodeManager nm = new NodeManager();
        System.out.println("------------添加-------------");
        nm.add(5);
        nm.add(4);
        nm.add(3);
        nm.add(2);
        nm.add(1);
        nm.print();
        System.out.println("------------删除-------------");
        nm.del(3);
        nm.print();
        System.out.println("------------查找-------------");
        System.out.println(nm.find(1));
        System.out.println("------------删除-------------");
        nm.update(1,10);
        nm.print();
        System.out.println("------------插入-------------");
        nm.insert(1,20);
        nm.print();
    }
}

class NodeManager{
    private Node root;//根节点
    private int currentIndex = 0;//节点序号，每次操作从0开始

    public void add(int data){
        if(root == null){
            root = new Node(data);
        }else {
            root.addNode(data);
        }
    }
    public void del(int data){
        if(root==null)return;
        if(root.getData() == data){
            root = root.next;
        }else {
            root.delNode(data);
        }
    }
    public void print(){
        if(root!=null){
            System.out.print(root.getData() + "->");
            root.printNode();
            System.out.println();
        }
    }
    public boolean find(int data){
        if(root==null){
            return false;
        }
        if(root.getData()==data){
            return true;
        }else {
            return root.findNode(data);
        }
    }
    public boolean update(int oldData, int newData){
        if(root == null){
            return false;
        }
        if(root.getData()==oldData){
            root.setData(newData);
            return true;
        }else {
            return root.updateNode(oldData, newData);
        }
    }
    //向索引之前插入
    public void insert(int index, int data){
        if(index < 0)return;
        currentIndex = 0;
        if(index == currentIndex){
            Node newNode = new Node(data);
            newNode.next = root;
            root = newNode;
        }else {
            root.insertNode(index, data);
        }

    }


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
            if(this.next == null){
                this.next = new Node(data);
            }else {
                this.next.addNode(data);
            }
        }
        //删除节点
        public void delNode(int data){
            if(this.next!=null){
                if(this.next.data == data){
                    this.next = this.next.next;
                }else {
                    this.next.delNode(data);
                }
            }
        }
        //输出所有节点
        public void printNode(){
            if(this.next!=null){
                System.out.print(this.next.data + "->");
                this.next.printNode();
            }
        }
        public boolean findNode(int data){
            if(this.next != null){
                if(this.next.data == data){
                    return true;
                }else {
                    return this.next.findNode(data);
                }
            }
            return false;
        }
        //更新节点
        public boolean updateNode(int oldData, int newData){
            if(this.next != null){
                if(this.next.data == oldData){
                    this.next.data = newData;
                    return true;
                }else {
                    return this.next.updateNode(oldData, newData);
                }
            }
            return false;
        }
        //插入数据
        public void insertNode(int index, int data){
            currentIndex++;
            if(index == currentIndex){
                Node newNode = new Node(data);
                newNode.next = this.next;
                this.next = newNode;
            }else {
                this.next.insertNode(index, data);
            }
        }
    }
}
