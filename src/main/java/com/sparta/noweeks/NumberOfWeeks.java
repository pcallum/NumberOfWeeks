package com.sparta.noweeks;

public class NumberOfWeeks {
    public static String getNoWeeks(int days) {
        int weeks = Math.floorDiv(days, 7);
        days = days % 7;

        StringBuilder str = new StringBuilder();

        str.append(weeks);

        if (weeks == 1) {
            str.append(" week and ");
        } else {
            str.append(" weeks and ");
        }

        str.append(days);

        if (days == 1) {
            str.append(" day");
        } else {
            str.append(" days");
        }

        return str.toString();
    }
}
