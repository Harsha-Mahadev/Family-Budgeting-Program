
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;

/*
* Created by Teodor Kljaic
* On October 31
*
*/

/**
 *
 * @author Teodor Kljaic
 */
public class FamilyBudgetProgram extends javax.swing.JFrame {
    
    /**
     * Creates new form FamilyBudgetProgram
     */
    public FamilyBudgetProgram() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        housingE = new javax.swing.JTextField();
        transportE = new javax.swing.JTextField();
        lifeE = new javax.swing.JTextField();
        savingE = new javax.swing.JTextField();
        netIncome = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        housingP = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        transportP = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lifeP = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        savingP = new javax.swing.JLabel();
        housingG = new javax.swing.JLabel();
        transportG = new javax.swing.JLabel();
        lifeG = new javax.swing.JLabel();
        savingG = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        message1 = new javax.swing.JLabel();
        message2 = new javax.swing.JLabel();
        message3 = new javax.swing.JLabel();
        message4 = new javax.swing.JLabel();
        warning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        titleLabel.setText("Family Budget");

        jLabel1.setText("Enter the amount you spend in each category per month.");

        jLabel2.setText("Housing:");

        jLabel3.setText("Transportation:");

        jLabel4.setText("Life:");

        jLabel5.setText("Savings:");

        jLabel6.setText("Enter your net monthly income:");

        housingE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                housingEKeyTyped(evt);
            }
        });

        transportE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportEActionPerformed(evt);
            }
        });
        transportE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                transportEKeyTyped(evt);
            }
        });

        lifeE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lifeEKeyTyped(evt);
            }
        });

        savingE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savingEActionPerformed(evt);
            }
        });
        savingE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                savingEKeyTyped(evt);
            }
        });

        netIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netIncomeActionPerformed(evt);
            }
        });
        netIncome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                netIncomeKeyTyped(evt);
            }
        });

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Housing");

        jLabel8.setText("Monthly Spending");

        housingP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setText("Transportation");

        transportP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setText("Life");

        lifeP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setText("Savings");

        savingP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        housingG.setBackground(new java.awt.Color(255, 51, 51));
        housingG.setOpaque(true);

        transportG.setBackground(new java.awt.Color(0, 153, 153));
        transportG.setOpaque(true);

        lifeG.setBackground(new java.awt.Color(0, 102, 102));
        lifeG.setOpaque(true);

        savingG.setBackground(new java.awt.Color(0, 0, 204));
        savingG.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(housingP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(housingG))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(transportP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(transportG, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lifeP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lifeG, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(savingP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(savingG, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(290, 290, 290))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(housingP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(housingG, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transportP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transportG, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lifeP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lifeG, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(savingP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(savingG, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        message1.setToolTipText("");

        message3.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(message1)
                    .addComponent(message2)
                    .addComponent(message3)
                    .addComponent(message4))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(message1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(message2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(message3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(message4)
                .addGap(25, 25, 25))
        );

        warning.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(housingE, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(transportE, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(warning)
                                    .addComponent(netIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(savingE, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lifeE, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)))
                .addGap(153, 153, 153))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(299, 299, 299))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(titleLabel)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(housingE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(transportE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(netIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lifeE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculate, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savingE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(warning))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transportEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportEActionPerformed
        // TODO add your handling code here:
//

    }//GEN-LAST:event_transportEActionPerformed

    private void savingEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savingEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savingEActionPerformed

    private void netIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netIncomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_netIncomeActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        //variable declaration
        // This conditional statement checks if any of the jTextFields are empty, if so It'll throw a warning message and returns out of the method
        if(netIncome.getText().toString().isEmpty() ||
                housingE.getText().toString().isEmpty() ||
                transportE.getText().toString().isEmpty() ||
                lifeE.getText().toString().isEmpty() ||
                savingE.getText().toString().isEmpty()){
            warning.setVisible(true);
            warning.setText("Edit Fields cannot be empty");
            return;
        }
        warning.setVisible(false);// if none of the textfileds are empty set the warning Label Invisible
        
        
        // reading from text fields as a String and converting it to Integer
        int NetIncome=Integer.parseInt(this.netIncome.getText().toString());
        int housing=Integer.parseInt(this.housingE.getText().toString());
        int transport=Integer.parseInt(this.transportE.getText().toString());
        int life=Integer.parseInt(this.lifeE.getText().toString());
        int saving=Integer.parseInt(this.savingE.getText().toString());
        
        
        
        //Calculating the percentage values
        int housingPercentage=Math.round(housing*100/NetIncome);
        int transportPercentage=Math.round(transport*100/NetIncome);
        int lifePercentage=Math.round(life*100/NetIncome);
        int savingsPercantage=Math.round(saving*100/NetIncome);
        
        
        
        //Setting the respective percentage values to the Lables
        housingP.setText(housingPercentage+"%");
        lifeP.setText(lifePercentage+"%");
        savingP.setText(savingsPercantage+"%");
        transportP.setText(transportPercentage+"%");
        
        
        //Setting the graph to their values
        transportG.setVisible(true);
        transportG.setSize(new Dimension(transportPercentage*2, 25));
        lifeG.setVisible(true);
        lifeG.setSize(lifePercentage*2, 25);
        savingG.setVisible(true);
        savingG.setSize(savingsPercantage*2, 25);
        housingG.setVisible(true);
        housingG.setSize(housingPercentage*2, 25);
        
        
        // Check if the savings percentage is 
        if(savingsPercantage<=10)
            message4.setText("Warning!, you are not saving enough money");
        else
            message4.setText("Great job!, you are saving a good amount of money");
        
        
        if(lifePercentage<=25)
            message3.setText("Great!, you are spending less money on life");
        else
            message3.setText("Warning! you are spending a lots of money on life ");
        
        if(transportPercentage<=15)
            message2.setText("Great!, you are spending less money on transportation");
        else
            message2.setText("Warning! you are spending a lots of money on transportation ");
        
        if(lifePercentage<=35)
            message1.setText("Great!, you are spending less money on your house");
        else
            message1.setText("Warning! you are spending a lots of money on Housing ");
        
        
        
        
    }//GEN-LAST:event_calculateActionPerformed

    private void housingEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_housingEKeyTyped
        // TODO add your handling code here:
        
        keyHandle(evt);
        
    }//GEN-LAST:event_housingEKeyTyped

    private void transportEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transportEKeyTyped
        // TODO add your handling code here:
        keyHandle(evt);

    }//GEN-LAST:event_transportEKeyTyped

    private void lifeEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lifeEKeyTyped
        // TODO add your handling code here:
        keyHandle(evt);

    }//GEN-LAST:event_lifeEKeyTyped

    private void savingEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_savingEKeyTyped
        // TODO add your handling code here:
        keyHandle(evt);

    }//GEN-LAST:event_savingEKeyTyped

    private void netIncomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_netIncomeKeyTyped
        // TODO add your handling code here:
        keyHandle(evt);

    }//GEN-LAST:event_netIncomeKeyTyped
    
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
            java.util.logging.Logger.getLogger(FamilyBudgetProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FamilyBudgetProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FamilyBudgetProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FamilyBudgetProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FamilyBudgetProgram().setVisible(true);
                
            }
        });
    }
    
    
    private void keyHandle(java.awt.event.KeyEvent evt){
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE)
            evt.consume();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JTextField housingE;
    private javax.swing.JLabel housingG;
    private javax.swing.JLabel housingP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lifeE;
    private javax.swing.JLabel lifeG;
    private javax.swing.JLabel lifeP;
    private javax.swing.JLabel message1;
    private javax.swing.JLabel message2;
    private javax.swing.JLabel message3;
    private javax.swing.JLabel message4;
    private javax.swing.JTextField netIncome;
    private javax.swing.JTextField savingE;
    private javax.swing.JLabel savingG;
    private javax.swing.JLabel savingP;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField transportE;
    private javax.swing.JLabel transportG;
    private javax.swing.JLabel transportP;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
    
    
}
