/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmenu.and.login;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.Border;

/**
 *
 * @author Avindu
 */
public class FoodMenuForm extends javax.swing.JFrame {

    /**
     * Creates new form FoodMenuForm
     */
    
    String close_image="\\/images/close.jpg";
    
    //code for create borders
   
    Border panel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.DARK_GRAY);
    
    //setting timers to go up or down
    Timer tm_A, tm_B, tm_C, tm_D;
    
    //variables for panel height
    int pl_A = 70,pl_B = 70,pl_C = 70,pl_D = 70;
   
    public FoodMenuForm() {
        initComponents();
        
        
        //center form
        this.setLocationRelativeTo(null);
        
        displayImage(close_image,jLabel_close_);
        
        //set borders
        
        jPanel_container.setBorder(panel_border);
        
        //changing jbuuton background colors
        Component[] panels=jPanel_container.getComponents();
        
        
        for(Component panel:panels){
        
            panel.setBackground(Color.DARK_GRAY);
            
            
           if(panel instanceof JPanel){
               
               for(Component btn : ((JPanel) panel).getComponents())
                {
                   if(btn instanceof JButton)        
                
                    btn.setBackground(Color.yellow);
                    btn.setForeground(Color.white);
                    
                }  
           } 
        }
        
    tm_A = new Timer(10 ,new ActionListener(){
    
    
    public void actionPerformed(ActionEvent e){
    
        if(pl_A > 300)
        {
            
            
            tm_A.stop();
        
        }
        else{
        
            jPanel_A_.setSize(jPanel_A_.getWidth(),pl_A);
            
            pl_A+=20;
        }
    
    
    }
    
    });
    
    tm_B = new Timer(10 ,new ActionListener(){
    
    
    public void actionPerformed(ActionEvent e){
    
        if(pl_B > 300)
        {
        
            tm_B.stop();
        
        }
        else{
        
            jPanel_B_.setSize(jPanel_B_.getWidth(),pl_B);
            
            pl_B+=20;
        }
    
    
    }
    
    });
    
    tm_C = new Timer(10 ,new ActionListener(){
    
    
    public void actionPerformed(ActionEvent e){
    
        if(pl_C > 300)
        {
        
            tm_C.stop();
        
        }
        else{
        
            jPanel_C_.setSize(jPanel_C_.getWidth(),pl_C);
            
            pl_C+=20;
        }
    
    
    }
    
    });
    
    tm_D = new Timer(10 ,new ActionListener(){
    
    
    public void actionPerformed(ActionEvent e){
    
        if(pl_D > 300)
        {
        
            tm_D.stop();
        
        }
        else{
        
            jPanel_D_.setSize(jPanel_D_.getWidth(),pl_D);
            
            pl_D+=20;
        }
    
    
    }
    
    });
    
    jButton_A_.addMouseListener(new MouseAdapter() {
    
    
    public void mouseEntered(MouseEvent e)
    {
        jPanel_B_.setSize(jPanel_B_.getWidth(),pl_B);
        jPanel_C_.setSize(jPanel_C_.getWidth(),pl_C);
        jPanel_D_.setSize(jPanel_D_.getWidth(),pl_D);
        tm_A.start();
    
    }      
            
    public void mouseExited(MouseEvent e)
    {
    
        tm_A.stop();
        pl_A=70;
      
    
    }
    
    });
    
    
     jButton_B_.addMouseListener(new MouseAdapter() {
    
    
    public void mouseEntered(MouseEvent e)
    {
        jPanel_A_.setSize(jPanel_A_.getWidth(),pl_A);
        jPanel_C_.setSize(jPanel_C_.getWidth(),pl_C);
        jPanel_D_.setSize(jPanel_D_.getWidth(),pl_D);
        tm_B.start();
    
    }      
            
    public void mouseExited(MouseEvent e)
    {
    
        tm_B.stop();
        pl_B = 70;
    }
    
    });
     
     jButton_C_.addMouseListener(new MouseAdapter() {
    
    
    public void mouseEntered(MouseEvent e)
    {
    
        jPanel_B_.setSize(jPanel_B_.getWidth(),pl_B);
        jPanel_A_.setSize(jPanel_A_.getWidth(),pl_A);
        jPanel_D_.setSize(jPanel_D_.getWidth(),pl_D);
        tm_C.start();
        
    
    }      
            
    public void mouseExited(MouseEvent e)
    {
    
        tm_C.stop();
        pl_C = 70;
    
    }
    
    });
    
    jButton_D_.addMouseListener(new MouseAdapter() {
    
    
    public void mouseEntered(MouseEvent e)
    {
        
        jPanel_B_.setSize(jPanel_B_.getWidth(),pl_B);
        jPanel_C_.setSize(jPanel_C_.getWidth(),pl_C);
        jPanel_A_.setSize(jPanel_A_.getWidth(),pl_A);
        tm_D.start();
    
    }      
            
    public void mouseExited(MouseEvent e)
    {
    
        tm_D.stop();
        pl_D = 70;
    
    }
    
    });
    
    }
    

    public void displayImage(String pic, JLabel label)
    {
    
        ImageIcon imgico=new ImageIcon(getClass().getResource(pic));
        
        Image img = imgico.getImage().getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
        
        label.setIcon(new ImageIcon(img));

        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_container = new javax.swing.JPanel();
        jPanel_A_ = new javax.swing.JPanel();
        jButton_A_ = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton_A_1 = new javax.swing.JButton();
        jPanel_B_ = new javax.swing.JPanel();
        jButton_B_ = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel_C_ = new javax.swing.JPanel();
        jButton_C_ = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel_D_ = new javax.swing.JPanel();
        jButton_D_ = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel_close_ = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_container.setBackground(new java.awt.Color(255, 255, 255));

        jButton_A_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_A_.setText("Menu Item A");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton2.setText("Menu Item 2");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton3.setText("Menu Item 3");

        jButton_A_1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_A_1.setText("Menu Item 1");

        javax.swing.GroupLayout jPanel_A_Layout = new javax.swing.GroupLayout(jPanel_A_);
        jPanel_A_.setLayout(jPanel_A_Layout);
        jPanel_A_Layout.setHorizontalGroup(
            jPanel_A_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton_A_, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_A_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_A_Layout.setVerticalGroup(
            jPanel_A_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_A_Layout.createSequentialGroup()
                .addComponent(jButton_A_, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_A_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );

        jButton_B_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_B_.setText("Menu Item B");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton5.setText("Menu Item 1");

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton6.setText("Menu Item 2");

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton7.setText("Menu Item 3");

        javax.swing.GroupLayout jPanel_B_Layout = new javax.swing.GroupLayout(jPanel_B_);
        jPanel_B_.setLayout(jPanel_B_Layout);
        jPanel_B_Layout.setHorizontalGroup(
            jPanel_B_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton_B_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_B_Layout.setVerticalGroup(
            jPanel_B_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_B_Layout.createSequentialGroup()
                .addComponent(jButton_B_, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
        );

        jButton_C_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_C_.setText("Menu Item C");

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton9.setText("Menu Item 1");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton10.setText("Menu Item 2");

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton11.setText("Menu Item 3");

        javax.swing.GroupLayout jPanel_C_Layout = new javax.swing.GroupLayout(jPanel_C_);
        jPanel_C_.setLayout(jPanel_C_Layout);
        jPanel_C_Layout.setHorizontalGroup(
            jPanel_C_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton_C_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_C_Layout.setVerticalGroup(
            jPanel_C_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_C_Layout.createSequentialGroup()
                .addComponent(jButton_C_, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );

        jButton_D_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_D_.setText("Menu Item D");

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton12.setText("Menu Item 1");

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton13.setText("Menu Item 2");

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton14.setText("Menu Item 3");

        javax.swing.GroupLayout jPanel_D_Layout = new javax.swing.GroupLayout(jPanel_D_);
        jPanel_D_.setLayout(jPanel_D_Layout);
        jPanel_D_Layout.setHorizontalGroup(
            jPanel_D_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton_D_, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_D_Layout.setVerticalGroup(
            jPanel_D_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_D_Layout.createSequentialGroup()
                .addComponent(jButton_D_, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_close_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_close_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_containerLayout = new javax.swing.GroupLayout(jPanel_container);
        jPanel_container.setLayout(jPanel_containerLayout);
        jPanel_containerLayout.setHorizontalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_A_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_B_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_C_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_D_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_close_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_containerLayout.setVerticalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addComponent(jLabel_close_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_A_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel_B_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel_C_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel_D_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jLabel_close_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_close_MouseClicked
        //design form closing
        
        System.exit(0);
        
        
    }//GEN-LAST:event_jLabel_close_MouseClicked

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
            java.util.logging.Logger.getLogger(FoodMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodMenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton_A_;
    private javax.swing.JButton jButton_A_1;
    private javax.swing.JButton jButton_B_;
    private javax.swing.JButton jButton_C_;
    private javax.swing.JButton jButton_D_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_close_;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel_A_;
    private javax.swing.JPanel jPanel_B_;
    private javax.swing.JPanel jPanel_C_;
    private javax.swing.JPanel jPanel_D_;
    private javax.swing.JPanel jPanel_container;
    // End of variables declaration//GEN-END:variables
}
