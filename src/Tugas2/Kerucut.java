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
public class Kerucut {
     private double jariling;
    private double tinggi;
    private double π;

    public void setr(double jariling) {
        this.jariling = jariling;
    }

    public void sett(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setπ(double pi) {
        this.π = pi;
    }

    public double getVolumeK() {
        double volume = 1/3 * π * jariling * jariling * tinggi;
        System.out.println("V Kerucut = " + volume);
        return volume;
    }
}
