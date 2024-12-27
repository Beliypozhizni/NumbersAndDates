package practice;

import java.time.LocalDate;
import java.time.Period;

public class Periods {

    public static String getPeriodFromBirthday(LocalDate firstDate, LocalDate secondDate) {
        Period period = Period.between(firstDate, secondDate);
        return String.format("years:%d, months:%d, days:%d", period.getYears(), period.getMonths(), period.getDays());
    }
}
