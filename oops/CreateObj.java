package oops;

public class CreateObj {
    
    String name="Rahul" ;  //Rahul
    int a=2;        //110
    public static void main(String[] args) {
       int num = 10;    //no apply
        CreateObj obj1 = new CreateObj();
        CreateObj obj2 = new CreateObj();
        CreateObj obj3 = new CreateObj();
        CreateObj obj4 = new CreateObj();
        obj1.name=  "Sarthak";
        obj2.a = 10;
        System.out.println(obj1.name);
        System.out.println(obj2.a);
        System.out.println(num);
        System.out.println(obj3.name);
        System.out.println(obj4.a);
        System.out.println(num);
    }
}
