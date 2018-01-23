
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Elkamel
 */
public class P3
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
//       
//        Session.loadACFromPath("/Users/Elkamel/Desktop/AC_JUILLET.txt");
//      
//        boolean test =false;
//        int comp = 0;
//        for(InfoAc ac : Session.listInfoAc)
//        {
//          if (ac.getTime().getSeconds()>0)
//          {
//              comp++;
//          }
//          else if (ac.getTime().getMinutes()/10!=0)
//          {
//              comp++;
//          }
//        }
//       System.out.println(Session.listInfoAc.size()-comp);
//       
       
        FileManager f = new FileManager();
        f.setVisible(true);
    }
    
}
