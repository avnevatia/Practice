package algo.tree.impl;

import java.util.Stack;

import algo.Node;
import algo.tree.api.TreeTraversal;

/**
 * Preorder Algorithm
 * 
 * 1. Visit the root.
 * 
 * 2. Recursively traverse the left subtree.
 * 
 * 3. Recursively traverse the right subtree.
 * 
 */

public class PreOrder<E> implements TreeTraversal<E> {

   @Override
   public void traverse(Node<E> node) {
      Stack<Node<E>> stack = new Stack<>();
      if (node == null)
         return;

      stack.push(node);

      while (!stack.isEmpty()) {
         node = stack.pop();
         System.out.print(node.item);

         if (node.right != null) {
            stack.push(node.right);
         }
         if (node.left != null) {
            stack.push(node.left);
         }
      }
   }

}
