/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

import java.util.PriorityQueue;
import java.util.Queue;
import javax.swing.JOptionPane;


public class EmergencyRoomGUI extends javax.swing.JFrame {

    Queue<Patient> lineup = new PriorityQueue<>();
    public EmergencyRoomGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        rbfc = new javax.swing.JRadioButton();
        rbsc = new javax.swing.JRadioButton();
        rbcc = new javax.swing.JRadioButton();
        btnsced = new javax.swing.JButton();
        btntn = new javax.swing.JButton();
        btnta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtinfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Patient Name:");

        buttonGroup1.add(rbfc);
        rbfc.setText("Fair Condition");
        rbfc.setActionCommand("fc");

        buttonGroup1.add(rbsc);
        rbsc.setText("Serious Condition");
        rbsc.setActionCommand("sc");

        buttonGroup1.add(rbcc);
        rbcc.setText("Critical Condition");
        rbcc.setActionCommand("cc");

        btnsced.setText("Scedule");
        btnsced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnscedActionPerformed(evt);
            }
        });

        btntn.setText("Treat Next");
        btntn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntnActionPerformed(evt);
            }
        });

        btnta.setText("Treat All");
        btnta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntaActionPerformed(evt);
            }
        });

        txtinfo.setColumns(20);
        txtinfo.setRows(5);
        jScrollPane1.setViewportView(txtinfo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(44, 44, 44)
                                .addComponent(txtname))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbcc)
                                    .addComponent(rbsc))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btntn)
                                    .addComponent(btnta))
                                .addGap(0, 23, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbfc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsced)
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbfc)
                    .addComponent(btnsced))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbsc)
                    .addComponent(btntn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbcc)
                    .addComponent(btnta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnscedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnscedActionPerformed
        String type;
        try{
        type = buttonGroup1.getSelection().getActionCommand();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please add a condition");
            return;
        }
        if(txtname.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Please add a name");
            return;
        }
        int cond;
        if (type.equals("fc"))
           cond = 3;
        else if (type.equals("sc"))
           cond = 2; 
        else if (type.equals("cc"))
           cond = 1;
        else{
            throw new AssertionError();
        }
        Patient temp = new Patient(txtname.getText(), cond);
        lineup.add(temp);
        txtname.setText("");
        rbfc.setSelected(false);
        rbsc.setSelected(false);
        rbcc.setSelected(false);
        txtinfo.append("" + temp + "\tWaiting...\n");
    }//GEN-LAST:event_btnscedActionPerformed

    private void btntnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntnActionPerformed
        if (lineup.isEmpty()){
            JOptionPane.showMessageDialog(this, "There are no more people to treat!");
            return;
        }
        txtinfo.append(lineup.remove().getName() + " has been treated.\n");
    }//GEN-LAST:event_btntnActionPerformed

    private void btntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntaActionPerformed
        if (lineup.isEmpty()){
            JOptionPane.showMessageDialog(this, "There are no more people to treat!");
            return;
        }
        txtinfo.append("Treating All Patients\n");
        while(!lineup.isEmpty()){
            txtinfo.append(lineup.remove().getName() + " has been treated.\n");
        }
        txtname.setText("");
        rbfc.setSelected(false);
        rbsc.setSelected(false);
        rbcc.setSelected(false);
    }//GEN-LAST:event_btntaActionPerformed

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
            java.util.logging.Logger.getLogger(EmergencyRoomGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmergencyRoomGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmergencyRoomGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmergencyRoomGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmergencyRoomGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsced;
    private javax.swing.JButton btnta;
    private javax.swing.JButton btntn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbcc;
    private javax.swing.JRadioButton rbfc;
    private javax.swing.JRadioButton rbsc;
    private javax.swing.JTextArea txtinfo;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
