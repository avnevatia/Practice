package algo.tree.impl;

import java.util.Stack;

import algo.Node;
import algo.tree.api.TreeTraversal;

/**
 * Inorder Algorithm
 * 
 * 1. Recursively traverse the left subtree.
 * 
 * 2. Visit the root.
 * 
 * 3. Recursively traverse the right subtree.
 * 
 */

public class InOrder<E> implements TreeTraversal<E> {
   @Override
   public void traverse(Node<E> node) {
      Stack<Node<E>> stack = new Stack<>();
      if (node == null)
         return;

      while (!stack.isEmpty() || node != null) {
         if (node != null) {
            stack.push(node);
            node = node.left;
         } else {
            node = stack.pop();
            System.out.print(node.item);
            node = node.right;
         }
      }
   }
}
