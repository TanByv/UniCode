import java.util.Comparator;
import java.util.Iterator;
import java.util.ArrayList;


public class BST<E> implements Iterable<E> {

   private class TreeNode {

      E element;
      TreeNode left;
      TreeNode right;

      TreeNode(E e) {
         element = e;
      }
   }

   private TreeNode root;
   private int size = 0;
   private Comparator<E> c;

   public BST() {
      c = new DefaultComparator<E>();
   }

   public BST(E[] objects) {

      this();

      for (int i = 0; i < objects.length; i++)
         insert(objects[i]);
   }

   public int getSize() {
      return size;
   }

   public boolean isEmpty() {
      return size == 0;
   }

   public boolean search(E e) {
      TreeNode current = root;

      while (current != null) {
         if (c.compare(e, current.element)<0) {
            current = current.left;
         } else if (c.compare(e, current.element) > 0) {
            current = current.right;
         } else {
            return true; // element found
         }
      }

      return false;
   }

   public boolean insert(E e) {

      if (root == null)

         root = new TreeNode(e);

      else {

         TreeNode parent = null;

         TreeNode current = root;

         while (current != null) {

            if (c.compare(e, current.element)<0) {

               parent = current;
               current = current.left;
            } else if (c.compare(e, current.element) > 0) {

               parent = current;
               current = current.right;
            } else

               return false;
         }

         if (c.compare(e, parent.element)<0)

            parent.left = new TreeNode(e);
         else

            parent.right = new TreeNode(e);
      }

      size++;

      return true;
   }

   public boolean delete(E e) {

      TreeNode parent = null;
      TreeNode current = root;

      while (current != null) {

         if (c.compare(e, current.element)<0) {

            parent = current;
            current = current.left;
         } else if (c.compare(e, current.element) > 0) {

            parent = current;
            current = current.right;
         } else

            break;
      }

      if (current == null)
         return false;

      if (current.left == null) {

         if (parent == null)

            root = current.right;

         else {

            if (c.compare(e, parent.element)<0)
               parent.left = current.right;

            else
               parent.right = current.right;
         }
      } else {

         TreeNode parentOfRightMost = current;
         TreeNode rightMost = current.left;

         while (rightMost.right != null) {
            parentOfRightMost = rightMost;
            rightMost = rightMost.right;
         }

         current.element = rightMost.element;

         if (parentOfRightMost.right == rightMost)
            parentOfRightMost.right = rightMost.left;
         else

            parentOfRightMost.left = rightMost.left;
      }

      size--;

      return true;
   }

   public void clear() {
      root = null;
      size = 0;
   }

   public void preorder() {

      preorder(root);
   }

   private void preorder(TreeNode n) {
      if (n != null) {
         System.out.print(n.element + " ");
         preorder(n.left);
         preorder(n.right);
      }
   }

   public void inorder() {

      inorder(root);
   }

   private void inorder(TreeNode n) {
      if (n != null) {
         inorder(n.left);
         System.out.print(n.element + " ");
         inorder(n.right);
      }
   }

   public void postorder() {

      postorder(root);
   }

   private void postorder(TreeNode n) {
      if (n != null) {
         postorder(n.left);
         postorder(n.right);
         System.out.print(n.element + " ");
      }
   }

   @Override

   public String toString() {

      return toString(root, "");
   }

   private String toString(TreeNode n, String indent) {

      String result = n.element + "\n";

      if (indent.equals("")) {
         result = "Root: " + result;
         indent = "  ";
      }

      if (n.left == null && n.right == null)

         return result;

      else if (n.right == null)

         result += indent + "└─ L: " + toString(n.left, indent + "   ");

      else if (n.left == null)

         result += indent + "└─ R: " + toString(n.right, indent + "   ");

      else {

         result += indent + "├─ L: " + toString(n.left, indent + "|  ");

         result += indent + "└─ R: " + toString(n.right, indent + "   ");
      }

      return result;
   }

   @Override

   public Iterator<E> iterator() {

      return new InorderIterator();
   }

   private class InorderIterator implements Iterator<E> {

      ArrayList<E> list = new ArrayList<>();

      int current = 0;

      InorderIterator() {

         inorder(root);
      }

      void inorder(TreeNode n) {

         if (n == null)
            return;

         inorder(n.left);

         list.add(n.element);

         inorder(n.right);
      }

      @Override

      public boolean hasNext() {
         if (current < list.size())
            return true;
         return false;
      }

      @Override

      public E next() {
         return list.get(current++);
      }

      @Override

      public void remove() {

         if (current == 0)

            throw new IllegalStateException();

         delete(list.get(--current));

         list.clear();
         inorder(root);
      }
   }
}