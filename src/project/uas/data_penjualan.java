/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.uas;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Fadhilansyah25
 */
public class data_penjualan extends javax.swing.JFrame {
private Connection conn_FadilArdiansyah;
private Statement stat_FadilArdiansyah;
private ResultSet res_FadilArdiansyah;
    /**
     * Creates new form data_barang
     */
    public data_penjualan() {
        initComponents();
        koneksi();
        kosongkan();
        tabel();
        tampil_combobox();
    }

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
        jLabel6 = new javax.swing.JLabel();
        id_transaksiTextField = new javax.swing.JTextField();
        nama_pembeliTextField = new javax.swing.JTextField();
        simpanButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Barang = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jumlah_beliTextField = new javax.swing.JTextField();
        id_barangComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        nama_barangTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Transaksi");

        jLabel2.setText("Id Transaksi");

        jLabel3.setText("Nama Pembeli");

        jLabel6.setText("Id Barang");

        id_transaksiTextField.setEditable(false);

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        Tabel_Barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabel_Barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_BarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel_Barang);

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Jumlah Beli");

        jLabel4.setText("Nama Barang");

        nama_barangTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nama_barangTextFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nama_pembeliTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(id_transaksiTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(id_barangComboBox, 0, 134, Short.MAX_VALUE)
                            .addComponent(nama_barangTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(jumlah_beliTextField)))
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(simpanButton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hapusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(id_transaksiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama_pembeliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(id_barangComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nama_barangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jumlah_beliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanButton)
                    .addComponent(jButton1)
                    .addComponent(editButton)
                    .addComponent(hapusButton))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:
        try {
            stat_FadilArdiansyah.executeUpdate("insert into penjualan_air values (NULL,"
            +"'"+nama_pembeliTextField.getText()+"',"
            +"'"+id_barangComboBox.getSelectedItem()+"',"
            +"'"+Integer.parseInt(jumlah_beliTextField.getText())+"')");
            kosongkan();
            tabel();

            JOptionPane.showMessageDialog(null, "Data Barang Berhasil Disimpan");
        } catch (Exception e) {
            //TODO: handle exception
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void Tabel_BarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_BarangMouseClicked
        // TODO add your handling code here:
        int i_FadilArdiansyah = Tabel_Barang.getSelectedRow();
        if (i_FadilArdiansyah == -1) {
            return;
        }

        String code0_FadilArdiansyah = (String)Tabel_Barang.getValueAt(i_FadilArdiansyah, 0);
        String code1_FadilArdiansyah = (String)Tabel_Barang.getValueAt(i_FadilArdiansyah, 1);
        String code2_FadilArdiansyah = (String)Tabel_Barang.getValueAt(i_FadilArdiansyah, 2);
        String code3_FadilArdiansyah = (String)Tabel_Barang.getValueAt(i_FadilArdiansyah, 3);
        String code4_FadilArdiasnyah = (String)Tabel_Barang.getValueAt(i_FadilArdiansyah, 4);

        id_transaksiTextField.setText(code0_FadilArdiansyah);
        nama_pembeliTextField.setText(code1_FadilArdiansyah);
        id_barangComboBox.setSelectedItem(code2_FadilArdiansyah);
        nama_barangTextField.setText(code3_FadilArdiansyah);
        jumlah_beliTextField.setText(code4_FadilArdiasnyah);
    }//GEN-LAST:event_Tabel_BarangMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        kosongkan();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int ok_FadilArdiansyah = JOptionPane.showConfirmDialog(null, "Apakah ingin mengedit Data ini?", "Edit Data", JOptionPane.YES_NO_CANCEL_OPTION);
        try {
            PreparedStatement stat_FadilArdiansyah = conn_FadilArdiansyah.prepareStatement(
                "update penjualan_air set id_transaksi=?, nama_pembeli=?, id_barang=?, jumlah_beli=? where id_transaksi='"
                +Integer.parseInt(id_transaksiTextField.getText())+"'");
                if (ok_FadilArdiansyah == 0) {
                    try {
                        stat_FadilArdiansyah.setInt(1, Integer.parseInt(id_transaksiTextField.getText()));
                        stat_FadilArdiansyah.setString(2, nama_pembeliTextField.getText());
                        stat_FadilArdiansyah.setInt(3, (Integer)id_barangComboBox.getSelectedItem());
                        stat_FadilArdiansyah.setInt(4, Integer.parseInt(jumlah_beliTextField.getText()));
                        stat_FadilArdiansyah.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Update Data Berhasil");
                    } catch (Exception e) {
                        //TODO: handle exception
                        JOptionPane.showMessageDialog(null, "Update Data Gagal"+e);
                    }
                }
            tabel();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        int ok_FadilArdiansyah = JOptionPane.showConfirmDialog(null, "Apakah Yakin Menghapus Data?", "Hapus Data", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok_FadilArdiansyah == 0) {
            try {
                String sql_FadilArdiansyah = "delete from penjualan_air where id_transaksi="+Integer.parseInt(id_transaksiTextField.getText());
                String resetno =  "ALTER TABLE penjualan_air DROP id_transaksi";
                String consecutivenumbers = "ALTER TABLE penjualan_air ADD  id_transaksi INT( 3 ) NOT NULL AUTO_INCREMENT FIRST ,ADD KEY (id_transaksi)";
                PreparedStatement stat_FadilArdiansyah = conn_FadilArdiansyah.prepareStatement(sql_FadilArdiansyah);
                stat_FadilArdiansyah.executeUpdate();
                conn_FadilArdiansyah.createStatement().execute(resetno);
                conn_FadilArdiansyah.createStatement().execute(consecutivenumbers);
                JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
            } catch (Exception e) {
                //TODO: handle exception
                JOptionPane.showMessageDialog(null, "Hapus Data Gagal"+e);
            }
        }
        tabel();
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void nama_barangTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nama_barangTextFieldMouseClicked
        // TODO add your handling code here:
        tampil();
    }//GEN-LAST:event_nama_barangTextFieldMouseClicked

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
            java.util.logging.Logger.getLogger(data_penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data_penjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel_Barang;
    private javax.swing.JButton editButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JComboBox<String> id_barangComboBox;
    private javax.swing.JTextField id_transaksiTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlah_beliTextField;
    private javax.swing.JTextField nama_barangTextField;
    private javax.swing.JTextField nama_pembeliTextField;
    private javax.swing.JButton simpanButton;
    // End of variables declaration//GEN-END:variables

    private void koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn_FadilArdiansyah = DriverManager.getConnection("jdbc:mysql://127.0.0.1/jual_air", "root", "");
            stat_FadilArdiansyah = conn_FadilArdiansyah.createStatement();
        } catch (Exception e) {
            //TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void kosongkan() {
        id_transaksiTextField.setText("");
        nama_pembeliTextField.setText("");
        id_barangComboBox.setSelectedIndex(-1);
        nama_barangTextField.setText("");
        jumlah_beliTextField.setText("");
    }

    private void tabel(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("ID Transaksi");
        tabel.addColumn("Nama Pembeli");
        tabel.addColumn("ID Barang");
        tabel.addColumn("Nama Barang");
        tabel.addColumn("Jumlah Beli");
        Tabel_Barang.setModel(tabel);

        try {
            res_FadilArdiansyah = stat_FadilArdiansyah.executeQuery("SELECT id_transaksi, nama_pembeli, jumlah_beli, t_barang.id_barang, t_barang.nama_barang FROM penjualan_air INNER JOIN t_barang ON penjualan_air.id_barang = t_barang.id_barang");
            while (res_FadilArdiansyah.next()) {
                tabel.addRow(new Object[]
                {
                    res_FadilArdiansyah.getString("id_transaksi"),
                    res_FadilArdiansyah.getString("nama_pembeli"),
                    res_FadilArdiansyah.getString("t_barang.id_barang"),
                    res_FadilArdiansyah.getString("t_barang.nama_barang"),
                    res_FadilArdiansyah.getString("jumlah_beli")
                });
            }
        } catch (Exception e) {
            //TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void tampil_combobox() {
        try {
            String sql = "select id_barang from t_barang order by id_barang asc";
            res_FadilArdiansyah = stat_FadilArdiansyah.executeQuery(sql);
            id_barangComboBox.addItem("-Pilih Kode Barang");
            while (res_FadilArdiansyah.next()) {
                id_barangComboBox.addItem(res_FadilArdiansyah.getString("id_barang"));
                
            }
        } catch (Exception e) {
            //TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void tampil() {
        try {
            String sql = "select nama_barang from t_barang where id_barang='"+id_barangComboBox.getSelectedItem()+"'";
            res_FadilArdiansyah = stat_FadilArdiansyah.executeQuery(sql);

            while (res_FadilArdiansyah.next()) {
                {   
                    nama_barangTextField.setText(res_FadilArdiansyah.getString("nama_barang"));
                }
            }
        } catch (Exception e) {
            //TODO: handle exception
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
}
