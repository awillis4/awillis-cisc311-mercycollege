//1. Add methods addBefore(T e, Node<T> n) and addAfter(T e, Node<T> n)
//2. Add method remove(Node<T> n)
//3. Write a method that can find the loop and correct the error by having the wrongfully linked node point to null
//4. Given a singly linked list, write a method that reverses the order of elements and returns the new linked list
//5. Write a method that solves the Josephus problem by using a circularly linked list.

import java.util.*;
/* Singly Linked List * Nested class: Node * */
public class AW_Master4<T> {
	
private Node<T> head;private Node<T> tail;private Node<T>next;
     
public void addBefore(T element){
         
 Node<T> n = new Node<T>();
n.setValue(element);
System.out.println("Adding: "+element);
        
//check if the list is empty
         
if(head == null){ head = n;tail = n;}
else { tail.setNextRef(n);tail = n;}}

public void addAfter(T element, T after){
         
Node<T> temp = head;Node<T> refNode = null;
System.out.println("Traversing nodes..");
        
// Traverse till given element
         
while(true){if(temp == null){break;}
if(temp.compareTo(after) == 0){refNode = temp;break;}
temp = temp.getNextRef();}
       
if(refNode != null){Node<T> n = new Node<T>();
n.setValue(element);n.setNextRef(temp.getNextRef());
if(temp == tail){tail = n;}temp.setNextRef(n);}
else {System.out.println("Could not find e");}}

public void deleteFront(){
         
if(head == null){System.out.println("Stack Underflow");}
Node<T> temp = head;head = temp.getNextRef();
if(head == null){tail = null;}
System.out.println("Deleted: "+temp.getValue());}
    
     
public void deleteAfter(T after){
         
Node<T> temp = head;Node<T> refNode = null;
System.out.println("Traversing to all nodes..");
while(true){if(temp == null){break;}
if(temp.compareTo(after) == 0){refNode = temp;break;}temp = temp.getNextRef();}
if(refNode != null){temp = refNode.getNextRef();refNode.setNextRef(temp.getNextRef());
if(refNode.getNextRef() == null){tail = refNode;}
System.out.println("Deleted: "+temp.getValue());}
else {System.out.println("Unable to find the given element...");}}

public void traverse(){  Node<T> temp = head;

while(true){if(temp == null){break;}
System.out.println(temp.getValue());temp = temp.getNextRef();}}

boolean fixLoop(Node first) { Node slow, fast, next;

if(first == null) { return false;}slow = fast = first;while(true){slow = slow.nextRef;       
if(fast.nextRef != null){fast = fast.nextRef.nextRef;}else{return false;}
if(slow == null || fast == null){return false;}

if(slow == fast){if(head == null) {
head = new Node ();tail = head;} 
else {tail.nextRef = new Node();
tail = tail.nextRef;}}}}

public void reverse(Node T){

List reverse = new ArrayList();
for (int i = Node.n - 1; i >= 0; i--) {
reverse.add(Node.n(i));}}
  
class josephus { 
  
int josephus(int n, int k) { 
if (n == 1) return 1; else
return (josephus(n - 1, k) + k-1) % n + 1; } 
  
public  void main(String[] args) { 
Scanner scan= new Scanner(System.in);
 System.out.println("Enter the number of entities involved");
int n=scan.nextInt();
 System.out.println("Enter the number for the rotary counter");
int k=scan.nextInt();
System.out.println("The auto sequence is" + josephus(n, k)); }}
  
// This code is contributed by Prerna Saini 

class Node<T> implements Comparable<T> {
private T value;private Node<T> nextRef;
public T getValue() {return value;}
public void setValue(T value) {this.value = value;}
public Node<T> getNextRef() {return nextRef;}
public void setNextRef(Node<T> ref) {this.nextRef = ref;}
@Override 
public int compareTo(T arg) {if(arg == this.value){return 0;}else {return 1;}}}}

//Citations:
//Written by Armani Willis
//cisc 311 Mercy College Sisi Li 2018
//http://www.java2novice.com/data-structures-in-java/linked-list/singly-linked-list/
//https://stackoverflow.com/questions/2663115/how-to-detect-a-loop-in-a-linked-list
//https://stackoverflow.com/questions/15367810/how-to-link-a-node-with-a-next-node-in-java
//https://stackoverflow.com/questions/3962766/how-to-get-a-reversed-list-view-on-a-list-in-java
//https://www.geeksforgeeks.org/josephus-problem-set-1-a-on-solution/