package org.example.Utill;

import java.time.LocalDate;

public class Utill {
    public static String nowDateTime() {
        LocalDate now = LocalDate.now();
        return now.toString();
    }
}
