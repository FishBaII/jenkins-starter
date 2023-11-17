package com.ljm.starter.util;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SystemUtilTest {

    @Test
    void getDateNow() {

        String nowDate = LocalDate.now().toString();
        String nowDateFromUtil = SystemUtil.getDateNow();
        assertEquals(nowDate, nowDateFromUtil);

    }
}