package com.helloworld.helloworld;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    LocalDateTime today = LocalDateTime.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");
    String dateTimeJp = dateTimeFormatter.format(today);
}
