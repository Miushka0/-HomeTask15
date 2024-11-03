package app;
import java.util.Scanner;

import app.Enum.WeekDays;
import app.Modules.Adviser;
import app.Modules.DayAdviser;

public class HomeTask15 {
    public static void main(String[] args) {
        Adviser adviser = new DayAdviser();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter week day (ex. MONDAY, TUESDAY... (UpperCase) : ");
        String enteredDay = userInput.nextLine();

        WeekDays weekDays = WeekDays.valueOf(enteredDay);
        adviser.advise(weekDays);
        userInput.close();
    }
}
