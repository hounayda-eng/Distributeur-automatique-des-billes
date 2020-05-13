
package first_project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class guichet {
    int numero_guichet ;
    double frais ;
    String adresse ;
    public void guichet(){
        numero_guichet=0 ;
        frais=0.0 ;
        adresse=" " ;
        
    }

    // **************les setters*****************
    
    
    public void set_numero(int n){ 
        this.numero_guichet=n ;
    } public void set_frais(double n){ 
        this.frais=n ;
    }
     public void set_adresse(String n){ 
        this.adresse=n ;
    }
      
    
    
    
    // **************les getters*********
    
    
    
    public String get_adresse(int n){
        String chemin="C:\\Users\\HP\\Documents\\NetBeansProjects\\DAB\\src\\dab\\guichet_1.txt" ;
        String adresse="" ;
      
  
            try{
               switch(n){
                   case 1 : chemin="C:\\Users\\HP\\Documents\\NetBeansProjects\\DAB\\src\\dab\\guichet_1.txt" ;
                       break ;
                   case 2 : chemin="C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication6\\src\\javaapplication6/guichet_2.txt" ;
                       break ;
                   case 3 : chemin="C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication6\\src\\javaapplication6/guichet_3.txt" ;
                       break ;
                   case 4 :chemin="C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication6\\src\\javaapplication6/guichet_4.txt" ;
                       break;
                    case 5 :chemin="C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication6\\src\\javaapplication6/guichet_5.txt" ;
                       break;
                    case 6 :chemin="C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication6\\src\\javaapplication6/guichet_6.txt" ;
                       break;
               }
               File guichet_file=new File(chemin) ;
               Scanner Reader=new Scanner(guichet_file) ;
               while(Reader.hasNextLine()){
                   String line=Reader.nextLine() ;
                   String tab[]=line.split("  ");
                   if (tab[0].equals("adresse")){adresse=tab[1];Reader.close();return(adresse);}
               }
}
             catch (IOException ex) {
  ex.printStackTrace();
}
            return(adresse);
    } 
       public double get_frais(int n){
        String chemin="C:\\Users\\HP\\Documents\\NetBeansProjects\\DAB\\src\\dab\\guichet_1.txt" ;
        double frais=0.0 ;
        String FRAIS ;
      
  
            try{
               switch(n){
                   case 1 : chemin="C:\\Users\\HP\\Documents\\NetBeansProjects\\DAB\\src\\dab\\guichet_1.txt" ;
                       break ;
                   case 2 : chemin="C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication6\\src\\javaapplication6/guichet_2.txt" ;
                       break ;
                   case 3 : chemin="C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication6\\src\\javaapplication6/guichet_3.txt" ;
                       break ;
                   case 4 :chemin="C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication6\\src\\javaapplication6/guichet_4.txt" ;
                       break;
                    case 5 :chemin="C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication6\\src\\javaapplication6/guichet_5.txt" ;
                       break;
                    case 6 :chemin="C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication6\\src\\javaapplication6/guichet_6.txt" ;
                       break;
               }
               File guichet_file=new File(chemin) ;
               Scanner Reader=new Scanner(guichet_file) ;
               while(Reader.hasNextLine()){
                   String line=Reader.nextLine() ;
                   String tab[]=line.split("  ");
                   if (tab[0].equals("frais")){FRAIS=tab[1]; frais=Double.parseDouble(FRAIS) ; Reader.close();return(frais) ;}
               }
}
             catch (IOException ex) {
  ex.printStackTrace();
}
            return(frais);
    }
      
}