
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GIRIDHAR
 */
public class TicTacToe extends javax.swing.JFrame {

    private String startGame ="X";
    private int xCount=0;
    private int oCount=0;
    
    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
    }

    private void gameScore(){
    jtf1.setText(String.valueOf(xCount));
    jtf2.setText(String.valueOf(oCount));
    }
    private void winningGame(){
    String b1=jb1.getText();
    String b2=jb2.getText();
    String b3=jb3.getText();
    
    String b4=jb4.getText();
    String b5=jb5.getText();
    String b6=jb6.getText();
    
    String b7=jb7.getText();
    String b8=jb8.getText();
    String b9=jb9.getText();
    
    if( b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins","TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jb1.setBackground(Color.yellow);
            jb2.setBackground(Color.yellow);
            jb3.setBackground(Color.yellow);
        }
    if( b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins","TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jb4.setBackground(Color.yellow);
            jb5.setBackground(Color.yellow);
            jb6.setBackground(Color.yellow);
        }
    if( b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins","TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jb7.setBackground(Color.yellow);
            jb8.setBackground(Color.yellow);
            jb9.setBackground(Color.yellow);
        }
    if( b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins","TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jb1.setBackground(Color.yellow);
            jb4.setBackground(Color.yellow);
            jb7.setBackground(Color.yellow);
        }
    if( b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins","TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jb2.setBackground(Color.yellow);
            jb5.setBackground(Color.yellow);
            jb8.setBackground(Color.yellow);
        }
    if( b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins","TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jb3.setBackground(Color.yellow);
            jb6.setBackground(Color.yellow);
            jb9.setBackground(Color.yellow);
        }
    if( b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins","TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jb1.setBackground(Color.yellow);
            jb5.setBackground(Color.yellow);
            jb9.setBackground(Color.yellow);
        }
    if( b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins","TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jb3.setBackground(Color.yellow);
            jb5.setBackground(Color.yellow);
            jb7.setBackground(Color.yellow);
        }
    
    
    
    // O WINS
        if( b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins","TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jb1.setBackground(Color.yellow);
            jb2.setBackground(Color.yellow);
            jb3.setBackground(Color.yellow);
        }
    if( b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins","TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jb4.setBackground(Color.yellow);
            jb5.setBackground(Color.yellow);
            jb6.setBackground(Color.yellow);
        }
    if( b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins","TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jb7.setBackground(Color.yellow);
            jb8.setBackground(Color.yellow);
            jb9.setBackground(Color.yellow);
        }
    if( b1 == ("O") && b4 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins","TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jb1.setBackground(Color.yellow);
            jb4.setBackground(Color.yellow);
            jb7.setBackground(Color.yellow);
        }
    if( b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins","TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jb2.setBackground(Color.yellow);
            jb5.setBackground(Color.yellow);
            jb8.setBackground(Color.yellow);
        }
    if( b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins","TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jb3.setBackground(Color.yellow);
            jb6.setBackground(Color.yellow);
            jb9.setBackground(Color.yellow);
        }
    if( b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins","TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jb1.setBackground(Color.yellow);
            jb5.setBackground(Color.yellow);
            jb9.setBackground(Color.yellow);
        }
    if( b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins","TicTacToe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jb3.setBackground(Color.yellow);
            jb5.setBackground(Color.yellow);
            jb7.setBackground(Color.yellow);
        }
    }
    
    
    private void choose_a_player(){
    
        if(startGame.equalsIgnoreCase("X"))
        {
        startGame="O";
        }
        else
        {
        startGame="X";
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
        jLabel2 = new javax.swing.JLabel();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jb10 = new javax.swing.JButton();
        jb11 = new javax.swing.JButton();
        jtf2 = new javax.swing.JTextField();
        jtf1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setText("TicTacToe");

        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Player O:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Player X:");

        jb10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jb10.setText("RESET");
        jb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb10ActionPerformed(evt);
            }
        });

        jb11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jb11.setText("EXIT");
        jb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb11, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jtf2)
                    .addComponent(jtf1))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtf1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtf2)
                                        .addGap(5, 5, 5))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb11ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jb11ActionPerformed

    private void jb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb10ActionPerformed
jb1.setText(" ");
jb2.setText(" ");
jb3.setText(" ");
jb4.setText(" ");
jb5.setText(" ");
jb6.setText(" ");
jb7.setText(" ");
jb8.setText(" ");
jb9.setText(" ");

jb1.setBackground(Color.white);
jb2.setBackground(Color.white);
jb3.setBackground(Color.white);
jb4.setBackground(Color.white);
jb5.setBackground(Color.white);
jb6.setBackground(Color.white);
jb7.setBackground(Color.white);
jb8.setBackground(Color.white);
   jb9.setBackground(Color.white);     // TODO add your handling code here:
    }//GEN-LAST:event_jb10ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        jb1.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
        jb1.setForeground(Color.red);
        }
        else
        {
            jb1.setForeground(Color.green);
        }
        choose_a_player();
        winningGame();
        // TODO add your handling code here:
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
jb2.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
        jb2.setForeground(Color.red);
        }
        else
        {
            jb2.setForeground(Color.green);
        }
        choose_a_player(); 
        winningGame();// TODO add your handling code here:
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
jb3.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
        jb3.setForeground(Color.red);
        }
        else
        {
            jb3.setForeground(Color.green);
        }
        choose_a_player();  
        winningGame();// TODO add your handling code here:
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
jb4.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
        jb4.setForeground(Color.red);
        }
        else
        {
            jb4.setForeground(Color.green);
        }
        choose_a_player();   
        winningGame();// TODO add your handling code here:
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
jb5.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
        jb5.setForeground(Color.red);
        }
        else
        {
            jb5.setForeground(Color.green);
        }
        choose_a_player(); 
        winningGame();// TODO add your handling code here:
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
jb6.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
        jb6.setForeground(Color.red);
        }
        else
        {
            jb6.setForeground(Color.green);
        }
        choose_a_player();
        winningGame();// TODO add your handling code here:
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
jb7.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
        jb7.setForeground(Color.red);
        }
        else
        {
            jb7.setForeground(Color.green);
        }
        choose_a_player(); 
        winningGame();// TODO add your handling code here:
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
jb8.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
        jb8.setForeground(Color.red);
        }
        else
        {
            jb8.setForeground(Color.green);
        }
        choose_a_player();   
        winningGame();// TODO add your handling code here:
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
jb9.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
        jb9.setForeground(Color.red);
        }
        else
        {
            jb9.setForeground(Color.green);
        }
        choose_a_player();  
        winningGame();// TODO add your handling code here:
    }//GEN-LAST:event_jb9ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb10;
    private javax.swing.JButton jb11;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JTextField jtf1;
    private javax.swing.JTextField jtf2;
    // End of variables declaration//GEN-END:variables
}
