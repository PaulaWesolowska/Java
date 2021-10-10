import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj swój wiek: ");
        int age = scan.nextInt();
        int result = age % 3;

        if (result == 0){
            System.out.println("Podzielny przez 3");
        } else{
            System.out.println("Niepodzielny przez 3");
        }



        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        System.out.print("Podaj numer indeksu: ");
        int indeks = scan.nextInt();
        int resultIndeks = (indeks % 2 == 0 ? 0 : 1);

        if (resultIndeks == 0){
            System.out.println("Numer jest podzielny przez 2");
        } else{
            System.out.println("Numer indeksu jest niepodzielny przez 2");
        }


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        System.out.print("Podaj liczbę: ");
        double a = scan.nextInt();

        if (a < 13) {
            System.out.println("Podana liczba jest < 13");
        } else if (a == 17){
            System.out.println("Podana liczba jest równa 17");
        } else if (a < -13) {
            System.out.println("Podana liczba jest > 35");
        } else {
            System.out.println("Wykonał się else, więc liczba: " + a + " jest !17, > 13 i < 35");
        }
    }


}
