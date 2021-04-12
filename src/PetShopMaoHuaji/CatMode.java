/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetShopMaoHuaji;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class CatMode extends javax.swing.JFrame {

    /**
     * Creates new form CatMode
     */
    public CatMode() {
        initComponents();
        this.setLocationRelativeTo(null);
        dataCombo();
    }

    public void ResetText() {
        breed.setText("");
        nama.setText("");
        notelp.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        br = new javax.swing.JLabel();
        Colour = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        breed = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        notelp = new javax.swing.JTextField();
        meong = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        idb = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        DELETE = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/vjg.jpg"))); // NOI18N
        jLabel4.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        br.setText("Breed");
        getContentPane().add(br, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 127, -1, -1));

        Colour.setText("Nama");
        getContentPane().add(Colour, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 165, -1, -1));

        Gender.setText("NoTelp");
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 203, -1, -1));
        getContentPane().add(breed, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 124, 190, -1));
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 162, 190, -1));

        notelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notelpActionPerformed(evt);
            }
        });
        getContentPane().add(notelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 200, 190, -1));

        meong.setText("MEONG");
        meong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meongMouseClicked(evt);
            }
        });
        meong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meongActionPerformed(evt);
            }
        });
        getContentPane().add(meong, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 264, -1, -1));

        jLabel2.setText("ID Breed");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 89, -1, -1));

        getContentPane().add(idb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 190, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/h.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 100, 120));

        DELETE.setText("DELETE");
        DELETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DELETEMouseClicked(evt);
            }
        });
        getContentPane().add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 264, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/h.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 230, 230, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/vjg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 280, 160));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/vjg.jpg"))); // NOI18N
        jLabel3.setText("jLabel1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 160));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/vjg.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 280, 160));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/vjg.jpg"))); // NOI18N
        jLabel6.setText("jLabel1");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 280, 160));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/vjg.jpg"))); // NOI18N
        jLabel7.setText("jLabel1");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 280, 160));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PetShopMaoHuaji/vjg.jpg"))); // NOI18N
        jLabel8.setText("jLabel1");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 280, 160));

        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notelpActionPerformed

    private void meongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meongMouseClicked
        // TODO add your handling code here:
        Cute cute = new Cute();
        if (idb.getSelectedItem().equals("") && breed.getText().trim().equals("")
                && nama.getText().trim().equals("") && notelp.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Semua Field Masih Belum Diisi !");
            idb.requestFocus();
            breed.requestFocus();
            nama.requestFocus();
            notelp.requestFocus();
        } else if (idb.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Sorry, ID Still Empty !");
            idb.requestFocus();
        } else if (breed.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Sorry, Breed Still Empty !");
            breed.requestFocus();
        } else if (nama.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Sorry, Colour Still Empty !");
            nama.requestFocus();
        } else if (notelp.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Sorry, Gender Still Empty !");
            notelp.requestFocus();
        } else {
            try {
                cute.setId_Breed(idb.getSelectedItem().toString());
                cute.setbreed(br.getText());
                cute.setnama(nama.getText());
                cute.setnotelp(notelp.getText());

                cute.SimpanData(
                        cute.getId_Breed(),
                        cute.getbreed(),
                        cute.getnama(),
                        cute.getnotelp()
                );
                JOptionPane.showMessageDialog(null, "Anda berhasil memesan");
                
                Cetak call;
                call = new Cetak(cute.getId_Breed());
                call.setVisible(true);
                dispose();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "DATA SUDAH ADA");
            }
        }
//        String id = idb.getSelectedItem().toString();
//        String br = breed.getText();
//        String nm = nama.getText();
//        String no = notelp.getText();
//
//        try {
//
//            PreparedStatement p = koneksi_mariadb.koneksiDB().prepareStatement("insert into cute values(?,?,?)");
//            p.setString(1, id);
//            p.setString(2, nm);
//            p.setString(3, no);
//
//            p.execute();
//            JOptionPane.showMessageDialog(null, "Anda berhasil memesan");
////            cetakStruk call = new cetakStruk(id, mas, kls);
////            call.setVisible(true);
////            this.dispose();
//
//        } catch (Exception e) {
//            System.out.println("Pesan: " + e);
//        }
//
    }//GEN-LAST:event_meongMouseClicked

    private void DELETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETEMouseClicked
        // TODO add your handling code here:
        ResetText();
    }//GEN-LAST:event_DELETEMouseClicked

    private void meongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meongActionPerformed

    public void dataCombo() {
        try {

            String com = "select id_breed from cat";
            Statement st = koneksi_mariadb.koneksiDB().createStatement();
            ResultSet r = st.executeQuery(com);

            while (r.next()) {
                idb.addItem(r.getString("id_breed"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

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
            java.util.logging.Logger.getLogger(CatMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatMode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Colour;
    private javax.swing.JButton DELETE;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel br;
    private javax.swing.JTextField breed;
    private javax.swing.JComboBox<String> idb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton meong;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField notelp;
    // End of variables declaration//GEN-END:variables
}
