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
public class NO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Ukuran, spasi = 0, spasi2 = 0;
        String Isi;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Ukuran : ");
        Ukuran = input.nextInt();
        System.out.print("Masukkan Isi Jam Pasir : ");
        Isi = input.next();

        // part atas ke tengah
        for (int i = 1; i < Ukuran + 1; i++) {
            System.out.print("|");
            for (int l = 0; l < spasi + 1; l++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            if (i < Ukuran) {
                for (int j = i; j < Ukuran; j++) {
                    System.out.print(Isi);
                    System.out.print(Isi);
                }
            } else {
                System.out.print("");
                System.out.print("");
            }

            System.out.print("/");
            for (int j = 0; j < spasi + 1; j++) {
                System.out.print(" ");
            }
            spasi++;
            System.out.print("|");
            System.out.println("");
        }
        // part tengah ke bawah
        for (int i = Ukuran; 1 <= i; i--) {
            System.out.print("|");
            for (int l = 0; l < spasi; l++) {
                System.out.print(" ");
            }
            System.out.print("/");
            if (i < Ukuran) {
                for (int j = i; j < Ukuran; j++) {
                    System.out.print(Isi);
                    System.out.print(Isi);
                }
            } else {
                System.out.print("");
                System.out.print("");
            }

            System.out.print("\\");
            for (int j = 0; j < spasi; j++) {
                System.out.print(" ");
            }
            spasi--;
            System.out.print("|");
            System.out.println("");
        }

    }
}
