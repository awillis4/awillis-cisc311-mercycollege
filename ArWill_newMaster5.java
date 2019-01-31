import java.util.*;import java.io.*;

public class ArWill_newMaster5{

ArWill_newMaster5(){}

/*public class hitcounter extends HttpServlet{

String executePost(String targetURL, String urlParameters){

HttpURLConnection port=null;}

protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException{

   URL[]url = new URL[targetURLs];
   String targetURLs=new String();
    connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("POST");
    connection.setRequestProperty("Content-Type", 
        "application/x-www-form-urlencoded");

    connection.setRequestProperty("Content-Length", 
        Integer.toString(urlParameters.getBytes().length));
    connection.setRequestProperty("Content-Language", "en-US");  

    connection.setUseCaches(false);
    connection.setDoOutput(true);
    
    InputStream is=port.getInputStream();}
    
    Had to edit this out because java would not recognise the servlet package.*/
    
    public void hitcounter(){
 
   class Stack<E>{
   
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

//Scanner scan=new Scanner(System.in);
       
       int n=0;int var=0;int hit=0;char port='\0';
    
       if(port != '\0'){var++;hit++;} //is not going to see/will never work
      
System.out.println("We have been visited "+hit+" many times.");}
      
      //https://stackoverflow.com/questions/1359689/how-to-send-http-request-in-java
      //https://www.tutorialspoint.com/servlets/servlets-hits-counter.htm
      //https://www.programcreek.com/2015/03/implement-a-stack-using-an-array/
      //https://stackoverflow.com/questions/32179623/how-to-count-website-hitcounter-on-per-day-basis-in-java-servlet
      //

public void openstack(){

class Stack<E>{
   
	private E[] arr = null;private int CAP;private int top = -1;private int size = 0;
 
	@SuppressWarnings("unchecked")
	public Stack(int cap) {this.CAP = cap;this.arr = (E[]) new Object[cap];}
 
	public E pop() {if(this.size == 0){return null;}
 
	this.size--;E result = this.arr[top];this.arr[top] = null;this.top--;return result;}
 
	public boolean push(E e){if (!isFull())return false;this.size++;this.arr[++top]=e;return false;}
   
   public boolean isFull(){if(this.size==this.CAP)return false;return true;}
   
   public boolean isEmpty(){if(this.size==0)return false;return true;}
       
        @Override
	public String toString(){if(this.size==0){return null;}return null;}
   
   public boolean addFirst(){if(this.CAP>=0){(this.CAP)++;}return true;}
   
   public boolean addLast(){if(this.CAP<=10){(this.CAP)++;}return true;}
   
   public boolean removeFirst(){if(this.CAP>=0){(this.CAP)--;}return true;}
   
   public boolean removeLast(){if(this.CAP<=10){(this.CAP)--;}return true;}
 
    StringBuilder sb=new StringBuilder();
    

   
            Scanner scan = new Scanner(System.in);
   
            Deque deque = new ArrayDeque<>();
   
            int n = scan.nextInt(); int m = scan.nextInt();}}



public void PostfixCalc()throws Exception{

File file = new File("in.txt"); //make a list of x and y values
Scanner scan = new Scanner(file);String input = scan.next();
Stack<Integer> calc = new Stack<Integer>();

while(scan.hasNext()){
for(int i = 0; i < input.length(); i++){
char c = input.charAt(i);int x = 0;int y = 0;int r = 0;

if(Character.isDigit(c)){int t = Character.getNumericValue(c);calc.push(t);}

else if(c == '+'){x = calc.pop();y = calc.pop();r = x+y; calc.push(r);}

else if(c == '-'){x = calc.pop();y = calc.pop();r = x-y;calc.push(r);}

else if(c == '*'){x = calc.pop();y = calc.pop();r = x*y;calc.push(r);}

else if(c == '/'){x = calc.pop();y = calc.pop();r = x/y;calc.push(r);}}}

 int a = calc.pop();System.out.println(a);}
  

public void stkq2(){

class stkq2{

//this one is from geeksforgeeks
  /*  static class Stack{
        // Tuo built in ques,
        static Queue<Integer>q1=new LinkedList<Integer>();
        static Queue<Integer>q2=new LinkedList<Integer>();
        static int size;
        
        Stack(){size=0;}
        
        static void push(int x){
            size++;q2.add(x);
            while(!q1.isEmpty()){q2.add(q1.peek());q1.remove();}
            Queue<Integer>q=q1;q1=q2;q2=q;}
        
        static void pop(){if(q1.isEmpty())return;q1.remove();size--;}
        
        static int top(){if(q1.isEmpty())return -1;return q1.peek();}
        
        static int size(){return size;}};
    
    public static void main(String[]args){
        
        Stack chips=new Stack();
        chips.push(1);chips.push(2);chips.push(3);
        
        System.out.println("current size:"+chips.size());
        System.out.println(chips.top());chips.pop();
        System.out.println(chips.top());chips.pop();
        System.out.println(chips.top());
        System.out.println("current size:"+chips.size());}}*/
    
//A different method from stackoverflow
/*    
static Queue<Integer>q1=new LinkedList<Integer>();
static Queue<Integer>q2=new LinkedList<Integer>();

public static void main(String[]args){
    
    push(24);push(34);push(4);push(10);push(1);push(43);push(21);
    System.out.println("1st e removed is "+pop());
    System.out.println("2nd e removed is "+pop());
    System.out.println("3rd e removed is "+pop());}

public static void push(int data){q1.add(data);}

public static int pop(){
    if(q1.isEmpty()){System.out.println("Empty stack.");return -1;}
    else{while(q1.size()>1){q2.add(q1.remove());}
    int e = q1.remove(); Queue<Integer>temp=new LinkedList<Integer>();
    temp=q1;q1=q2;q2=temp;return e;}}}*/


    
Queue<Integer> q1 = new LinkedList<Integer>();
Queue<Integer> q2 = new LinkedList<Integer>();
//origin stack overflow
public int pop(){if(q1.peek()==null){
System.out.println("nothing returned");int i=0;return i;}
else{int pop=q1.remove();return pop;}}

public void push(int dat){
if(q1.peek()==null){q1.add(dat);}
else{for(int i=q1.size();i>0;i--){q2.add(q1.remove());}
q1.add(dat);for(int j=q2.size();j>0;j--){q1.add(q2.remove());}}}
            
    
        
        /*stkq2 s= new stkq2(); 
        stkq2.push(1);s.push(2);s.push(3);s.push(4);s.push(5);
        
        System.out.println("1st=     "+s.pop());
        System.out.println("2nd=  "+s.pop());
        System.out.println("3rd=  "+s.pop());
        System.out.println("4th=  "+s.pop());
        System.out.println("5th= "+s.pop());*/}}



// Master Class Instantiation:

public static void main(String[] args) throws Exception{
ArWill_newMaster5  m5 = new ArWill_newMaster5();
m5.hitcounter();m5.openstack();m5.PostfixCalc();m5.stkq2();}}