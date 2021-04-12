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
public class Dog {

    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Ciko";

        Dog[] anjing = new Dog[3];
        anjing[0] = new Dog();
        anjing[1] = new Dog();
        anjing[2] = dog1;

        anjing[0].name = "Dalma";
        anjing[1].name = "Doggy";

        System.out.println("nama anjing terakhir");
        System.out.println(anjing[2].name);

        int x = 0;
        while (x < anjing.length) {
            anjing[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " Bersuara guk-guk!!!");
    }
}
