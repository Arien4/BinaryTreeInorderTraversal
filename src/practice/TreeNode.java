package practice;

public class TreeNode {
    Integer val;
    TreeNode left;
    TreeNode right;


    TreeNode() {

    }

    TreeNode(Integer val) {
        this.val = val;
    }

    TreeNode(Integer val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode arrayToTreeNode(Integer[] array) {
        return createTreeNode(array, 1);
    }

    private static TreeNode createTreeNode(Integer[] array, int index) {
        if (index <= array.length) {
            Integer value = array[index - 1];
            TreeNode node = new TreeNode(value);
            node.left = createTreeNode(array, index * 2);
            node.right = createTreeNode(array, index * 2 + 1);
            return node;
        }
        return null;
    }

}
