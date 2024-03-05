package org.vpa;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ukazCoVTebeJe("Lamborghini", str -> System.out.println("Sportiak '" + str + "' zvladne stovku za 2.8[s]") );
        ukazCoVTebeJe("Felicia", str -> System.out.println("Sportiak '" + str + "' zvladne... pockat?!! " + str + " predsa nie je sportiak") );
        ukazCoVTebeJe("Bugatti", str -> {
            int a = 0;
            int b = 100;
            System.out.println("Sportiak '" + str + "' sa moze pochvalit zrychlenim z" + a + " na " + b + " za 2.5[s]!");
        });
    }

    static void ukazCoVTebeJe(String znacka, SportoveAuta sportiak) {
        sportiak.zrychliZ0na100(znacka);
    }
}

