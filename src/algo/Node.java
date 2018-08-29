package algo;

public class Node<E> {
   public E item;
   public Node<E> left;
   public Node<E> right;

   public Node(E item) {
      this.item = item;
      left = right = null;
   }
}
