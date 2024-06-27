/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author kelompok 3
 */

import javax.swing.Timer;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
public class loading extends javax.swing.JFrame {

    public Timer t = null;
    private int count = 0;
    
    public loading(){
        initComponents();
       
        try {
             BufferedImage beam = ImageIO.read(getClass().getResource("library.png"));
             setIconImage(beam); 
        } catch (IOException ex) {
            Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setTitle("Loading");
        
        t = new Timer(100, new ActionListener() {
            
           @Override
           public void actionPerformed(ActionEvent e){
                count +=5;
                jProgressBar1.setValue(count);
                if(jProgressBar1.getValue()<100){
                jProgressBar1.setValue(jProgressBar1.getValue()+ 1);    
                }
                if(jProgressBar1.getValue()==100 ){
                    new beranda().setVisible(true);
                 t.stop();
                 dispose();
                }
            } 
        });
        t.start();
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
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar1.setBackground(new java.awt.Color(204, 255, 204));
        jProgressBar1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(0, 153, 0));
        jProgressBar1.setBorderPainted(false);
        jProgressBar1.setStringPainted(true);
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 560, 30));

        jLabel1.setFont(new java.awt.Font("Corbel", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOADING");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}