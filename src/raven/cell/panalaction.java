/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package raven.cell;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Asus
 */
public class panalaction extends javax.swing.JPanel {

    /**
     * Creates new form panalaction
     */
    public panalaction() {
        initComponents();
    }
    public void initEvent(tableactionevent event,int row){
   btnview.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         event.onView(row);
         
       }
   });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnview = new raven.cell.ActionButton();
        jButton1 = new javax.swing.JButton();

        btnview.setBackground(new java.awt.Color(0, 204, 51));
        btnview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/cell/icons8-view-24.png"))); // NOI18N
        btnview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnviewMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raven/cell/icons8-delete-25.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnview, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
            .addComponent(btnview, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnviewMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private raven.cell.ActionButton btnview;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}