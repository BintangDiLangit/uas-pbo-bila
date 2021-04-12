/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetShopMaoHuaji;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class koneksi_mariadb {

    private static Connection mysqlkonek;

    public static Connection koneksiDB() throws SQLException {
        if (mysqlkonek == null) {
            try {
                String DB = "jdbc:mysql://localhost/pboBila"; // tokobuku database
                String user = "root"; // user database
                String pass = ""; // password database
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkonek = (Connection) DriverManager.getConnection(DB, user, pass);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal");
            }
        }
        return mysqlkonek;
    }
}
