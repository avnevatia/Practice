package algo.tree.impl;

import java.util.Stack;

import algo.Node;
import algo.tree.api.TreeTraversal;

public class LevelOrder<E> implements TreeTraversal<E> {

   @Override
   public void traverse(Node<E> node) {
      Stack<Node<E>> stack = new Stack<>();
      if (node == null)
         return;

   }

}
