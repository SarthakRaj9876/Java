package MapandGeneric;

import java.util.*;
class Student
{
  private int age;
  private String name;
  private String city;

public Student(int age , String name , String city)
{
  this.name = name;
  this.age = age;
  this.city = city;
}
public int getAge() {
    return age;
}
public String getName() {
    return name;
}
public String getCity() {
    return city;
}

public String toString()
{
    return name + " " + age + " " + city;
}

  
}

public class map3 {
    public static void main(String[] args) {

        Student st1 = new Student(25, "rohan", "delhi");
        Student st2 = new Student(20, "ankit", "bihar");
        Student st3 = new Student(22, "rahul", "hydrabad");

        Map map1 = new HashMap();
        map1.put(1, st1);
        map1.put(2, st2);
        map1.put(3, st3);

        System.out.println(map1);

        Set set = map1.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
           Map.Entry data = (Map.Entry)itr.next();
           System.out.println(data.getKey() + " : " + data.getValue());
            
        }

    
}
    
}
