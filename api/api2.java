package api;


import java.time.*;

public class api2 {
    public static void main(String[] args) {
    
        LocalDate dt= LocalDate.now();
        
        System.out.println(dt);
        
         int day =   dt.getDayOfMonth();
         int month =   dt.getMonthValue();
         int year = dt.getYear();
         System.out.println(day +"/"+ month +"/" + year);

         LocalTime time = LocalTime.now();
         System.out.println(time);

         int hour =time.getHour();
         int minut = time.getMinute();
         int sec = time.getSecond();
         int nano = time.getNano();

         System.out.println(hour+ ":" + minut + ":" + sec + ":" +nano);


    }
    
    
}
