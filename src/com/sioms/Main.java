package com.sioms;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main{
    public static void main(String[] args) {
        Instant now = Instant.now();
        LocalDate date = LocalDate.now();
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);
        System.out.println(date);
        System.out.println(now);
    }
}