import java.util.*;

public class AW_Master3{
public static void main(String[]args){

//1. Write a method that accepts two arguments into the parameters x and y. Assume x and y
//hold positive nonzero integers, the method should return the value of x times y.
//Multiplication can be performed as repeated addition as follows: 5 × 6 = 6 + 6 + 6 + 6 + 6

int m=0;int n=0;int c=1;
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number");
m=scan.nextInt();int x=m;
System.out.println("Enter another number");
n=scan.nextInt();
System.out.println("will multiply m*n as an n sum of m");

//a. Solve the problem by using recursion

while(c<n){m=m*x;c++;}
System.out.println("m times n="+m);

//b. recursion with memoization

int num=n;int max=m;int[]mem=new int[1000];
max=mem[num];
System.out.println("m times n="+max+" but with memoization.");

//2. Ackermann’s Function is a recursive mathematical algorithm that can be used to test how
//well a system optimizes its performance of recursion. The two-argument Ackermann’s
//function, is defined as follows for nonnegative integers m and n:
//Given the arguments m and n, write a method that solves the Ackermann’s function 

//c. by using Recursion

public static int ack(int c,int x){//Missing jvadoc
if(c==0){return x+1;}
else{if(c>0 && x==0){return ack(c-1,1);}
else{if(c>0 && x>0){return ack(c-1,ack(c,x-1));}
int ans=ack(c,x);return ack(c,x);
System.out.println(ack(c,x)+" is the ack for these values m,n");

//d. by using Recursion with memoization

int cc=c;int xx=x;int[]mack=new int[100];xx=mack[cc];
System.out.println(xx+" is ack ans with memoization");return xx;}}

}}

//e. Analyze the time and space complexity of each method

//Shili = 10n, yinwei ta baohan 10 ge fangfa
// a = 2n, ta baohan 2 ge fangfa
// b = 5n, ta baohan 5 ge fangfa
// c = n(n + 6), yinwei ta you 1 ge qian tao for xunhuan.
// D =yu b leisi, baohan 5 zhong fangfa.
//Yiqi, f = O(n ^ 2).

// the instance =10n since it contains 10 methods
//a = 2n, it contains 2 methods
//b = 5n, it contains 5 methods
//c = n(n+6) since it has 1 nested for loop.
//d = similar to b, and contains 5 methods.
//together, f=O(n^2).

//i couldnt find something that returns o complexity.