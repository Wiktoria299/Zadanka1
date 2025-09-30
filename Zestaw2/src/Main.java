import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    //Zad1

    public class NieparzysteLiczbyLinkedList {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj liczbę całkowitą dodatnią: ");
            int i = scanner.nextInt();

            if (i <= 0) {
                System.out.println("Podana liczba musi być dodatnia!");
                scanner.close();
                return;
            }

            LinkedList<Integer> lista = new LinkedList<>();

            for (int n = 1; i <= n; i += 2) {
                lista.add(i);
            }

            System.out.println("Liczby nieparzyste: " + lista);

        }
    }

        //Zad2
    public class SumaCiągu {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Podaj liczbę A: ");
            int A = scanner.nextInt();
            System.out.print("Podaj liczbę B (B > A): ");
            int B = scanner.nextInt();

            if (A >= B) {
                System.out.println("B musi być większe od A!");
                return;
            }


            int sumaWhile = 0;
            int i = A;
            while (i <= B) {
                sumaWhile += i;
                i++;
            }
            System.out.println("Suma (while): " + sumaWhile);


            int sumaDoWhile = 0;
            int j = A;
            do {
                sumaDoWhile += j;
                j++;
            } while (j <= B);
            System.out.println("Suma (do-while): " + sumaDoWhile);


            int sumaFor = 0;
            for (int k = A; k <= B; k++) {
                sumaFor += k;
            }
            System.out.println("Suma (for): " + sumaFor);
        }
    }
      //Zad3

    public class PotegiDwójki {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj liczbę całkowitą dodatnią: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Liczba musi być dodatnia!");
                return;
            }

            System.out.println("Potęgi liczby 2 nie większe niż " + n + ":");

            int potega = 1;
            while (potega <= n) {
                System.out.println(potega);
                potega *= 2;
            }
        }
    }
      //Zad4

    public class SumaDoZera {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int suma = 0;
            int liczba;

            System.out.println("Podawaj liczby całkowite (0 kończy wprowadzanie):");

            while (true) {
                liczba = scanner.nextInt();
                if (liczba == 0) {
                    break;
                }
                suma += liczba;
            }

            System.out.println("Suma wszystkich podanych liczb: " + suma);
        }
    }
        //zad5



    public class MinMaxSrednia {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Podawaj liczby całkowite (0 kończy wprowadzanie):");

            int liczba;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            while (true) {
                liczba = scanner.nextInt();
                if (liczba == 0) {
                    break;
                }

                if (liczba < min) min = liczba;
                if (liczba > max) max = liczba;
            }


            if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
                System.out.println("Nie wprowadzono żadnych liczb!");
            } else {
                int sumaMinMax = min + max;
                double sredniaMinMax = sumaMinMax / 2.0;

                System.out.println(sumaMinMax);
                System.out.println(sredniaMinMax);
            }
        }
    }

        //zad6

    public class ZaDuzoZaMalo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random generator = new Random();

            int wylosowana = generator.nextInt(100) + 1;
            int zgaduj;

            System.out.println("Odgadnij liczbę od 1 do 100!");

            while (true) {
                System.out.print("Podaj swoją liczbę: ");
                zgaduj = scanner.nextInt();

                if (zgaduj > wylosowana) {
                    System.out.println("Podałeś za dużą wartość");
                } else if (zgaduj < wylosowana) {
                    System.out.println("Podałeś za małą wartość");
                } else {
                    System.out.println("Gratulacje! Odgadłeś liczbę: " + wylosowana);
                    break;
                }
            }
        }
    }
             //Zad7

    public class ProstokatKonsola {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj znak wypełnienia: ");
            char znak = scanner.next().charAt(0);

            System.out.print("Podaj współrzędną x lewego górnego rogu: ");
            int x = scanner.nextInt();

            System.out.print("Podaj współrzędną y lewego górnego rogu: ");
            int y = scanner.nextInt();

            System.out.print("Podaj wysokość prostokąta (a): ");
            int a = scanner.nextInt();

            System.out.print("Podaj szerokość prostokąta (b): ");
            int b = scanner.nextInt();

            for (int i = 1; i < y; i++) {
                System.out.println();
            }

            for (int i = 0; i < a; i++) {

                for (int j = 1; j < x; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < b; j++) {
                    System.out.print(znak);
                }
                System.out.println();
            }
        }
    }
    //Zad 8

    public class Choinka {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj wysokość choinki (n > 0): ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Wysokość musi być większa od 0!");
                return;
            }


            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    //Zad9

    public class SumaICyfry {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj liczbę całkowitą: ");
            int liczba = scanner.nextInt();
            int temp = Math.abs(liczba);

            int suma = 0;
            int sumaParzyste = 0;
            int licznikParzyste = 0;
            int sumaNieparzyste = 0;
            int licznikNieparzyste = 0;

            while (temp > 0) {
                int cyfra = temp % 10;
                suma += cyfra;

                if (cyfra % 2 == 0) {
                    sumaParzyste += cyfra;
                    licznikParzyste++;
                } else {
                    sumaNieparzyste += cyfra;
                    licznikNieparzyste++;
                }

                temp /= 10;
            }

            System.out.println("Suma cyfr liczby: " + suma);

            if (licznikParzyste == 0 || licznikNieparzyste == 0) {
                System.out.println("Nie można obliczyć stosunku średnich (brak cyfr parzystych lub nieparzystych)");
            } else {
                double sredniaParzyste = (double) sumaParzyste / licznikParzyste;
                double sredniaNieparzyste = (double) sumaNieparzyste / licznikNieparzyste;
                double stosunek = sredniaParzyste / sredniaNieparzyste;

                System.out.println("Średnia cyfr parzystych: " + sredniaParzyste);
                System.out.println("Średnia cyfr nieparzystych: " + sredniaNieparzyste);
                System.out.println("Stosunek średniej cyfr parzystych do średniej cyfr nieparzystych: " + stosunek);
            }
        }
    }
        //Zad10

    public class Dzielniki {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj liczbę całkowitą: ");
            int n = scanner.nextInt();

            System.out.print("Dzielniki liczby " + n + ": ");

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
                    //Zad11

    public class LiczbaPierwsza {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj liczbę całkowitą większą od 1: ");
            int n = scanner.nextInt();

            if (n <= 1) {
                System.out.println("Liczba musi być większa od 1!");
                return;
            }

            boolean pierwsza = true;


            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    pierwsza = false;
                    break;
                }
            }

            if (pierwsza) {
                System.out.println(n + " jest liczbą pierwszą.");
            } else {
                System.out.println(n + " nie jest liczbą pierwszą.");
            }
        }
    }


}


