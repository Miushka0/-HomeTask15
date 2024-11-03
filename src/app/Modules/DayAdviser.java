package app.Modules;

import app.Enum.WeekDays;

public class DayAdviser implements Adviser{

    @Override
    public void advise(WeekDays weekDays) {
        switch (weekDays) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                    System.out.println("Today is a weekday. Your advise: Hold on and wait for the weekend");
            case FRIDAY ->
                    System.out.println("Happy Friday!");
            case SATURDAY, SUNDAY ->
                    System.out.println("It's a weekend day!  Visit the park and the best institution of the city");
        }
    }
}
