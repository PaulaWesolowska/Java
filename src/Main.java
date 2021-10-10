import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        char varChar = 'a';
        System.out.println("Zmienna char: " + varChar);
        String varString = "Przykładowy String";
        System.out.println("Zmienna String: " + varString);
        byte varByte = 34;
        System.out.println("Zmienna byte: " + varByte);
        short varShort = 9876;
        System.out.println("Zmienna short: " + varShort);
        short varInt = 9876;
        System.out.println("Zmienna int: " + varInt);
        short varLong = 9876;
        System.out.println("Zmienna long: " + varLong);
        short varFloat = 9876;
        System.out.println("Zmienna float: " + varFloat);
        short varDouble = 9876;
        System.out.println("Zmienna double: " + varDouble);
        short varBoolean = 9876;
        System.out.println("Zmienna boolean: " + varBoolean);
        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */
// przykład A
        int a = 333;
        int b = 3;

        int ResultOfAdding = a + b;
        System.out.println(a + " + " + b + " = " + ResultOfAdding);
        int ResultOfSubstraction = a-b;
        System.out.println(a + " - " + b + " = " + ResultOfSubstraction);
        int ResultOfMultiplication = a*b;
        System.out.println(a + " * " + b + " = " + ResultOfMultiplication);
        int ResultOfDivision = a/b;
        System.out.println(a + " / " + b + " = " + ResultOfDivision);

// przyład B
        double x = 333;
        double y = 3;

        double ResultOfAdding2 = x + y;
        System.out.println(x + " + " + y + " = " + ResultOfAdding2);
        double ResultOfSubstraction2 = x-y;
        System.out.println(x + " - " + y + " = " + ResultOfSubstraction2);
        double ResultOfMultiplication2 = x*y;
        System.out.println(x + " * " + y + " = " + ResultOfMultiplication2);
        double ResultOfDivision2 = x/y;
        System.out.println(x + " / " + y + " = " + ResultOfDivision2);


    }
}
