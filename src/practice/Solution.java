package practice;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root;
        while (curr != null || !stack.empty())
        {
            if (curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else
            {
                curr = stack.pop();
                values.add(curr.val);
                curr = curr.right;
            }
        }

        return values;
    }
}
