package com.ljm.starter.util;

import java.time.LocalDate;

public class SystemUtil {

    public static String getDateNow(){

        LocalDate date = LocalDate.now();
        return date.toString();

    }

}
