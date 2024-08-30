package Eancapsulation;
class Student1{
    private long ID;
    private String name,address;
Student1(String name , long ID, String address){
        this.name=name;                          // name=name;           
        this.ID=ID;                             //  ID=ID;                     not work use this
       this.address=address;                    //  address=address;
}
public void sr1()
{
    System.out.println("Name is :: " +name);
    System.out.println("ID is :: " +ID);
    System.out.println("Address is :: " +address);
}
}

public class ShadowProblem {
    public static void main(String[] args) {
        Student1 st = new Student1("Sarthak", 216330032 , "Sheikhpura");
        st.sr1();
        
        
    }
}
