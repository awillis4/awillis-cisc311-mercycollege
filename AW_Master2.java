//Homework (100 pts): Given an array of ints,
//1. write a method named calcSum to sum values of the array and return it
//2. write a method named calcAvg to calculate the average of array elements and return it
//3. write a method named reverse to reverse the array and return the reversed array
//4. write a method named findMax to find the largest element in the array and return it
//5. write a method named findSecMax to find the second largest element in the array and return it
//6. write a method named findDuplicate to find and return duplicates in the array if there are any
//7. write a method named removeDuplicates to remove and return all the duplicate values in the array if there are any
//8. write a method named replaceNegative to replace all the negative elements in the array with the positive value and return the array
//9. write a method named separate to separate the array into two arrays based on whether the element values are even or odd and return these two arrays

import java.util.*; 

public class AW_Master2{public static void main(String[]args){

int i=0;int p=0;int[]d=new int[p];int s=0;float m=0;int r=0;

Scanner scan=new Scanner(System.in);
System.out.println("please enter a (p<16)-1, then press enter.qing shuru (p<16)-1 ranhou an enter jian.");
p=scan.nextInt();while(p<16){
System.out.println("enter an int.int then press space r times then press enter.shuru int.Int ranhou an kongge jian r ci, ranhou an Enter jian.");
d[p]=scan.nextInt();}

while(i<=p){s=s+d[i];i++;}
System.out.println("the array sum is"+s);

while(i<=p){s=s+d[i];i++;m=s/p;}
System.out.println("and the array average is"+m);

while(i<=p/2){r=d[i];d[i]=d[p-i-1];d[p-i-1]=r;}
System.out.println(r+"is the set in reverse");

int n=d.length;int gap=n/2;
while(gap>0){for(int c=0;c<n;c++){for(int b=0;b<c-gap;b++){
if(d[b]>d[c]){r=d[b];d[b]=d[c];d[c]=r;}gap=gap/2;}}}
System.out.println(d[r]+"and"+d[r-1]+"are the two largest values.");

int g=0;int h=0;d[p]=g;d[p-i]=h;
while(i<p){if(d[p]=d[p-i]){
System.out.println(g+"and"+h+"are identical.");}}

if(d[i]=d[i-p]{Object.obj=list.remove(d[i]);Object.obj=list.remove(d[i-1]);}
System.out.println(d+"is the array minus duplicates");

while(d[i]<0){d[i]=d[i]+2*d[i];}
System.out.println(d+"is the array with negatives as positives");

int k=2;int even=0;int odd=1; 
if(d[i]%k=odd){d[i]=even;}else{d[i]=odd;}
System.out.println(even+odd+"are the evens and odds of the array"); }}