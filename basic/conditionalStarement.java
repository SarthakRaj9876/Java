public class conditionalStarement {
    public static void main(String[] args) {
        int age=25;
        if(age>=18 && age<60){
            if(age>20 && age<30){
                System.out.println("you are in 20s");
            }
                else if(age>=30 && age<=40){
                    System.out.println("you are in 30s");
                }
                else{
                    System.out.println("you are still teen");
                }
            }
            else if(age>60){
                System.out.println("you are an old man");
            }
            else if (age>16 && age<18){
                System.out.println("you are teenager");
            }
            else{
                System.out.println("you are still kid");
            }
    }
}
