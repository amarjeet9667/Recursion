import java.util.*;

public class BinaryTreeYT {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildNodes(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildNodes(nodes);
            newNode.right = buildNodes(nodes);

            return newNode;
        }
    }

    // ...........PreOreder Traversal(1st Print root , 2nd Print all left nodes ,
    // 3rd print all right nodes).......
    public static void preOrder(Node root) { // Time complexity O(n)

        if (root == null) {
            return;
        }

        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // ............InOrder Traversal(1st print all left node, 2nd in middle print
    // rootnode, 3rd then print right nodes)........
    public static void inOrder(Node root) { // Time complexity O(n)
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    // .......... PostOrder Traversal(1st print all left nodes, 2nd Print all right
    // nodes , 3rd Then print Root node at the last).........
    public static void postOrder(Node root) { // Time complexity O(n)
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // ...........Level Order.........
    public static void leveOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();

            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // .......count of nodes..........
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return leftCount + rightCount + 1;
    }

    // ..........Total sum of root data........
    public static int sumOfData(Node root) {
        if (root == null) {
            return 0;
        }

        int sumOfLeft = sumOfData(root.left);
        int sumOfRight = sumOfData(root.right);
        return sumOfLeft + sumOfRight + root.data;
    }

    // .............Height of Tree...........
    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);
        int myTreeHeight = Math.max(left, right) + 1;
        return myTreeHeight;
    }

    // .............. Diameter of Tree ..............
    public static int diameterOfTree(Node root) { // Time complexity O(n2)
        if (root == null) {
            return 0;
        }

        int diam1 = diameterOfTree(root.left);
        int diam2 = diameterOfTree(root.right);
        int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    // ............Daimeter with complexity O(n)...........
    public static class DiaMeterTreeInfo {
        int ht;
        int di;

        DiaMeterTreeInfo(int height, int diaMeter) {
            this.ht = height;
            this.di = diaMeter;
        }
    }

    public static DiaMeterTreeInfo DiameterOfTree2(Node root) {
        if (root == null) {
            return new DiaMeterTreeInfo(0, 0);
        }

        DiaMeterTreeInfo left = DiameterOfTree2(root.left);
        DiaMeterTreeInfo right = DiameterOfTree2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.di;
        int diam2 = right.di;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        DiaMeterTreeInfo myInfo = new DiaMeterTreeInfo(myHeight, myDiam);

        return myInfo;
    }

    public static void main(String[] arg) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildNodes(nodes);
        // System.out.println(root.data);
        // preOrder(root);
        // inOrder(root);
        // postOrder(root);
        // leveOrder(root);
        // int totalNumbersOfNode = countNodes(root);
        // int sumOfNode = sumOfData(root);
        // int height = heightOfTree(root);
        DiaMeterTreeInfo info = DiameterOfTree2(root);
        System.out.println("Diameter2 of the tree: " + info.di);
    }
}
