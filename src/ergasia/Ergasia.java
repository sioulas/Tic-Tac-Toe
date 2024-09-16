/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ergasia;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Ergasia extends javax.swing.JFrame {

    private String arxh = "X";
    private int mx = 0;
    private int mo = 0;
 
    
    public Ergasia() {
        initComponents();
    }
    
    private void Pontoi(){
        ScoreO.setText(String.valueOf(mo));
        ScoreX.setText(String.valueOf(mx));
    }
    
    private void Dialekse_Paikth(){
        if(arxh.equalsIgnoreCase("X")){
            arxh = "O";
        }
        else{
            arxh = "X";
        }
    }
    
    private void Victory(){
        String button1 = B1.getText();
        String button2 = B2.getText();
        String button3 = B3.getText();
        String button4 = B4.getText();
        String button5 = B5.getText();
        String button6 = B6.getText();
        String button7 = B7.getText();
        String button8 = B8.getText();
        String button9 = B9.getText();
        
        if(button1=="X" && button2=="X" && button3=="X" ){
            JOptionPane.showMessageDialog(this, "Player X is Victorious","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            mx++;
            Pontoi();
        }
        
        if(button4=="X" && button5=="X" && button6=="X" ){
            JOptionPane.showMessageDialog(this, "Player X is Victorious","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            mx++;
            Pontoi();
        }
        
        if(button7=="X" && button8=="X" && button9=="X" ){
            JOptionPane.showMessageDialog(this, "Player X is Victorious","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            mx++;
            Pontoi();
        }
        
        if(button1=="X" && button4=="X" && button7=="X" ){
            JOptionPane.showMessageDialog(this, "Player X is Victorious","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            mx++;
            Pontoi();
        }
        
        if(button2=="X" && button5=="X" && button8=="X" ){
            JOptionPane.showMessageDialog(this, "Player X is Victorious","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            mx++;
            Pontoi();
        }
        
        if(button3=="X" && button6=="X" && button9=="X" ){
            JOptionPane.showMessageDialog(this, "Player X is Victorious","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            mx++;
            Pontoi();
        }
        
        if(button1=="X" && button5=="X" && button9=="X" ){
            JOptionPane.showMessageDialog(this, "Player X is Victorious","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            mx++;
            Pontoi();
        }
        
        if(button3=="X" && button5=="X" && button7=="X" ){
            JOptionPane.showMessageDialog(this, "Player X is Victorious","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            mx++;
            Pontoi();
        }
        
        if(button1=="O" && button2=="O" && button3=="O" ){
            JOptionPane.showMessageDialog(this, "Player O is Victorious","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            mo++;
            Pontoi();
        }
        
        if(button4=="O" && button5=="O" && button6=="O" ){
            JOptionPane.showMessageDialog(this, "Player O is Victorious","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            mo++;
            Pontoi();
        }
        
        if(button7=="O" && button8=="O" && button9=="O" ){
            JOptionPane.showMessageDialog(this, "Player O is Victorious","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            mo++;
            Pontoi();
        }
        
        if(button1=="O" && button4=="O" && button7=="O" ){
            JOptionPane.showMessageDialog(this, "Player O is Victorious","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            mo++;
            Pontoi();
        }
        
        if(button2=="O" && button5=="O" && button8=="O" ){
            JOptionPane.showMessageDialog(this, "Player X is Victorious","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            mo++;
            Pontoi();
        }
        
        if(button3=="O" && button6=="O" && button9=="O" ){
            JOptionPane.showMessageDialog(this, "Player O is Victorious","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            mo++;
            Pontoi();
        }
        
        if(button1=="O" && button5=="O" && button9=="O" ){
            JOptionPane.showMessageDialog(this, "Player O is Victorious","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            mo++;
            Pontoi();
        }
        
        if(button3=="O" && button5=="O" && button7=="O" ){
            JOptionPane.showMessageDialog(this, "Player O is Victorious","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            mo++;
            Pontoi();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        PlayerO = new javax.swing.JLabel();
        PlayerX = new javax.swing.JLabel();
        ScoreX = new javax.swing.JLabel();
        ScoreO = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        ResetButton = new javax.swing.JButton();
        NewGameButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B1.setFont(new java.awt.Font("Zilla Slab", 1, 100)); // NOI18N
        B1.setMaximumSize(new java.awt.Dimension(200, 158));
        B1.setMinimumSize(new java.awt.Dimension(200, 158));
        B1.setPreferredSize(new java.awt.Dimension(200, 158));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel2.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 190, 170));

        B2.setFont(new java.awt.Font("Zilla Slab", 3, 100)); // NOI18N
        B2.setMaximumSize(new java.awt.Dimension(200, 158));
        B2.setMinimumSize(new java.awt.Dimension(200, 158));
        B2.setPreferredSize(new java.awt.Dimension(200, 158));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        jPanel2.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 190, 170));

        B3.setFont(new java.awt.Font("Zilla Slab", 3, 100)); // NOI18N
        B3.setMaximumSize(new java.awt.Dimension(200, 158));
        B3.setMinimumSize(new java.awt.Dimension(200, 158));
        B3.setPreferredSize(new java.awt.Dimension(200, 158));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        jPanel2.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 190, 170));

        B4.setFont(new java.awt.Font("Zilla Slab", 3, 100)); // NOI18N
        B4.setMaximumSize(new java.awt.Dimension(200, 158));
        B4.setMinimumSize(new java.awt.Dimension(200, 158));
        B4.setPreferredSize(new java.awt.Dimension(200, 158));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        jPanel2.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 190, 170));

        B5.setFont(new java.awt.Font("Zilla Slab", 3, 100)); // NOI18N
        B5.setMaximumSize(new java.awt.Dimension(200, 158));
        B5.setMinimumSize(new java.awt.Dimension(200, 158));
        B5.setPreferredSize(new java.awt.Dimension(200, 158));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        jPanel2.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 190, 170));

        B6.setFont(new java.awt.Font("Zilla Slab", 3, 100)); // NOI18N
        B6.setMaximumSize(new java.awt.Dimension(200, 158));
        B6.setMinimumSize(new java.awt.Dimension(200, 158));
        B6.setPreferredSize(new java.awt.Dimension(200, 158));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        jPanel2.add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 190, 170));

        B7.setFont(new java.awt.Font("Zilla Slab", 3, 100)); // NOI18N
        B7.setMaximumSize(new java.awt.Dimension(200, 158));
        B7.setMinimumSize(new java.awt.Dimension(200, 158));
        B7.setPreferredSize(new java.awt.Dimension(200, 158));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        jPanel2.add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 190, 170));

        B8.setFont(new java.awt.Font("Zilla Slab", 3, 100)); // NOI18N
        B8.setMaximumSize(new java.awt.Dimension(200, 158));
        B8.setMinimumSize(new java.awt.Dimension(200, 158));
        B8.setPreferredSize(new java.awt.Dimension(200, 158));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        jPanel2.add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 190, 170));

        B9.setFont(new java.awt.Font("Zilla Slab", 3, 100)); // NOI18N
        B9.setMaximumSize(new java.awt.Dimension(200, 158));
        B9.setMinimumSize(new java.awt.Dimension(200, 158));
        B9.setPreferredSize(new java.awt.Dimension(200, 158));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        jPanel2.add(B9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 190, 170));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 650, 690));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(153, 102, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tic Tac Toe Game");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 170));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 190));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 630, 210));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PlayerO.setFont(new java.awt.Font("Zilla Slab", 3, 60)); // NOI18N
        PlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerO.setText("Player O :");
        PlayerO.setToolTipText("");
        jPanel5.add(PlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 80));

        PlayerX.setFont(new java.awt.Font("Zilla Slab", 3, 60)); // NOI18N
        PlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerX.setText("Player X :");
        PlayerX.setToolTipText("");
        jPanel5.add(PlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 300, 80));

        ScoreX.setFont(new java.awt.Font("Zilla Slab", 3, 70)); // NOI18N
        ScoreX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ScoreX.setText("0");
        ScoreX.setToolTipText("");
        ScoreX.setOpaque(true);
        jPanel5.add(ScoreX, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 200, 80));

        ScoreO.setFont(new java.awt.Font("Zilla Slab", 3, 70)); // NOI18N
        ScoreO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ScoreO.setText("0");
        ScoreO.setToolTipText("");
        ScoreO.setOpaque(true);
        jPanel5.add(ScoreO, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 200, 80));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 630, 210));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ResetButton.setFont(new java.awt.Font("Zilla Slab", 3, 60)); // NOI18N
        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        jPanel6.add(ResetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 190));

        NewGameButton.setFont(new java.awt.Font("Zilla Slab", 3, 60)); // NOI18N
        NewGameButton.setText("<html>New<br>Game</html>");
        NewGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameButtonActionPerformed(evt);
            }
        });
        jPanel6.add(NewGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 210, 190));

        ExitButton.setFont(new java.awt.Font("Zilla Slab", 3, 60)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel6.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 200, 190));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 630, 210));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 660, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private JFrame frame;
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit the game ?","Exit Tic Tac Toe",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {     
            System.exit(0); 
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Are you sure you want to reset the game ?"," Reset Tic Tac Toe",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)
        {     
        B1.setEnabled(true);
        B2.setEnabled(true);
        B3.setEnabled(true);
        B4.setEnabled(true);
        B5.setEnabled(true);
        B6.setEnabled(true);
        B7.setEnabled(true);
        B8.setEnabled(true);
        B9.setEnabled(true);
        B1.setText("");
        B2.setText("");
        B3.setText("");
        B4.setText("");
        B5.setText("");
        B6.setText("");
        B7.setText("");
        B8.setText("");
        B9.setText("");
        B1.setBackground(Color.LIGHT_GRAY);
        B2.setBackground(Color.LIGHT_GRAY);
        B3.setBackground(Color.LIGHT_GRAY);
        B4.setBackground(Color.LIGHT_GRAY);
        B5.setBackground(Color.LIGHT_GRAY);
        B6.setBackground(Color.LIGHT_GRAY);
        B7.setBackground(Color.LIGHT_GRAY);
        B8.setBackground(Color.LIGHT_GRAY);
        B9.setBackground(Color.LIGHT_GRAY);      
        }
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void NewGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameButtonActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Are you sure you want to start a new game ?"," New game of Tic Tac Toe",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)
        {  
        B1.setEnabled(true);
        B2.setEnabled(true);
        B3.setEnabled(true);
        B4.setEnabled(true);
        B5.setEnabled(true);
        B6.setEnabled(true);
        B7.setEnabled(true);
        B8.setEnabled(true);
        B9.setEnabled(true);
        ScoreO.setText("0");
        ScoreX.setText("0");
        mo=0;
        mx=0;
        B1.setText("");
        B2.setText("");
        B3.setText("");
        B4.setText("");
        B5.setText("");
        B6.setText("");
        B7.setText("");
        B8.setText("");
        B9.setText("");
        B1.setBackground(Color.LIGHT_GRAY);
        B2.setBackground(Color.LIGHT_GRAY);
        B3.setBackground(Color.LIGHT_GRAY);
        B4.setBackground(Color.LIGHT_GRAY);
        B5.setBackground(Color.LIGHT_GRAY);
        B6.setBackground(Color.LIGHT_GRAY);
        B7.setBackground(Color.LIGHT_GRAY);
        B8.setBackground(Color.LIGHT_GRAY);
        B9.setBackground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_NewGameButtonActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        B1.setText(arxh);
        B1.setEnabled(false);
        Dialekse_Paikth();
        Victory();
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        B2.setText(arxh);
        B2.setEnabled(false);
        Dialekse_Paikth();
        Victory();
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        B3.setText(arxh);
        B3.setEnabled(false);
        Dialekse_Paikth();
        Victory();
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        B4.setText(arxh);
        B4.setEnabled(false);
        Dialekse_Paikth();
        Victory();
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        B5.setText(arxh);
        B5.setEnabled(false);
        Dialekse_Paikth();
        Victory();
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        B6.setText(arxh);
        B6.setEnabled(false);
        Dialekse_Paikth();
        Victory();
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        B7.setText(arxh);
        B7.setEnabled(false);
        Dialekse_Paikth();
        Victory();
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        B8.setText(arxh);
        B8.setEnabled(false);
        Dialekse_Paikth();
        Victory();
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        B9.setText(arxh);
        B9.setEnabled(false);
        Dialekse_Paikth();
        Victory();
    }//GEN-LAST:event_B9ActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(Ergasia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ergasia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ergasia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ergasia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ergasia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton NewGameButton;
    private javax.swing.JLabel PlayerO;
    private javax.swing.JLabel PlayerX;
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel ScoreO;
    private javax.swing.JLabel ScoreX;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
