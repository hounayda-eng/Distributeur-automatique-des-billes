
package first_project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class recuperation_billet extends javax.swing.JFrame {
boolean test_recuperation ;
compte c=new compte();

double montant_à_retrancher;
File file;
int montant_demande ;
    public recuperation_billet() {
        test_recuperation=false;
        
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dix_dinar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        trente_dinar = new javax.swing.JLabel();
        cinquante_dinar = new javax.swing.JLabel();
        vingt_dinar = new javax.swing.JLabel();
        recup_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("veillez récuperer vos billets");
        setMaximumSize(new java.awt.Dimension(500, 651));
        setMinimumSize(new java.awt.Dimension(500, 651));
        setPreferredSize(new java.awt.Dimension(502, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(502, 650));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(237, 237, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(107, 127, 188)));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 651));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 651));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 651));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/20-ConvertImage.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 150, 250, 120);

        dix_dinar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        dix_dinar.setText("X 0");
        jPanel1.add(dix_dinar);
        dix_dinar.setBounds(350, 40, 110, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/10tunisienne-ConvertImage.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 20, 260, 110);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/30-ConvertImage.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 290, 250, 110);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/50-ConvertImage.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 420, 260, 120);

        trente_dinar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        trente_dinar.setText("X 0");
        jPanel1.add(trente_dinar);
        trente_dinar.setBounds(350, 290, 100, 90);

        cinquante_dinar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        cinquante_dinar.setText("X 0");
        jPanel1.add(cinquante_dinar);
        cinquante_dinar.setBounds(350, 440, 140, 70);

        vingt_dinar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        vingt_dinar.setText("X 0");
        jPanel1.add(vingt_dinar);
        vingt_dinar.setBounds(350, 160, 120, 80);

        recup_button.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        recup_button.setForeground(new java.awt.Color(121, 135, 210));
        recup_button.setText("récuperer");
        recup_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recup_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(recup_button);
        recup_button.setBounds(130, 560, 250, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 651);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void recup_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recup_buttonActionPerformed
   /// comme le client a confirmé l'opération de retrait en appuyant sur le bouton "récuperer" alors on peut retrancher le montant retiré de son solde
 
          c.retrait(montant_à_retrancher);
          
          
          
          // changer le solde dans le fichier comptes.txt
                
                try{
                    
                    File fichierCible=new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\First_Project\\fichierTemporaire.txt");
                    
                    fichierCible.createNewFile();
                
                    
                    Scanner myReader=new Scanner(file);
                    FileWriter Writer=new FileWriter(fichierCible);
                    
                    while(myReader.hasNextLine()){
                       String line=myReader.nextLine();
                       String tab[]=line.split("  ") ;
                       String NUM=Integer.toString(c.num_compte) ;
                       String SOLDE=Double.toString(c.solde) ;
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
        this.test_recuperation=true;        
         
      this.hide();
    }//GEN-LAST:event_recup_buttonActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               recuperation_billet frame2= new recuperation_billet();
               frame2.setVisible(true);
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel cinquante_dinar;
    public static javax.swing.JLabel dix_dinar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton recup_button;
    public javax.swing.JLabel trente_dinar;
    public javax.swing.JLabel vingt_dinar;
    // End of variables declaration//GEN-END:variables
}
