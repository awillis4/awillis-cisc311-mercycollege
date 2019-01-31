import java.util.*;import java.io.*;

public class ipcount{
public static void main(String[]args){

//private static final char default_separator = ',';
//private static final char default_quote ='"';
int k=0;int[]n=new int[k];

String csvfile="I:\cis311\final\final\IP_Address";

BufferedReader br=null;String line="";String csvsplit=";";

try{

br=new BufferedReader(new FileReader(csvFile));
while ((line=br.readLine())!=null){

String[] ip = line.split(csvsplit);
System.out.println("ip="+ip[i]);

for (j=0;j<i.length;j++){while (ip[i]!=ip[i-j]){n++;}
while (ip[i]==ip[i-j]){return ip[i];k++;}return n;
System.out.println("number of like ips ="+n);}

List<String, Integer>map=new HashMap<String, Integer>();
for(int i=0;i<list.size();){
String s = list.get(i);
int count=list.lastIndexOf(s)-list.indexOf(s)+1;
map.put(s.count);
i=list.lastIndexOf(s)+1;}}

catch(FileNotFoundExeption e){e.printStackTrace();}
catch(IOException e){e.printStackTrace();}
finally{if{br!=null){try{br.close();}
catch(IOException e){e.printStackTrace();}}}}}





