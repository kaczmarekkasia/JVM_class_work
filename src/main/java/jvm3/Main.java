package jvm3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Plansza p = new Plansza();

        while (!p.jestKompletna()){
            p.wypisz();
            try{
                int numerKomórki = scanner.nextInt();
                p.zaznacz(numerKomórki);
            } catch (InputMismatchException ime){
                scanner.nextLine();
            }
        }
        p.wypisz();
    }
}
