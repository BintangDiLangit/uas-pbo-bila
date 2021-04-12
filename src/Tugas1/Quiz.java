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
public class Quiz {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {
            y = y + 2;
            if (y > 4) {
                y = y - 1;
            }
            System.out.println(x + "" + y + "");
            x = x + 1;
        }
    }
}
