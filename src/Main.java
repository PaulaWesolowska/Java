import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

        // pierwszy sposób
        System.out.println("Tablica 1: ");
        double[] tab1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < tab1.length; i++) {
            System.out.println(tab1[i] + " ");
        }

        // drugi sposób
        System.out.println("Tablica 2: ");
        double[] tab2 = new double[5];
        tab2[0] = 11;
        tab2[1] = 12;
        tab2[2] = 13;
        tab2[3] = 14;
        tab2[4] = 15;
        for (int i = 0; i < tab2.length; i++) {
            System.out.println(tab2[i] + " ");
        }

        //trzeci sposób
        System.out.println("Tablica 3: ");
        double[] tab3 = new double[5];
        for (int i = 0; i < tab3.length; i++){
            tab3[i] = i + 2.5;
        }
        for (int i = 0; i < tab3.length; i++) {
            System.out.println(tab3[i] + " ");
        }
    }
}
