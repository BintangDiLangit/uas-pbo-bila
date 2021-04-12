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
public class infinite {

    private String group;
    private int anggota;

    public String setgroup() {
        return group;
    }

    public int setanggota() {
        return anggota;
    }

    public void getgroup(String s) {
        group = s;
    }

    public void getanggota(int s) {
        anggota = s;
    }

    public void member() {
        if (anggota >= 23) {
            System.out.println(group + " INFINITE members");
        } else {
            System.out.println(group + " standart members");
        }
    }

    public static void main(String[] args) {
        infinite[] members = new infinite[5];
        members[0] = new infinite();
        members[1] = new infinite();
        members[2] = new infinite();
        members[3] = new infinite();
        members[4] = new infinite();

        members[0].group = "EXO";
        members[1].group = "NCT";
        members[2].group = "RED VELVET";
        members[3].group = "SUPER JUNIOR";
        members[4].group = "GIRL'S GENERATION";

        members[0].anggota = 9;
        members[1].anggota = 23;
        members[2].anggota = 5;
        members[3].anggota = 13;
        members[4].anggota = 9;

        int i = 0;
        while (i < members.length) {
            members[i].member();
            i++;
        }

    }
}
