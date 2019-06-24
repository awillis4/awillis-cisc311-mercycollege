//Java Assignment1 A.Willis S.Li
// Exercises 1.7, 1.8, 1.9 on pages 63-65 of 
//the Power Point Slides 01_java_foundations_I.pdf
//Problem on page 84 of the Power Point Slides 01_java_foundations_I.pdf

import java.util.*;
public class AWill_Homework1{ AWill_Homework1(){}
static Scanner scan=new Scanner(System.in);Scanner sc=new Scanner(System.in);

//1.6 
//print the fibonacci sequence starting from one, then approximate the golden ratio.
//Using a for, while, and a do loop

public void fibonacci(){
   float n=0;float min0=0; float min1=0;float min2=0;float max=13; 
    float num00=0;float num10=1;float fib0=0;float rat0=0;
    float num01=0;float num11=1;float fib1=0;float rat1=0;
    float num02=0;float num12=1;float fib2=0;float rat2=0;

for(int i=0;i<=13;i++){fib0=num00+num10;num00=num10;num10=fib0;rat0=num10/num00;min0++;
System.out.println("Current step= "+min0+", Current num= "+fib0+", current ratio= "+rat0);}
    
while(min1<max){fib1=num01+num11;num01=num11;num11=fib1;rat1=num11/num01;min1++;
System.out.println("Current Step= "+min1+", Current num= "+fib1+", current ratio= "+rat1);}

do{fib2=num02+num12;num02=num12;num12=fib2;rat2=num12/num02;min2++;
System.out.println("Current Step= "+min2+", Current num= "+fib2+", current ratio= "+rat2);}
while(min2<max);}

 //1.7
 // Ask the user to enter an integer n (n >= 1).
 //Write a program that calculates 1! + 2! + 3! + 4! + … + n!
 //using a for loop, while loop, and a do loop
 
  public void factorial(){
 
int i0=1;int sum0=1;int fac0=1;
int i1=1;int sum1=1;int fac1=1;
int i2=1;int sum2=1;int fac2=1;

System.out.print("Enter integer less than 20 ");
Scanner scan=new Scanner(System.in);int n=scan.nextInt();
              
for(i0=1;i0<=n;i0++){fac0=i0*fac0;sum0+=fac0;}System.out.println(n+"! factorial= "+fac0);
while(i1<=n){fac1=i1*fac1;sum1+=fac1;i1++;}System.out.println(n+"! factorial= "+fac1);
do{fac2=i2*fac2;sum2+=fac2;i2++;}while(i2<=n);System.out.println(n+"! factorial= "+fac2);}
 
 //1.8
 //Write a program that displays the multiplication table shown as follows:
 //By using a for, while, and do loop.
   
public void printmultable(){int i=9;int j=9;

for(i=9;i>=1;i--){for(j=i;j>=1;j--){System.out.print(i+"*"+j+"="+i*j+" ");}
System.out.println();}

while (i>=1){j=i;while(j>=1){System.out.print(i+"*"+j+"="+i*j+" ");j--;}
System.out.println();i--;}

do{j=i;do{System.out.print(i+"*"+j+"="+i*j+" ");j--;} 
while(j>=1);System.out.println();i--;}while (i >= 1);}

//1.9
//Write a program that prints 3 number triangles:
//By using for, while, and a do loop.

public void numtower(){ int n=9;

System.out.println("");
for(int i=1; i<=n; i++){for(int j=0; j<n-i; j++){System.out.print(" ");}
for(int k=1; k<i; k++){System.out.print(k);}
for(int l=i; l>=1; l--){System.out.print(l);}
System.out.print("\n");}

{int i=1;while (i<=n) {int j=9-i ; 
while( j>= 0) {System.out.print(" ");j--;}
int k = i;while(k >= 1) {System.out.print(k);k--;}
int l = 2;while (l <= i){System.out.print(l);l++;}
System.out.println();i++;}}

int i=1;do{int j=9-i;do{System.out.print(" ");j--;}while (j >= 0);
int k=i;do{System.out.print(k);k--;}while (k >= 1);
int l=2;do{if(i != 1){System.out.print(l);l++;}}while(l <= i);
System.out.println();i++;}while(i<=n);}

// *Citing globalvannan, soaride

//1.10
//Given an array of doubles
//Compute the sum of the array
//Compute the maximum in the array

public void doubles(){

int i,j,k,p,c;int sum1,sum2,sum3,max1,max2,max3,temp1,temp2,temp3;
String d1,d2,d3;p=16;int[]d=new int[p];
max1=d[0];max2=d[0];max3=d[0];temp1=0;temp2=0;temp3=0;sum1=0;sum2=0;sum3=0;i=0;j=0;k=0;

Scanner scan=new Scanner(System.in);
System.out.println("please enter a (c<16)-1, then press enter.");c=scan.nextInt();
System.out.println("enter numbers <16 then press enter c times.");for(p=0;p<c;p++){d[p]=scan.nextInt();}
d1=Arrays.toString(d);d2=Arrays.toString(d);d3=Arrays.toString(d);

System.out.println(d1);
for(i=0;i<c;i++){sum1+=d[i];}System.out.println("the sum is "+sum1);
for(i=1;i<c;i++){if (d[i]>max1){max1=d[i];}System.out.println("the max is "+max1);}
for(i=1;i<p;i++){if(d[i]>d[i+1]){temp1=d[i];d[i]=d[i+1];d[i+1]=temp1;System.out.print(d[i]+" ");}}

System.out.println(d2);
while(j<c){sum2+=d[j];}j++;System.out.println("the sum is "+sum2);
while(j<c){if(d[j]>max2){max2=d[j];}j++;}System.out.println("the max is "+max2);
while(j<c){if (d[j]>d[j+1]){d[j]=d[j+1];d[j+1]=temp2;j++;System.out.println(d[j]+" ");}}

System.out.println(d3);
if(d[k]<p){do{sum3+=d[k];k++;}while(k<c);System.out.println("the sum is "+sum3);}
if(d[k]>max3){do{max3=d[k];k++;}while(k<c);System.out.println("the max is "+max3);}
if(d[k+1]<d[k]){do{d[k]=d[k+1];d[k+1]=temp3;k++;System.out.println(d[k]+" ");}while(k<c);} }

//https://www.tutorialgateway.org/java-program-to-sort-array-in-ascending-order/

// Master Class Instantiation: */
public static void main(String[]args){AWill_Homework1  m1=new AWill_Homework1();
m1.fibonacci();m1.factorial();m1.printmultable();m1.numtower();m1.doubles();}}