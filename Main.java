package com.AdventOfCode3;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static int NajmniejszaLiczbaKrokow(ArrayList<PasujeDoArreja> czescWspolna,
                                              ArrayList<PasujeDoArreja> kabel1,
                                              ArrayList<PasujeDoArreja> kabel2){

        int liczbaKrokow;
        int i = 0;

        ArrayList<Integer> odleglosciDoSkrzyzowan = new ArrayList<>(czescWspolna.size());

        for (PasujeDoArreja element : czescWspolna){

            int indeksK1;
            int indeksK2;
            indeksK1 = kabel1.indexOf(element);
            indeksK2 = kabel2.indexOf(element);

            if ((indeksK1 != 0) & (indeksK2!=0)) {
                odleglosciDoSkrzyzowan.add(i, indeksK1 + indeksK2);
                i++;
            }
        }

        liczbaKrokow = Collections.min(odleglosciDoSkrzyzowan);


        return liczbaKrokow;
    }

    public static ArrayList<PasujeDoArreja> MacierzKabla(String[] literki, String[] cyferki){

        ArrayList<PasujeDoArreja> skrzynka = new ArrayList<>();
        int pozycjaX = 0;
        int pozycjaY = 0;

        int i=0;
        int j=0;
        while (i<literki.length){

            switch (literki[i]){
                case "R":
                    int prawoSkret = Integer.parseInt(cyferki[i]);
                    for (int r=0; r<prawoSkret; r++){
                        PasujeDoArreja doWpisania = new PasujeDoArreja();
                        doWpisania.setWartoscX(pozycjaX);
                        doWpisania.setWartoscY(pozycjaY);
                        skrzynka.add(j, doWpisania);
                        pozycjaX += 1;
                        j++;
                    }
                    i++;
                    break;

                case "L":
                    int lewoSkret = Integer.parseInt(cyferki[i]);
                    for (int r=0; r<lewoSkret; r++){
                        PasujeDoArreja doWpisania = new PasujeDoArreja();
                        doWpisania.setWartoscX(pozycjaX);
                        doWpisania.setWartoscY(pozycjaY);
                        skrzynka.add(j, doWpisania);
                        pozycjaX -= 1;
                        j++;
                    }
                    i++;
                    break;

                case "D":
                    int doloSkret = Integer.parseInt(cyferki[i]);
                    for (int r=0; r<doloSkret; r++){
                        PasujeDoArreja doWpisania = new PasujeDoArreja();
                        doWpisania.setWartoscX(pozycjaX);
                        doWpisania.setWartoscY(pozycjaY);
                        skrzynka.add(j, doWpisania);
                        pozycjaY += 1;
                        j++;
                    }
                    i++;
                    break;

                case "U":
                    int goroSkret = Integer.parseInt(cyferki[i]);
                    for (int r=0; r<goroSkret; r++){
                        PasujeDoArreja doWpisania = new PasujeDoArreja();
                        doWpisania.setWartoscX(pozycjaX);
                        doWpisania.setWartoscY(pozycjaY);
                        skrzynka.add(j, doWpisania);
                        pozycjaY -= 1;
                        j++;
                    }
                    i++;
                    break;
            }
        }
        return skrzynka;
    }

    public static void main(String[] args) throws IOException {

        Path kabel1 = Paths.get("/Users/daab/IdeaProjects/AdventOfCode3/src/com/AdventOfCode3/kabel1.txt");
        Path kabel2 = Paths.get("/Users/daab/IdeaProjects/AdventOfCode3/src/com/AdventOfCode3/kabel2.txt");
        String [] kabel1Literki = new String[301];
        String [] kabel1Cyferki = new String[301];
        String [] kabel2Literki = new String[301];
        String [] kabel2Cyferki = new String[301];

        try (Scanner sc = new Scanner(kabel1)){
            sc.useDelimiter(",|$");
            int i=0;
            while ( sc.hasNext() & i<kabel1Literki.length) {
                String token = sc.next();
                String literka = token.substring(0, 1);
                String cyferka = token.substring(1);
                Array.set(kabel1Literki, i, literka);
                Array.set(kabel1Cyferki, i, cyferka);
                i++;
            }
        }

        try (Scanner sc = new Scanner(kabel2)){
            sc.useDelimiter(",|$");
            int i=0;
            while ( sc.hasNext() & i<kabel2Literki.length) {
                String token = sc.next();
                String literka = token.substring(0, 1);
                String cyferka = token.substring(1);
                Array.set(kabel2Literki, i, literka);
                Array.set(kabel2Cyferki, i, cyferka);
                i++;
            }
        }

        ArrayList<PasujeDoArreja> wynikKabel1 = MacierzKabla(kabel1Literki, kabel1Cyferki);
        ArrayList<PasujeDoArreja> wynikKabel2 = MacierzKabla(kabel2Literki, kabel2Cyferki);
        ArrayList<PasujeDoArreja> czescWspolna = new ArrayList<>(wynikKabel1);


        czescWspolna.retainAll(wynikKabel2);


        ArrayList<Integer> sumy = new ArrayList<>(czescWspolna.size());
        for (PasujeDoArreja element : czescWspolna){
            int suma = Math.abs(element.getWartoscX()) + Math.abs(element.getWartoscY());
            if (suma != 0)
                sumy.add(suma);
        }


        int min = Collections.min(sumy);
        System.out.println("Najblizsze skrzyzowanie " + min);

        System.out.println("Najmniejsza liczba krokow do skrzyzowania " +
                NajmniejszaLiczbaKrokow(czescWspolna, wynikKabel1, wynikKabel2));


    }
}
