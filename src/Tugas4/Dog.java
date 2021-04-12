/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author Nadhifah Salsabila_19650025
 */
public class Dog {
    int size;
    String name;
    
    void bark(){
        if (size > 60){
            System.out.println("Woof !! Woof !!");
        }else if (size > 14){
            System.out.println("Ruff !! Ruff !!");
        }else{
            System.out.println("Kaing !! Kaing !!");
        }
    }
}
