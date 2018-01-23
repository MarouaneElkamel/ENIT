
import java.text.SimpleDateFormat;
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
public class Info
{
    private Date time;
    private double TensionCC=-99;
    private double CourantCC=-99;
    private double PuissanceCC=-99;
    private double Tmp1=-99;
    private double TemAmbiance=-99;
    private double Rayonnement=-99;
    private double WindSpeed=-99;
    private double AC_U=-99;
    private double AC_P=-99;

        
    
    
    Info(InfoCapteur infoC,InfoOnduleur infoO)
    {
        setTime(infoC.getTime());
        setTensionCC(infoO.TensionCC);
        setCourantCC(infoO.CourantCC);
        setPuissanceCC(infoO.PuissanceCC);
        setTmp1(infoO.Tmp1);
        setTemAmbiance(infoC.getTemAmbiance());
        setRayonnement(infoC.getRayonnement());
        setAC_U(infoO.getTensionReseau());
        setAC_P(infoO.getPuissance());
        
        
        
                
    }
    /**
     * @return the time
     */
    public Date getTime()
    {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(Date time)
    {
        this.time = time;
    }

    /**
     * @return the TensionCC
     */
    public double getTensionCC()
    {
        return TensionCC;
    }

    /**
     * @param TensionCC the TensionCC to set
     */
    public void setTensionCC(double TensionCC)
    {
        this.TensionCC = TensionCC;
    }

    /**
     * @return the CourantCC
     */
    public double getCourantCC()
    {
        return CourantCC;
    }

    /**
     * @param CourantCC the CourantCC to set
     */
    public void setCourantCC(double CourantCC)
    {
        this.CourantCC = CourantCC;
    }

    /**
     * @return the PuissanceCC
     */
    public double getPuissanceCC()
    {
        return PuissanceCC;
    }

    /**
     * @param PuissanceCC the PuissanceCC to set
     */
    public void setPuissanceCC(double PuissanceCC)
    {
        this.PuissanceCC = PuissanceCC;
    }

    /**
     * @return the Tmp1
     */
    public double getTmp1()
    {
        return Tmp1;
    }

    /**
     * @param Tmp1 the Tmp1 to set
     */
    public void setTmp1(double Tmp1)
    {
        this.Tmp1 = Tmp1;
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
   
    @Override
    public String toString()
    {
       return new SimpleDateFormat("yyyy-MM-dd").format(getTime()).toString()+'T'+new SimpleDateFormat("HH:mm:ss").format(getTime()).toString()+"+01:00;"+getRayonnement()+';'+getTemAmbiance()+';'+getTensionCC()+';'+getCourantCC()+';'+getPuissanceCC()+';'+getTmp1()+';'+getWindSpeed()+';'+getAC_U()+';'+getAC_P();
    }

    /**
     * @return the WindSpeed
     */
    public double getWindSpeed()
    {   
        return WindSpeed;
    }

    /**
     * @param WindSpeed the WindSpeed to set
     */
    public void setWindSpeed(double WindSpeed)
    {
        this.WindSpeed = WindSpeed;
    }

    /**
     * @return the AC_U
     */
    public double getAC_U()
    {
        return AC_U;
    }

    /**
     * @param AC_U the AC_U to set
     */
    public void setAC_U(double AC_U)
    {
        this.AC_U = AC_U;
    }

    /**
     * @return the AC_P
     */
    public double getAC_P()
    {
        return AC_P;
    }

    /**
     * @param AC_P the AC_P to set
     */
    public void setAC_P(double AC_P)
    {
        this.AC_P = AC_P;
    }

  

}
