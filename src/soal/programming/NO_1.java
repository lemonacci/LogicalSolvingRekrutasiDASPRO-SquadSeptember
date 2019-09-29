/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.programming;

import java.util.Scanner;

/**
 *
 * @author JombloeKamoeNax
 */
public class NO_1 {

    public static void main(String[] args) {
        Scanner aw = new Scanner(System.in);
        int pertama;
        int kedua;

        System.out.println("Input Faktor Persekutuan  2 Bilangan");
        System.out.print("Angka Pertama   : ");
        pertama = aw.nextInt();
        System.out.print("Angka kedua     : ");
        kedua = aw.nextInt();

        System.out.print("Faktor dari " + pertama + " : ");
        for (int i = 1; i <= pertama; i++) {
            if (pertama % i == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println("");
        System.out.print("Faktor dari " + kedua + " : ");
        for (int i = 1; i <= kedua; i++) {
            if (kedua % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.print("Faktor Persekutuan Bilangan " + pertama + " dan " + kedua + " : ");
        if (pertama > kedua) {
            for (int i = 1; i <= pertama; i++) {
                if (pertama % i == 0 && kedua % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        if (pertama < kedua) {
            for (int i = 1; i <= kedua; i++) {
                if (pertama % i == 0 && kedua % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println("");
    }

}
