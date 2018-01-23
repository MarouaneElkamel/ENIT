
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elkamel
 */
public final class InfoCapteur
{   
    private Date Time;
    private int NumeroApp;
    private double TemAmbiance;
    private double TemModule;
    private double Rayonnement;
    private double RevenuAujourdhui;
    private double Puissance;
    private String NumeroSerie;
    
    
    InfoCapteur(String Line)
    {
         String[] fields = Line.split("\\s");
         String[] year = fields[0].split("-");
         String[] tim = fields[1].split(":");
         Calendar cal = Calendar.getInstance();
         cal.set(Calendar.YEAR, Integer.parseInt(year[0]));
         cal.set(Calendar.MONTH, (Integer.parseInt(year[1])-1));
         cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(year[2]));
         cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(tim[0]));
         cal.set(Calendar.MINUTE, Integer.parseInt(tim[1]));
         cal.set(Calendar.SECOND, Integer.parseInt(tim[2]));
         setTime(cal.getTime());
         setNumeroApp(Integer.parseInt(fields[2]));
         setNumeroSerie(fields[3]);
         setTemAmbiance(ParseDouble(fields[4]));
         setTemModule(ParseDouble(fields[5]));
         setRayonnement(ParseDouble(fields[6]));
         if (fields.length>7)
         {
         setRevenuAujourdhui(ParseDouble(fields[7]));
         setPuissance(ParseDouble(fields[8]));
         }
    }
    /**
     * @return the time
     */
    public Date getTime()
    {
        return Time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(Date time)
    {
        this.Time = time;
    }

    /**
     * @return the NumeroApp
     */
    public int getNumeroApp()
    {
        return NumeroApp;
    }

    /**
     * @param NumeroApp the NumeroApp to set
     */
    public void setNumeroApp(int NumeroApp)
    {
        this.NumeroApp = NumeroApp;
    }

    /**
     * @return the TemAmbiance
     */
    public double getTemAmbiance()
    {
        return TemAmbiance;
    }

    /**
     * @param TemAmbiance the TemAmbiance to set
     */
    public void setTemAmbiance(double TemAmbiance)
    {
        this.TemAmbiance = TemAmbiance;
    }

    /**
     * @return the TemModule
     */
    public double getTemModule()
    {
        return TemModule;
    }

    /**
     * @param TemModule the TemModule to set
     */
    public void setTemModule(double TemModule)
    {
        this.TemModule = TemModule;
    }

    /**
     * @return the Rayonnement
     */
    public double getRayonnement()
    {
        return Rayonnement;
    }

    /**
     * @param Rayonnement the Rayonnement to set
     */
    public void setRayonnement(double Rayonnement)
    {
        this.Rayonnement = Rayonnement;
    }

    /**
     * @return the RevenuAujourdhui
     */
    public double getRevenuAujourdhui()
    {
        return RevenuAujourdhui;
    }

    /**
     * @param RevenuAujourdhui the RevenuAujourdhui to set
     */
    public void setRevenuAujourdhui(double RevenuAujourdhui)
    {
        this.RevenuAujourdhui = RevenuAujourdhui;
    }

    /**
     * @return the Puissance
     */
    public double getPuissance()
    {
        return Puissance;
    }

    /**
     * @param Puissance the Puissance to set
     */
    public void setPuissance(double Puissance)
    {
        this.Puissance = Puissance;
    }

    /**
     * @return the NumeroSerie
     */
    public String getNumeroSerie()
    {
        return NumeroSerie;
    }

    /**
     * @param NumeroSerie the NumeroSerie to set
     */
    public void setNumeroSerie(String NumeroSerie)
    {
        this.NumeroSerie = NumeroSerie;
    }

    private double ParseDouble(String strNumber) {
        if (strNumber != null && strNumber.length() > 0) {
            try {
                return Double.parseDouble(strNumber);
            } catch(Exception e) {
                return -1;   // or some value to mark this field is wrong. or make a function validates field first ...
            }
        }
        else return 0;
    }
}

