import java.util.ArrayList;
import java.util.Scanner;

public class genericTrees {

  private class Node{
      int data;
      ArrayList<Node> children;
      Node (int data){
          this.data = data;
          this.children = new ArrayList<>();
      }
  }
  private Node root;
  private int size;

  GenericTree(){

      Scanner s = new Scanner(System.in);
      this.root = takeInput(s , null , 0 );
  }
  //Take the input from generic tree
  private Node takeInput(Scanner s ,Node parent , int ithchild ){

      if (this.root == null){
          System.out.print("Enter data for the root node: ");
      }
      else{

      }
      int nodedata = s.nextInt();
      Node node = new Node(nodedata);
      this.size++;

      System.out.print("Enter the  number of children for" + node.data  );
      int children = s.nextInt();

      for (int i = 0; i < children; i++){

      }

  }

}
