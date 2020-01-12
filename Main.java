package com.AdventOfCode3;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {


    public static int[][] MacierzKabla(String[] literki, String[] cyferki){

        int[] skrzynkaX = new int[100000];
        int[] skrzynkaY = new int[100000];
        int pozycjaX = 0;
        int pozycjaY = 0;

        int i=0;
        int j=0;
        while (i<literki.length){

            switch (literki[i]){
                case "R":
                    System.out.println("Iteracja: "+i);
                    int prawoSkret = Integer.parseInt(cyferki[i]);
                    for (int r=0; r<prawoSkret; r++){
                        skrzynkaX[j] = pozycjaX;
                        skrzynkaY[j] = pozycjaY;
                        pozycjaX += 1;
                        j++;
                    }
                    i++;
                    break;

                case "L":
                    System.out.println("Iteracja: "+i);
                    int lewoSkret = Integer.parseInt(cyferki[i]);
                    for (int r=0; r<lewoSkret; r++){
                        skrzynkaX[j] = pozycjaX;
                        skrzynkaY[j] = pozycjaY;
                        pozycjaX -= 1;
                        j++;
                    }
                    i++;
                    break;

                case "D":
                    System.out.println("Iteracja: "+i);
                    int doloSkret = Integer.parseInt(cyferki[i]);

                    for (int r=0; r<doloSkret; r++){
                        skrzynkaX[j] = pozycjaX;
                        skrzynkaY[j] = pozycjaY;
                        pozycjaY += 1;
                        j++;
                    }
                    i++;
                    break;

                case "U":
                    System.out.println("Iteracja: "+i);
                    int goroSkret = Integer.parseInt(cyferki[i]);

                    for (int r=0; r<goroSkret; r++){
                        skrzynkaX[j] = pozycjaX;
                        skrzynkaY[j] = pozycjaY;
                        pozycjaY -= 1;
                        j++;
                    }
                    i++;
                    break;

            }

        }

        int[][] calaSkrzynka = new int[skrzynkaX.length][skrzynkaY.length];


        return calaSkrzynka;
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
//
//        int[] wynik = MacierzKabla(wPrawoO5L, wPrawoO5C);
//
//
//
//        for (int i=0; i<wynik.length; i++){
//            System.out.println(Arrays.toString(wynik[0])+Arrays.toString(wynik[1]));
//        }


    }
}
