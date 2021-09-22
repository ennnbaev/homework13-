package com.company;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        //так как 24:00 ввести мы не можем поэтому везде будет +1 минута в результате
        final int oneMinute = 1;
        LocalDateTime springBegin = LocalDateTime.of(1965, 3, 1, 0, 0);
        LocalDateTime springEnd = LocalDateTime.of(1965, 5, 31, 23, 59);
        Duration springTime = Duration.between(springBegin, springEnd);
        System.out.println(oneMinute + springTime.toMinutes() + " минут длилась весна в 1965 году");
        LocalDateTime summerBegin = LocalDateTime.of(1965, 6, 1, 0, 0);
        LocalDateTime summerEnd = LocalDateTime.of(1965, 8, 31, 23, 59);
        Duration summerTime = Duration.between(summerBegin, summerEnd);
        System.out.println(oneMinute + summerTime.toMinutes() + " минут длилось лето в 1965 году");
        LocalDateTime autumnBegin = LocalDateTime.of(1965, 9, 1, 0, 0);
        LocalDateTime autumnEnd = LocalDateTime.of(1965, 11, 30, 23, 59);
        Duration autumnTime = Duration.between(autumnBegin, autumnEnd);
        System.out.println(oneMinute + autumnTime.toMinutes() + " минут длилась осень в 1965 году");
        LocalDateTime DecemberBegin = LocalDateTime.of(1965, 12, 1, 0, 0);
        LocalDateTime DecemberEnd = LocalDateTime.of(1965, 12, 31, 23, 59);
        Duration DecemberTime = Duration.between(DecemberBegin, DecemberEnd);
        LocalDateTime winterBegin = LocalDateTime.of(1965, 1, 1, 0, 0);
        LocalDateTime winterEnd = LocalDateTime.of(1965, 2, 28, 23, 59);
        Duration winterTime = Duration.between(winterBegin, winterEnd);
        //два раза добавляем минуту так как потеряли при расчете в декабре и остальных двух месяцев
        System.out.println(oneMinute + oneMinute + winterTime.toMinutes() + DecemberTime.toMinutes() + "  минут длилась зима в 1965 году");
    }
}
