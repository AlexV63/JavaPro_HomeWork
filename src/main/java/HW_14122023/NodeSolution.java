package HW_14122023;

import lombok.ToString;

@ToString

public class NodeSolution {

    public Integer value;
    public Node left;
    public Node right;

    private static boolean isNodeExist(Node node) {
        return node != null && node.value != null;
    }

    //root
    private static void createNode(Node node, int value) {
        node.left = new Node();
        node.right = new Node();
        node.value = value;
    }

    private static void insert(Node node, int value) {
        if (!isNodeExist(node)) {
            createNode(node, value);
        } else if (value < node.value) {
            insert(node.left, value);
        } else {
            insert(node.right, value);
        }
    }

    //todo
    private static Node search(Node node, int value) {
        if (!isNodeExist(node)) {
            return null;
        } else if (node.value == value) {
            return node;
        }
        return node;
    }

    private static Node getMin(Node node) {
        if (!isNodeExist(node)) {
            return null;
        }
        if ((!isNodeExist(node.left))) {
            return node;
        }
        return getMin(node.left);
    }

    //todo
    private static Node getMax(Node node) {
        if (!isNodeExist(node)) {
            return null;
        }
        if ((!isNodeExist(node.right))) {
            return node;
        }
        return getMax(node.right);
    }


    //симметричный обход
    private static void inOrderTraversal(Node node) {
        if (!isNodeExist(node)) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println("[ " + node + " ]");
        inOrderTraversal(node.right);
    }

    //todo
    //обратный обход
    private static void postOrderTraversal(Node node) {
        if (!isNodeExist(node)) {
            return;
        }
        inOrderTraversal(node.left);
        inOrderTraversal(node.right);
        System.out.println("[ " + node + " ]");
    }

    //todo
    //прямой обход
    private static void directOrderTraversal(Node node) {
        if (!isNodeExist(node)) {
            return;
        }
        System.out.println("[ " + node + " ]");
        inOrderTraversal(node.left);
        inOrderTraversal(node.right);
    }

    //todo
    private static void moveNode(Node toNode, Node fromNode) {
        if (!isNodeExist(toNode) && !isNodeExist(fromNode)) return;
        if (isNodeExist(toNode)) {
            toNode.value = (isNodeExist(fromNode)) ? fromNode.value : null;
        }
    }

    //todo
    private static int getChildrenCount(Node node) {
        int count = 0;
        if (node.left.value != null) count++;
        if (node.right.value != null) count++;
        return count;
    }

    //todo
    private static Node getChildOrNull(Node node) {
        if (isNodeExist(node.left)) {
            return node.left;
        } else if (isNodeExist(node.right)) {
            return node.right;
        } else
            return null;
    }

    private static void removeNodeWithOneOrZeroChild(Node nodeToDelete) {
        Node childOrNull = getChildOrNull(nodeToDelete);
        moveNode(nodeToDelete, childOrNull);
    }

    //todo
    private static boolean remove(Node node, int value) {
        boolean isRemove;
        if (isNodeExist(node)) {
            if (getChildrenCount(node) < 2) {
                removeNodeWithOneOrZeroChild(node);
            } else {
                moveNode(node, getMin(node.right));
                removeNodeWithOneOrZeroChild(getMin(node.right));
            }
            isRemove = true;
        } else isRemove = false;
        return isRemove;
    }


    public static void main(String[] args) {
        Integer[] digit = {9, 2, 5, 13, 6, 10, 14, 7, 33, 44, 3};
        Node node = new Node();
        createNode(node, 9);
        for (int i = 1; i < digit.length; i++) {
            insert(node, digit[i]);
        }
        inOrderTraversal(node);
        System.out.println("remove");
        remove(node, 10);
        System.out.println(node);
        inOrderTraversal(node);
        System.out.println("Search");
        System.out.println(search(node, 6));
        System.out.println("Max");
        System.out.println(getMax(node));
        System.out.println("ChildrenCount");
        System.out.println(getChildrenCount(node));
        System.out.println("ChildOrNull");
        System.out.println(getChildOrNull(node));
        System.out.println("isRemove");
        System.out.println(remove(node, 2));

    }
}

