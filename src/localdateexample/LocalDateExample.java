package localdateexample;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        int month=date.getMonthValue();
        System.out.println(String.format("Номер месяца %s", month));
        int today=date.getDayOfMonth();
        System.out.println(String.format("Текущее число %S",today));
        date=date.minusDays(today-1);//задаю первый день месяца (отнимаю текущую дату и единицу)
        DayOfWeek weekday=date.getDayOfWeek();
        System.out.println(String.format("Название дня недели %s", weekday));
        int value=weekday.getValue();
        System.out.println(String.format("Номер дня недели %s",value));
        
        for(int i=1;i<value;i++){
            System.out.println(" ");
        }
        
        while(date.getMonthValue()==month){
            System.out.printf("%3s",date.getDayOfMonth());
            if(date.getDayOfMonth()==today){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            date=date.plusDays(1);
            if(date.getDayOfWeek().getValue()==1){
                System.out.println();
            }
        }
        if(date.getDayOfWeek().getValue()!=1){
            System.out.println();
        }
    }
    
}
