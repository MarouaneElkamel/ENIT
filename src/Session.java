
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
public class Session
{   static  ArrayList<InfoCapteur> listCapteur = new ArrayList<>();
    static  ArrayList<InfoOnduleur> listOnduleur = new ArrayList<>();
    static  ArrayList<InfoWind> listWind = new ArrayList<>();

    static  ArrayList<Info> listInfo = new ArrayList<>();
    
    private static Session INSTANCE = new Session();
     
    public static Session getInstance()
        {
        if (INSTANCE == null)
            {
            setINSTANCE(new Session());
            }
        return INSTANCE;
        }

      private static void setINSTANCE(Session aINSTANCE)
        {
        INSTANCE = aINSTANCE;
        }
      
      static public void loadCapteurFromPath(String Path)
      {
        TraitCapteurFile.Path = Path;
          Session.listCapteur.addAll(TraitCapteurFile.LoadInfo());
      }
       static public void loadOnduleurFromPath(String Path)
      {
        TraitOnduleurFile.Path = Path;
          Session.listOnduleur.addAll(TraitOnduleurFile.LoadInfo());
      }
       
        static public void loadWindFromPath(String Path)
      {
        TraitWindFile.Path = Path;
          Session.listWind.addAll(TraitWindFile.LoadInfo());
          System.out.println("wind added " + listWind.size());
      }
}
