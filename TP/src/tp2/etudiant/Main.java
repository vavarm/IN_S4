package tp2.etudiant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO create objects and print their attributes
        Nationality cp = Nationality.ETRANGER_FRANCOPHONE;
        Etudiant et1 = new Etudiant("Dubois", 2002, true, cp);
        System.out.println(et1.toString());

        Scanner scanner = new Scanner(System.in);
        et1.saisieCodePays(scanner);
        System.out.println(et1.toString());

        et1.saisieNotes(scanner);
        System.out.println("Mention " + et1.mention());

        System.out.println(et1.toString());

        scanner.close();

        System.out.println("\nDATE & TIME\n");

        ////////// DATE //////////
        int year = 2002;
        int month = 2;
        int dayOfMonth = 1;
        LocalDate date = LocalDate.of(year, month, dayOfMonth);
        System.out.println(date); // formatage par d�faut
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        System.out.println(formatter.format(date)); // formatage

        ////////// TIME //////////
        int hour = 13;
        int minute = 50;
        LocalTime time = LocalTime.of(hour, minute);
        System.out.println(time);

        ////////// DATE & TIME //////////
        LocalDateTime dateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
        System.out.println(dateTime);
    }
}
