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
public class GoodDog {
    private int size;
    private String name;
    
    public int getsize(){
        return size;
    }
    public String getname(){
        return name;
    }
    public void setsize (int s){
        size = s;
    }
    public void setname(String s){
        name = s;
    }
    
    public void bark(){
        if (size > 60){
            System.out.println("WAOWWW!!!");
        }else if (size > 14){
            System.out.println("Meowwww!!!");
        }else{
            System.out.println("MIWWMIWW!!!");
        }
    }
}
