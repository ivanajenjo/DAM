package com.ivanajenjo.RegEx;

import java.util.regex.*;

public class RegEx {
    public static void main(String[] args) {
        EjemploFecha();
        EjemploFecha2();
        ComprobarDni();
        ComprobarEmail();
        ComprobarEmail2();
    }

    public static void EjemploFecha(){
        String regexp = "\\d{1,2}/\\d{1,2}/\\d{4}";
        //True
        System.out.println(Pattern.matches(regexp, "11/12/2014"));
        System.out.println(Pattern.matches(regexp, "1/12/2014"));
        System.out.println(Pattern.matches(regexp, "11/2/2014"));
        //False
        System.out.println(Pattern.matches(regexp, "11/12/14"));
        System.out.println(Pattern.matches(regexp, "11//2014"));
        System.out.println(Pattern.matches(regexp, "11/12/14perico"));
    }

    public static void EjemploFecha2(){
        String literalMonthRegexp = "\\d{1,2}/(?i)(ene|feb|mar|abr|may|jun|jul|ago|sep|oct|nov|dic)/\\d{4}";
        //True
        System.out.println(Pattern.matches(literalMonthRegexp, "11/dic/2014"));
        System.out.println(Pattern.matches(literalMonthRegexp, "1/nov/2014"));
        System.out.println(Pattern.matches(literalMonthRegexp, "1/AGO/2014"));
        System.out.println(Pattern.matches(literalMonthRegexp, "21/Oct/2014"));
        //False
        System.out.println(Pattern.matches(literalMonthRegexp, "11/abc/2014"));
        System.out.println(Pattern.matches(literalMonthRegexp, "11//2014"));
        System.out.println(Pattern.matches(literalMonthRegexp, "11/jul/2014pedro"));
    }

    public static void ComprobarDni(){
        String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";
        //True
        System.out.println(Pattern.matches(dniRegexp, "01234567C"));
        //False
        System.out.println(Pattern.matches(dniRegexp, "01234567U"));
        System.out.println(Pattern.matches(dniRegexp, "0123567X"));
    }

    public static void ComprobarEmail(){
        String emailRegexp = "[^@]+@[^@]+\\.[a-zA-Z]{2,}";
        //True
        System.out.println(Pattern.matches(emailRegexp, "a@b.com"));
        System.out.println(Pattern.matches(emailRegexp, "+++@+++.com"));
        //False
        System.out.println(Pattern.matches(emailRegexp, "@b.com"));
        System.out.println(Pattern.matches(emailRegexp, "a@b.c"));
        System.out.println(Pattern.matches(emailRegexp, ".@b..com"));
    }

    public static void ComprobarEmail2(){
        String emailRegexp = "^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        System.out.println(Pattern.matches(emailRegexp, "a@b.com"));

        System.out.println(Pattern.matches(emailRegexp, ".@b..com"));
        /*
         * [\\w-]+ Inicio del email
         * El signo + indica que debe aparecer uno o más caracteres entre corchetes.
         * \\w indica caracteres de la A ala Z tanto en mayusculas como en minusculas, digitos del 0 al 9 y el caracter _
         * Caracter -
         * Podemos sustituir el \\w por [A-Za-z0-9-_]+
         *
         * (\\.[\\w-]+)*
         * El * indica que este grupo puede aparecer cero o más veces. El email puede contener de forma opcional  un punto seguido de uno o más de los caracteres entre corchetes.
         *
         * @ indica que debe aparecer @
         *
         * [A-Za-z0-9]+ Después de la @ el email debe contener uno o más de los caracteres que aparecen entre los corchetes
         *
         * (\\.[A-Za-z0-9]+)* Seguido (opcional, 0 ó más veces) de un punto y 1 ó más de los caracteres entre corchetes
         *
         * (\\.[A-Za-z]{2,}) Seguido de un punto y al menos 2 de los caracteres que aparecen entre corchetes (final del email)
         */
    }
}
