import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */

        //przykład a
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj swoje imię: ");
        String firstName = scan.next();
        System.out.print("Podaj swoje nazwisko: ");
        String lastName = scan.next();
        System.out.print("Podaj swój wiek: ");
        int age = scan.nextInt();
        System.out.print("Podaj numer indeksu: ");
        int indexNumber = scan.nextInt();
        // przykład b
        System.out.println("Twoje imię to: "+ firstName+", Twoje nazwisko to: "+lastName+",");
        System.out.printf("Twój wiek: " + age+ ", nr indeksu: "+ indexNumber + ".");


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
         */

        System.out.println("Podaj liczbę a: ");
        int a = scan.nextInt();
        System.out.println("Podaj liczbę b: ");
        int b = scan.nextInt();

        int Result1 = a+b;
        System.out.println(a +" + " + b + " = " + Result1);
        int Result2 = a-b;
        System.out.println(a +" - " + b + " = " + Result2);
        int Result3 = a*b;
        System.out.println(a +" * " + b + " = " + Result3);
        int Result4 = a/b;
        System.out.println(a +" / " + b + " = " + Result4);
        int Result5 = a%b;
        System.out.println(a +" % " + b + " = " + Result5);
    }
}
