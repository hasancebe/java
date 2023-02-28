package Day29_StringBuilderDateFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C01_DateFormat {
    public static void main(String[] args) {
        LocalDate ldt1=LocalDate.now();
        System.out.println(ldt1);

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(ldt1.format(dtf1));
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MM/YY");
        System.out.println(ldt1.format(dtf2));
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MMM/YY");
        System.out.println(ldt1.format(dtf3));
        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("dd.MMMM.YY");
        System.out.println(ldt1.format(dtf4));
    }
}
