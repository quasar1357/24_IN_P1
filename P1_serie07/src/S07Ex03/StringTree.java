package S07Ex03;

import java.io.File;
import java.util.Scanner;

/*
 * Serie 7; Aufgabe 3 (Methoden add und minimum)
 */
class StringTree {
	
    private TreeNode root;

    public StringTree() {
        root = null;
    }

    public void printInOrder() {
        printInOrderRecursive(root);
    }

    private void printInOrderRecursive(TreeNode node) {
        if (node != null) {
            printInOrderRecursive(node.left);
            // System.out.print("  ");
            System.out.println(node.value);
            // System.out.print("    ");
            printInOrderRecursive(node.right);
        }
    }

    public void add(String value){
        if (this.root == null)
            this.root = new TreeNode(value);
        else{
            TreeNode current = this.root;
            boolean found = false;
            while(!found) {
                if(value.compareTo(current.value) < 0) {
                    if (current.left == null) {
                        current.left = new TreeNode(value);
                        found = true;
                    }
                    else{
                        current = current.left;
                    }
                }
                else if (value.compareTo(current.value) > 0) {
                    if (current.right == null) {
                        current.right = new TreeNode(value);
                        found = true;
                    } else{
                        current = current.right;
                    }
                }
                else {
                    System.out.println("The tree already contains the value " + value + ". Nothing done.");
                    found = true;
                }
            }
        }
    }

    public TreeNode minimum() {
        if(this.root == null)
            return null;
        TreeNode current = this.root;
        while(current.left != null)
            current = current.left;
        return current;
    }

    public void readString(String textIn){
        Scanner strScanner = new Scanner(textIn);
        while(strScanner.hasNext()){
            this.add(strScanner.next());
        }
    }

    public static String readFile(String filename){
        try{
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);
            String fileContent = "";
            while(fileScanner.hasNext()){
                fileContent += fileScanner.nextLine() + "\n";
            }
            return fileContent;
        } catch(Exception e){
            System.out.println("Error reading file: " + e);
            return null;
        }
    }
}
