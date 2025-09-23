import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Zad1
        System.out.println("Wpisujemy");
        double stopnieCelcjusza, stopnieFahrenheita;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj stopnie Celcjusza:");
        stopnieCelcjusza = scaner.nextDouble();
        stopnieFahrenheita = 1.8 * stopnieCelcjusza + 32;
        System.out.println("Stopnie Fahrenheita" + stopnieFahrenheita);


        //Zad2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę:");
        int a = scanner.nextInt();
        System.out.print("Podaj drugą liczbę:");
        int b = scanner.nextInt();
        System.out.print("Podaj trzecią liczbę:");
        int c = scanner.nextInt();
        int max = Math.max(a,Math.max (b,c));
        int min = Math.min(a,Math.min (b,c));
        System.out.print("Największa liczba to:" + max);
        System.out.print("Najmniejsza liczba to:" + min);


        //Zad3

        double waga = 70;     // kg
        double wzrost = 1.75; // m
        double bmi = waga / (wzrost * wzrost);
        System.out.printf("Twoje BMI: %.2f\n", bmi);
        if (bmi < 18.5) {
        System.out.println("Niedowaga");
        } else if (bmi <= 24.9) {
        System.out.println("Waga prawidłowa");
        } else {
        System.out.println("Nadwaga");
        }


        //Zad4
        Scanner scannner = new Scanner(System.in);
        System.out.print("Podaj dochód w zł: ");
        double dochod = scanner.nextDouble();
        double podatek;
        if (dochod <= 85528) {
            podatek = dochod * 0.18 - 556.02;
        } else {
            podatek = 14839.02 + (dochod - 85528) * 0.32;
        }
        if (podatek < 0) {
            podatek = 0;
        }
        System.out.printf("Należny podatek: %.2f zł\n", podatek);


        //Zad5
        double cena = 2000;
        int liczbaRat = 12;
        double oprocentowanie = (liczbaRat <= 12) ? 0.025 :
        (liczbaRat <= 24) ? 0.05 : 0.10;
        double rata = cena * (1 + oprocentowanie) / liczbaRat;
        System.out.printf("Miesięczna rata: %.2f zł\n", rata);


        //Zad6
        double d = 10;
        double e = 5;
        char operacja = '/';
        switch (operacja) {
        case '+': System.out.println(d + e); break;
        case '-': System.out.println(d - e); break;
        case '*': System.out.println(d * e); break;
        case '/':
        if (e == 0) System.out.println("Błąd: dzielenie przez zero!");
        else System.out.println(d / e);
        break;
        default: System.out.println("Błędny symbol działania!");
        }


    }
}