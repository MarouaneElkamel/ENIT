
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
public class TraitACFile
{   
    static ArrayList<InfoAc> list;
    static String Path;
    static File fichier;
    static FileReader fr;
    static BufferedReader br;
   
    
    
    
   static ArrayList<InfoAc> LoadInfo () 
    {  
       fichier = new File(Path);
        try
        {
            fr=new FileReader(fichier);
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(TraitACFile.class.getName()).log(Level.SEVERE, null, ex);
        }
       br = new BufferedReader(fr);
       list = new ArrayList<>();
       String line; 
        try
        {
            while ((line = br.readLine() )!= null  ) {
                if(line.split("\\s").length==41)
                list.add(new InfoAc(line));
            }
        }
        catch (IOException ex)
        {
            Logger.getLogger(TraitACFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        try
        {
            br.close();
        }
        catch (IOException ex)
        {
            Logger.getLogger(TraitACFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
            fr.close();
        }
        catch (IOException ex)
        {
            Logger.getLogger(TraitACFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
