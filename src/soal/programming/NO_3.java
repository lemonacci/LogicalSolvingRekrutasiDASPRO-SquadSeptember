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
public class NO_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner aw = new Scanner(System.in);
        String P;

        int angka1 = 0;
        int angka2 = 0;
        int angka3 = 0;

        System.out.print("Persamaan   : ");

        P = aw.nextLine();

        String get1 = P.substring(0, 1);

        int satu = 1;
        if (P.length() == 6) {
            if (get1.equals("x")) {
                String get2 = P.substring(2, 3);
                String get3 = P.substring(4, 6);
                System.out.println("a   : " + satu);
                System.out.println("b   : " + get2);
                System.out.println("c   : " + get3);

                angka2 = Integer.parseInt(get2);
                angka3 = Integer.parseInt(get3);

                int hitung1 = angka3 - angka2;

                int hitung2 = hitung1 / satu;

                System.out.println("x   : " + hitung2);

            }
            if (get1.equals("-")) {
                String get2 = P.substring(1, 2);
                String get3 = P.substring(4, 6);
                System.out.println("a   : " + get1 + get2);
                System.out.println("b   : " + 0);
                System.out.println("c   : " + get3);

                angka2 = Integer.parseInt(get2);
                angka3 = Integer.parseInt(get3);

                System.out.println("x   : " + -(angka3) + "/" + angka2);

            }
            if (!get1.equals("x") && !get1.equals("-")) {
                String get2 = P.substring(2, 4);
                String get3 = P.substring(5, 6);
                String get4 = P.substring(1, 2);
                if (!get4.equals("x")) {
                    System.out.println("Format Penulisan Salah");

                } else {
                    System.out.println("a   : " + get1);
                    System.out.println("b   : " + get2);
                    System.out.println("c   : " + get3);

                    angka1 = Integer.parseInt(get1);

                    angka2 = Integer.parseInt(get2);
                    angka3 = Integer.parseInt(get3);

                    int hitung1 = angka3 - angka2;

                    int hitung2 = hitung1 / angka1;

                    System.out.println("x   : " + hitung2);
                }
            }

        }

        if (P.length() != 6) {
            System.out.println("Format Penulisan Salah");
        }

    }
}
