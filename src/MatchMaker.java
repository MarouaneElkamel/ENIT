
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elkamel
 */
public class MatchMaker
{
    public ArrayList<Info> InfoList = new ArrayList<Info>();
    ArrayList<InfoCapteur> list1;
    ArrayList<InfoOnduleur> list2;
    ArrayList<InfoWind> list3;
     
    MatchMaker(ArrayList<InfoCapteur> l ,ArrayList<InfoOnduleur> l1,  ArrayList<InfoWind> l2)
    {
        list2 = l1;
        list1 = l;
        list3 = l2;
       
       int sizel1 = list1.size();
        int sizel2 = list2.size();
         int sizel3 = list3.size();
       
    
       
       
     
        boolean test = false;
         System.out.println( "Onduleure Data : "+ list1.size()+"\nCapture Data : "+ list2.size()+"\nWind Data : "+"    "+list3.size());
         
        InfoCapteur infoC;
        Iterator<InfoCapteur> iter = list1.iterator();
            while (iter.hasNext())
           
        {   infoC = iter.next();  
            test = true;
            for (InfoOnduleur infoO : list2)
            { 
                if (infoC.getTime().toString().equals(infoO.time.toString()))
                  { 
                      test = false;
                      Info theInfo =new Info(infoC,infoO);     
               
                    for(InfoWind infoW : list3)
                    {  
                        if (infoC.getTime().toString().equals(infoW.getTime().toString()))
                        {
                           
                           theInfo.setWindSpeed(infoW.getSpeed());
                    
                    list3.remove(infoW);
                    
                    break;
                        }
                    }
                    
                  
                    
                    InfoList.add(theInfo); 
                    
                    list2.remove(infoO);
                 
                    
                    break;
                }
                
                
            }
          
        if (test == false)     iter.remove();
        }
        System.out.println( "Onduleure Data : "+ list1.size()+ " (" + (sizel1- list1.size()  ) + ") used  "+"\nCapture Data : " + list2.size()+ " (" + (sizel2- list2.size()  ) + ") used  "+"\nWind Data : "+list3.size()+ " (" + (sizel3- list3.size()  ) + ") used  ");
    }
          
}
