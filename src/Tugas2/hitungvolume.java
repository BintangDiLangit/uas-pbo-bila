/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Nadhifah Salsabila_19650025
 */
public class hitungvolume {

    public static void main(String[] args) {

        Tabung volumeT = new Tabung();
        volumeT.setr(21);
        volumeT.sett(30);
        volumeT.setπ(22 / 7);
        volumeT.getVolumeT();

        Bola volumeB = new Bola();
        volumeB.setr(3);
        volumeB.setπ(3.14);
        volumeB.getVolumeB();
    }
}
