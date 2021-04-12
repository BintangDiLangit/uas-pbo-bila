/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

/**
 *
 * @author BILA
 */
public class AnimalApp {

    public static void main(String[] args) {
        System.out.println("====================");
        Animal[] a = new Animal[6];
        a[0] = new Hippo();
        a[1] = new Lion();
        a[2] = new Tiger();
        a[3] = new Cat();
        a[4] = new Dog();
        a[5] = new Wolf();

        for (int i = 0; i < a.length; i++) {
            a[i].makenoise();
            a[i].eat();
            a[i].sleep();
            a[i].roam();
            System.out.println("====================");
        }
    }
}
