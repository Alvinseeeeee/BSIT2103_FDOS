package BSIT2103_FDOS.BackEnd2;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalendarTable {
    private LocalDate currentDate;
    private LocalDate today;

    public CalendarTable(){
        today = LocalDate.now();
        currentDate = today;  
    }
    
    public String getMonthYear(){
        return currentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH) + " " + currentDate.getYear();
    }
    
    public int[][] getMonthDays(){
        LocalDate firstDayMonth = currentDate.withDayOfMonth(1);
        int startDayOfWeek = firstDayMonth.getDayOfWeek().getValue() % 7;
        int daysInMonth = currentDate.lengthOfMonth();
        
        int[][] days = new int[6][7];
        int dayCounter = 1;

        for(int i = 0; i < days.length; i++){
            for(int j = 0; j < days[i].length; j++){
                if(i == 0 && j < startDayOfWeek){
                    days[i][j] = 0;
                }
                else if(dayCounter <= daysInMonth){
                    days[i][j] = dayCounter++;
                }
                else{
                    days[i][j] = 0;
                }
            }
        }
        
        return days;
    }
    
    public void previousMonth(){
        if (currentDate.isAfter(today.minusMonths(5))) {
            currentDate = currentDate.minusMonths(1);
        }
    }
    
    public void nextMonth(){
        if (currentDate.isBefore(today.plusMonths(5))) {
            currentDate = currentDate.plusMonths(1);
        }
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }
    
    public boolean isPastDate(int day) {
        LocalDate dateToCheck = currentDate.withDayOfMonth(day);
        return dateToCheck.isBefore(today);
    }
}
