package dataStructure.abstractDataType;

public interface List<E> extends Iterable<E> {
   public boolean add(E elem);

   public boolean add(int index, E elem);

   public E get(int index);

   // Replaces existing element
   public void set(int index, E elem);

   public boolean contains(Object o);

   public boolean equals(Object o);

   public int hashCode();

   public int indexOf(Object o);

   public int size();

   public E remove(int index);

   public boolean remove(Object o);
}
