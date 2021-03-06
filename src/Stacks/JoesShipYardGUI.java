
package Stacks;

import java.util.ArrayList;
import java.util.Stack;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class JoesShipYardGUI extends javax.swing.JFrame {

    JLabel containers[] = new JLabel[10];
    Stack<Container> yard = new Stack();
    ArrayList<Container> out = new ArrayList();
    DefaultListModel outdata;
    
    public JoesShipYardGUI() {
        initComponents();
        containers[0] = lblcontain0;
        containers[1] = lblcontain1;
        containers[2] = lblcontain2;
        containers[3] = lblcontain3;
        containers[4] = lblcontain4;
        containers[5] = lblcontain5;
        containers[6] = lblcontain6;
        containers[7] = lblcontain7;
        containers[8] = lblcontain8;
        containers[9] = lblcontain9;
        
        for(JLabel c: containers){
            yard.push(new Container());
            c.setText(yard.peek().toString());
        }
        
        outdata = new DefaultListModel();
        outlist.setModel(outdata);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblcontain0 = new javax.swing.JLabel();
        lblcontain1 = new javax.swing.JLabel();
        lblcontain2 = new javax.swing.JLabel();
        lblcontain3 = new javax.swing.JLabel();
        lblcontain4 = new javax.swing.JLabel();
        lblcontain5 = new javax.swing.JLabel();
        lblcontain6 = new javax.swing.JLabel();
        lblcontain7 = new javax.swing.JLabel();
        lblcontain8 = new javax.swing.JLabel();
        lblcontain9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outlist = new javax.swing.JList<>();
        btnbook = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        btnreturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMinimumSize(new java.awt.Dimension(246, 300));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        lblcontain0.setBackground(new java.awt.Color(80, 80, 90));
        lblcontain0.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain0.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain0.setText("Testing");
        lblcontain0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 180, 190), 2));
        lblcontain0.setOpaque(true);

        lblcontain1.setBackground(new java.awt.Color(80, 80, 90));
        lblcontain1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain1.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain1.setText("Testing");
        lblcontain1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 180, 190), 2));
        lblcontain1.setOpaque(true);

        lblcontain2.setBackground(new java.awt.Color(80, 80, 90));
        lblcontain2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain2.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain2.setText("Testing");
        lblcontain2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 180, 190), 2));
        lblcontain2.setOpaque(true);

        lblcontain3.setBackground(new java.awt.Color(80, 80, 90));
        lblcontain3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain3.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain3.setText("Testing");
        lblcontain3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 180, 190), 2));
        lblcontain3.setOpaque(true);

        lblcontain4.setBackground(new java.awt.Color(80, 80, 90));
        lblcontain4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain4.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain4.setText("Testing");
        lblcontain4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 180, 190), 2));
        lblcontain4.setOpaque(true);

        lblcontain5.setBackground(new java.awt.Color(80, 80, 90));
        lblcontain5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain5.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain5.setText("Testing");
        lblcontain5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 180, 190), 2));
        lblcontain5.setOpaque(true);

        lblcontain6.setBackground(new java.awt.Color(80, 80, 90));
        lblcontain6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain6.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain6.setText("Testing");
        lblcontain6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 180, 190), 2));
        lblcontain6.setOpaque(true);

        lblcontain7.setBackground(new java.awt.Color(80, 80, 90));
        lblcontain7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain7.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain7.setText("Testing");
        lblcontain7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 180, 190), 2));
        lblcontain7.setOpaque(true);

        lblcontain8.setBackground(new java.awt.Color(80, 80, 90));
        lblcontain8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain8.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain8.setText("Testing");
        lblcontain8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 180, 190), 2));
        lblcontain8.setOpaque(true);

        lblcontain9.setBackground(new java.awt.Color(80, 80, 90));
        lblcontain9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblcontain9.setForeground(new java.awt.Color(255, 255, 255));
        lblcontain9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontain9.setText("Testing");
        lblcontain9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 180, 190), 2));
        lblcontain9.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcontain0, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(lblcontain1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcontain2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcontain3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcontain4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcontain5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcontain6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcontain7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcontain8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcontain9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcontain9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcontain8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcontain7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcontain6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcontain5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcontain4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcontain3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcontain2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcontain1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcontain0, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setViewportView(outlist);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        btnbook.setText("Book It");
        btnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbookActionPerformed(evt);
            }
        });

        btnreturn.setText("Return Selected Container");
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnbook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnreturn)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnreturn))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbookActionPerformed
        if (yard.size()==0){
            JOptionPane.showMessageDialog(this, "No containers left");
            txtname.setText("");
            return;
        }
        if (txtname.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Please enter a name");
            return;
        }
        Container temp = yard.pop();
        temp.book(txtname.getText());
        out.add(temp);
        outdata.add(outdata.size(),temp);
        containers[yard.size()].setVisible(false);
        txtname.setText("");
    }//GEN-LAST:event_btnbookActionPerformed

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        int retcon = outlist.getSelectedIndex();
        if (retcon == -1) {
            JOptionPane.showMessageDialog(this, "Select container to return");
            return;
        }
        Container temp = out.remove(retcon);
        outdata.removeElementAt(retcon);
        temp.unbook("");
        yard.push(temp);
        containers[yard.size()-1].setText(temp.toString());
        containers[yard.size()-1].setVisible(true);
    }//GEN-LAST:event_btnreturnActionPerformed

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
            java.util.logging.Logger.getLogger(JoesShipYardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JoesShipYardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JoesShipYardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JoesShipYardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JoesShipYardGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbook;
    private javax.swing.JButton btnreturn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcontain0;
    private javax.swing.JLabel lblcontain1;
    private javax.swing.JLabel lblcontain2;
    private javax.swing.JLabel lblcontain3;
    private javax.swing.JLabel lblcontain4;
    private javax.swing.JLabel lblcontain5;
    private javax.swing.JLabel lblcontain6;
    private javax.swing.JLabel lblcontain7;
    private javax.swing.JLabel lblcontain8;
    private javax.swing.JLabel lblcontain9;
    private javax.swing.JList<String> outlist;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
