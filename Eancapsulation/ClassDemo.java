package Eancapsulation;
class Student{
    private int age;
    private String name;
    public void sr()
    {
     age=18;
      name="Sarthak Raj";
     //System.out.println(age+" " +name);
    }
    public void show()
    {
        System.out.println(name+ "   " +age);
    }
}
public class ClassDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
       s.sr();
       s.show();
       
    }
}
