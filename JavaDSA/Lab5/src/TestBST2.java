import java.util.Arrays;
import java.util.Iterator;

public class TestBST2 {
   public static void main(String[] args) {

      Integer[] numbers = { 12, 14, 13, 11, 18, 15, 16, 17 };
      BST<Integer> bst = new BST<>(numbers);

      System.out.println("bst after inserting " + Arrays.toString(numbers));
      printTree(bst, true);

      System.out.println("\n\nIs 10 in bst?: " + bst.search(10));
      System.out.println("Is 7 in bst?: " + bst.search(7));
      System.out.println("Is 12 in bst?: " + bst.search(12));

      System.out.print("\nbst sorted: ");
      Iterator<Integer> bstInorderIterator = bst.iterator();
      Integer currentElement, deletedElement = null;
      int count = 0;

      while (bstInorderIterator.hasNext()) {

         currentElement = bstInorderIterator.next();
         System.out.print(currentElement + " ");
         count++; 

         if (count == 5) {
            deletedElement = currentElement;
            bstInorderIterator.remove();
         }
      }

      System.out.println("\n\nbst after deleting " + deletedElement);
      printTree(bst, false);
   }

   @SuppressWarnings("rawtypes")
   private static void printTree(BST tree, boolean showTraversals) {

      System.out.print(tree); 

      System.out.println("The number of the elements is " + tree.getSize() + ".");

      if (showTraversals) {
         System.out.print("Inorder (sorted): ");
         tree.inorder();
         System.out.print("\nPostorder: ");
         tree.postorder();
         System.out.print("\nPreorder: ");
         tree.preorder();
      }
   }
}