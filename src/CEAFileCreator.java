
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
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
public class CEAFileCreator
{
    ArrayList<InfoCapteur> list1;
    ArrayList<InfoOnduleur> list2;
    ArrayList<InfoWind> list3;
     ArrayList<InfoAc> list4;
    String Path;
    File fichier;
    FileOutputStream fos ;
    BufferedWriter bw;
    OutputStreamWriter osw;
    
    CEAFileCreator(ArrayList<InfoCapteur> l ,ArrayList<InfoOnduleur> l1,ArrayList<InfoWind> l2,String Path) 
    {   try
        {
            list2 = l1;
            list1 = l;
            list3 = l2;
          
            String s1=new SimpleDateFormat("dd").format(list1.get(0).getTime()).toString();
            String s2=new SimpleDateFormat("dd").format(list1.get(list1.size()-1).getTime()).toString();
            int day1 = Integer.parseInt(s1);
            int day2 = Integer.parseInt(s2);
            this.Path = Path;
            if(day1==day2)
                fichier = new File(Path+"/ENIT 7kWc_ACQ_"+new SimpleDateFormat("yyyy-MM-dd").format(list1.get(2).getTime()).toString()+".txt");
            else
                fichier = new File(Path+"/ENIT 7kWc_ACQ_"+new SimpleDateFormat("yyyy-MM").format(list1.get(2).getTime()).toString()+".txt");
            fos = new FileOutputStream(fichier);
            osw = new OutputStreamWriter(fos);
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(CEAFileCreator.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }

    void CEACreator() 
    {
        try
        {
            bw = new BufferedWriter(osw);
            bw.write("Date Locale;Gipm (w par m²);Tam (°C);Va (V);Ia (A);Pa (Kw);Tm (°C);WindSpeed (m par s);AC-U (V);AC-P (W)");
            bw.newLine();
            
            MatchMaker mk = new MatchMaker(list1,list2,list3);
            for (Info i : mk.InfoList)
            {
                bw.write(i.toString());  bw.newLine();
            }
            

bw.close();
osw.close();
fos.close();

Desktop.getDesktop().open(new File(Path));
        }
        catch (IOException ex)
        {
            Logger.getLogger(CEAFileCreator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
