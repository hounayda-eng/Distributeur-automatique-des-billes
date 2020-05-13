package first_project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner ;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path ;
import  java.nio.file.Paths;



public class compte {
    int num_compte ;
    int code ;
    double solde ;
    String nom_proprietaire ;
    int banque ;
    public compte(){
         int num_compte=0000000000 ;
    int code=0000 ;
    int solde=0 ;
    String nom_proprietaire="anonyme" ;
   
   int banque=0 ;
        
    }
        public compte(int num,int nip , int sld,String client,char sexe,int banque){

this.num_compte=num ;
this.code=nip ;
this.solde=sld ;
this.nom_proprietaire=client ;
this.banque=banque ;
    
}
        //*********************************les opérations *********************************************
        
        
        public void retrait(double montant ){
            
            
                double sld=solde-(montant);
                this.solde=sld;
                 
               
        }
        
        public void depot (int montant ){
                   double sld=solde+montant;
                this.solde=sld;
}
    //********************les getters ***************************************************
         public double get_solde(int num , int code,File file){
            String solde ;
            
            try(Scanner myReader=new Scanner(file) ;){
                
                
                 while (myReader.hasNextLine()) {
            String line=myReader.nextLine();
            String tab[]=line.split("  ") ;
            String NUM=String.valueOf(num);
            String CODE=String.valueOf(code);
            
            if (tab[0].equals(NUM)&& tab[1].equals(CODE)){
               solde=tab[2] ; 
               double SOLDE=Double.parseDouble(solde); 
               myReader.close();
               return(SOLDE) ;
            }
            
              }
            
            } 
                 catch (IOException ex) {
  ex.printStackTrace();
}
            
        
return(0);
}
       public String get_nom(int num , int code,File file){
            String nom="anonyme" ;
            try(Scanner myReader=new Scanner(file) ;){
                
               
                 while (myReader.hasNextLine()) {
            String line=myReader.nextLine();
            String tab[]=line.split("  ") ;
            String NUM=String.valueOf(num);
            String CODE=String.valueOf(code);
            
            if (tab[0].equals(NUM)&& tab[1].equals(CODE)){
               nom=tab[3] ; 
               myReader.close(); 
               return(nom) ;
            }
            
              } 
            
            }
                 catch (IOException ex) {
  ex.printStackTrace();
}
     
return(nom);
}

        public int get_banque(int num , int code, File file){
            int BANQUE_NUMBER=0;
            try( Scanner myReader=new Scanner(file) ;){
                
                
                 while (myReader.hasNextLine()) {
            String line=myReader.nextLine();
            String tab[]=line.split("  ") ;
            String NUM=Integer.toString(num) ;
            String CODE=Integer.toString(code);
            
            if (tab[0].equals(NUM)&& tab[1].equals(CODE)){
               String banque =tab[4] ; 
               banque=banque.trim();
               BANQUE_NUMBER = Integer.parseInt(banque);
               myReader.close();
               return(BANQUE_NUMBER) ;
            }
            
              }  
            
            }
                 catch (NumberFormatException nfe) {
  System.out.println("NumberFormatException: " + nfe.getMessage());
  
}
            catch (IOException ex) {
  ex.printStackTrace();
}
        
return(BANQUE_NUMBER);
}

       // **********************************les setters ***************************************
        
        public void set_solde(double sld){
    this.solde=sld ;
}
       
        public void set_nom(String name){
            this.nom_proprietaire=name ;
        }
        public void set_banque(int f){
            this.banque=f ;
        }
        
        public void set_num(int n){
            this.num_compte=n ;
        }
}
