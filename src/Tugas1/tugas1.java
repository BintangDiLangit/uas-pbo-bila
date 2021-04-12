/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
// class
public class tugas1 {

    //main method
    public static void main(String[] args) {
        System.out.println("~~~ Penghitung Berat Badan Ideal ~~~"); //prolog
        int a = 1; //deklarasi a
        for (int b = 0; b < a; b++) {//perulangan for
            Scanner Ideal = new Scanner(System.in);//deklarasi scanner 
            System.out.print("Masukkan Berat badan : ");
            Double BB = Ideal.nextDouble(); //deklarasi x (BeratBadan)
            System.out.print("Masukkan Tinggi Badan (dalam satuan meter) : ");
            Double TB = Ideal.nextDouble(); // deklarasi y (Tinggibadan)
            Double total = BB / (TB * 2); //deklarasi total rumus BB Ideal
            System.out.println("Total = " + total);

            if (total < 18.5) { //percabangan if
                System.out.println("Kurus");
            } else if (total >= 18.5 && total <= 24.9) { //percabangan else if
                System.out.println("Normal");
            } else if (total >= 25 && total <= 29.9) { //percabangan else if
                System.out.println("Overweight");
            } else if (total >= 30) { //percangan else if
                System.out.println("Obesitas");

            }
        }
    }
}
