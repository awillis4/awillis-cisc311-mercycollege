//Java Assignment1 A.Willis S.Li
// Exercises 1.7, 1.8, 1.9 on pages 63-65 of the Power Point Slides 01_java_foundations_I.pdf
//Problem on page 84 of the Power Point Slides 01_java_foundations_I.pdf

import java.util.*;

public class AWill_Master1{ AWill_Master1(){}

  //1.7
 // Ask the user to enter an integer n (n >= 1).
 //Write a program that calculates 1! + 2! + 3! + 4! + … + n!
 //By using for loop
 //By using while loop
 //By using do-while loop
 
public void factorial(){
 
 int n=0;int x=0;
 do{n=0;}while(n>0);do{x=0;}while(x>0);
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter an int>0, press Enter");
 n=scan.nextInt();
 
 for(int z=n;z<n;z--){n=n*(z-1)+n*(z-2);}System.out.println(n);
 
 while(x>0){n=x;n=n*(x-1)+n*(x-2);}System.out.println(n);
 
 do{x=n;n=n*(x-1)+n*(x-2);}while(x>0);System.out.println(n);}
 
 //Yexu wo de jgrasp yu ni de jgrasp you suo butong
 
 //1.8
 //Write a program that displays the multiplication table shown as follows:
 //By using for loop
// By using while loop
//By using do-while loop

public void printmultable(){

for(int x=1;x<10;x++){for(int y=1;y<10;y++){
System.out.print(x+"*"+y+"="+x*y);}}

int x=0;int y=0;
while(x>=1){x=y;while(y>=1){
System.out.print(x+"*"+y+"="+x*y);y--;}
System.out.println();x--;}

x=9; y=9;
do{x=y;do{
System.out.print(x+"*"+y+"="+x*y);y--;}while(y>=1);
System.out.println();x--;}while(x>=1);}

//1.9
//Write a program that displays the pattern shown as follows:
//By using for loop
//By using while loop
//By using do-while loop

public void numtower(){ int n=9;

for(int i=0;i<n;i++){
for(int j=9-i;j>=0;j--){System.out.print(" "+" ");}
for(int j=i;j>=1;j--){System.out.print(j+" ");}
for(int j=2;j<=i;j++){System.out.println(j+" ");}
System.out.println();}

{int i=1;while (i<=n) {int j=9-i ; 
while( j>= 0) {System.out.print(" ");j--;}
int k = i;while(k >= 1) {System.out.print(k);k--;}
int l = 2;while (l <= i){System.out.print(l);l++;}
System.out.println();i++;}}

int i=1;do{
int j=9-i;do{System.out.print(" ");j--;}while (j >= 0);
int k=i;do{System.out.print(k);k--;} while (k >= 1);
int l=2;do {if (i != 1) {System.out.print(l);l++;}}while (l <= i);
System.out.println();i++;} while (i <= n);}

//1.10
//Given an array of doubles
//Compute the sum of the array
//Compute the maximum in the array

public void doubles(){

int p=0;double[]d=new double[p];
Scanner scan=new Scanner(System.in);
System.out.println("please enter a (p<16)-1, then press enter.");
p=scan.nextInt();while(p<16){
System.out.println("enter an int.int then press space r times then press enter.shuru int.Int ranhou an kongge jian r ci, ranhou an Enter jian.");
d[p]=scan.nextDouble();}

for(int i=10;i<d.length;i--){d[i]=d[i]+d[i-1];System.out.println(d);
for(int n=0;n<d.length;n++){while(d[i]>d[i-n]){System.out.println(d);}}

int n=0;while(i<d.length){d[i]=d[i]+d[i-1];i--;System.out.println(d);}
while(n<d.length){while(d[i]>d[i-n]){System.out.println(d);}n++;}

d[i]=d[i-1];do{System.out.println(d);i--;}while(i<d.length);
while(d[i]>d[i-n]){do{System.out.println(d);}while(n<d.length);}n++;}}

//Array Sorting

public int[] arraysort(int[] a) {int n = a.length;
for (int i=0;i<n-1;i++){for (int j=i+1;j<n;j++) {
if (a[j]<a[i]) {int temp=a[i];a[i]=a[j];a[j]=temp;}}}
return a;}

// Master Class Instantiation:

public static void main(String[] args) {AWill_Master1  m1 = new AWill_Master1();
m1.factorial();m1.printmultable();m1.numtower();m1.doubles();
int[] a = {1,3,2,5,6,7,4};a = m1.arraysort(a);System.out.println(Arrays.toString(a));}}
	




