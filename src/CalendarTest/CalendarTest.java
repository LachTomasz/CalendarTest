package CalendarTest;

import java.time.*;

/**
 * Program ten wyświetla kalendarz bierzącego miesiąca , * oznaczony jest bieżący dzień.
 * This program will display the calendar of the current month, * the current day is marked.
 * @author Tomek
 *
 */
public class CalendarTest
{
    public static void main(String[] args)
    {
        //Pobranie aktualnej daty.
        //Get the current date.
        LocalDate date = LocalDate.now();

        //date = date.plusMonths(2);

        //Pobranie aktualnego miesiąca.
        //Get the current month.
        int month = date.getMonthValue();
        //Pobranie aktualnego dnia.
        //Get the current day.
        int today = date.getDayOfMonth();

        //Ustawienie na początek miesiąca.
        //Setting for the beginning of the month.
        date = date.minusDays(today - 1);

        //Pobranie dnia tygodnia dla pierwszego dnia miesiąca.
        //Get the day of week for the first day of the month.
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); //1 = Monday, ..., 7 = Sunday.

        String[] monthName = new String[] {"Styczeń","Luty","Marzec","Kwiecień","Maj","Czerwiec",
                "Lipiec","Sierpień","Wrzesień","Paziernik","Listopad","Grudzień"};
        System.out.println(monthName[month-1]);

        System.out.println(" Pn  Wt  Śr  Czw Pt  So  Nd");

        for(int i = 1; i < value; i++)
            System.out.print("    ");

        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());

            if(date.getDayOfMonth() == today)
                System.out.print('*');
            else
                System.out.print(" ");

            date = date.plusDays(1);

            if(date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
    }
}
