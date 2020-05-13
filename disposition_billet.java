
package first_project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class disposition_billet extends javax.swing.JFrame {
    int nb_10=0;
    int nb_20=0;
    int nb_30=0;
    int nb_50=0;
    int montant_versé=0;
    compte compte;
    File file ;
    boolean test_disposition;
    

   
    public disposition_billet() {
         nb_10=0;
    nb_20=0;
     nb_30=0;
     nb_50=0;
        test_disposition=false;
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        cinquante_dinar = new javax.swing.JLabel();
        dix_dinar = new javax.swing.JLabel();
        vingt_dinar = new javax.swing.JLabel();
        trente_dinar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(670, 803));
        setMinimumSize(new java.awt.Dimension(670, 803));
        setPreferredSize(new java.awt.Dimension(670, 803));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(226, 226, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(669, 803));
        jPanel1.setMinimumSize(new java.awt.Dimension(669, 803));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/10tunisienne-ConvertImage.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 30, 260, 140);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/20-ConvertImage.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 180, 250, 170);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/30-ConvertImage.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 350, 290, 140);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/50-ConvertImage.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 520, 260, 120);

        jButton1.setFont(new java.awt.Font("Source Sans Pro Black", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Disposer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 690, 230, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(460, 110, 50, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(460, 210, 50, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(460, 40, 50, 40);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(460, 280, 50, 40);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("+");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(460, 360, 50, 40);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("-");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(460, 430, 50, 40);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("+");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(460, 510, 50, 40);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setText("-");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(460, 580, 50, 40);

        cinquante_dinar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cinquante_dinar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cinquante_dinar.setText("0");
        jPanel1.add(cinquante_dinar);
        cinquante_dinar.setBounds(460, 550, 40, 30);

        dix_dinar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dix_dinar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dix_dinar.setText("0");
        jPanel1.add(dix_dinar);
        dix_dinar.setBounds(470, 80, 40, 30);

        vingt_dinar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vingt_dinar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vingt_dinar.setText("0");
        jPanel1.add(vingt_dinar);
        vingt_dinar.setBounds(460, 250, 40, 30);

        trente_dinar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        trente_dinar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trente_dinar.setText("0");
        jPanel1.add(trente_dinar);
        trente_dinar.setBounds(460, 400, 40, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 669, 803);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
if(nb_20!=0){
    nb_20--;
    vingt_dinar.setText(Integer.toString(nb_20));
    
}
        

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
if(nb_30!=0){
    nb_30--;
   trente_dinar.setText(Integer.toString(nb_30));
    
}
        


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
nb_10++;
dix_dinar.setText(Integer.toString(nb_10));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

       nb_20++;
       vingt_dinar.setText(Integer.toString(nb_20));
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
nb_30++;
       trente_dinar.setText(Integer.toString(nb_30));
        

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
nb_50++;
       cinquante_dinar.setText(Integer.toString(nb_50));
      
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(nb_10!=0){
    nb_10--;
    dix_dinar.setText(Integer.toString(nb_10));
    
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      if(nb_50!=0){
    nb_50--;
    cinquante_dinar.setText(Integer.toString(nb_50));
    
}
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.montant_versé=(nb_10*10000)+(nb_20*20000)+(nb_30*30000)+(nb_50*50000);
      compte.depot(montant_versé);
       this.test_disposition=true;
       this.nb_10=0;
       this.nb_20=0;
       this.nb_30=0;
       this.nb_50=0;
       dix_dinar.setText("0");
       vingt_dinar.setText("0");
       trente_dinar.setText("0");
       cinquante_dinar.setText("0");
       
      
        
          
          
          
          // changer le solde dans le fichier comptes.txt
                
                try{
                    
                    File fichierCible=new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\First_Project\\fichierTemporaire.txt");
                    
                    fichierCible.createNewFile();
                
                    
                    Scanner myReader=new Scanner(file);
                    FileWriter Writer=new FileWriter(fichierCible);
                    
                    while(myReader.hasNextLine()){
                       String line=myReader.nextLine();
                       String tab[]=line.split("  ") ;
                       String NUM=Integer.toString(compte.num_compte) ;
                       String SOLDE=Double.toString(compte.solde) ;
                       if(tab[0].equals(NUM)){
                            Writer.write(tab[0]);Writer.write("  "); Writer.write(tab[1]);Writer.write("  ");Writer.write(SOLDE);Writer.write("  ");
                           Writer.write(tab[3]);Writer.write("  ");Writer.write(tab[4]);Writer.write("\n");
                           
                           
                       }
                       else {Writer.write(line);Writer.write("\n");}
                        
                    }
                    myReader.close();
                     Writer.close();
                     file.delete();
                     fichierCible.renameTo(file) ;
                    
                       
                }catch (IOException ex) {
  ex.printStackTrace();
}
      
     this.hide();
        
    }//GEN-LAST:event_jButton1ActionPerformed

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
               disposition_billet frame3= new disposition_billet();
                        frame3.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cinquante_dinar;
    private javax.swing.JLabel dix_dinar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel trente_dinar;
    private javax.swing.JLabel vingt_dinar;
    // End of variables declaration//GEN-END:variables
}
