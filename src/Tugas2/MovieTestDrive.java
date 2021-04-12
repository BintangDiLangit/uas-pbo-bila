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
public class MovieTestDrive {

    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "The Captain";
        one.genre = "Disaster";
        one.rating = 6;

        Movie two = new Movie();
        two.title = "Gonjiam";
        two.genre = "Horor, Documenter";
        two.rating = 6;

        Movie three = new Movie();
        three.title = "Harry Potter";
        three.genre = "fantasi";
        three.rating = 8;
        
       one.playIt();
       two.playIt();
       three.playIt();
    }
}
