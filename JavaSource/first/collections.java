package first;

import java.util.*;  
class collections {  
public static void main(String args[]){  
Set<Integer> list=new TreeSet<>(); 
list.add(2);
list.add(4);
list.add(1);
list.add(7);
list.add(6);
Iterator itr=list.iterator();  
while(itr.hasNext()) {  
System.out.println(itr.next());  
}  
}  
}  