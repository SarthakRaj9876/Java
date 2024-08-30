package MapandGeneric;

import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.jar.Attributes;

class Employee
{
  private int empid;
  private String name;
  
public Employee(int empid , String name)
{
  this.name = name;
  this.empid = empid;

}
public String toString()
{
     return empid + " ";
}
@Override
public void finalize()
{
   System.out.println("clean up work by GC before deallocating memory from heap");
}
  
}

public class map5 {
    public static void main(String[] args) 
    {
        
     Employee e = new Employee(145,"poll");

     
     HashMap hm = new HashMap();
     //WeakHashMap hm = new WeakHashMap();
      hm.put(e, "hayder");

      System.out.println(hm);
      e=null;                   //eligible for garbage collector
      System.gc();              //invoking garbage cillector

      System.out.println(hm);

      System.out.println("last line");














    }
    
}
