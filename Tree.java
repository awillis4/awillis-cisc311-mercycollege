/*Design an algorithm to serialize and deserialize a binary tree. You just need to ensure that a
binary tree can be serialized to a string and this string can be deserialized to the original tree
structure.

1. In LinkedBinaryTree.java, add two methods inOrderSerialize() and
preOrderSerialize() to serialize the binary tree and return the serialized string by
using the inorder traversal and the preoreder traversal, respectively. (50 pts)
For example, the binary tree to be serialized is:

a. The inOrderSerialize() method should use the inorder traversal and return the
string “null, 4, null, 8, null, 10, null, 12, null, 14, null, 20, null, 22, null”

b. The preOrderSerialize() method should use the preorder traversal and return
the string “20, 8, 4, null, null, 12, 10, null, null, 14, null, null, 22, null, null”

2. In LinkedBinaryTree.java, add a method save(string) to write the string into a csv file
and name it your Lastname_Firstname.csv. (5 pts)

3. In LinkedBinaryTree.java, add a method retrieve() to read the string from your csv file
and return the string. (5 pts)

4. In LinkedBinaryTree.java, add a method preOrderDeserialize(preOrderString)
that accepts a serialized string, deserializes the given string to the original binary tree,
and returns the tree. (40 pts)*/

import java.util.*;import java.io.*;import javax.naming.*;

public class Tree{public static class TreeNode{

		int data;TreeNode left;TreeNode right;
		TreeNode(int data){this.data=data;}}
 
// Recursive Solution InOrder
	public void inOrder(TreeNode root) {
		if(root !=  null) {inOrder(root.left);
			//Visit the node by Printing the node data  
			System.out.printf("%d ",root.data);inOrder(root.right);}}
	
   // Recursive Solution
	public void preorder(TreeNode root) {
		if(root !=  null) {//Visit the node-Printing the node data  
			System.out.printf("%d ",root.data);preorder(root.left);preorder(root.right);}}

 public static void main(String[] args){
 
		Tree b1=new Tree();
		// Creating a binary tree
		TreeNode rootNode1=createBinaryTree();
		System.out.println("Using Recursive solution:");
      b1.inOrder(rootNode1);
      
      Tree b2=new Tree();
		// Creating a binary tree
		TreeNode rootNode2=createBinaryTree();
		System.out.println("Using Recursive solution:");
      b2.preorder(rootNode2);}
 
	public static TreeNode createBinaryTree(){
 
		TreeNode rootNode =new TreeNode(20);
		TreeNode       node8=new TreeNode(8);
		TreeNode       node22=new TreeNode(22);
		TreeNode       node4=new TreeNode(4);
		TreeNode       node12=new TreeNode(12);
		TreeNode       node10=new TreeNode(10);
		TreeNode       node14=new TreeNode(14);
           
           
	   rootNode.left=node8;rootNode.right=node22;
           node8.left=node4;node8.right=node12;
           node12.left=node10;node12.right=node14;
           return rootNode;}
      
      public static class csvfile{
          public static void main(String[]args)throws IOException,ClassNotFoundException{
      
      csvfile user=new csvfile();   
      PrintWriter pw= new PrintWriter(new File("Will__Ard.csv"));
      String filepath="C:\\Users\\User1\\Documents\\work.will\\cisc 257\\311a\\as6\\Will_Ard.csv";
      
      OutputStream put=new FileOutputStream(filepath);
      ObjectOutput out=new ObjectOutputStream(put);
      out.writeObject(user);out.flush();out.close();
      
      ObjectInputStream in=new ObjectInputStream(new FileInputStream(filepath));
      Integer temp;try{
          while((temp=(Integer)in.readObject())!=null){System.out.println(temp);}}
      catch(EOFException e){}finally{in.close();}
      
      
      StringBuilder sub=new StringBuilder();
      sub.append("20");sub.append('\n');
      sub.append("8");sub.append("22");sub.append('\n');
      sub.append("4");sub.append("12");sub.append('\n');
      sub.append("10");sub.append("14");sub.append('\n');
      pw.write(sub.toString());pw.close();}}
          
          public void read(){
              
              String filepath="C:\\Users\\User1\\Documents\\work.will\\cisc 257\\311a\\as6\\Will_Ard.csv";
              BufferedReader buff=null;String line="";String abc="";
              try{ buff=new BufferedReader(new FileReader(filepath));
              while(buff.ready()){line=buff.readLine();System.out.println(line);
              abc=line+"--";}}catch(Exception e){e.printStackTrace();}}}


/* Citations:
Code by Armani Williis/Mercy College
https://stackoverflow.com/questions/7826834/de-serializing-objects-from-a-file-in-java
https://www.codingeek.com/java/io/object-streams-serialization-deserialization-java-example-serializable-interface/
https://howtoprogramwithjava.com/java-serialization/
https://stackoverflow.com/questions/24902673/how-to-read-a-csv-file-and-display-its-contents-in-java-translucent-swing-window
https://stackoverflow.com/questions/30073980/java-writing-strings-to-a-csv-file
https://www.mkyong.com/java/how-to-export-data-to-csv-file-java/
https://java2blog.com/how-to-print-leaf-nodes-of-binary-tree-java/
https://kennyzhuang.gitbooks.io/algorithms-collection/content/minimum_height_trees.html
https://java2blog.com/binary-tree-inorder-traversal-in-java/
https://java2blog.com/binary-tree-preorder-traversal-in-java/
*/
              