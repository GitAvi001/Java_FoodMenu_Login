/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmenu.and.login;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import static jdk.nashorn.internal.objects.NativeDebug.getClass;
import static sun.security.x509.OIDMap.getClass;


/**
 *
 * @author Avindu
 */
public class LoginForm extends javax.swing.JFrame {
    
    //adding the login arrow image path
    
    String login_image="\\/images/login.png";
    String close_image="\\/images/close.jpg";
    
    //code for create borders
   
    Border panel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.DARK_GRAY);
    Border title_border = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.DARK_GRAY);
    Border text_border = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.YELLOW);
    Border red_text_border = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.red);
    
    public LoginForm() {
        initComponents();
        
        //center the form
        this.setLocationRelativeTo(null);
       //show images
        
        displayImage(login_image ,jLabel_BigImage);
        displayImage(close_image, jLabel_Close);
        
        
        //set borders
       jPanel_container.setBorder(panel_border);
       jLable_title.setBorder(title_border);
       jTextField_Username.setBorder(text_border);
       jPasswordField1.setBorder(text_border);
       
    }
    
    
    //create a function to display images
    public void displayImage(String pic, JLabel label)
    {
    
        ImageIcon imgico=new ImageIcon(getClass().getResource(pic));
        
        Image img = imgico.getImage().getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
        
        label.setIcon(new ImageIcon(img));

        
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_container = new javax.swing.JPanel();
        jLabel_BigImage = new javax.swing.JLabel();
        jLabel_Close = new javax.swing.JLabel();
        jLable_title = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton_LoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_BigImage.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_BigImage.setOpaque(true);

        jLabel_Close.setBackground(new java.awt.Color(204, 0, 0));
        jLabel_Close.setOpaque(true);
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });

        jLable_title.setBackground(new java.awt.Color(255, 255, 255));
        jLable_title.setFont(new java.awt.Font("Verdana", 2, 70)); // NOI18N
        jLable_title.setText("Login ");

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Username:");

        jTextField_Username.setBackground(new java.awt.Color(194, 177, 183));
        jTextField_Username.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField_Username.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Password:");

        jPasswordField1.setBackground(new java.awt.Color(194, 177, 183));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jButton_LoginButton.setBackground(new java.awt.Color(48, 45, 50));
        jButton_LoginButton.setFont(new java.awt.Font("Verdana", 0, 30)); // NOI18N
        jButton_LoginButton.setText("Login");
        jButton_LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_containerLayout = new javax.swing.GroupLayout(jPanel_container);
        jPanel_container.setLayout(jPanel_containerLayout);
        jPanel_containerLayout.setHorizontalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addComponent(jLabel_BigImage, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_containerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_containerLayout.createSequentialGroup()
                                .addGap(0, 369, Short.MAX_VALUE)
                                .addComponent(jLabel_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_containerLayout.createSequentialGroup()
                                .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLable_title, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel_containerLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton_LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel_containerLayout.setVerticalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_BigImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addComponent(jLabel_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLable_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton_LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginButtonActionPerformed
        //Login
        String Username=jTextField_Username.getText().trim();
        
        String password=String.valueOf(jPasswordField1.getPassword()).trim();
        
        if(Username.equals(""))
        {
           jTextField_Username.setBorder(red_text_border);
           System.out.println("Enter The Username");
            
        }
        else if(password.equals(""))
        {
            jPasswordField1.setBorder(red_text_border);
            System.out.println("Enter the password");
            
        }
        else
        {
        
            if(Username.equals("admin") && password.equals("pass"))
            {
                
                FoodMenuForm menuf=new FoodMenuForm();
                
                menuf.setVisible(true);
                this.setVisible(false);
                System.out.println("Yes");
                
            }
            else
            {
                jTextField_Username.setBorder(red_text_border);
                jPasswordField1.setBorder(text_border);
                JOptionPane.showMessageDialog(null,"Invalid Username or Password","Error",JOptionPane.ERROR_MESSAGE);
                System.out.println("No");
            
            }
        }
    }//GEN-LAST:event_jButton_LoginButtonActionPerformed

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
       //closing the form by clicking the x mark
       
        System.exit(0);
        
    }//GEN-LAST:event_jLabel_CloseMouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_LoginButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_BigImage;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLable_title;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_container;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
