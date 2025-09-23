import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wpisujemy");
        double stopnieCelcjusza, stopnieFahrenheita;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj stopnie Celcjusza:");
        stopnieCelcjusza = scaner.nextDouble();
        stopnieFahrenheita = 1.8 * stopnieCelcjusza + 32;
        System.out.println("Stopnie Fahrenheita" + stopnieFahrenheita);
    }
}