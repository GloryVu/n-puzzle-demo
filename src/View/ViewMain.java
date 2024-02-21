/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.State;

/**
 *
 * @author ADMIN
 */
public class ViewMain extends javax.swing.JFrame {

    /**
     * Creates new form ViewMain
     */
    List<State> stepOfUser=new ArrayList<>();
        
    void setTextForLable(int[] integers){
        L0.setText(integers[0]+"");
        L0.setBackground(Color.ORANGE);
        L1.setText(integers[1]+"");
        L1.setBackground(Color.ORANGE);
        L2.setText(integers[2]+"");
        L2.setBackground(Color.ORANGE);
        L3.setText(integers[3]+"");
        L3.setBackground(Color.ORANGE);
        L4.setText(integers[4]+"");
        L4.setBackground(Color.ORANGE);
        L5.setText(integers[5]+"");
        L5.setBackground(Color.ORANGE);
        L6.setText(integers[6]+"");
        L6.setBackground(Color.ORANGE);
        L7.setText(integers[7]+"");
        L7.setBackground(Color.ORANGE);
        L8.setText(integers[8]+"");
        L8.setBackground(Color.ORANGE);
        
        if(L0.getText().equals("0")) L0.setBackground(Color.black);
        if(L1.getText().equals("0")) L1.setBackground(Color.black);
        if(L2.getText().equals("0")) L2.setBackground(Color.black);
        if(L3.getText().equals("0")) L3.setBackground(Color.black);
        if(L4.getText().equals("0")) L4.setBackground(Color.black);
        if(L5.getText().equals("0")) L5.setBackground(Color.black);
        if(L6.getText().equals("0")) L6.setBackground(Color.black);
        if(L7.getText().equals("0")) L7.setBackground(Color.black);
        if(L8.getText().equals("0")) L8.setBackground(Color.black);
        
        
    }
    
    void clickLable(JLabel jLabel,int k){
        
        int[] arr=new int[]{
            Integer.parseInt(L0.getText()),
            Integer.parseInt(L1.getText()),
            Integer.parseInt(L2.getText()),
            Integer.parseInt(L3.getText()),
            Integer.parseInt(L4.getText()),
            Integer.parseInt(L5.getText()),
            Integer.parseInt(L6.getText()),
            Integer.parseInt(L7.getText()),
            Integer.parseInt(L8.getText()),
        };
        if(new State(arr).isDestination()){
            JOptionPane.showMessageDialog(null, "Thanh cong");
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                if(i+3==k){
                    State matrix=new State(arr);
                    setTextForLable(matrix.moveDown().getMatrix());
                    stepOfUser.add(matrix.moveDown());
                    if(matrix.moveDown().isDestination()){
                        JOptionPane.showMessageDialog(null, "Thanh cong");
                    }
                }
                else if(i-3==k){
                    State matrix=new State(arr);
                    setTextForLable(matrix.moveUp().getMatrix());
                    stepOfUser.add(matrix.moveUp());
                    if(matrix.moveUp().isDestination()){
                        JOptionPane.showMessageDialog(null, "Thanh cong");
                    }
                }
                else if((i-1!=5||i-1!=2)&&i-1==k){
                    State matrix=new State(arr);
                    setTextForLable(matrix.moveLeft().getMatrix());
                    stepOfUser.add(matrix.moveLeft());
                    if(matrix.moveLeft().isDestination()){
                        JOptionPane.showMessageDialog(null, "Thanh cong");
                    }
                }
                else if((i+1!=6||i+1!=3)&&i+1==k){
                    State matrix=new State(arr);
                    stepOfUser.add(matrix.moveRight());
                    setTextForLable(matrix.moveRight().getMatrix());
                    if(matrix.moveRight().isDestination()){
                        JOptionPane.showMessageDialog(null, "Thanh cong");
                    }
                }
            }
        }
        
    }
    
    State banDau;
    
    public ViewMain() {
        initComponents();
        banDau=new State(new int[]{3,4,1,2,8,7,6,5,0});
        setTextForLable(banDau.getMatrix());
        stepOfUser.add(banDau);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L3 = new javax.swing.JLabel();
        L0 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();
        L7 = new javax.swing.JLabel();
        L8 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        stepLable = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        L3.setBackground(new java.awt.Color(153, 255, 0));
        L3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        L3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        L3.setOpaque(true);
        L3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L3MouseClicked(evt);
            }
        });

        L0.setBackground(new java.awt.Color(153, 255, 0));
        L0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        L0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L0.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        L0.setOpaque(true);
        L0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L0MouseClicked(evt);
            }
        });

        L2.setBackground(new java.awt.Color(153, 255, 0));
        L2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        L2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        L2.setOpaque(true);
        L2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L2MouseClicked(evt);
            }
        });

        L5.setBackground(new java.awt.Color(153, 255, 0));
        L5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        L5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        L5.setOpaque(true);
        L5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L5MouseClicked(evt);
            }
        });

        L4.setBackground(new java.awt.Color(153, 255, 0));
        L4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        L4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        L4.setOpaque(true);
        L4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L4MouseClicked(evt);
            }
        });

        L6.setBackground(new java.awt.Color(153, 255, 0));
        L6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        L6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        L6.setOpaque(true);
        L6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L6MouseClicked(evt);
            }
        });

        L7.setBackground(new java.awt.Color(153, 255, 0));
        L7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        L7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        L7.setOpaque(true);
        L7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L7MouseClicked(evt);
            }
        });

        L8.setBackground(new java.awt.Color(153, 255, 0));
        L8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        L8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        L8.setOpaque(true);
        L8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L8MouseClicked(evt);
            }
        });

        L1.setBackground(new java.awt.Color(153, 255, 0));
        L1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        L1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        L1.setOpaque(true);
        L1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L1MouseClicked(evt);
            }
        });

        jButton1.setText("Truoc");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        stepLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton3.setText("Dap An");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(L0, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(L6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(L7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(L8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(stepLable, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L0, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stepLable, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void L3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MouseClicked
        // TODO add your handling code here:
        clickLable(L3, 3);
    }//GEN-LAST:event_L3MouseClicked

    private void L0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L0MouseClicked
        // TODO add your handling code here:
        clickLable(L0, 0);
    }//GEN-LAST:event_L0MouseClicked

    private void L2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MouseClicked
        // TODO add your handling code here:
        clickLable(L2, 2);
    }//GEN-LAST:event_L2MouseClicked

    private void L5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseClicked
        // TODO add your handling code here:
        clickLable(L5, 5);
    }//GEN-LAST:event_L5MouseClicked

    private void L4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L4MouseClicked
        // TODO add your handling code here:
        clickLable(L4, 4);

    }//GEN-LAST:event_L4MouseClicked

    private void L6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L6MouseClicked
        // TODO add your handling code here:
        clickLable(L6, 6);
    }//GEN-LAST:event_L6MouseClicked

    private void L7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L7MouseClicked
        // TODO add your handling code here:
        clickLable(L7, 7);
    }//GEN-LAST:event_L7MouseClicked

    private void L8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L8MouseClicked
        // TODO add your handling code here:
        clickLable(L8, 8);
    }//GEN-LAST:event_L8MouseClicked

    private void L1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseClicked
        // TODO add your handling code here:
        clickLable(L1, 1);
    }//GEN-LAST:event_L1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(stepOfUser.size()-1>0){
            setTextForLable(stepOfUser.get(stepOfUser.size()-2).getMatrix());
            stepOfUser.remove(stepOfUser.size()-1);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setTextForLable(banDau.getMatrix());

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Form form=new Form(banDau);
        form.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L0;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JLabel L8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel stepLable;
    // End of variables declaration//GEN-END:variables
}
