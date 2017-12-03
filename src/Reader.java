


import java.io.FileReader;

import java.io.LineNumberReader;

import java.util.ArrayList;

import java.util.Scanner;

public class Reader {
    public static void reader() throws Exception {

        LineNumberReader reader = new LineNumberReader( new FileReader( "F:/untitled/src/tablica.csv" ) );

        String line = null;
        ArrayList<String> tablica = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            tablica.add( line );
        }
        String[] tabl = tablica.toArray( new String[tablica.size()] );
        System.out.println( "  Имя     Фамилия    Возраст" );
        for (int l = 1; l < tabl.length; l++) {
            System.out.println( l + " " + tabl[l] );
        }
        String[] tabl2 = new String[tabl.length];
        System.arraycopy( tabl, 0, tabl2, 0, tabl.length );

        System.out.println( '\n' + "Введите номер строки которую хотите заменить:" );
        Scanner scanner = new Scanner( System.in );
        int vvod = scanner.nextInt();
        String type[] = tabl[vvod].split( "[,;:.!?\\s]+" );
        String type1[] = tabl2[vvod].split( "[,;:.!?\\s]+" );

        System.out.println( "На что хотите заменить" );

        System.out.println( "Введите Имя:" );
        Scanner scanner1 = new Scanner( System.in );
        String name = scanner1.nextLine();
        type[0] = name;

        System.out.println( "Введите Фамилию:" );
        Scanner scanner2 = new Scanner( System.in );

        String surname = scanner2.nextLine();
        type[1] = surname;

        System.out.println( "Введите Возраст:" );
        Scanner scanner3 = new Scanner( System.in );
        String age = scanner3.nextLine();
        type[2] = age;

        String newstr = new String();

        String named = type[0];
        String surnamed = type[1];
        String aged = type[2];
        String otmena;
        int a = 0;

        System.out.println( "Отменить изменение имени [n] " + '\n' + "Отменить изменение фамилии [s] " + '\n' + "Отменить изменение возраста [a] " + '\n' + "Продолжить[g]" + '\n' );
        while (a != 1) {

            Scanner scan1 = new Scanner( System.in );
            otmena = scan1.nextLine();
            if (otmena.equals( "g" )) {
                a = 1;
            }
            switch (otmena) {
                case "n":
                    named = type1[0];
                    break;
                case "s":
                    surnamed = type1[1];
                    break;
                case "a":
                    aged = type1[2];
                    break;

            }

        }
        String namedpr = null;
        if (named.length() == 4) namedpr = ",      ";
        if (named.length() == 5) namedpr = ",     ";
        if (named.length() == 6) namedpr = ",    ";
        if (named.length() == 7) namedpr = ",   ";
        if (named.length() == 8) namedpr = ",  ";
        if (named.length() == 9) namedpr = ", ";
        if (named.length() == 10) namedpr = ",";

        String surnamedpr=null;
        if (surnamed.length() == 4) surnamedpr = ",         ";
        if (surnamed.length() == 5) surnamedpr = ",        ";
        if (surnamed.length() == 6) surnamedpr = ",       ";
        if (surnamed.length() == 7) surnamedpr = ",      ";
        if (surnamed.length() == 8) surnamedpr = ",     ";
        if (surnamed.length() == 9) surnamedpr = ",    ";
        if (surnamed.length() == 10)surnamedpr = ",   ";
        if (surnamed.length() == 11)surnamedpr = ",  ";
        if (surnamed.length() == 12)surnamedpr = ", ";
        if (surnamed.length() == 13)surnamedpr = ",";


        newstr = named + namedpr + surnamed + surnamedpr + aged + ",";


        System.out.println( "" + newstr + '\n' );
        tabl[vvod] = newstr;
        System.out.println( "Сохранить изменения?" + '\n' + "[1] Yes" + '\n' + "[2]No" );

        Scanner scan = new Scanner( System.in );
        int vibor = scan.nextInt();

        if (vibor == 1) {
            FileUtils.write( "F:/untitled/src/output.csv", " " );

            for (int i = 0; i < tablica.size(); i++) {

                FileUtils.update( "F:/untitled/src/output.csv", tabl[i] );
            }
        }
        if (vibor == 2) {
            FileUtils.write( "F:/untitled/src/output.csv", " " );

            for (int b = 0; b < tabl2.length; b++) {

                FileUtils.update( "F:/untitled/src/output.csv", tabl2[b] );
            }
        }
    }

}
