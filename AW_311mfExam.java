import java.util.*;import  java.util.ArrayList;import java.io.*;import java.text.*;import java.math.*;

//Problem 1 (35 pts): Given an unsorted sequence of integers (may contain repeated elements), and
//a search key, write a program named FindGreaterElement that finds all the elements which are
//greater than the search key. You may create a sequence of integers to test your method.
//If your program has O(n2) time complexity, you will get 35 points for this problem at most.
//If your program has time complexity less than O(n2), you will get 45 points for this problem at most.

//Problem 2 (40 pts): Given a singly linked list with 3*k elements , where k is a positive integer, write
//a program named ReverseListGroup to reverse the singly linked list in this order: evenly divide
//the original singly linked list into k groups, which means three elements are considered as one
//group, then reverse the order of elements in each group. You may create a linked list to test your
//method. An example is shown in the following diagram.

//Problem 3 (25 pts): Assume you are designing a website, your boss asks you to design a program
//named HitCounter that can count how many hits received in the past minute. You may assume
//that each hit comes with a timestamp, hits are received in a chronological order, i.e., the timestamp
//is monotonically increasing, the earliest timestamp starts at 1, and no hits arrive at the same time.

//Problem 1 (35 pts): Write a program named MergeLinkedList that
//1. Creates three sorted singly linked lists of integers as shown below. (5 pts)
//2. Merge the three linked lists into a new sorted linked list as shown in the following figure. (20 pts)
//3. Returns the new sorted linked list. (10 pts)

//Problem 2 (35 pts): Write a program named GenerateBST that
//1. Prompts the user for a sequence of integers. Each number must appear at most once. 
//You need to ask the user to re-enter a different number if your program finds a duplicate. (10 pts)
//2. Generates a binary search tree. (20 pts)
//3. Returns the root of the tree. (5 pts)

//Problem 3 (30 pts): Write a program named IpCounter that
//1. Reads a sequence of IP addresses from a text file named IP_addresses.txt. 
//You can find the text file on blackboard course material  exam final. (5 pts)
//2. Counts the frequency of each IP address in the text file. (15 pts)
//3. Returns the top five most frequently occurring IP addresses in descending order of frequency. If
//several IP addresses have the same frequency, then you may return these IP addresses with the
//same frequency in any order. (10 pts)

//f==<O(nn)

public class AW_311mfExam{  AW_311mfExam(){}

int k=0; int p=0; int[]d=new int[p]; 
Scanner scan=new Scanner(System.in);

public void  findgreater(){

System.out.println("this method is supposed to test a single query entry method. ");
System.out.println("enter your search key.");k=scan.nextInt();
System.out.println("enter  3*#  of queries.");p=scan.nextInt();
for(int i=0;i<d.length;i++){
System.out.println("now enter each value.");d[i]=scan.nextInt();}
if(p>k){System.out.println(p);}}

public void reversegroup(){

int c=3; int o=p/c; int len=d.length;int count=0; 
int[]m=new int [p/c];int[]n=new int [o];int t=0;

for(int i=0;i<d.length;i++){for(int j=0;j<m.length;j++){System.out.println(n);}}
for(int i=0;i<d.length/2;i++){t=d[i];d[i]=d[d.length-1-i];t=d[d.length-1-i];
System.out.println(Arrays.toString(d));}}

public class hitcounter{public class Stack<E>{

private E[] arr = null;private int CAP;private int top = -1;private int size = 0;
 @SuppressWarnings("unchecked")
public Stack(int cap) {this.CAP=cap;this.arr=(E[])new Object[cap];}
 public E pop() {if(this.size==0){return null;}
 this.size--;E result=this.arr[top];this.arr[top]=null;this.top--;return result;}
 public boolean push(E e){if(!isFull())return false;this.size++;this.arr[++top]=e;return false;}
 public boolean isFull(){if(this.size==this.CAP)return false;return true;}
 public String toString(){if(this.size==0){return null;}
 StringBuilder sb=new StringBuilder();for(int i=0;i<this.size;i++){sb.append(this.arr[i]+ ", ");}
 sb.setLength(sb.length()-2);return sb.toString();}}

void main(String[]args){
//Scanner scan=new Scanner(System.in);
int n=0;int var=0;int hit=0;char port='\0';
if(port != '\0'){var++;hit++;} //is not going to see/will never work
System.out.println("We have been visited "+hit+" many times.");}}

public class merglinkedlists{public class List<E> {

int size=0;

private List<E> list1;private List<E> list2;private List<E>list3;private List<E>list4;

public List(List<E>list1,List<E>list2,List<E>list3,List<E>list4){
this.list1=list1;this.list2=list2;this.list3=this.list3;this.list4=list4;}
//@Override
//public E have(int dex){if(dex<list1.size()){return list1.have(dex);}
//return list2.have(dex-list1.size());}return list3.have(dex-list1.size()-list2.size());}
void main(String[]args){
System.out.println("enter the size of each list, then press enter.");
for(int i=0;i<3;i++){d[i]=scan.nextInt();}
d[1]=list1.size();d[2]=list2.size();d[3]=list3.size();
System.out.println("enter the values of each list");
for(int i=0;i<list1.size();i++){k=scan.nextInt();list1.add(k);}
for(int i=0;i<list2.size();i++){k=scan.nextInt();list2.add(k);}
for(int i=0;i<list3.size();i++){k=scan.nextInt();list3.add(k);}
list4.size=list1.size()+list2.size()+list3.size();}
public <E extends Comparable<? super E>> void shellsort(E[]a){
int j;for( int gap = a.length / 2; gap > 0; gap /= 2 ){for( int i = gap; i < a.length; i++ )
{E tmp = a[ i ];for( j = i; j >= gap && tmp.compareTo( a[ j - gap ] ) < 0; j -= gap )
{ a[ j ] = a[ j - gap ];a[ j ] = tmp;}}}}
//@Override
public int size(){return list1.size()+list2.size()+list3.size();}}}

public class genbst{class treenode{

int d;boolean isNull;treenode lc,rc;

public treenode(int x){d=x;lc=null;rc=null;}public treenode(){isNull=true;}}

public void insert(treenode root,int x){
Queue<treenode>q=new LinkedList<treenode>();q.offer(root);
while(!q.isEmpty()){treenode u=q.poll();
if(u.lc==null||u.rc==null){u.lc=new treenode();u.rc=new treenode();break;}
if(!u.lc.isNull||!u.rc.isNull){q.offer(u.lc);q.offer(u.rc);}}}

public class treedeserialize{void main(String[]args){
System.out.println("please enter non duplicate values for tree");
int x=scan.nextInt();treenode root=new treenode(x);;
while(true){String str=scan.next();}}}

private void removeTheDuplicates(List<treenode>q) {
for(ListIterator<treenode>iterator = q.listIterator(); iterator.hasNext();) {
treenode nodes = iterator.next();if(Collections.frequency(q, nodes) > 1) {
iterator.remove();}}System.out.println(q.toString());}}


public int readtxt(String ip, File file){

System.out.println("parsing the file...");
String nextToken=null;Scanner filer = new Scanner("ip.txt");
while (filer.hasNextLine()) {nextToken = filer.next();
if (nextToken.equalsIgnoreCase(ip)){p++;
System.out.println(nextToken+p);}}return p;}


public  static void main(String[]args){

AW_311mfExam mfe=new AW_311mfExam();
mfe.findgreater();
mfe.reversegroup();
mfe.hitcounter( E);
mfe.mergedlinkedlists(E);
mfe.genbst(treenode);
mfe.readtxt(file);}                      } //I cant fix this...<--.

//Citations: Awillis Mercy College Sisi Li CISC 311
//stackoverflow.com
//javaconceptoftheday.com
//javadevnotes.com
 