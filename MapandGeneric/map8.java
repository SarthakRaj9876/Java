package MapandGeneric;

class Gen <T>
{ 
    T obj;

    public Gen(T obj)
    {
      this.obj = obj;
    }
    
    void disp()
    {
       System.out.println("The type of data is : "   + getClass().getName());
    }

    public T getobj()
    {
      return obj;
    }
}
public class map8 {
    public static void main(String[] args) 
    {
         Gen<Integer> g = new Gen<Integer>(10);

         g.disp();

         System.out.println(g.getobj());

         Gen<String> g1 = new Gen<String>("ankur");

         g1.disp();

         System.out.println(g1.getobj());




      /*   ArrayList<Gen> list1 = new ArrayList<Gen>();

        List<String> list2 = new ArrayList<String>();

        Collection<Integer> list3 = new ArrayList<Integer>();

        //List<Object> list4 = new ArrayList<String>();  // CE

        //List<int> list4 = new ArrayList<int>();           //CE

        ArrayList<Integrr> list1 = new ArrayList<String>();           */



    }
    
}
