/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author Nadhifah Salsabila_19650025
 */
public class gooddogtestdrive {
    public static void main(String[] args) {
        GoodDog[] rens = new GoodDog[10];
        for (int i = 1; i < rens.length; i++) {
            rens[i]=new GoodDog();
            rens[i].setsize((int)(Math.random()*100));
        }
        for (int i = 1; i < rens.length; i++) {
            System.out.println("Dog "+i+" : "+rens[i].getsize());
            rens[i].bark();
            
        }
    }
}
