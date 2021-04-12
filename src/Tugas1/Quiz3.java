/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author HP
 */
public class Quiz3 {

    public static void main(String[] args) { //3
        int x = 3;//4
        while (x > 0) { //7
            if (x > 2) { //5
                System.out.print("a");
            }
            x = x - 1; //6
            System.out.print("-");
            if (x == 2) { //2
                System.out.print("b c");
            }
            if (x == 1) {//1
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}
