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
public class GuessGame {

    Player P1;
    Player P2;
    Player P3;

    public void StartGame() {
        P1 = new Player();
        P2 = new Player();
        P3 = new Player();

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean P1isRight = false;
        boolean P2isRight = false;
        boolean P3isRight = false;

        int targetno = (int) (Math.random() * 10);
        System.out.println("aku mikir antara 0-9");

        while (true) {
            System.out.println("Angka yang harus ditebak : " + targetno);
            P1.guess();
            P2.guess();
            P3.guess();

            guessP1 = P1.no;
            System.out.println("pemain pertama menebak angka " + guessP1);
            guessP2 = P2.no;
            System.out.println("pemain kedua menebak angka " + guessP2);
            guessP3 = P3.no;
            System.out.println("pemain ketiga menebak angka " + guessP3);

            if (guessP1 == targetno) {
                P1isRight = true;
            }
            if (guessP2 == targetno) {
                P2isRight = true;
            }
            if (guessP3 == targetno) {
                P3isRight = true;
            }

            if (P1isRight || P2isRight || P3isRight) {
                System.out.println("Oke sudah ada pemenangnya");
                System.out.println("pemain 1 yang menang? " + P1isRight);
                System.out.println("pemain 2 yang menang? " + P2isRight);
                System.out.println("pemain 3 yang menang? " + P3isRight);
                System.out.println("Permainan Selesai");
                break;
            } else {
                System.out.println("tebak lagii dong...");
            }
        }
    }
}
