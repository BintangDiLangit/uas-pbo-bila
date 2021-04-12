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
public class Tabung {

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

    public double getVolumeT() {
        double volume = π * jariling * jariling * tinggi;
        System.out.println("V Tabung = " + volume);
        return volume;
    }
}
