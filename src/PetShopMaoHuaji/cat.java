package PetShopMaoHuaji;

import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class cat extends Mao {

    private String id_breed;
    private String breed;
    private String colour;
    private String gender;
    private String price;

    public String getId_breed() {
        return id_breed;
    }

    public void setId_breed(String id_breed) {
        this.id_breed = id_breed;
    }

    public String getBrd() {
        return breed;
    }

    public String getcolor() {
        return colour;
    }

    public String getgndr() {
        return gender;
    }

    public String getPrice() {
        return price;
    }

    public void setBrd(String breed) {
        this.breed = breed;
    }

    public void setcolor(String colour) {
        this.colour = colour;
    }

    public void setgndr(String gender) {
        this.gender = gender;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public ResultSet tampilData() {
        query = "select*from cat";
        try {
            statement = koneksi.createStatement();
            hasil = statement.executeQuery(query);
        } catch (Exception e) {
        }
        return hasil;
    }

    // @Override // diwariskan dari superclass
    @Override
    public void simpanData(String id_breed, String breed, String colour, 
            String gender, String price) { // behavior
        query = "insert into cat values (?,?,?,?,?)";
        try {
            prepsat = koneksi.prepareStatement(query);
            prepsat.setString(1, id_breed);
            prepsat.setString(2, breed);
            prepsat.setString(3, colour);
            prepsat.setString(4, gender);
            prepsat.setString(5, price);

            prepsat.executeUpdate();
            prepsat.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

//    @Override
//    public void ubahData(String id, String nama, String no, String alamat) {
//        CRUDquery = "update customer set id=?,nama=?,no=?,alamat=?";
//        try {
//            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
//            CRUDpsmt.setString(1, id);
//            CRUDpsmt.setString(2, nama);
//            CRUDpsmt.setString(3, no);
//            CRUDpsmt.setString(4, alamat);
//
//            CRUDpsmt.executeUpdate();
//            CRUDpsmt.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    @Override
//    public void hapusData(String id) {
//        CRUDquery = "delete from customer where nama=?";
//        try {
//            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
//            CRUDpsmt.setString(1, id);
//            CRUDpsmt.executeUpdate();
//            CRUDpsmt.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//    
//    
}
