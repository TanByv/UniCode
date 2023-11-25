import java.util.Arrays;

public class TestBST1 {
   public static void main(String[] args) {

      BST<String> bst = new BST<>();
      String[] names = { "George", "Mike", "Tom", "Adam", "Joe", "Peter", "Dany" };
      for (String s : names)
         bst.insert(s);

      System.out.println("bst after inserting " + Arrays.toString(names));
      printTree(bst, true);

      System.out.println("\n\nIs Peter in bst?: " + bst.search("Peter"));
      System.out.println("Is Max in bst?: " + bst.search("Max"));
      System.out.println("Is Dany in bst?: " + bst.search("Dany"));

      System.out.print("\nbst sorted alphabetically: ");
      for (String s : bst)
         System.out.print(s + " ");

      bst.delete("George");
      System.out.println("\n\nbst after deleting George");
      printTree(bst, false);
      bst.delete("Adam");
      System.out.println("\nbst after deleting Adam");
      printTree(bst, false);
      bst.delete("Mike");
      System.out.println("\nbst after deleting Mike");
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