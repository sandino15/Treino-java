package Udemy.CursoJavaCompleto.exercicios.cap11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora2 {

public static void main(String[] args){
    LocalDate d04 = LocalDate.parse("2025-10-06");
    LocalDateTime d05 = LocalDateTime.parse("2025-10-06T01:30:26");
    Instant d06 = Instant.parse("2025-10-06T01:30:26Z");

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
    DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm").withZone(ZoneId.systemDefault());

    System.out.println("d04 = " + d04.format(fmt1));
    System.out.println("d05 = " + d05.format(fmt1));
    System.out.println("d05 = " + fmt3.format(d06));
    System.out.println("d05 = " + d05.format(fmt2));
    System.out.println("d04 = " + fmt1.format(d04));
}
}
