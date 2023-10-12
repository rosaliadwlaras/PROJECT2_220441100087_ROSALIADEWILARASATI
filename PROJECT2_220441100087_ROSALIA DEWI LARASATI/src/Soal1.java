import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author INFINIX
 */
public class Soal1 extends javax.swing.JFrame {

    private int tarifperjam;
    private double gajiBruto;
    private double potonganPajak;
    private double gajiBersih;

    /**
     * Creates new form GajiKaryawan
     */
    public Soal1() {
        initComponents();
        tfPerJam.setText("10000");
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
        tfGajiBersih = new javax.swing.JTextField();
        lbPerJam = new javax.swing.JLabel();
        tfJamKerja = new javax.swing.JTextField();
        lbGajiBruto = new javax.swing.JLabel();
        btHitungBruto = new javax.swing.JButton();
        tfGajiBruto = new javax.swing.JTextField();
        btHitungBersih = new javax.swing.JButton();
        lbGajiBersih = new javax.swing.JLabel();
        lbJamKerja = new javax.swing.JLabel();
        tfPerJam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setText("Gaji Karyawan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 160, 30));

        tfGajiBersih.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(tfGajiBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 198, -1));

        lbPerJam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPerJam.setText("Tarif Perjam");
        getContentPane().add(lbPerJam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        tfJamKerja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJamKerjaActionPerformed(evt);
            }
        });
        getContentPane().add(tfJamKerja, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 130, 30));

        lbGajiBruto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbGajiBruto.setText("Gaji Bruto");
        getContentPane().add(lbGajiBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        btHitungBruto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btHitungBruto.setText("Hitung Gaji Bruto");
        btHitungBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHitungBrutoActionPerformed(evt);
            }
        });
        getContentPane().add(btHitungBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        tfGajiBruto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(tfGajiBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 199, -1));

        btHitungBersih.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btHitungBersih.setText("Hitung Gaji Bersih");
        btHitungBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHitungBersihActionPerformed(evt);
            }
        });
        getContentPane().add(btHitungBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, 30));

        lbGajiBersih.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbGajiBersih.setText("Gaji Bersih");
        getContentPane().add(lbGajiBersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        lbJamKerja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbJamKerja.setText("Jumlah Jam Kerja (1 Minggu)");
        getContentPane().add(lbJamKerja, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, 20));

        tfPerJam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfPerJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPerJamActionPerformed(evt);
            }
        });
        getContentPane().add(tfPerJam, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 180, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btHitungBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHitungBersihActionPerformed
        // TODO add your handling code here:
        double gajiBruto = Double.parseDouble(tfGajiBruto.getText());

        // Hitung potongan pajak (10% dari gaji bruto)
        double potonganPajak = 0.10 * gajiBruto;

        // Hitung gaji bersih (gaji bruto - potongan pajak)
        double gajiBersih = gajiBruto - potonganPajak;

        // Set nilai gaji bersih ke komponen teks eGajibersih
        tfGajiBersih.setText(String.valueOf(gajiBersih));

    }//GEN-LAST:event_btHitungBersihActionPerformed

    private void btHitungBrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHitungBrutoActionPerformed
        // TODO add your handling code here:
         // Hitung gaji bruto
        double gajiBruto;
        double jamKerja = Double.parseDouble(tfJamKerja.getText());
        double tarif = Double.parseDouble(tfPerJam.getText());
        
        if (jamKerja <= 40) {
            gajiBruto = jamKerja * tarif;
        } else {
            double jamLembur = jamKerja - 40;
            gajiBruto = (40 * tarif) + (jamLembur * (1.5 * tarif));
        }

        // Set nilai gaji bruto ke komponen teks eGajibruto
        tfGajiBruto.setText(String.valueOf(gajiBruto));


    }//GEN-LAST:event_btHitungBrutoActionPerformed

    private void tfJamKerjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJamKerjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJamKerjaActionPerformed

    private void tfPerJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPerJamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPerJamActionPerformed

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
            java.util.logging.Logger.getLogger(Soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHitungBersih;
    private javax.swing.JButton btHitungBruto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbGajiBersih;
    private javax.swing.JLabel lbGajiBruto;
    private javax.swing.JLabel lbJamKerja;
    private javax.swing.JLabel lbPerJam;
    private javax.swing.JTextField tfGajiBersih;
    private javax.swing.JTextField tfGajiBruto;
    private javax.swing.JTextField tfJamKerja;
    private javax.swing.JTextField tfPerJam;
    // End of variables declaration//GEN-END:variables
}
