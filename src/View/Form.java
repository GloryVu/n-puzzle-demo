/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Algorithm;
import model.State;
import model.Result;

/**
 *
 * @author ADMIN
 */
public class Form extends javax.swing.JFrame {
    
    State banDau;
    

    Result result=null;
    
    int soThuTu=0;
    
    List<State> stepOfUser=new ArrayList<>();
    
    int[] sinhDayRandom(int[] danhSachTu){
        int soThuTu=0;
        List<Integer> soTuArrayList =new ArrayList<>();
        int[] randomArrays=new int[danhSachTu.length];
        for(int i=0;i<danhSachTu.length;i++) soTuArrayList.add(i);
        Random random=new Random();
        while(!soTuArrayList.isEmpty()){
            int viTri=random.nextInt(soTuArrayList.size());
            randomArrays[soThuTu++]=soTuArrayList.get(viTri);
            soTuArrayList.remove(viTri);
        }
        
        return randomArrays;
    }
    
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
    
    
    public Form(State dauVao) {
        initComponents();
        
        banDau=dauVao;
        setTextForLable(banDau.getMatrix());
        if(banDau.isDestination()){
            JOptionPane.showMessageDialog(null, "Thanh cong");
        }
        this.setSize(1000, 1000);
        
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
        timeL = new javax.swing.JLabel();
        stepLable = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        danhThucHien = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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
        getContentPane().add(L3);
        L3.setBounds(40, 172, 145, 140);

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
        getContentPane().add(L0);
        L0.setBounds(40, 20, 145, 140);

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
        getContentPane().add(L2);
        L2.setBounds(360, 20, 145, 140);

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
        getContentPane().add(L5);
        L5.setBounds(360, 170, 145, 140);

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
        getContentPane().add(L4);
        L4.setBounds(200, 170, 145, 140);

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
        getContentPane().add(L6);
        L6.setBounds(40, 330, 145, 140);

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
        getContentPane().add(L7);
        L7.setBounds(200, 330, 145, 140);

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
        getContentPane().add(L8);
        L8.setBounds(360, 330, 145, 140);

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
        getContentPane().add(L1);
        L1.setBounds(200, 20, 145, 140);

        jButton1.setText("Truoc");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 490, 140, 60);

        jButton2.setText("Sau");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 490, 140, 60);

        timeL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeL.setText("TIME");
        timeL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(timeL);
        timeL.setBounds(590, 50, 130, 40);

        stepLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(stepLable);
        stepLable.setBounds(220, 490, 120, 60);

        jButton3.setText("BFS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(530, 100, 260, 50);

        jButton4.setText("IDS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(530, 230, 260, 70);

        jButton5.setText("Leo Doi");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(530, 310, 260, 70);
        getContentPane().add(danhThucHien);
        danhThucHien.setBounds(520, 0, 310, 50);

        jButton6.setText("A Sao");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(530, 390, 260, 70);

        jButton7.setText("Reset");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(530, 490, 260, 60);

        jButton8.setText("DFS");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(530, 163, 260, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void L4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L4MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_L4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(soThuTu>0) soThuTu--;
        setTextForLable(result.getPath().get(soThuTu).getMatrix());
        stepLable.setText(soThuTu+"/"+result.getCost());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(soThuTu<result.getCost()) soThuTu++;
        setTextForLable(result.getPath().get(soThuTu).getMatrix());
        stepLable.setText(soThuTu+"/"+result.getCost());
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setTextForLable(banDau.getMatrix());
        long startTime = System.currentTimeMillis();
        result=Algorithm.LeoDoi(new State(banDau.getMatrix()));
        long endTime = System.currentTimeMillis();
        timeL.setText((endTime - startTime) + " milliseconds");
        soThuTu=0;
        stepLable.setText(soThuTu+"/"+result.getCost());
        danhThucHien.setText("Dang thuc hien Leo Doi");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setTextForLable(banDau.getMatrix());
        long startTime = System.currentTimeMillis();
        result=Algorithm.BFS(new State(banDau.getMatrix()));
        long endTime = System.currentTimeMillis();
        timeL.setText((endTime - startTime) + " milliseconds");
        if(result==null){
            JOptionPane.showMessageDialog(null, "Khong co loi giai");
            return;
        }
        
        soThuTu=0;
        stepLable.setText(soThuTu+"/"+result.getCost());
        danhThucHien.setText("Dang thuc hien BFS");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setTextForLable(banDau.getMatrix());
        long startTime = System.currentTimeMillis();
        for(int i = 2; i < 362880; i++){
            result=Algorithm.IDS(banDau, i);
            if(result!=null) break;
        }
        long endTime = System.currentTimeMillis();
        timeL.setText((endTime - startTime) + " milliseconds");
        if(result==null){
            JOptionPane.showMessageDialog(null, "Khong co loi giai");
            return;
        }
        
        soThuTu=0;
        stepLable.setText(soThuTu+"/"+result.getCost());
        danhThucHien.setText("Dang thuc hien IDS");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        soThuTu=0;
        stepLable.setText(soThuTu+"/"+result.getCost());
        setTextForLable(banDau.getMatrix());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void L0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L0MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_L0MouseClicked

    private void L1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_L1MouseClicked

    private void L2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_L2MouseClicked

    private void L3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_L3MouseClicked

    private void L5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_L5MouseClicked

    private void L6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_L6MouseClicked

    private void L7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_L7MouseClicked

    private void L8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_L8MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        setTextForLable(banDau.getMatrix());
        long startTime = System.currentTimeMillis();
        result=Algorithm.DFS(new State(banDau.getMatrix()));
        long endTime = System.currentTimeMillis();
        timeL.setText((endTime - startTime) + " milliseconds");
        if(result==null){
            JOptionPane.showMessageDialog(null, "Khong co loi giai");
            return;
        }
        
        soThuTu=0;
        stepLable.setText(soThuTu+"/"+result.getCost());
        danhThucHien.setText("Dang thuc hien DFS");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        setTextForLable(banDau.getMatrix());
        long startTime = System.currentTimeMillis();
        result=Algorithm.AStar(new State(banDau.getMatrix()));
        long endTime = System.currentTimeMillis();
        timeL.setText((endTime - startTime) + " milliseconds");
        if(result==null){
            JOptionPane.showMessageDialog(null, "Khong co loi giai");
            return;
        }
        
        soThuTu=0;
        stepLable.setText(soThuTu+"/"+result.getCost());
        danhThucHien.setText("Dang thuc hien A*");
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Form().setVisible(true);
//            }
//        });
//    }

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
    private javax.swing.JLabel danhThucHien;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel stepLable;
    private javax.swing.JLabel timeL;
    // End of variables declaration//GEN-END:variables
}
