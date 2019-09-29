/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.programming;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JombloeKamoeNax
 */
public class NO_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data, data2;
        System.out.println("Aplikasi menentukan Best Second");
        System.out.print("Total Data : ");
        data = input.nextInt();
        System.out.println("");
        int[] angka = new int[data];
        for (int i = 0; i < data; i++) {
            System.out.print("Angka ke-" + (i + 1) + " : ");
            angka[i] = input.nextInt();
        }
        System.out.println("");
        Arrays.sort(angka);
        boolean running = true;
        int j = data;
        while (running) {
            if (j == 1) {
                System.out.println("Best Second : Tidak Ada");
                running = false;
            } else if (angka[j - 1] <= angka[j - 2]) {
                j--;
            } else if (angka[j - 2] < angka[j - 1]) {
                System.out.println("Best Second : " + angka[j - 2]);
                running = false;
            }
        }
    }
}
