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
public class Bola {

    private double jariling;
    private double π;

    public void setr(double jariling) {
        this.jariling = jariling;
    }

    public void setπ(double pi) {
        this.π = pi;
    }

    public double getVolumeB() {
        double volume = 4 / 3 * π * jariling * jariling * jariling;
        System.out.println("V Bola = " + volume);
        return volume;
    }
}
