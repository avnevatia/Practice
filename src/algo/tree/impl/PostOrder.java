package algo.tree.impl;

import java.util.Stack;

import algo.Node;
import algo.tree.api.TreeTraversal;

/**
 * Postorder Algorithm
 * 
 * 1. Recursively traverse the left subtree.
 * 
 * 2. Recursively traverse the right subtree.
 * 
 * 3. Visit the root.
 * 
 */

public class PostOrder<E> implements TreeTraversal<E> {

   @Override
   public void traverse(Node<E> node) {
      Stack<Node<E>> stack = new Stack<>();

      // Check for empty tree
      if (node == null)
         return;
      stack.push(node);
      Node<E> prev = null;
      while (!stack.isEmpty()) {
         Node<E> current = stack.peek();

         /*
          * go down the tree in search of a leaf an if so process it and pop
          * stack otherwise move down
          */
         if (prev == null || prev.left == current || prev.right == current) {
            if (current.left != null)
               stack.push(current.left);
            else if (current.right != null)
               stack.push(current.right);
            else {
               stack.pop();
               System.out.print(current.item);
            }

            /*
             * go up the tree from left node, if the child is right push it
             * onto stack otherwise process parent and pop stack
             */
         } else if (current.left == prev) {
            if (current.right != null)
               stack.push(current.right);
            else {
               stack.pop();
               System.out.print(current.item);
            }

            /*
             * go up the tree from right node and after coming back from
             * right node process parent and pop stack
             */
         } else if (current.right == prev) {
            stack.pop();
            System.out.print(current.item);
         }

         prev = current;
      }
   }

}
