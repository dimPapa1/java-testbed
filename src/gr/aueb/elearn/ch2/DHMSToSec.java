package gr.aueb.elearn.ch2;

import java.util.Locale;
import java.util.Scanner;

/** METATREPEI  MERES WRES LEPTA DEYTEROLEPTA SE
 * SYLOLIKA DEYTEROLEPTA
 * @author D.Papaioannou
 *
 */
public class DHMSToSec {
    public static void main(String[] args) {
        final int SEC_PER_DAY = 3600 * 24;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MIN = 60;

        Scanner in = new Scanner(System.in);
        long days, hours, min, sec;
        long totalsec;

        System.out.println("Give days, hours, minutes, seconds");

        days = in.nextInt();
        hours = in.nextInt();
        min = in.nextInt();
        sec = in.nextInt();


        totalsec = ( days * SEC_PER_DAY) +(hours * SEC_PER_HOUR) + (min * SEC_PER_MIN) + sec;

        System.out.printf(Locale.ENGLISH, "Total Sec: %,d", totalsec); //LOCALE ENGLISH kanei tis teleies se komma
        in.close();

    }
}
