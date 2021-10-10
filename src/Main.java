import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        // OPERATORY ARYTMETYCZNE
        // OPERATORY LOGICZNE
        boolean a = false;
        boolean b = true;
        boolean c = false;

        // AND - iloczyn logiczny
        System.out.println("\nOR - iloczyn logiczny");
        System.out.println(" a && b = " + (a&&b));
        System.out.println(" a && c = " + (a&&c));
        System.out.println(" c && b = " + (c&&b));


        // OR - różnica logiczna
        System.out.println("\nOR - różnica logiczna");
        System.out.println(" a || b = " + (a||b));
        System.out.println(" a || c = " + (a||c));
        System.out.println(" c || b = " + (c||b));
        System.out.println(" true || b = " + (true ||b));


        //NOT - zaprzeczenie
        System.out.println("\nNOT - zaprzeczenie");
        System.out.println(" !a = " + !a);
        System.out.println(" !b = " + !b);


        // łączenie operatorów
        System.out.println("\nLączenie operatorów");
        System.out.println("!(a || c) = " + !(a||c));
        System.out.println("!(a || b) && (!b && a) = " + (!(a || b) && (!b && a)));


        //operatory porównania
        int x = 1;
        int y = 9;
        int z = 1;

        // porównanie
        System.out.println("\nPorównanie");
        System.out.println("x == y : " + (x==y));
        System.out.println("x == z : " + (x==z));

        // nierówność
        System.out.println("\nNierówność");
        System.out.println("x != y : " + (x!=y));
        System.out.println("x != z : " + (x!=z));


        // pozostałe operatory
        System.out.println("\nPozostałe operatory");
        System.out.println("x > y : " + (x>y));
        System.out.println("x < z : " + (x<z));
        System.out.println("y <= z : " + (y<=z));

        System.out.println("(x || y) && (a > b) : " +((x >= y) && (a || b)));
        System.out.println("(!x && y) && (a <= c) : " +((-x >= y) && (!a && c)));



    }
}
