
package first_project;

import java.io.File;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.text.BadLocationException;

public class DAB extends javax.swing.JFrame {

    public DAB() {
        initComponents();
    }
    
    
    
    public void reçu_button(){
    recu.setEnabled(false);
    recup_billet.setEnabled(false);
    dispo_billets.setEnabled(false);
    
}
    
   //********************************************************************présentation des variables **************************************************************************************************************
   
    
    



    //les variables responsable à la création du fichier enregistrement ( reçu ) qui stocke les opérations :
    //_____________________________________________________________________________________________________________________________
    /*1*/int nb_operation_depot=0;
    /*2*/int nb_operation_retrait=0;  
    /*3*/FileWriter historique_writer;
  
    //1// est une variable qui conte le nombre d'opération de depot faite par l'utilisateur
    //2// est une variable qui conte le nombre d'opération de retrait faite par l'utilisateur
   //3// le filewriter du fichier qui sera crée une seule fois c'est pourquoi on le déclare comme un attribut de la classe pricipale 
    
    //_____________________________________________________________________________________________________________________________
    
    
    
    
   
    

// les variables qui manipulent les montants (à retrancher et à verser dans le compte) :
    //_______________________________________________________________________________________________________________________________
    /*1*/ double frais_à_retrancher=0 ;
    /*2*/double montant_à_retrancher;
    /*3*/int saisie_montant=0 ;
    /*4*/int montant_demande=0;
    /*5*/ String montant="";
    
    //1//est une variable qui stocke le frais de la banque choisie par l'utilisateur au début du processus
    //2// elle stocke le totale du montant à retrancher avec le frais soit 0 soit frais de la banque choisie
    //3// controle le saisie du montant pour l'option "autre montant" dans l'opération retrait qui ne doit pas dépasser 3 .
    //4//c'est le montant demandé par l'utilisateur dans l'opération retrait sans conter le frais 
    //5// une chaine aussi qui nous aide dans le le saisie du montant pour l'option "autre montant" dans 
    // l'opération retrait, chaque caractére ajouté il va étre concatiné à cette chaine
    //_______________________________________________________________________________________________________________________________
    
    
    
   
    

    //les variables qui contribue dans la phase identification client :
    //_______________________________________________________________________________________________________________________________
    
    /*1*/ File file= new File("C:\\Users\\HP\\Desktop\\comptes.txt");
    /*2*/int numero_de_carte=0 ;
    /*3*/int banque_choisie=0 ;
    /*4*/int etape=0;
    /*5*/String operation="" ;
    /*6*/int saisie_numero=0 ;
    /*7*/int saisie_code=0;
    /*8*/int Code=0;
    /*9*/String code="" ;
    /*10*/ compte compte=new compte(numero_de_carte,Code,0,"anonyme",'F',0) ;
    /*11*/guichet guichet=new guichet();
    
    //1// c'est le fichier qui stocke les données de chaque client
    //2//c'est le numero de carte saisie par utilisateur
    //3// c'est le numero de la banque choisie au début du processus (pour chaque banque on le référe par un entier de 1 jusqu'à 6 .
    //4// dans ce programme il existe trois étapes qu'on les référe par des entiers de 1 à 3 : 
    //etape 1 : phase saisie numero de carte
    //etape 2 : phase saisie code
    //etape 3 : phase page d'accueil 
    //5// comme on a décomposé ce programme en 3 étapes et on arrive à l'étape 3 on se trouve dans la page d'accueil là ou les opérations s'interviennent 
    // donc on a 2 opération : retrait + depot pour controler le fonctionnement d'une bouton lors de l'appui
   //6// une variable qui controle le saisie du numero de carte dans la phase identification utilisateur
    //7//+//8//+//9// : sont des variables aussi pour controler le saisie du code et de le récupérer par la chaine code .
    //10// aprés le saisie de numero et de code le programme va affecter les valeurs saisie à condition qui sont vrai à la variable compte qui récupére le reste des données 
    //à partir de ses methodes
    //11// c'est le guichet choisie par l'utilisateur (banque) qui récupéres le reste de ses données (adresse,frais) à partir de ses methodes
    //_________________________________________________________________________________________________________________________________________________________________
    
    
    
    
    
    recuperation_billet frame2=new recuperation_billet(); //=======>une fenetre qui sera affiché pour récupérer ses billets
    disposition_billet frame3=new disposition_billet();  //=======>une fenetre qui sera affiché pour disposer les billets à ajouter dans le compte
    reçu frame4=new reçu(); // ======> une fenetre qui sera affiché à la fin du processus pour récupérer le récu
  
  
    
    
   
    
     
    
   
    
      
        

     static boolean verif_Code(int num , int nip,File file){
          boolean test=false ;
        try {
 
  Scanner myReader = new Scanner(file);

while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String code[]=data.split("  ") ;
        String NUM=Integer.toString(num) ;
        String NIP=Integer.toString(nip);
      if(code[0].equals(NUM)){
          if(code[1].equals(NIP)){test=true ;}
          else{test=false ;myReader.close();return(test);}
           
        }
      } myReader.close();
} catch (IOException ex) {
  // erreur d'entrée/sortie ou fichier non trouvé
  ex.printStackTrace();
}
        return(test) ;
}
    static boolean numeroExist(int num , File file){
        boolean test=false ;
        
        try{
      
        Scanner myReader = new Scanner(file);
            
             while (myReader.hasNextLine()) {
            String line=myReader.nextLine();
            String code[]=line.split("  ") ;
            String NUM=String.valueOf(num);
            if (code[0].equals(NUM)){
                test=true ;myReader.close();return(test);
                
            } 

        }myReader.close();
        }
        catch (IOException ex) {
  ex.printStackTrace();
}
        return(test) ;
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        label1 = new java.awt.Label();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        ecran = new javax.swing.JPanel();
        option2 = new javax.swing.JLabel();
        option4 = new javax.swing.JLabel();
        option6 = new javax.swing.JLabel();
        option3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        option1 = new javax.swing.JLabel();
        message1 = new javax.swing.JLabel();
        message2 = new javax.swing.JLabel();
        option5 = new javax.swing.JLabel();
        entree = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        recu = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        recup_billet = new javax.swing.JButton();
        dispo_billets = new javax.swing.JButton();

        label1.setText("label1");

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Distributeur Automatique des Billets");
        setLocation(new java.awt.Point(450, 175));
        setMinimumSize(new java.awt.Dimension(893, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(198, 202, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(890, 680));
        jPanel1.setMinimumSize(new java.awt.Dimension(890, 680));
        jPanel1.setPreferredSize(new java.awt.Dimension(890, 700));
        jPanel1.setLayout(null);

        ecran.setBackground(java.awt.SystemColor.activeCaption);
        ecran.setForeground(new java.awt.Color(51, 0, 204));
        ecran.setLayout(null);

        option2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        option2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        option2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/UIB.png"))); // NOI18N
        ecran.add(option2);
        option2.setBounds(460, 120, 110, 70);

        option4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        option4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        option4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/BIAT.png"))); // NOI18N
        ecran.add(option4);
        option4.setBounds(0, 10, 110, 70);

        option6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        option6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/ATTIJARI.png"))); // NOI18N
        ecran.add(option6);
        option6.setBounds(0, 220, 230, 70);

        option3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        option3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        option3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/UBCI.png"))); // NOI18N
        ecran.add(option3);
        option3.setBounds(450, 220, 130, 50);
        ecran.add(jLabel5);
        jLabel5.setBounds(0, 210, 270, 70);

        option1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        option1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        option1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/BH.png"))); // NOI18N
        ecran.add(option1);
        option1.setBounds(490, 20, 90, 80);

        message1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        message1.setText("Choisissez un Banque  pour votre");
        ecran.add(message1);
        message1.setBounds(120, 30, 430, 160);

        message2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        message2.setText("               Service");
        ecran.add(message2);
        message2.setBounds(140, 110, 350, 100);

        option5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        option5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/ZITOUNA.png"))); // NOI18N
        ecran.add(option5);
        option5.setBounds(0, 100, 100, 90);

        entree.setBackground(new java.awt.Color(153, 153, 0));
        entree.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        entree.setForeground(new java.awt.Color(255, 255, 255));
        entree.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entree.setBorder(null);
        entree.setCaretColor(new java.awt.Color(255, 255, 255));
        entree.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entree.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        entree.setEnabled(false);
        entree.setFocusable(false);
        entree.setHighlighter(null);
        entree.setOpaque(false);
        entree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entreeActionPerformed(evt);
            }
        });
        ecran.add(entree);
        entree.setBounds(90, 210, 400, 60);

        jPanel1.add(ecran);
        ecran.setBounds(140, 40, 580, 310);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText(">>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 170, 80, 60);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("<<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(730, 260, 80, 60);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText(">>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(40, 60, 80, 60);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("<<");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(730, 160, 80, 60);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setText(">>");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(40, 270, 80, 60);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setText("<<");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(730, 50, 80, 60);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7.setText("2");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(160, 410, 50, 50);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton8.setText("3");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(220, 410, 50, 50);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton9.setText("4");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(100, 470, 50, 50);

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton10.setText("5");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(160, 470, 50, 50);

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton11.setText("6");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(220, 470, 50, 50);

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton12.setText("7");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(100, 530, 50, 50);

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton13.setText("8");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(160, 530, 50, 50);

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton14.setText("9");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(220, 530, 50, 50);

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton15.setText("0");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(160, 590, 50, 50);

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton16.setText("1");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(100, 410, 50, 50);

        jButton17.setText("1");
        jPanel1.add(jButton17);
        jButton17.setBounds(100, 410, 50, 50);

        jButton18.setText("jButton7");
        jPanel1.add(jButton18);
        jButton18.setBounds(100, 410, 50, 50);

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton19.setForeground(new java.awt.Color(102, 204, 0));
        jButton19.setText("valider");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);
        jButton19.setBounds(570, 410, 220, 50);

        recu.setText("obtenir un reçu");
        recu.setHideActionText(true);
        recu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuActionPerformed(evt);
            }
        });
        jPanel1.add(recu);
        recu.setBounds(570, 590, 220, 50);

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton20.setForeground(new java.awt.Color(204, 204, 0));
        jButton20.setText("corriger");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20);
        jButton20.setBounds(570, 470, 220, 50);

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton21.setForeground(new java.awt.Color(204, 0, 0));
        jButton21.setText("annuler");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21);
        jButton21.setBounds(570, 530, 220, 50);

        recup_billet.setText("récuperer les Billets");
        recup_billet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recup_billetActionPerformed(evt);
            }
        });
        jPanel1.add(recup_billet);
        recup_billet.setBounds(140, 360, 280, 30);

        dispo_billets.setText("Disposer les Billets");
        dispo_billets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispo_billetsActionPerformed(evt);
            }
        });
        jPanel1.add(dispo_billets);
        dispo_billets.setBounds(430, 360, 290, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 890, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
if (etape==0){
    banque_choisie = 2 ;
option1.setText("");
option2.setText("");
option3.setText("");
option4.setText("");
option5.setText("");
option6.setText("");



option1.setIcon(null);
option2.setIcon(null);
option3.setIcon(null);
option4.setIcon(null);
option5.setIcon(null);
option6.setIcon(null);
message1.setText("\t    Entrez Votre Numero de Carte");
message2.setText("");
entree.setText(" - - - - - - - - -");
frame4.texte.setText("");

etape=1;
}

if((etape==3)&&(operation.equals("retrait"))){
    montant_demande=10000;
    if (compte.banque==banque_choisie){frais_à_retrancher=0;}
    else{frais_à_retrancher=guichet.frais;}
montant_à_retrancher=frais_à_retrancher+montant_demande;  
if(montant_à_retrancher>compte.solde){
    message1.setText("Solde insufffisant");
    option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("Retour");
}

    
    if(montant_à_retrancher<=compte.solde){
    message1.setText("veillez récuperez vos billets");
    option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("Retour");
    recup_billet.setEnabled(true);}
    
    
    
    
    
}
if((etape==3)&&(operation.equals("accueil"))){
     option1.setText("10");
    option2.setText("20");
    option3.setText("40");
    option4.setText("60");
    option5.setText("100");
    option6.setText("autre montant");
    
    
    
    
 
         operation="retrait";
    }
if(frame2.test_recuperation){
        ///// indique que le client a récuperé ses billets  donc on peut ajouter les informations au fichier 
        
         
                
                try{
                     nb_operation_retrait++;
              String MONTANT=Integer.toString(montant_demande);
               historique_writer.write("\n ---------------------"); historique_writer.write(" \n Montant Retiré n° ");historique_writer.write(Integer.toString(nb_operation_retrait));
               historique_writer.write(" :");historique_writer.write(MONTANT); 
                }catch (IOException ex) {
                ex.printStackTrace();
                  }
               
        frame2.test_recuperation=false;  
        montant_demande=0;
      }



if(frame3.test_disposition){
        ///// indique que le client a disposé ses billets donc ajouter les informations au fichier historique
    
    
              
          
         
                
                try{
                     nb_operation_depot++;
              String MONTANT=Integer.toString(frame3.montant_versé);
               historique_writer.write("\n ---------------------"); historique_writer.write(" \n Montant Versé n° ");historique_writer.write(Integer.toString(nb_operation_depot));
               historique_writer.write(" :");historique_writer.write(MONTANT); 
                }catch (IOException ex) {
                ex.printStackTrace();
                  }
                
        frame3.test_disposition=false;  
        frame3.montant_versé=0; 
        
      }
    
   


        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
if (etape==0){
    banque_choisie = 3 ;
    option1.setText("");
option2.setText("");
option3.setText("");
option4.setText("");
option5.setText("");
option6.setText("");


option1.setIcon(null);
option2.setIcon(null);
option3.setIcon(null);
option4.setIcon(null);
option5.setIcon(null);
option6.setIcon(null);
message1.setText("\t    Entrez Votre Numero de Carte");
message2.setText("");
entree.setText(" - - - - - - - - -");

frame4.texte.setText("");
etape=1;
}
if(   (etape==3) &&   (option2.getText().equals("Depot"))     &&    (operation.equals("accueil"))      ){
        message1.setText("veillez disposer vos billets");
        option1.setText("");
        option2.setText("");
        option3.setText("");
        option4.setText("");
        option5.setText("");
        option6.setText("Retour");
        dispo_billets.setEnabled(true);
        operation="depot";
    }
if((etape==3)&&(operation.equals("retrait"))){
    montant_demande=20000;
    if (compte.banque==banque_choisie){frais_à_retrancher=0;}
    else{frais_à_retrancher=guichet.frais;}
montant_à_retrancher=frais_à_retrancher+montant_demande;  
if(montant_à_retrancher>compte.solde){
    message1.setText("Solde insufffisant");
    option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("Retour");
}

    
    if(montant_à_retrancher<=compte.solde){
    message1.setText("veillez récuperer vos billets");
    option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("Retour");
    recup_billet.setEnabled(true);}
}
if(frame3.test_disposition){
        ///// indique que le client a disposé ses billets donc on peut  ajouter les informations au fichier historique 
  
                try{
                     nb_operation_depot++;
              String MONTANT=Integer.toString(frame3.montant_versé);
               historique_writer.write("\n ---------------------"); historique_writer.write(" \n Montant Versé n° ");historique_writer.write(Integer.toString(nb_operation_depot));
               historique_writer.write(" :");historique_writer.write(MONTANT); 
                }catch (IOException ex) {
                ex.printStackTrace();
                  }
                nb_operation_depot++;
               
        
        frame3.test_disposition=false; 
        frame3.montant_versé=0; 
        
      }
if(frame2.test_recuperation){
        ///// indique que le client a récuperé ses billets donc on peut ajouter les informations au fichier historique   
           
             
                try{
                     nb_operation_retrait++;
              String MONTANT=Integer.toString(montant_demande);
               historique_writer.write("\n ---------------------"); historique_writer.write(" \n Montant Retiré n° ");historique_writer.write(Integer.toString(nb_operation_retrait));
               historique_writer.write(" :");historique_writer.write(MONTANT); 
                }catch (IOException ex) {
                ex.printStackTrace();
                  }
              
        frame2.test_recuperation=false;  
        montant_demande=0;
      }
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if (etape==0){
    banque_choisie = 1 ;

option1.setText("");
option2.setText("");
option3.setText("");
option4.setText("");
option5.setText("");
option6.setText("");
option1.setIcon(null);
option2.setIcon(null);
option3.setIcon(null);
option4.setIcon(null);
option5.setIcon(null);
option6.setIcon(null);
message1.setText("\t    Entrez Votre Numero de Carte");
message2.setText("");

entree.setText(" - - - - - - - - -");
frame4.texte.setText("");


etape=1;
}
if((etape==3)&&(operation.equals("retrait")&&(message1.getText().equals("")))){
    montant_demande=60000;
    if (compte.banque==banque_choisie){frais_à_retrancher=0;}
    else{frais_à_retrancher=guichet.frais;}
montant_à_retrancher=frais_à_retrancher+montant_demande;  
if(montant_à_retrancher>compte.solde){
    message1.setText("Solde insufffisant");
    option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("Retour");
}

    
    if(montant_à_retrancher<=compte.solde){
    message1.setText("veillez récuperer vos billets");
    option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("Retour");
    recup_billet.setEnabled(true);}}
if(frame2.test_recuperation){
        ///// indique que le client a récuperé ses billets  donc on peut  ajouter les informations au historique 
             
                try{
                     nb_operation_retrait++;
              String MONTANT=Integer.toString(montant_demande);
               historique_writer.write("\n ---------------------"); historique_writer.write(" \n Montant Retiré n° ");historique_writer.write(Integer.toString(nb_operation_retrait));
               historique_writer.write(" :");historique_writer.write(MONTANT); 
                }catch (IOException ex) {
                ex.printStackTrace();
                  }
              
        frame2.test_recuperation=false;  
        montant_demande=0;
      }
if(frame3.test_disposition){
        ///// indique que le client a disposé ses billets   // ajouter les informations au historique 
    
   
           
          
                
                try{
                     nb_operation_depot++;
              String MONTANT=Integer.toString(frame3.montant_versé);
               historique_writer.write("\n ---------------------"); historique_writer.write(" \n Montant Versé n° ");historique_writer.write(Integer.toString(nb_operation_depot));
               historique_writer.write(" :");historique_writer.write(MONTANT); 
                }catch (IOException ex) {
                ex.printStackTrace();
                  }
               
          
        frame3.test_disposition=false; 
        frame3.montant_versé=0; 
        
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
if(etape==1){
      if(saisie_numero<9){
          saisie_numero++;
          int offset=2;
          int len =16;
          try {
              entree.setText(entree.getText(offset,len)+" 1");
          } catch (BadLocationException ex) {
              Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
         
       
          
      }
}
if(etape==2){
    if(saisie_code<4){
        saisie_code++;
        int offset=3;
        int len=10;
        try {
            entree.setText(entree.getText(offset, len)+"  *");
        } catch (BadLocationException ex) {
            Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   code=code+"1"; 
    
}
if((etape==3)&&(operation.equals("retrait"))&&(saisie_montant!=0)&&(saisie_montant<=3)){   
    int offset=2;
    int len=4;
  
    try {
        entree.setText(entree.getText(offset, len)+" 1");
    } catch (BadLocationException ex) {
        Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
    }
    saisie_montant++;
    montant=montant+1;
    
}
 
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if (etape==0){
    banque_choisie = 4 ;
    option1.setText("");
option2.setText("");
option3.setText("");
option4.setText("");
option5.setText("");
option6.setText("");


option1.setIcon(null);
option2.setIcon(null);
option3.setIcon(null);
option4.setIcon(null);
option5.setIcon(null);
option6.setIcon(null);
message1.setText("\t    Entrez Votre Numero de Carte");
message2.setText("");
entree.setText(" - - - - - - - - -");

frame4.texte.setText("");
etape=1;
}
if((etape==3)&&(operation.equals("retrait"))){
    montant_demande=40000;
    if (compte.banque==banque_choisie){frais_à_retrancher=0;}
    else{frais_à_retrancher=guichet.frais;}
montant_à_retrancher=frais_à_retrancher+montant_demande;  
if(montant_à_retrancher>compte.solde){
    message1.setText("Solde insufffisant");
    option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("Retour");
}

    
    if(montant_à_retrancher<=compte.solde){
    message1.setText("veillez récuperer vos billets");
    option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("Retour");
    recup_billet.setEnabled(true);}
    //"         Votre Solde est :"
    
    
    
    
}
if((etape==3)&&(operation.equals("accueil"))&&(      ( !(message1.getText().equals("         Votre Solde est :"))   || !(message1.getText().equals("veillez récuperer vos billets"))   ||  !(  message1.getText().equals("le montant doit etre en  ")) ||  !(  message1.getText().equals("le montant demandé est nul !"))   ||  !(   message1.getText().equals("Solde insufffisant")))              )){
 option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("Retour");
    message1.setText("         Votre Solde est :");
  
  message2.setText("             "+Double.toString(compte.solde));
  operation="solde";
  
  
}
if(frame2.test_recuperation){
        ///// indique que le client a récuperé ses billets   // ajouter les informations au historique 
               
                try{
                     nb_operation_retrait++;
              String MONTANT=Integer.toString(montant_demande);
               historique_writer.write("\n ---------------------"); historique_writer.write(" \n Montant Retiré n° ");historique_writer.write(Integer.toString(nb_operation_retrait));
               historique_writer.write(" :");historique_writer.write(MONTANT); 
                }catch (IOException ex) {
                ex.printStackTrace();
                  }
              
        frame2.test_recuperation=false;  
        montant_demande=0;
      }
if(frame3.test_disposition){
        ///// indique que le client a disposé ses billets  // ajouter les informations au historique
    
   
           
                
                try{
                     nb_operation_depot++;
              String MONTANT=Integer.toString(frame3.montant_versé);
               historique_writer.write("\n ---------------------"); historique_writer.write(" \n Montant Versé n° ");historique_writer.write(Integer.toString(nb_operation_depot));
               historique_writer.write(" :");historique_writer.write(MONTANT); 
                }catch (IOException ex) {
                ex.printStackTrace();
                  }
               
        
        frame3.test_disposition=false; 
        frame3.montant_versé=0; 
        
      }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (etape==0){
    banque_choisie = 5 ;

option1.setText("");
option2.setText("");
option3.setText("");
option4.setText("");
option5.setText("");
option6.setText("");
option1.setIcon(null);
option2.setIcon(null);
option3.setIcon(null);
option4.setIcon(null);
option5.setIcon(null);
option6.setIcon(null);
message1.setText("\t    Entrez Votre Numero de Carte");
message2.setText("");
entree.setText(" - - - - - - - - -");

frame4.texte.setText("");
etape=1;

}
if((etape==3)&&(operation.equals("retrait"))&&(message1.getText().equals(""))){
    montant_demande=100000;
    if (compte.banque==banque_choisie){frais_à_retrancher=0;}
    else{frais_à_retrancher=guichet.frais;}
montant_à_retrancher=frais_à_retrancher+montant_demande;  
if(montant_à_retrancher>compte.solde){
    message1.setText("Solde insufffisant");
    option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("Retour");
}

    
    if(montant_à_retrancher<=compte.solde){
    message1.setText("veillez récuperer vos billets");
    option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("Retour");
    recup_billet.setEnabled(true);}
    
    if(frame3.test_disposition){
        ///// indique que le client a disposé ses billets   // ajouter les informations au historique 
    
   
          
                
                try{
                     nb_operation_depot++;
              String MONTANT=Integer.toString(frame3.montant_versé);
               historique_writer.write("\n ---------------------"); historique_writer.write(" \n Montant Versé n° ");historique_writer.write(Integer.toString(nb_operation_depot));
               historique_writer.write(" :");historique_writer.write(MONTANT); 
                }catch (IOException ex) {
                ex.printStackTrace();
                  }
               
        
        frame3.test_disposition=false; 
        frame3.montant_versé=0; 
        
      }
 
    
    
    
}
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
if (etape==0){
    banque_choisie = 6 ;
option1.setText("");
option2.setText("");
option3.setText("");
option4.setText("");
option5.setText("");
option6.setText("");

option1.setIcon(null);
option2.setIcon(null);
option3.setIcon(null);
option4.setIcon(null);
option5.setIcon(null);
option6.setIcon(null);
message1.setText("\t    Entrez Votre Numero de Carte");
message2.setText("");
entree.setText(" - - - - - - - - -");

frame4.texte.setText("");
etape=1;
}

if(    (etape==3)       &&      (operation.equals("accueil"))   &&       (!(option6.equals("Retour")))        ){
    message1.setText("veillez récuperer votre reçu");
    option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("");
    operation="fin";
    recu.setEnabled(true);
    
}

if(frame2.test_recuperation){
        ///// indique que le client a récuperé ses billets   // ajouter les informations au historique 
            
                try{
                     nb_operation_retrait++;
              String MONTANT=Integer.toString(montant_demande);
               historique_writer.write("\n ---------------------"); historique_writer.write(" \n Montant Retiré n° ");historique_writer.write(Integer.toString(nb_operation_retrait));
               historique_writer.write(" :");historique_writer.write(MONTANT); 
                }catch (IOException ex) {
                ex.printStackTrace();
                  }
              
        frame2.test_recuperation=false;  
        montant_demande=0;
      }

if((etape==3)&&(operation.equals("retrait"))&&(message1.getText().equals(""))){
    option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("");
    message1.setText("Entrez le montant à retirer  ");
    message2.setText("           (en dinar)");
    entree.setText(" 0 0 0");
    saisie_montant++;
    
}
if(message1.getText().equals("le montant demandé est nul !")){
    
    message1.setText("");
        entree.setText("");
        operation="accueil";
        
        option1.setText("Retrait");                                              /// "Votre Solde est :"
        option2.setText("Depot");
        option3.setText("Solde");
        option6.setText("fin");
         recup_billet.setEnabled(false);  

    
}
if(      (etape==3)  &&  (option6.getText().equals("Retour")    )     ){
    montant_demande=0;
     message1.setText("");
     message2.setText("");
        entree.setText("");
        operation="accueil";
        
        option1.setText("Retrait");
        option2.setText("Depot");
        option3.setText("Solde");
        option6.setText("fin");
        dispo_billets.setEnabled(false);
        recup_billet.setEnabled(false);
    if(      (etape==3)  &&  (option6.getText().equals("Retour")    )     ){
        recup_billet.setEnabled(false);
        dispo_billets.setEnabled(false);
    montant_demande=0;
     message1.setText("");
     message2.setText("");
        entree.setText("");
        operation="accueil";
        
        option1.setText("Retrait");
        option2.setText("Depot");
        option3.setText("Solde");
        option6.setText("fin");
    
}
}
if(frame3.test_disposition){
        ///// indique que le client a disposé ses billets // ajouter les informations au historique  
    
   
           
                
                try{
                     nb_operation_depot++;
              String MONTANT=Integer.toString(frame3.montant_versé);
               historique_writer.write("\n ---------------------"); historique_writer.write(" \n Montant Versé n° ");historique_writer.write(Integer.toString(nb_operation_depot));
               historique_writer.write(" :");historique_writer.write(MONTANT); 
                }catch (IOException ex) {
                ex.printStackTrace();
                  }
               
       
        frame3.test_disposition=false; 
        frame3.montant_versé=0; 
        
      }


       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void entreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entreeActionPerformed
    }//GEN-LAST:event_entreeActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 if(etape==1){
        if(saisie_numero<9){
          saisie_numero++;
          int offset=2;
          int len =16;
          try {
              entree.setText(entree.getText(offset,len)+" 2");
          } catch (BadLocationException ex) {
              Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
         
       
          
      }
 }
 if(etape==2){
    if(saisie_code<4){
        saisie_code++;
        int offset=3;
        int len=10;
        try {
            entree.setText(entree.getText(offset, len)+"  *");
        } catch (BadLocationException ex) {
            Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   code=code+"2"; 
    
}
 if((etape==3)&&(operation.equals("retrait"))&&(saisie_montant!=0)&&(saisie_montant<=3)){   
    int offset=2;
    int len=4;
  
    try {
        entree.setText(entree.getText(offset, len)+" 2");
    } catch (BadLocationException ex) {
        Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
    }
    saisie_montant++;
    montant=montant+2;
    
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
  if(etape==1){
        if(saisie_numero<9){
          saisie_numero++;
          int offset=2;
          int len =16;
          try {
              entree.setText(entree.getText(offset,len)+" 3");
          } catch (BadLocationException ex) {
              Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
         
       
          
      }
  }
  if(etape==2){
    if(saisie_code<4){
        saisie_code++;
        int offset=3;
        int len=10;
        try {
            entree.setText(entree.getText(offset, len)+"  *");
        } catch (BadLocationException ex) {
            Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   code=code+"3"; 
    
}
  if((etape==3)&&(operation.equals("retrait"))&&(saisie_montant!=0)&&(saisie_montant<=3)){   
    int offset=2;
    int len=4;
  
    try {
        entree.setText(entree.getText(offset, len)+" 3");
    } catch (BadLocationException ex) {
        Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
    }
    saisie_montant++;
    montant=montant+3;
    
}
 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
 if(etape==1){
        if(saisie_numero<9){
          saisie_numero++;
          int offset=2;
          int len =16;
          try {
              entree.setText(entree.getText(offset,len)+" 4");
          } catch (BadLocationException ex) {
              Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
         
       
          
      }
 }
 if(etape==2){
    if(saisie_code<4){
        saisie_code++;
        int offset=3;
        int len=10;
        try {
            entree.setText(entree.getText(offset, len)+"  *");
        } catch (BadLocationException ex) {
            Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   code=code+"4"; 
    
}
 if((etape==3)&&(operation.equals("retrait"))&&(saisie_montant!=0)&&(saisie_montant<=3)){   
    int offset=2;
    int len=4;
  
    try {
        entree.setText(entree.getText(offset, len)+" 4");
    } catch (BadLocationException ex) {
        Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
    }
    saisie_montant++;
    montant=montant+4;
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
if(etape==1){
        if(saisie_numero<9){
          saisie_numero++;
          int offset=2;
          int len =16;
          try {
              entree.setText(entree.getText(offset,len)+" 5");
          } catch (BadLocationException ex) {
              Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
         
       
          
      }
}
if(etape==2){
    if(saisie_code<4){
        saisie_code++;
        int offset=3;
        int len=10;
        try {
            entree.setText(entree.getText(offset, len)+"  *");
        } catch (BadLocationException ex) {
            Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   code=code+"5"; 
    
}
if((etape==3)&&(operation.equals("retrait"))&&(saisie_montant!=0)&&(saisie_montant<=3)){   
    int offset=2;
    int len=4;
  
    try {
        entree.setText(entree.getText(offset, len)+" 5");
    } catch (BadLocationException ex) {
        Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
    }
    saisie_montant++;
    montant=montant+5;
    
}
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
 if(etape==1){
        if(saisie_numero<9){
          saisie_numero++;
          int offset=2;
          int len =16;
          try {
              entree.setText(entree.getText(offset,len)+" 6");
          } catch (BadLocationException ex) {
              Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
         
       
          
      }
 }
 if(etape==2){
    if(saisie_code<4){
        saisie_code++;
        int offset=3;
        int len=10;
        try {
            entree.setText(entree.getText(offset, len)+"  *");
        } catch (BadLocationException ex) {
            Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   code=code+"6"; 
    
}
 if((etape==3)&&(operation.equals("retrait"))&&(saisie_montant!=0)&&(saisie_montant<=3)){   
    int offset=2;
    int len=4;
  
    try {
        entree.setText(entree.getText(offset, len)+" 6");
    } catch (BadLocationException ex) {
        Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
    }
    saisie_montant++;
    montant=montant+6;
    
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
  if(etape==1){
        if(saisie_numero<9){
          saisie_numero++;
          int offset=2;
          int len =16;
          try {
              entree.setText(entree.getText(offset,len)+" 7");
          } catch (BadLocationException ex) {
              Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
         
       
          
      }
  }
   if(etape==2){
    if(saisie_code<4){
        saisie_code++;
        int offset=3;
        int len=10;
        try {
            entree.setText(entree.getText(offset, len)+"  *");
        } catch (BadLocationException ex) {
            Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   code=code+"7"; 
    
}
   if((etape==3)&&(operation.equals("retrait"))&&(saisie_montant!=0)&&(saisie_montant<=3)){   
    int offset=2;
    int len=4;
  
    try {
        entree.setText(entree.getText(offset, len)+" 7");
    } catch (BadLocationException ex) {
        Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
    }
    saisie_montant++;
    montant=montant+7;
    
}
// TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
 if(etape==1){
        if(saisie_numero<9){
          saisie_numero++;
          int offset=2;
          int len =16;
          try {
              entree.setText(entree.getText(offset,len)+" 8");
          } catch (BadLocationException ex) {
              Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
         
       
          
      }
 }
 if(etape==2){
    if(saisie_code<4){
        saisie_code++;
        int offset=3;
        int len=10;
        try {
            entree.setText(entree.getText(offset, len)+"  *");
        } catch (BadLocationException ex) {
            Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   code=code+"8"; 
    
}
 if((etape==3)&&(operation.equals("retrait"))&&(saisie_montant!=0)&&(saisie_montant<=3)){   
    int offset=2;
    int len=4;
  
    try {
        entree.setText(entree.getText(offset, len)+" 8");
    } catch (BadLocationException ex) {
        Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
    }
    saisie_montant++;
    montant=montant+8;
    
}
 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
if(etape==1){
        if(saisie_numero<9){
          saisie_numero++;
          int offset=2;
          int len =16;
          try {
              entree.setText(entree.getText(offset,len)+" 9");
          } catch (BadLocationException ex) {
              Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
         
       
          
      }
}
if(etape==2){
    if(saisie_code<4){
        saisie_code++;
        int offset=3;
        int len=10;
        try {
            entree.setText(entree.getText(offset, len)+"  *");
        } catch (BadLocationException ex) {
            Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   code=code+"9"; 
    
}
if((etape==3)&&(operation.equals("retrait"))&&(saisie_montant!=0)&&(saisie_montant<=3)){   
    int offset=2;
    int len=4;
  
    try {
        entree.setText(entree.getText(offset, len)+" 9");
    } catch (BadLocationException ex) {
        Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
    }
    saisie_montant++;
    montant=montant+9;
    
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
 if(etape==1){
        if(saisie_numero<9){
          saisie_numero++;
          int offset=2;
          int len =16;
          try {
              entree.setText(entree.getText(offset,len)+" 0");
          } catch (BadLocationException ex) {
              Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
         
       
          
      }
 }
 if(etape==2){
    if(saisie_code<4){
        saisie_code++;
        int offset=3;
        int len=10;
        try {
            entree.setText(entree.getText(offset, len)+"  *");
        } catch (BadLocationException ex) {
            Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   code=code+"0"; 
    
}
 
 if((etape==3)&&(operation.equals("retrait"))&&(saisie_montant!=0)&&(saisie_montant<=3)){   
    int offset=2;
    int len=4;
  
    try {
        entree.setText(entree.getText(offset, len)+" 0");
    } catch (BadLocationException ex) {
        Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
    }
    saisie_montant++;
    montant=montant+0;
    
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
if((etape==1)&&(entree.getText().equals(" - - - - - - - - -"))){
    option1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/BH.png")));
    option2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/UIB.png")));
    option3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/UBCI.png")));
    option4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/BIAT.png")));
    option5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/ZITOUNA.png")));
    option6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/ATTIJARI.png")));
    message1.setText("Choisissez un Banque  pour votre");
    message2.setText("               Service");
    entree.setText("");
    etape=0;
 
}
else if((etape==1)&&(!(entree.getText()==" - - - - - - - - -"))){
    entree.setText(" - - - - - - - - - -");
    saisie_numero=0;
    if((etape==1)&&(message1.getText().equals("numero incorrecte !"))){
        message1.setIcon(null);
        message1.setText("\t    Entrez Votre Numero de Carte");
message2.setText("");
entree.setText(" - - - - - - - - -");
        
    }
    
}
if((etape==2)&&!(entree.getText().equals("  -  -  -  -"))){
   entree.setText("  -  -  -  -");
   saisie_code=0;
   code="";
    
    
}
if((etape==2)&&(message1.getText().equals("Code incorrecte !"))){
     message1.setIcon(null);
       message1.setText("        Entrez votre Code");
        entree.setText("  -  -  -  -");
        code="";
        saisie_code=0;
    
}
   
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
if((etape==1)&&(saisie_numero==9)){
    String ch[]=entree.getText().split(" ");
    String chaine="";
    for(int i=0; i<ch.length ; i++){
        chaine=chaine+ch[i];
    }
    int numero=Integer.parseInt(chaine);
    if(!(numeroExist(numero,file))){
        message1.setText("numero incorrecte !");
    message2.setText("");
    entree.setText("");
    message1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/erreur!.png")));
    }
    else{
        numero_de_carte=numero;
        etape=2;
        message1.setText("        Entrez votre Code");
        entree.setText("  -  -  -  -");
    }
    
}
if((etape==2)&&(saisie_code==4)){
    Code=Integer.parseInt(code);
    if(verif_Code(numero_de_carte ,Code,file)){
       
        
        
        
        
         /// récuperation les données du compte client
        int banque_client =compte.get_banque(numero_de_carte, Code, file);
        String nom_client=compte.get_nom(numero_de_carte, Code, file);
        double solde=compte.get_solde(numero_de_carte, Code, file);
        compte.set_nom(nom_client);
        compte.set_banque(banque_client);
        compte.set_solde(solde);
        compte.set_num(numero_de_carte);
        /// fin 
        
        
        //// récuperation les données du guichet(banque ) 
        
        String adresse=guichet.get_adresse(banque_choisie);
        double frais=guichet.get_frais(banque_choisie);
        guichet.set_numero(banque_choisie);
        guichet.set_frais(frais);
        guichet.set_adresse(adresse);
        ///fin  
    
          // *******************************************Partie création d'un fichier txt pour enregistrer les historiques******************************************************
      

          try {
                              File historique=new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\First_Project\\src\\first_project\\enregistrement.txt"); // définir l'arborescence

     
      FileWriter info=new FileWriter(historique);
      historique_writer=info;
      historique.createNewFile();
     historique_writer.write("********** ");  // écrire une ligne dans le fichier resultat.txt
      historique_writer.write("\n"); // forcer le passage à la ligne
      // date
        Date aujourdhui = new Date() ;
        DateFormat shortDateFormat = DateFormat.getDateTimeInstance(
        DateFormat.SHORT,
        DateFormat.SHORT);
         historique_writer.write("Date:    Heure:");
         historique_writer.write("\n");
         historique_writer.write(shortDateFormat.format(aujourdhui));
         historique_writer.write("\n");
         // les coordonnées du guichet et client
         switch(banque_choisie){
             case 1:{historique_writer.write("Banque : BIAT - بنك تونس العربي الدولي");}
             break;
             case 2:{historique_writer.write("Banque : BH - بنك الاسكان");}
             break;
             case 3 :{historique_writer.write("Banque : UIB - الاتحاد الدولي للبنوك");}
             break;
             case 4 : {historique_writer.write("Banque : UBCI - البنك العربي");}
             break;
             case 5 :{historique_writer.write("Banque : Zitouna Bank - الزيتونة بنك");}
             break;
             case 6 :{historique_writer.write("Banque : Attijari Bank - التجاري بنك");}
                
         }
        
         historique_writer.write("\n");
         historique_writer.write("adresse : ");         historique_writer.write(guichet.adresse);
         String NUM=Integer.toString(compte.num_compte);
         historique_writer.write("\n \n ");
         historique_writer.write("--------------------------------------------- \n \n");
         historique_writer.write("Carte : ") ; 
         historique_writer.write(NUM);
         historique_writer.write("\n");
         historique_writer.write("le Proriétaire :  ");
         String n=compte.nom_proprietaire;
         historique_writer.write(n);
        
         } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
         
        
        
        
        
        
        
        
        
        
        
        
        
        message1.setText("");
        entree.setText("");
        operation="accueil";
        
        option1.setText("Retrait");
        option2.setText("Depot");
        option3.setText("Solde");
        option6.setText("Fin");
        etape=3;
        
        
    }
    else{
         message1.setText("Code incorrecte !");
    message2.setText("");
    entree.setText("");
    message1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/erreur!.png")));
    }
    
}
if((etape==3)&&(operation.equals("retrait"))&&(message1.getText().equals("Entrez le montant à retirer  "))){ 
    int mont=Integer.parseInt(montant); 
    montant="";
 
    if((mont%10)!=0){
        message1.setText("le montant doit etre en  ");
        message2.setText("      chiffre rond !");
    option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("Retour");
    saisie_montant=0;
    
    }
    if(mont%10==0){
        message2.setText("");
        montant_demande=mont*1000;
         saisie_montant=0;
     if(montant_demande==0){
        message1.setText("le montant demandé est nul !");
    option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("Retour");
    }
     if(montant_demande!=0){
    if (compte.banque==banque_choisie){frais_à_retrancher=0;}
    else{frais_à_retrancher=guichet.frais;}
montant_à_retrancher=frais_à_retrancher+montant_demande;  
if(montant_à_retrancher>compte.solde){
    message1.setText("Solde insufffisant");
    option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("Retour");
}

    
    if(montant_à_retrancher<=compte.solde){
    message1.setText("veillez récuperer vos billets");
    option1.setText("");
    option2.setText("");
    option3.setText("");
    option4.setText("");
    option5.setText("");
    option6.setText("Retour");
    recup_billet.setEnabled(true);}
     }
    entree.setText("");
  
   
   
            }
    }
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void dispo_billetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispo_billetsActionPerformed
dispo_billets.setEnabled(false);

frame3.compte=compte;
frame3.file=file;

frame3.setVisible(true);
      frame3.setDefaultCloseOperation(frame2.DISPOSE_ON_CLOSE);
      message1.setText("");
      
      message1.setText("");
        entree.setText("");
        operation="accueil";
        
        option1.setText("Retrait");
        option2.setText("Depot");
        option3.setText("Solde");
        option6.setText("Fin");

     
        
    }//GEN-LAST:event_dispo_billetsActionPerformed

    private void recup_billetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recup_billetActionPerformed
  
       frame2.setSize(500, 690);
       frame2.c=compte;
       
      frame2.montant_à_retrancher=montant_à_retrancher;
      frame2.file=file;
      int mont=montant_demande;
      frame2.montant_demande=montant_demande;
      
      int nb_50=0;
      int nb_30=0;
      int nb_20=0;
      int nb_10=0;
     
      if((mont/50000)==0){nb_50=0;}
      else{nb_50=mont/50000;mont=mont%50000;}
      
      
      
      if((mont/30000)==0){nb_30=0;}
      else{nb_30=mont/30000;mont=mont%30000;}
      
       
       
       if((mont/20000)==0){nb_20=0;}
      else{nb_20=mont/20000;  mont=mont%20000;}
      
     
       
       if((mont/10000)==0){nb_10=0;}
      else{nb_10=mont/10000;}
      
      
      
      
    
      frame2.dix_dinar.setText("X "+Integer.toString(nb_10));
      frame2.vingt_dinar.setText("X "+Integer.toString(nb_20));
      frame2.trente_dinar.setText("X "+Integer.toString(nb_30));
      frame2.cinquante_dinar.setText("X "+Integer.toString(nb_50));
      
 recup_billet.setEnabled(false);  
      
      frame2.setVisible(true);
      frame2.setDefaultCloseOperation(frame2.DISPOSE_ON_CLOSE);
     
      
      
 
  
         

       // retour au page d'accueil   
        message1.setText("");
        entree.setText("");
        operation="accueil";        
        option1.setText("Retrait");
        option2.setText("Depot");
        option3.setText("Solde");
        option6.setText("Fin"); 
   
      
    }//GEN-LAST:event_recup_billetActionPerformed

    private void recuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuActionPerformed

    try{
                    String SOLDE=Double.toString(compte.solde);
                historique_writer.write("\n ---------------------"); historique_writer.write(" \n Solde actuelle:   ");historique_writer.write(SOLDE);
               
                historique_writer.write("\n \n \n \n************************************************************");
                historique_writer.write(" \n           Merci pour Votre Visite \n              **** à Bientot ***");historique_writer.close();
                }catch (IOException ex) {
  ex.printStackTrace();
} 
recu.setEnabled(false);

File reçu_file=new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\First_Project\\src\\first_project\\enregistrement.txt"); 
Scanner reçu_reader;
        try {
            reçu_reader = new Scanner(reçu_file);
            while(reçu_reader.hasNextLine()){
                String line=reçu_reader.nextLine();
                
                frame4.texte.setText(frame4.texte.getText()+"\n"+line);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAB.class.getName()).log(Level.SEVERE, null, ex);
        }
        frame4.setTitle("Reçu");
frame4.setVisible(true);
 frame4.setDefaultCloseOperation(frame2.DISPOSE_ON_CLOSE);
            
  
            

       


/// retour au etat initial 
  
   frais_à_retrancher=0 ;
   montant_à_retrancher=0;
   frame2.test_recuperation=false;
   nb_operation_depot=0;
     nb_operation_retrait=0; 
       frais_à_retrancher=0 ;
     montant_à_retrancher=0;
   saisie_montant=0 ;
    montant_demande=0;
   String montant="";
   
     numero_de_carte=0 ;
   banque_choisie=0 ;
    etape=0;
     operation="" ;
     saisie_numero=0 ;
     saisie_code=0;
     Code=0;
     code="" ;
    
    compte.nom_proprietaire="anonyme";
    compte.banque=0;
    compte.solde=0;
    compte.num_compte=0;
    
    guichet.adresse="";
    guichet.frais=0;
    guichet.numero_guichet=0;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
      
   
   
   
   
   
  
    option1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/BH.png")));
    option2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/UIB.png")));
    option3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/UBCI.png")));
    option4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/BIAT.png")));
    option5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/ZITOUNA.png")));
    option6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/ATTIJARI.png")));
    message1.setText("Choisissez un Banque  pour votre");
    message2.setText("               Service");
    entree.setText("");
    
        
    }//GEN-LAST:event_recuActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
if((etape==3)&&(operation.equals("retrait"))&&(option1.getText().equals("10"))){
      
        operation="accueil";        
        option1.setText("Retrait");
        option2.setText("Depot");
        option3.setText("Solde");
        option4.setText("");
        option5.setText("");
        option6.setText("Fin"); 

}
       
    }//GEN-LAST:event_jButton21ActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DAB frame=new DAB();
                frame.setVisible(true);
                frame.reçu_button();
               
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dispo_billets;
    private javax.swing.JPanel ecran;
    private javax.swing.JTextField entree;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private java.awt.Label label1;
    private javax.swing.JLabel message1;
    private javax.swing.JLabel message2;
    private javax.swing.JLabel option1;
    private javax.swing.JLabel option2;
    private javax.swing.JLabel option3;
    private javax.swing.JLabel option4;
    private javax.swing.JLabel option5;
    private javax.swing.JLabel option6;
    public javax.swing.JButton recu;
    private javax.swing.JButton recup_billet;
    // End of variables declaration//GEN-END:variables

}
