package jvm3;

/**
 *
 */

public class Plansza {
    private boolean[][] tablica;

    public Plansza() {
        tablica = new boolean[3][3];
    }

    /**
     * Metoda przyjmująca jako parametr liczbę, która wskazuje numer kolumny który zostanie
     * @param liczba
     */
    public void zaznacz(int liczba) {
        if (liczba > 9 || liczba < 1) {
            return;
        }
        int wiersz = 0, kolumna = 0;
        if (liczba >= 1 && liczba <= 3) {
            wiersz = 0;
            kolumna = liczba - 1;
        } else if (liczba >= 4 && liczba <= 6) {
            wiersz = 1;
            kolumna = liczba - 4;
        } else if (liczba >= 7 && liczba <= 9) {
            wiersz = 2;
            kolumna = liczba - 7;
        }
        tablica[wiersz][kolumna] = true;
    }

    /**
     * Metoda która wypisuje na ekran
     * #####
     * #   #
     * #   #
     * #   #
     * #####
     */

    public void wypisz() {
        StringBuilder sb = new StringBuilder();
        sb.append("#####\n");
        wypiszWiersz(sb, 0);
        wypiszWiersz(sb, 1);
        wypiszWiersz(sb, 2);
        sb.append("#####\n");
        sb.append("\n\n");
        System.out.println(sb.toString());
    }

    /**
     *
     * @param sb
     * @param row
     */

    private void wypiszWiersz(StringBuilder sb, int row) {
        sb.append("#");
        for (int i = 0; i < 3; i++) {
            if (tablica[row][i]) {
                sb.append("#");
            } else {
                sb.append(" ");
            }
        }
        sb.append("#\n");
    }

    /**
     * Metoda ta sprawdza czy tablica dwuwymiarowa boolean [3][3] została zapełniona;
     * @return boolean
     */

    public boolean jestKompletna(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if(!tablica[i][j]) return false;
            }
        }
        return true;
    }
}
