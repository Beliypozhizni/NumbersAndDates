package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {
        int day = 30;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));
    }

    public static String collectBirthdays(int year, int month, int day) {
        StringBuilder result = new StringBuilder();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E").localizedBy(Locale.US);
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        for (int number = 0; !birthday.isAfter(today); number++) {
            result.append(number)
                    .append(" - ")
                    .append(formatter.format(birthday))
                    .append(System.lineSeparator());
            birthday = birthday.plusYears(1);
        }

        return result.toString();
    }
}
