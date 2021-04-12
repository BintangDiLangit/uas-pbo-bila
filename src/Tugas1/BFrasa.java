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

public class BFrasa { //class
    
    public static void main(String[] args) { //mainmethod
        //list barang bayi
        String[] listBrgBayi = {"BotolSusu", "Grito", "Popok", "Bedong",
            "Bjbayi"};
        //list barang ibu hamil
        String[] listBrgBumil = {"GritoIbu", "Korset", "BjBumil", "PompaAsi",
            "MamaPad"};
        //list barang perlengkapan bayi
        String[] listPrlngBayi = {"BtlMenyusui", "TasBayi", "KKBayi", "KsrBayi",
            "BakBayi"};
        
        //mencari banyak kata pada setiap list    
        int listbrgbayi = listBrgBayi.length;//mencari banyak kata pada listbrgbayi
        int listbrgbumil = listBrgBumil.length;//mencari banyak kata pada listbrgbumil
        int listprlngbayi = listPrlngBayi.length;//mencari banyak kata pada listprlngbayi
        
        //mengacak kata mnggunakan Math.random
        int randomBrgBayi = (int) (Math.random() * listbrgbayi);//mengacak kata pada listbrgbayi
        int randomBrgBumil = (int) (Math.random() * listbrgbumil);//mengacak kata pada listbrgbumil
        int randomPrlngBayi = (int) (Math.random() * listprlngbayi);//mengacak kata pada listprlngbayi

        //mencetak frasa pada output
        System.out.println("Saya Ingin Membeli " + listBrgBayi[randomBrgBayi]
                + " " + listBrgBumil[randomBrgBumil]
                + " " + listPrlngBayi[randomPrlngBayi]);

    }
}
