/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetShopMaoHuaji;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Miaow extends javax.swing.JFrame {

    /**
     * Creates new form Miaow
     */
    public Miaow() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
//    private DefaultTableModel tabmode;
//    private ResultSet hasil;

    public void ResetText() {
        idbreed.setText("");
        Breed.setText("");
        Colour.setText("");
        Gender.setText("");
        Price.setText("");
    }

//    public void tampil_database() {
//        //PreparedStatement baris = koneksi_mariadb.koneksiDB().prepareStatement
//        Object[] baris = {"ID Breed", "Breed", "Colour", "Gender", "Price"};
//        tabmode = new DefaultTableModel(null, baris);
//        tabeladmin.setModel(tabmode);
//        try {
//            hasil = cat.tampilData();
//            while (hasil.next()) {
//                cat.setId_breed(hasil.getString("Id_breed"));
//                cat.setBrd(hasil.getString("Brd"));
//                cat.setcolor(hasil.getString("color"));
//                cat.setgndr(hasil.getString("gndr"));
//                cat.setPrice(hasil.getString("Price"));
//
//                String[] data = {(cat.getId_breed()), cat.getBrd(), cat.getcolor(), cat.getgndr(), cat.getPrice()};
//                tabmode.addRow(data);
//            }
//        } catch (Exception e) {
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idbreed = new javax.swing.JTextField();
        Breed = new javax.swing.JTextField();
        Colour = new javax.swing.JTextField();
        Gender = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID Breed");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 106, -1, -1));

        jLabel2.setText("Breed");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 141, -1, -1));

        jLabel3.setText("Colour");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 182, -1, -1));

        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 220, -1, -1));

        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 258, -1, -1));

        idbreed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbreedActionPerformed(evt);
            }
        });
        getContentPane().add(idbreed, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 103, 200, -1));

        Breed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreedActionPerformed(evt);
            }
        });
        getContentPane().add(Breed, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 141, 200, -1));
        getContentPane().add(Colour, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 179, 200, -1));

        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 217, 200, -1));
        getContentPane().add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 255, 200, -1));

        save.setText("SAVE");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        delete.setText("DELETE");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 302, -1, -1));

        exit.setText("Logout");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 336, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/h.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 130, 160));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/h.jpg"))); // NOI18N
        jLabel13.setText("jLabel12");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 130, 160));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/vjg.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 300, 160));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/vjg.jpg"))); // NOI18N
        jLabel7.setText("jLabel6");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 160));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/vjg.jpg"))); // NOI18N
        jLabel8.setText("jLabel6");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 300, 160));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/vjg.jpg"))); // NOI18N
        jLabel9.setText("jLabel6");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 300, 160));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/vjg.jpg"))); // NOI18N
        jLabel10.setText("jLabel6");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 300, 160));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/vjg.jpg"))); // NOI18N
        jLabel11.setText("jLabel6");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 300, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idbreedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbreedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idbreedActionPerformed

    private void BreedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BreedActionPerformed

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        ResetText();
    }//GEN-LAST:event_deleteMouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        // TODO add your handling code here:
        cat cat = new cat();
        
            try {
                cat.setId_breed(idbreed.getText());
                cat.setBrd(Breed.getText());
                cat.setcolor(Colour.getText());
                cat.setgndr(Gender.getText());
                cat.setPrice(Price.getText());

                cat.simpanData(cat.getId_breed(),cat.getBrd(),cat.getcolor(),cat.getgndr(),cat.getPrice());
                
                JOptionPane.showMessageDialog(null, "Data Succesfully Saved");
                
                dataKucing d = new dataKucing();
                d.setVisible(true);
                this.dispose();

            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "DATA SUDAH ADA");
            }
        
        
        

//        try {
//
//            PreparedStatement p = koneksi_mariadb.koneksiDB().prepareStatement(""
//                    + "insert into cat (id_breed,breed,colour,"
//                    + "gender,price) values (?,?,?,?,?)");
//            p.setString(1, idbreed.getText());
//            p.setString(2, Breed.getText().toString());
//            p.setString(3, Colour.getText().toString());
//            p.setString(4, Gender.getText().toString());
//            p.setString(5, Price.getText().toString());
//            ;
//            p.execute();
//            System.out.println("Berhasil");
//            tampil_database();
//        } catch (Exception e) {
//            System.out.println("Pesan: " + e);
//        }

    }//GEN-LAST:event_saveMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        login l = new login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_saveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Miaow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Miaow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Miaow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Miaow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Miaow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Breed;
    private javax.swing.JTextField Colour;
    private javax.swing.JTextField Gender;
    private javax.swing.JTextField Price;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JTextField idbreed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
