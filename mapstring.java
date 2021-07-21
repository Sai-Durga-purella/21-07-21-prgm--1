import java.util.*;

class map1

{
  
public static void main(String args[])
  
{
    
int n;
    
String[] s =new String[];
    
HashMap<String, Integer>x=new HashMap<String ,Integer>();
    
int[] s={Rama,Gita,Rama,Lakshmi,Rama,Gita,Lakshmi,Sita,Lakshmi};
    for(int i=0;i<s.length;i++)
    
{
     
int key;
     
 key=s[i];
     

 if(x.containsKey(key))
     
 x.put(key,x.get(key)+1);
      
else
     
 x.put(key,1);
      
}
     
System.out.println(x);
 
 }

}