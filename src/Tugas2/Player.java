/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author HP
 */
public class Player {

    int no = 0;

    public void guess() {
        no = (int) (Math.random() * 10);
        System.out.println("Aku menebak angka : " + no);
    }
}
