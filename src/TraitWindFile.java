
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
public class TraitWindFile
{
   static ArrayList<InfoWind> list;
   static String Path;
   static File fichier;
   static FileReader fr;
   static BufferedReader br;
    TraitWindFile(String Path) 
    {
       
    }
  static   ArrayList<InfoWind> LoadInfo () 
    {  
         
       try
       {
           fichier = new File(Path);
           fr=new FileReader(fichier);
           br = new BufferedReader(fr);
           list = new ArrayList<InfoWind>();
           String line;
           try
           {
               br.readLine();
           }
           catch (IOException ex)
           {
               Logger.getLogger(TraitWindFile.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           try
           {
               while ((line = br.readLine() )!= null ) {
                   if(line.split("\\s").length==3)
                   list.add(new InfoWind(line));
               }
           }
           catch (IOException ex)
           {
               Logger.getLogger(TraitWindFile.class.getName()).log(Level.SEVERE, null, ex);
           }
           try
           {
               br.close();
           }
           catch (IOException ex)
           {
               Logger.getLogger(TraitWindFile.class.getName()).log(Level.SEVERE, null, ex);
           }
           try
           {
               fr.close();
           }
           catch (IOException ex)
           {
               Logger.getLogger(TraitWindFile.class.getName()).log(Level.SEVERE, null, ex);
           }
           return list;
       }
       catch (FileNotFoundException ex)
       {
           Logger.getLogger(TraitWindFile.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
    }
}
