package school.mjc.stage0.conditions.task3;

import java.util.Calendar;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (isValidDate(month)) {
            int days = getDaysInMonth(month);
            System.out.println(days);
        } else {
            System.out.println("wrong number!");
        }
    }

    public static boolean isValidDate(int month) {
        return (month >= 1 && month <= 12);
    }

    public static int getDaysInMonth(int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, month - 1, 1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
