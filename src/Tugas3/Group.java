/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Nadhifah Salsabila_19650025
 */
public class Group {
    String group;
    int anggota;
}

class GroupRun {

    public static void main(String[] args) {
        Group[] Group = new Group[5];
        for (int i = 0; i < 5; i++) {
            Group[i] = new Group();
       }
        Group[0].group = "EXO";
        Group[1].group = "NCT";
        Group[2].group = "RED VELVET";
        Group[3].group = "SUPER JUNIOR";
        Group[4].group = "GIRL'S GENERATION";

        Group[0].anggota = 9;
        Group[1].anggota = 23;
        Group[2].anggota = 5;
        Group[3].anggota = 13;
        Group[4].anggota = 9;

        for (int i = 0; i < 5; i++) {
            System.out.print("Group " + Group[i].group);
            System.out.println(" memiliki " 
                  + Group[i].anggota + " anggota");

        }
    }
}
