package gui;

import java.awt.Color;
import javax.swing.JTextField;

public class XOgame extends javax.swing.JFrame {
    
    private boolean Xturn, Oturn, win;
    private int Xscore, Oscore;

    public XOgame() {
        initComponents();
        Xscore = 0;
        Oscore = 0;
        titleTextField.setHorizontalAlignment(JTextField.CENTER);
        turnTextField.setHorizontalAlignment(JTextField.CENTER);
        titleTextField.setEditable(false);
        XscoreTextField.setEditable(false);
        OscoreTextField.setEditable(false);
        this.setLocationRelativeTo(null);
        initiate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleTextField = new javax.swing.JTextField();
        pos3Button = new javax.swing.JButton();
        pos1Button = new javax.swing.JButton();
        pos2Button = new javax.swing.JButton();
        pos4Button = new javax.swing.JButton();
        pos5Button = new javax.swing.JButton();
        pos6Button = new javax.swing.JButton();
        pos7Button = new javax.swing.JButton();
        pos8Button = new javax.swing.JButton();
        pos9Button = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        XscoreLabel = new javax.swing.JLabel();
        OscoreLabel = new javax.swing.JLabel();
        OscoreTextField = new javax.swing.JTextField();
        XscoreTextField = new javax.swing.JTextField();
        playAgainButton = new javax.swing.JButton();
        turnTextField = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(titleTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 7, 160, 30));

        pos3Button.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pos3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos3ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pos3Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 80, 110, 80));

        pos1Button.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pos1Button.setBorder(null);
        pos1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos1ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pos1Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 80, 110, 80));

        pos2Button.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pos2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos2ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pos2Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 110, 80));

        pos4Button.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pos4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos4ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pos4Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 160, 110, 80));

        pos5Button.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pos5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos5ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pos5Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 110, 80));

        pos6Button.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pos6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos6ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pos6Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 160, 110, 80));

        pos7Button.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pos7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos7ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pos7Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 240, 110, 80));

        pos8Button.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pos8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos8ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pos8Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 110, 80));

        pos9Button.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        pos9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos9ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pos9Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 240, 110, 80));

        resetButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 367, 92, -1));

        XscoreLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        XscoreLabel.setText("X score:");
        getContentPane().add(XscoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        OscoreLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OscoreLabel.setText("O score:");
        getContentPane().add(OscoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        getContentPane().add(OscoreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 365, 30, -1));
        getContentPane().add(XscoreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 335, 30, -1));

        playAgainButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        playAgainButton.setText("Play Again");
        playAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainButtonActionPerformed(evt);
            }
        });
        getContentPane().add(playAgainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 337, -1, -1));

        turnTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(turnTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 43, 60, 30));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\fadys\\Downloads\\Self-Learning\\Projects\\Backgrounds\\XO background.jpg")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void initiate(){
        titleTextField.setText("Tic Tac Toe Game");
        Xturn = true;
        Oturn = false; 
        win = false;
        XscoreTextField.setText(String.valueOf(Xscore));
        OscoreTextField.setText(String.valueOf(Oscore));
        turnTextField.setText("X turn");
    }
    
    private void switchTurns() {
        if(Xturn == true) {
            Xturn = false;
            Oturn = true;
            turnTextField.setText("O turn");
        } else {
            Xturn = true;
            Oturn = false;
            turnTextField.setText("X turn");
        }
    }
    
    private void drawTable(){
        pos1Button.setText("");
        pos2Button.setText("");
        pos3Button.setText("");
        pos4Button.setText("");
        pos5Button.setText("");
        pos6Button.setText("");
        pos7Button.setText("");
        pos8Button.setText("");
        pos9Button.setText("");
        pos1Button.setEnabled(true);
        pos2Button.setEnabled(true);
        pos3Button.setEnabled(true);
        pos4Button.setEnabled(true);
        pos5Button.setEnabled(true);
        pos6Button.setEnabled(true);
        pos7Button.setEnabled(true);
        pos8Button.setEnabled(true);
        pos9Button.setEnabled(true);
    }
    
    private void setColor(String letter, Color color){
        if(pos1Button.getText() == letter && pos2Button.getText() == letter && pos3Button.getText() == letter){
                pos1Button.setForeground(color);
                pos2Button.setForeground(color);
                pos3Button.setForeground(color);
           } else if(pos1Button.getText() == letter && pos4Button.getText() == letter && pos7Button.getText() == letter){
                pos1Button.setForeground(color);
                pos4Button.setForeground(color);
                pos7Button.setForeground(color);
           } else if(pos1Button.getText() == letter && pos5Button.getText() == letter && pos9Button.getText() == letter){
                pos1Button.setForeground(color);
                pos5Button.setForeground(color);
                pos9Button.setForeground(color);
           } else if(pos2Button.getText() == letter && pos5Button.getText() == letter && pos8Button.getText() == letter){
                pos2Button.setForeground(color);
                pos5Button.setForeground(color);
                pos8Button.setForeground(color);
           } else if(pos3Button.getText() == letter && pos6Button.getText() == letter && pos9Button.getText() == letter){
                pos3Button.setForeground(color);
                pos6Button.setForeground(color);
                pos9Button.setForeground(color);
           } else if(pos3Button.getText() == letter && pos5Button.getText() == letter && pos7Button.getText() == letter){
                pos3Button.setForeground(color);
                pos5Button.setForeground(color);
                pos7Button.setForeground(color);
           } else if(pos4Button.getText() == letter && pos5Button.getText() == letter && pos6Button.getText() == letter){
                pos4Button.setForeground(color);
                pos5Button.setForeground(color);
                pos6Button.setForeground(color);
           } else if(pos7Button.getText() == letter && pos8Button.getText() == letter && pos9Button.getText() == letter) {
                pos7Button.setForeground(color);
                pos8Button.setForeground(color);
                pos9Button.setForeground(color);
           }
    }
    
    private void checkWin(String letter) {
        if((pos1Button.getText() == letter && pos2Button.getText() == letter && pos3Button.getText() == letter)
           || (pos1Button.getText() == letter && pos4Button.getText() == letter && pos7Button.getText() == letter)
           || (pos1Button.getText() == letter && pos5Button.getText() == letter && pos9Button.getText() == letter)
           || (pos2Button.getText() == letter && pos5Button.getText() == letter && pos8Button.getText() == letter)
           || (pos3Button.getText() == letter && pos6Button.getText() == letter && pos9Button.getText() == letter)
           || (pos3Button.getText() == letter && pos5Button.getText() == letter && pos7Button.getText() == letter)
           || (pos4Button.getText() == letter && pos5Button.getText() == letter && pos6Button.getText() == letter)
           || (pos7Button.getText() == letter && pos8Button.getText() == letter && pos9Button.getText() == letter)) {
            win = true;
            titleTextField.setText(letter + " wins");
            if(letter == "X"){
                Xscore = Xscore + 1;
                XscoreTextField.setText(String.valueOf(Xscore));
            } else {
                Oscore = Oscore + 1;
                OscoreTextField.setText(String.valueOf(Oscore));
            }
            pos1Button.setEnabled(false);
            pos2Button.setEnabled(false);
            pos3Button.setEnabled(false);
            pos4Button.setEnabled(false);
            pos5Button.setEnabled(false);
            pos6Button.setEnabled(false);
            pos7Button.setEnabled(false);
            pos8Button.setEnabled(false);
            pos9Button.setEnabled(false); 
            setColor(letter, Color.green);
        }else if (pos1Button.getText() != "" && pos2Button.getText() != "" && pos3Button.getText() != ""
                   && pos4Button.getText() != "" && pos5Button.getText() != "" && pos6Button.getText() != ""
                   && pos7Button.getText() != "" && pos8Button.getText() != "" && pos9Button.getText() != "") {
            titleTextField.setText("Tie");
        }
    }
    
    private void pos1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos1ButtonActionPerformed
        if(Xturn == true){
            pos1Button.setText("X");
            checkWin("X");
        } else {
            pos1Button.setText("O");
            checkWin("O");
        }
        if(win == false){
            switchTurns();
        }
        pos1Button.setEnabled(false);
    }//GEN-LAST:event_pos1ButtonActionPerformed

    private void pos2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos2ButtonActionPerformed
        if(Xturn == true){
            pos2Button.setText("X");
            checkWin("X");
        } else {
            pos2Button.setText("O");
            checkWin("O");
        }
        if(win == false){
            switchTurns();
        }
        pos2Button.setEnabled(false);        
    }//GEN-LAST:event_pos2ButtonActionPerformed

    private void pos3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos3ButtonActionPerformed
        if(Xturn == true){
            pos3Button.setText("X");
            checkWin("X");
        } else {
            pos3Button.setText("O");
            checkWin("O");
        }
        if(win == false){
            switchTurns();
        }
        pos3Button.setEnabled(false);
    }//GEN-LAST:event_pos3ButtonActionPerformed

    private void pos4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos4ButtonActionPerformed
        if(Xturn == true){
            pos4Button.setText("X");
            checkWin("X");
        } else {
            pos4Button.setText("O");
            checkWin("O");
        }
        if(win == false){
            switchTurns();
        }
        pos4Button.setEnabled(false);
    }//GEN-LAST:event_pos4ButtonActionPerformed

    private void pos5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos5ButtonActionPerformed
        if(Xturn == true){
            pos5Button.setText("X");
            checkWin("X");
        } else {
            pos5Button.setText("O");
            checkWin("O");
        }
        if(win == false){
            switchTurns();
        }
        pos5Button.setEnabled(false);
    }//GEN-LAST:event_pos5ButtonActionPerformed

    private void pos6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos6ButtonActionPerformed
        if(Xturn == true){
            pos6Button.setText("X");
            checkWin("X");
        } else {
            pos6Button.setText("O");
            checkWin("O");
        }
        if(win == false){
            switchTurns();
        }
        pos6Button.setEnabled(false);
    }//GEN-LAST:event_pos6ButtonActionPerformed

    private void pos7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos7ButtonActionPerformed
        if(Xturn == true){
            pos7Button.setText("X");
            checkWin("X");
        } else {
            pos7Button.setText("O");
            checkWin("O");
        }
        if(win == false){
            switchTurns();
        }
        pos7Button.setEnabled(false);
    }//GEN-LAST:event_pos7ButtonActionPerformed

    private void pos8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos8ButtonActionPerformed
        if(Xturn == true){
            pos8Button.setText("X");
            checkWin("X");
        } else {
            pos8Button.setText("O");
            checkWin("O");
        }
        if(win == false){
            switchTurns();
        }
        pos8Button.setEnabled(false);
    }//GEN-LAST:event_pos8ButtonActionPerformed

    private void pos9ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos9ButtonActionPerformed
        if(Xturn == true){
            pos9Button.setText("X");
            checkWin("X");
        } else {
            pos9Button.setText("O");
            checkWin("O");
        }
        if(win == false){
            switchTurns();
        }
        pos9Button.setEnabled(false);
    }//GEN-LAST:event_pos9ButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        Xscore = 0;
        Oscore = 0;
        regenerateGame();
    }//GEN-LAST:event_resetButtonActionPerformed
    
    private void playAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainButtonActionPerformed
        regenerateGame();
    }//GEN-LAST:event_playAgainButtonActionPerformed

    private void regenerateGame() {
       if(Xturn == true) {
            setColor("X", Color.black);
        } else {
            setColor("O", Color.black);
        } 
        initiate();
        drawTable();
    }
    
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
            java.util.logging.Logger.getLogger(XOgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XOgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XOgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XOgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XOgame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OscoreLabel;
    private javax.swing.JTextField OscoreTextField;
    private javax.swing.JLabel XscoreLabel;
    private javax.swing.JTextField XscoreTextField;
    private javax.swing.JLabel background;
    private javax.swing.JButton playAgainButton;
    private javax.swing.JButton pos1Button;
    private javax.swing.JButton pos2Button;
    private javax.swing.JButton pos3Button;
    private javax.swing.JButton pos4Button;
    private javax.swing.JButton pos5Button;
    private javax.swing.JButton pos6Button;
    private javax.swing.JButton pos7Button;
    private javax.swing.JButton pos8Button;
    private javax.swing.JButton pos9Button;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JTextField turnTextField;
    // End of variables declaration//GEN-END:variables

}
