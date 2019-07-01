package jvm1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        boolean isWorking = true;

        while (isWorking) {
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("sto") || line.equalsIgnoreCase("100")) {
                isWorking = false;
                continue;
            }
            System.out.println("Hello World!");

        }
        System.out.println("Tadaaaaa!");


    }
}
