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
public class NO_5 {

    public static void main(String[] args) {
        double speed;
        int speed2, point;
        Scanner input = new Scanner(System.in);
        System.out.println("======== Speed Limit ========");
        System.out.print("Speed : ");
        speed = input.nextDouble();
        if (speed < 70) {
            System.out.println("Ok.");
        } else if (70 <= speed && speed < 130) {
            speed2 = (int) speed - 70;
            point = speed2 / 5;
            System.out.println("Point : " + point);
        } else {
            System.out.println("License Suspended");
        }

    }
}
