package algo.client;

import algo.Node;
import algo.tree.api.TreeTraversal;
import algo.tree.impl.InOrder;
import algo.tree.impl.PostOrder;
import algo.tree.impl.PreOrder;

public class TestTree {
   public static void main(String[] args) {
      Node<String> tree = new Node<>("a");
      // tree.left= new Node<>("g");
      // tree.right=new Node<>("h");
      // tree.left.right=new Node<>("e");
      // tree.left.right.left=new Node<>("k");
      // tree.left.right.right=new Node<>("l");
      // tree.right.left=new Node<>("b");
      // tree.right.right=new Node<>("i");
      // tree.right.left.left=new Node<>("f");
      // tree.right.right.left=new Node<>("c");
      // tree.right.right.right=new Node<>("d");
      // tree.right.right.left.right=new Node<>("j");
      tree.left = new Node<>("b");
      tree.right = new Node<>("c");
      tree.left.left = new Node<>("d");
      tree.left.right = new Node<>("e");
      tree.right.left = new Node<>("f");
      tree.right.right = new Node<>("g");

      System.out.println("PREORDER:");
      TreeTraversal<String> treeTraversal = new PreOrder<>();
      treeTraversal.traverse(tree);

      System.out.println("\n\nINORDER:");
      treeTraversal = new InOrder<>();
      treeTraversal.traverse(tree);

      System.out.println("\n\nPOSTORDER:");
      treeTraversal = new PostOrder<>();
      treeTraversal.traverse(tree);
   }
}
