/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ticket.view.ticket;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

/**
 *
 * @author Vanessa
 */
public class TicketFrm extends javax.swing.JFrame {
    
    private TicketActionListener listener;
    /**
     * Creates new form TicketFrm
     */
    public TicketFrm() {
        initComponents();
        this.listener = new TicketActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jbTitle = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jbExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jbUserName = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jToolBar4 = new javax.swing.JToolBar();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tbTickets = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtOpen = new javax.swing.JTable();
        lblIdOpeneds = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtClosed = new javax.swing.JTable();
        lblIdCloseds = new javax.swing.JLabel();
        jToolBar3 = new javax.swing.JToolBar();
        jbAdd = new javax.swing.JButton();
        jbEdit = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbSave = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        cbClass = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbUser = new javax.swing.JComboBox<>();
        cbClose = new javax.swing.JCheckBox();
        lblIdTicket = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar1.setRollover(true);

        jbTitle.setFont(new java.awt.Font("Carlito", 1, 24)); // NOI18N
        jbTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ie/ticket/img/support_operator.png"))); // NOI18N
        jbTitle.setText("Tickets Manager");
        jToolBar1.add(jbTitle);

        jbExit.setText("Exit");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("|");

        jbUserName.setText("Hello Jhon");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(596, Short.MAX_VALUE)
                .addComponent(jbUserName)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(25, 25, 25)
                .addComponent(jbExit)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jbExit)
                    .addComponent(jbUserName)))
        );

        jToolBar1.add(jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jToolBar4.setRollover(true);

        jLabel5.setText("Cadastred Tickets");
        jToolBar4.add(jLabel5);
        jToolBar4.add(jLabel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jtOpen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtOpen);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lblIdOpeneds, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIdOpeneds, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tbTickets.addTab("Openeds", jPanel8);

        jtClosed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jtClosed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lblIdCloseds, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIdCloseds, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tbTickets.addTab("Closeds", jPanel9);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tbTickets))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jToolBar3.setRollover(true);

        jbAdd.setText("Add");
        jToolBar3.add(jbAdd);

        jbEdit.setText("Edit");
        jbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditActionPerformed(evt);
            }
        });
        jToolBar3.add(jbEdit);

        jbDelete.setText("Delete");
        jbDelete.setFocusable(false);
        jbDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(jbDelete);

        jbSave.setText("Save");
        jbSave.setFocusable(false);
        jbSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(jbSave);

        jbCancel.setText("Cancel");
        jbCancel.setFocusable(false);
        jbCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCancel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(jbCancel);

        jLabel2.setText("Issue:");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jLabel3.setText("Classification:");

        cbClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Longterm", "Normal", "Urgente", " " }));
        cbClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClassActionPerformed(evt);
            }
        });

        jLabel4.setText("Responsible:");

        cbUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "John", "James", "Johan" }));

        cbClose.setText("Close");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(4, 4, 4)
                                    .addComponent(cbClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cbClose)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdTicket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIdTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cbClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cbClose)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEditActionPerformed

    private void cbClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClassActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicketFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form *//*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketFrm().setVisible(false);
            }
        });*/
    }

    public JComboBox<String> getCbClass() {
        return cbClass;
    }

    public void setCbClass(JComboBox<String> cbClass) {
        this.cbClass = cbClass;
    }

    public JCheckBox getCbClose() {
        return cbClose;
    }

    public void setCbClose(JCheckBox cbClose) {
        this.cbClose = cbClose;
    }

    public JComboBox<String> getCbUser() {
        return cbUser;
    }

    public void setCbUser(JComboBox<String> cbUser) {
        this.cbUser = cbUser;
    }

    public JButton getJbAdd() {
        return jbAdd;
    }

    public void setJbAdd(JButton jbAdd) {
        this.jbAdd = jbAdd;
    }

    public JButton getJbCancel() {
        return jbCancel;
    }

    public void setJbCancel(JButton jbCancel) {
        this.jbCancel = jbCancel;
    }

    public JButton getJbDelete() {
        return jbDelete;
    }

    public void setJbDelete(JButton jbDelete) {
        this.jbDelete = jbDelete;
    }

    public JButton getJbEdit() {
        return jbEdit;
    }

    public void setJbEdit(JButton jbEdit) {
        this.jbEdit = jbEdit;
    }

    public JButton getJbExit() {
        return jbExit;
    }

    public void setJbExit(JButton jbExit) {
        this.jbExit = jbExit;
    }

    public JButton getJbSave() {
        return jbSave;
    }

    public void setJbSave(JButton jbSave) {
        this.jbSave = jbSave;
    }

    public JLabel getJbTitle() {
        return jbTitle;
    }

    public void setJbTitle(JLabel jbTitle) {
        this.jbTitle = jbTitle;
    }

    public JLabel getJbUserName() {
        return jbUserName;
    }

    public void setJbUserName(JLabel jbUserName) {
        this.jbUserName = jbUserName;
    }

    public JTable getJtClosed() {
        return jtClosed;
    }

    public void setJtClosed(JTable jtClosed) {
        this.jtClosed = jtClosed;
    }

    public JTable getJtOpen() {
        return jtOpen;
    }

    public void setJtOpen(JTable jtOpen) {
        this.jtOpen = jtOpen;
    }

    public JLabel getLblIdCloseds() {
        return lblIdCloseds;
    }

    public void setLblIdCloseds(JLabel lblIdCloseds) {
        this.lblIdCloseds = lblIdCloseds;
    }

    public JLabel getLblIdOpeneds() {
        return lblIdOpeneds;
    }

    public void setLblIdOpeneds(JLabel lblIdOpeneds) {
        this.lblIdOpeneds = lblIdOpeneds;
    }

    public JLabel getLblIdTicket() {
        return lblIdTicket;
    }

    public void setLblIdTicket(JLabel lblIdTicket) {
        this.lblIdTicket = lblIdTicket;
    }

    public JTabbedPane getTbTickets() {
        return tbTickets;
    }

    public void setTbTickets(JTabbedPane tbTickets) {
        this.tbTickets = tbTickets;
    }

    public JTextArea getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(JTextArea txtDescription) {
        this.txtDescription = txtDescription;
    }
    
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbClass;
    private javax.swing.JCheckBox cbClose;
    private javax.swing.JComboBox<String> cbUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbEdit;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbSave;
    private javax.swing.JLabel jbTitle;
    private javax.swing.JLabel jbUserName;
    private javax.swing.JTable jtClosed;
    private javax.swing.JTable jtOpen;
    private javax.swing.JLabel lblIdCloseds;
    private javax.swing.JLabel lblIdOpeneds;
    private javax.swing.JLabel lblIdTicket;
    private javax.swing.JTabbedPane tbTickets;
    private javax.swing.JTextArea txtDescription;
    // End of variables declaration//GEN-END:variables
}
