package eight.tasks.datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.time.format.DateTimeFormatter.ofPattern;
import static java.time.temporal.TemporalAdjusters.firstDayOfMonth;
import static util.Constants.*;

public class DateTimeAPITask {

    //LocalDate
    private static String getFormattedCurrentDate() {
        return LocalDate.now().format(ofPattern(DATE_PATTERN));
    }

    private static LocalDate getFirstDayOfCurrentMonth() {
        return LocalDate.parse(getFormattedCurrentDate()).with(firstDayOfMonth());
    }

    private static DayOfWeek getCurrentDayOfWeek() {
        return LocalDate.parse(getFormattedCurrentDate()).getDayOfWeek();
    }

    //LocalTime
    private static String getFormattedCurrentTime() {
        return LocalTime.now().format(ofPattern(TIME_PATTERN));
    }

    private static LocalTime increaseCurrentTime(int quantity, ChronoUnit chronoUnit) {
        return LocalTime.parse(getFormattedCurrentTime()).plus(quantity, chronoUnit);
    }

    public static void printDateTimeResults(int quantity, ChronoUnit chronoUnit) {
        out.println(format("%s%s", CURRENT_DATE, getFormattedCurrentDate()));
        out.println(format("%s%s", FIRST_DAY_OF_MONTH, getFirstDayOfCurrentMonth()));
        out.println(format("%s%s", CURRENT_DAY_OF_WEEK, getCurrentDayOfWeek()));
        out.println(format("%s%s", CURRENT_TIME, getFormattedCurrentTime()));
        out.println(format(INCREASED_TIME, quantity, chronoUnit, increaseCurrentTime(quantity, chronoUnit)));
    }

}
