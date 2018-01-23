
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elkamel
 */
public class TraitCapteurFile
{
   static ArrayList<InfoCapteur> list;
   static  String Path;
   static  File fichier;
   static  FileReader fr;
   static  BufferedReader br;
   
    
    TraitCapteurFile(String Path) throws FileNotFoundException
    {
       
    
      
      
    }
    
   static  ArrayList<InfoCapteur> LoadInfo () 
    {             try
    {     fichier = new File(Path);
    fr=new FileReader(fichier);
    
    try
    {
        br = new BufferedReader(fr);
        list = new ArrayList<InfoCapteur>();
        String line;
        
        int lines = 0;
        br.readLine();
        while ((line = br.readLine() )!= null ) {
            
            if (line.split("\\s").length==7){
               list.add(new InfoCapteur(line));
            lines++;  
            }
            }
        
        br.close();
        fr.close();
        return list;
    }
    catch (IOException ex)
    {
        Logger.getLogger(TraitCapteurFile.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
    }
       catch (FileNotFoundException ex)
       {
           Logger.getLogger(TraitCapteurFile.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
    }

}
