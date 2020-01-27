package com.AdventOfCode3;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static ArrayList<Integer[]> MacierzKabla(String[] literki, String[] cyferki){

        ArrayList<Integer[]> skrzynka = new ArrayList<>();
        int pozycjaX = 0;
        int pozycjaY = 0;

        int i=0;
        int j=0;
        while (i<literki.length){

            switch (literki[i]){
                case "R":
                    int prawoSkret = Integer.parseInt(cyferki[i]);
                    for (int r=0; r<prawoSkret; r++){
                        Integer[] doWpisania = {pozycjaX, pozycjaY};
                        skrzynka.add(j, doWpisania);
                        pozycjaX += 1;
                        j++;
                    }
                    i++;
                    break;

                case "L":
                    int lewoSkret = Integer.parseInt(cyferki[i]);
                    for (int r=0; r<lewoSkret; r++){
                        Integer[] doWpisania = {pozycjaX, pozycjaY};
                        skrzynka.add(j, doWpisania);
                        pozycjaX -= 1;
                        j++;
                    }
                    i++;
                    break;

                case "D":
                    int doloSkret = Integer.parseInt(cyferki[i]);
                    for (int r=0; r<doloSkret; r++){
                        Integer[] doWpisania = {pozycjaX, pozycjaY};
                        skrzynka.add(j, doWpisania);
                        pozycjaY += 1;
                        j++;
                    }
                    i++;
                    break;

                case "U":
                    int goroSkret = Integer.parseInt(cyferki[i]);
                    for (int r=0; r<goroSkret; r++){
                        Integer[] doWpisania = {pozycjaX, pozycjaY};
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

//        String [] penisLiterki = new String[]{"R","U","L","U","L","D","L","D","R"};
//        String [] penisCyferki = new String[]{"10","10","10","30","10","30","10","10","10"};
//
//        String [] wPrawoO5L = new String[]{"R"};
//        String [] wPrawoO5C = new String[]{"5"};

        ArrayList<Integer[]> wynikKabel1 = MacierzKabla(kabel1Literki, kabel1Cyferki);
        ArrayList<Integer[]> wynikKabel2 = MacierzKabla(kabel2Literki, kabel2Cyferki);

//        wynikKabel1.retainAll(wynikKabel2);

        ArrayList<Integer[]> czescWspolna = new ArrayList<>();

        for (Integer[] elementA : wynikKabel1) {
            for (Integer[] elementB : wynikKabel2)
            if (Arrays.equals(elementA, elementB)){
                czescWspolna.add(elementA);
            }
        }

        ArrayList<Integer> sumy = new ArrayList<>(czescWspolna.size());
        for (Integer[] element : czescWspolna){
            int suma = Math.abs(element[0]) + Math.abs(element[1]);
            if (suma != 0) {
                sumy.add(suma);
            }
        }


        int min = Collections.min(sumy);
        System.out.println(min);

//       for (Integer[] iterator : czescWspolna){
//           System.out.println(Arrays.toString(iterator));
//       }


    }
}
