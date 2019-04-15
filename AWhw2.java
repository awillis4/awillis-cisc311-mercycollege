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
public class AWhw2{public static void main(String[]args){

 int i,j,c,s,r,h,g,p;p=16;int[]d=new int[p];float m;
 i=0;j=i-1;s=0;r=0;h=0;g=0;m=0;
Scanner scan=new Scanner(System.in);Object obj;

System.out.println("please enter a (c<16)-1, press enter.");c=scan.nextInt();
System.out.println("enter an int, press enter c*.");for(p=0;p<c;p++){d[p]=scan.nextInt();}

while(i<c){s+=d[i];i++;}System.out.println("the array sum is "+s);

while(i<=p){s+=d[i];i++;m=s/p;}System.out.println("and the array average is "+m);

for(i=c-1;i>=0;i--){System.out.print(d[i]+" ");}System.out.println("is the array reversed.");

int max=d[0];for(i=0;i<c;i++){if(d[i]>=max){max=d[i];}}
System.out.print(" "+d[i]);System.out.print(" is the largest value,");
System.out.print(" "+d[i-1]);System.out.println(" is the second largest value.");

for(i=0;i<c;i++){for(r=0;r<c;r++){if(d[i]==d[i+r]){d[i]=d[i+r];}}}
for(i=0;i<c;i++){for(r=0;r<c;r++){if(d[i]!=d[i+r]){}}}System.out.println("none are identical.");
System.out.println(d[i]+" and "+d[i-r]+" are identical.");

for(i=0;i<c;i++){d[i]=Math.abs(d[i]);}
for(i=0;i<c;i++){System.out.print(" "+d[i]);}System.out.println(" is the array with negs as pos");

for(i=0;i<c;i++){if(d[i]%2!=0){System.out.print(" "+d[i]);}}System.out.print(" are the odds of the array, ");
for(i=0;i<c;i++){if(d[i]%2==0){System.out.print(" "+d[i]);}}System.out.println(" are the evens of the array");

for(i=0;i<c;i++){for(j=i+1;j<c;j++){if(d[i]==d[j]){c--;}}}
for(h=0;h<c;h++){System.out.print(" "+d[h]);}System.out.println(" is the array minus duplicates.");
    
System.out.println("feel free to comment out any method with //");    
}}

//javaconceptoftheday.com
