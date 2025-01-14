
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class JabatanForm extends javax.swing.JFrame {

    /**
     * Creates new form JabatanForm
     */
    public JabatanForm() {
        initComponents();
        tampilData();
        bersih();
    }

    String id;
    Connection conn = koneksi.getKoneksi();
    PreparedStatement pst;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Jabatan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel1.setText("Nama Jabatan : ");

        jLabel2.setText("Gaji Pokok : ");

        jButton1.setText("Tambah");
        jButton1.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");
        jButton2.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Bersihkan");
        jButton4.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Jabatan", "Nama Jabatan", "Gaji Pokok"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Cari jabatan berdasarkan nama jabatan : ");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jButton5.setText("Kembali ke menu utama");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Simpan Data");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Data Jabatan Belum Diisi", "Gagal Tambah Data", JOptionPane.WARNING_MESSAGE);
            } else if (!jTextField2.getText().matches("\\d+")) { // Validasi gaji pokok hanya angka
                JOptionPane.showMessageDialog(null, "Gaji Pokok hanya boleh berisi angka.", "Validasi Gagal", JOptionPane.WARNING_MESSAGE);
            } else {
                String queryTambah = "INSERT INTO jabatan (nama_jabatan, gaji_pokok) VALUES (?, ?)";
                pst = conn.prepareStatement(queryTambah);

                pst.setString(1, jTextField1.getText());
                pst.setString(2, jTextField2.getText());

                pst.executeUpdate();
                tampilData(); // Memuat ulang data di jTable1
                bersih();     // Membersihkan input form

                JOptionPane.showMessageDialog(null, "Data Jabatan Berhasil Ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
    // Validasi jika nama jabatan kosong
    if (jTextField1.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nama Jabatan Belum Diisi", "Gagal Edit Data", JOptionPane.WARNING_MESSAGE);
    } 
    // Validasi hanya untuk gaji pokok jika ada perubahan pada gaji pokok dan kolom tidak kosong
    else if (!jTextField2.getText().isEmpty() && !jTextField2.getText().matches("\\d+(\\.\\d{1,2})?")) {
        // Validasi jika gaji pokok berisi angka dan satu titik desimal maksimal dua angka di belakangnya
        JOptionPane.showMessageDialog(null, "Gaji Pokok hanya boleh berisi angka dan satu titik desimal maksimal dua angka di belakangnya.", "Validasi Gagal", JOptionPane.WARNING_MESSAGE);
    } 
    else {
        // Konfirmasi apakah user ingin melanjutkan perubahan
        int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin mengedit data Jabatan ini?", "Konfirmasi Edit?", JOptionPane.YES_NO_OPTION);
        if (konfirmasi == JOptionPane.YES_OPTION) {
            // Menyusun query untuk memperbarui data jabatan
            String queryEdit = "UPDATE jabatan SET nama_jabatan=?, gaji_pokok=? WHERE id_jabatan=?";
            pst = conn.prepareStatement(queryEdit);

            // Set nama jabatan
            pst.setString(1, jTextField1.getText()); // Nama Jabatan

            // Set gaji pokok hanya jika ada perubahan
            if (!jTextField2.getText().isEmpty()) {
                // Jika gaji pokok diubah, set nilai baru
                pst.setBigDecimal(2, new BigDecimal(jTextField2.getText())); // Gaji Pokok
            } else {
                // Jika gaji pokok tidak diubah, set nilai lama dari gaji pokok
                pst.setNull(2, java.sql.Types.DECIMAL);
            }

            // Set ID jabatan yang dipilih untuk diperbarui
            pst.setString(3, id); // ID Jabatan yang dipilih

            // Eksekusi query update
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Jabatan Berhasil Diperbarui", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            tampilData(); // Memuat ulang data di jTable1
            bersih();     // Membersihkan input form
        }
    }
} catch (SQLException ex) {
    Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
    JOptionPane.showMessageDialog(null, "Terjadi Kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Format Gaji Pokok tidak valid.", "Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        id = jTable1.getValueAt(row, 0).toString();
        jTextField1.setText(jTable1.getValueAt(row, 1).toString()); // Nama Jabatan

        // Mengambil gaji pokok sebagai BigDecimal dan mengonversinya menjadi string yang diformat
        BigDecimal gajiPokok = new BigDecimal(jTable1.getValueAt(row, 2).toString());
        jTextField2.setText(gajiPokok.setScale(2, RoundingMode.HALF_UP).toString()); // Format dengan dua angka di belakang koma

        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // Pastikan ada data yang dipilih pada jTable1
            int row = jTable1.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Silakan pilih data jabatan yang ingin dihapus.", "Pilih Data", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Mendapatkan ID jabatan yang dipilih dari jTable1
            String idJabatan = jTable1.getValueAt(row, 0).toString();

            // Konfirmasi untuk menghapus data jabatan
            int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data Jabatan ini?", "Konfirmasi Hapus?", JOptionPane.YES_NO_OPTION);

            if (konfirmasi == JOptionPane.YES_OPTION) {
                // Query untuk menghapus data jabatan berdasarkan ID
                String queryHapus = "DELETE FROM jabatan WHERE id_jabatan=?";
                pst = conn.prepareStatement(queryHapus);
                pst.setString(1, idJabatan); // Set ID jabatan yang akan dihapus

                // Eksekusi query hapus
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Data Jabatan Berhasil Dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);

                // Memuat ulang data di jTable1
                tampilData();

                // Membersihkan input form
                bersih();
            }
        } catch (SQLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        bersih();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
       tampilData();
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        HalamanLogin hl = new HalamanLogin();
        hl.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Membuat file chooser untuk memilih lokasi penyimpanan
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Simpan Data ke File CSV");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("CSV files", "csv"));

        // Jika pengguna memilih lokasi penyimpanan
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            if (!filePath.endsWith(".csv")) {
                filePath += ".csv"; // Tambahkan ekstensi .csv jika belum ada
            }

            try (FileWriter writer = new FileWriter(filePath)) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                int rowCount = model.getRowCount();
                int colCount = model.getColumnCount();

                // Menulis header kolom ke file CSV
                for (int i = 0; i < colCount; i++) {
                    writer.write(model.getColumnName(i));
                    if (i < colCount - 1) {
                        writer.write(",");
                    }
                }
                writer.write("\n");

                // Menulis data dari jTable1 ke file CSV
                for (int i = 0; i < rowCount; i++) {
                    for (int j = 0; j < colCount; j++) {
                        writer.write(model.getValueAt(i, j).toString());
                        if (j < colCount - 1) {
                            writer.write(",");
                        }
                    }
                    writer.write("\n");
                }

                // Menampilkan pesan sukses
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke " + filePath, "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(JabatanForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Gagal menyimpan data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(JabatanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JabatanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JabatanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JabatanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JabatanForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void tampilData() {
        try {
            String[] judul = {"ID Jabatan", "Nama Jabatan", "Gaji Pokok"};
            DefaultTableModel dtm = new DefaultTableModel(null, judul);
            jTable1.setModel(dtm);

            String sql = "SELECT * FROM jabatan"; // Default query untuk menampilkan semua data jabatan

            // Mengecek apakah jTextField3 berisi input pencarian
            if (!jTextField3.getText().isEmpty()) {
                sql = "SELECT * FROM jabatan WHERE nama_jabatan LIKE ?"; // Filter berdasarkan nama jabatan
            }

            pst = conn.prepareStatement(sql);

            // Jika ada input pada jTextField3, set parameter pencarian
            if (!jTextField3.getText().isEmpty()) {
                pst.setString(1, "%" + jTextField3.getText() + "%"); // Pencarian berdasarkan nama jabatan
            }

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String idJabatan = rs.getString("id_jabatan");
                String namaJabatan = rs.getString("nama_jabatan");
                BigDecimal gajiPokok = rs.getBigDecimal("gaji_pokok");
                String gajiFormatted = gajiPokok.setScale(2, RoundingMode.HALF_UP).toString(); // Format gaji pokok

                String[] data = {idJabatan, namaJabatan, gajiFormatted};
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Saat Menampilkan Data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void bersih() {
        jTextField1.setText("");  // Membersihkan kolom Nama Jabatan
        jTextField2.setText("");  // Membersihkan kolom Gaji Pokok
        jButton1.setEnabled(true); // Mengaktifkan tombol Tambah
        jButton2.setEnabled(false); // Menonaktifkan tombol Edit
        jButton3.setEnabled(false); // Menonaktifkan tombol Hapus
    }
}
