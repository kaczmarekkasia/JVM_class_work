package jvm2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer iloscObiegow;

        if (args.length >= 1) {
            iloscObiegow = Integer.parseInt(args[0]);
        } else {
            iloscObiegow = null;
        }

        while(iloscObiegow == null){
            System.out.println("podaj liczbę");

            try{
                int  liczba = scanner.nextInt();
                iloscObiegow = liczba;
            } catch (InputMismatchException ime){
                System.out.println("To nie jest liczba!");
                scanner.nextLine();
            }
        }

        for (int i=0; i < iloscObiegow; i++){
            System.out.println("Hello World!");

        }



    }
}
