package oops;


    class cal{
    public int add (int n1 , int n2){
        int result = n1+n2;
        return result;

    }
    public int add (int n1 , int n2 ,int n3){
        int result = n1+n2+n3;
        return result;

    }
    public double add (Double n1 , Double n2 ,Double n3){
        double result = n1+n2+n3;
        return result;

    }
}
public class methodOverloding {
    public static void main(String[] args) {
        cal obj = new cal();
       // int result= obj.add(5,6);
        int result1 = obj.add(5,55 ,9);
        double result2 = obj.add(8.0,55. ,7.0);
      //  System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
       // System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        
    }
}