
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
public class InfoAc
{   static int count =0;
    public boolean valid;
    private Date Time;
    private double ICUOperating;
    private double GMUOperating;
    private double DCUOperating;
    private double Event;
    private double DC_U1;
    private double DC_U2;
    private double DC_U3;
    private double DC_U4;
    private double DC_U5;
    private double DC_I1;
    private double DC_I2;
    private double DC_I3;
    private double DC_P;
    private double AC_UL1;
    private double AC_UL2;
    private double AC_UL3;
    private double AC_PL1;
    private double AC_PL2;
    private double AC_PL3;
    private double DayEnergy;
    private double T_COIL;
    private double T_IGBT;
    private double T_PCB;
    private double T_UI;
    private double OperatingTime;
    private double RIsolation;
    private double Frequency;
    private double AFI_I;
    private double ACDC_I;
    private double PhaseDesired;
    private double PhaseActualL1;
    private double PhaseActualL2;
    private double PhaseActualL3;
    private double PowerReduction;
    private double ReduceMode;
    private double PowerReductionPerCent;
    private double QCommand;
    private double Checksum;
    private double Datas;
    InfoAc(String Line)
    {
        count++;
         String[] fields = Line.split("\\s");
      
         String[] year = fields[0].split("/");
         String[] tim = fields[1].split(":");
         Calendar cal = Calendar.getInstance();
         cal.set(Calendar.YEAR, Integer.parseInt(year[2]));
         cal.set(Calendar.MONTH, (Integer.parseInt(year[1])-1));
         cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(year[0]));
         cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(tim[0]));
         cal.set(Calendar.MINUTE, Integer.parseInt(tim[1]));
        
         if(Integer.parseInt(tim[2])%10==0) cal.set(Calendar.MINUTE,Integer.parseInt(tim[2]));
         if(Integer.parseInt(tim[2])%10==1) cal.set(Calendar.MINUTE,Integer.parseInt(tim[2])-1);
         if(Integer.parseInt(tim[2])%10==2) cal.set(Calendar.MINUTE,(Integer.parseInt(tim[2]))-2);
         if(Integer.parseInt(tim[2])%10==3) cal.set(Calendar.MINUTE,(Integer.parseInt(tim[2]))+2);
         if(Integer.parseInt(tim[2])%10==4) cal.set(Calendar.MINUTE,(Integer.parseInt(tim[2]))+1);
         if(Integer.parseInt(tim[2])%10==5) cal.set(Calendar.MINUTE,Integer.parseInt(tim[2]));
         if(Integer.parseInt(tim[2])%10==6) cal.set(Calendar.MINUTE,(Integer.parseInt(tim[2]))-1);
         if(Integer.parseInt(tim[2])%10==7) cal.set(Calendar.MINUTE,(Integer.parseInt(tim[2]))-2);
         if(Integer.parseInt(tim[2])%10==8) cal.set(Calendar.MINUTE,(Integer.parseInt(tim[2]))+2);
         if(Integer.parseInt(tim[2])%10==9) cal.set(Calendar.MINUTE,(Integer.parseInt(tim[2])+1));
         
         
         
         
//         if(Integer.parseInt(tim[2])%10==0) cal.set(Calendar.SECOND,Integer.parseInt(tim[2]));
//         if(Integer.parseInt(tim[2])%10==1) cal.set(Calendar.SECOND,Integer.parseInt(tim[2])-1);
//         if(Integer.parseInt(tim[2])%10==2) cal.set(Calendar.SECOND,(Integer.parseInt(tim[2]))-2);
//         if(Integer.parseInt(tim[2])%10==3) cal.set(Calendar.SECOND,(Integer.parseInt(tim[2]))+2);
//         if(Integer.parseInt(tim[2])%10==4) cal.set(Calendar.SECOND,(Integer.parseInt(tim[2]))+1);
//         if(Integer.parseInt(tim[2])%10==5) cal.set(Calendar.SECOND,Integer.parseInt(tim[2]));
//         if(Integer.parseInt(tim[2])%10==6) cal.set(Calendar.SECOND,(Integer.parseInt(tim[2]))-1);
//         if(Integer.parseInt(tim[2])%10==7) cal.set(Calendar.SECOND,(Integer.parseInt(tim[2]))-2);
//         if(Integer.parseInt(tim[2])%10==8) cal.set(Calendar.SECOND,(Integer.parseInt(tim[2]))+2);
//         if(Integer.parseInt(tim[2])%10==9) cal.set(Calendar.SECOND,(Integer.parseInt(tim[2])+1));
            cal.set(Calendar.SECOND,0);     
        if (cal.get(Calendar.MINUTE) % 10 != 0) this.valid=false ; else this.valid = true;
         setTime(cal.getTime());
         
         this.setICUOperating(Double.parseDouble(fields[2]));
         this.setGMUOperating(Double.parseDouble(fields[3]));
         this.setDCUOperating(Double.parseDouble(fields[4]));
         this.setEvent(Double.parseDouble(fields[5]));
         this.setDC_U1(Double.parseDouble(fields[6]));
         this.setDC_U2(Double.parseDouble(fields[7]));
         this.setDC_U3(Double.parseDouble(fields[8]));
         this.setDC_U4(Double.parseDouble(fields[9]));
         this.setDC_U5(Double.parseDouble(fields[10]));
         this.setDC_I1(Double.parseDouble(fields[11]));
         this.setDC_I2(Double.parseDouble(fields[12]));
         this.setDC_I3(Double.parseDouble(fields[13]));
         this.setDC_P(Double.parseDouble(fields[14]));
         this.setAC_UL1(Double.parseDouble(fields[15]));
         this.setAC_UL2(Double.parseDouble(fields[16]));
         this.setAC_UL3(Double.parseDouble(fields[17]));
         this.setAC_PL1(Double.parseDouble(fields[18]));
         this.setAC_PL2(Double.parseDouble(fields[19]));
         this.setAC_PL3(Double.parseDouble(fields[20]));
         this.setDayEnergy(Double.parseDouble(fields[21]));
         this.setT_COIL(Double.parseDouble(fields[22]));
         this.setT_IGBT(Double.parseDouble(fields[23]));
         this.setT_PCB(Double.parseDouble(fields[24]));
         this.setT_UI(Double.parseDouble(fields[25]));
         this.setOperatingTime(Double.parseDouble(fields[26]));
         this.setRIsolation(Double.parseDouble(fields[27]));
         this.setFrequency(Double.parseDouble(fields[28]));
         this.setAFI_I(Double.parseDouble(fields[29]));
         this.setACDC_I(Double.parseDouble(fields[30]));
         this.setPhaseDesired(Double.parseDouble(fields[31]));
         this.setPhaseActualL1(Double.parseDouble(fields[32]));
         this.setPhaseActualL2(Double.parseDouble(fields[33]));
         this.setPhaseActualL3(Double.parseDouble(fields[34]));
         this.setPowerReduction(Double.parseDouble(fields[35]));
         this.setQCommand(Double.parseDouble(fields[36]));
         this.setChecksum(Double.parseDouble(fields[37]));
         this.setDatas(Double.parseDouble(fields[38]));
                                
    }
    /**
     * @return the Time
     */
    public Date getTime()
    {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(Date Time)
    {
        this.Time = Time;
    }

    /**
     * @return the ICUOperating
     */
    public double getICUOperating()
    {
        return ICUOperating;
    }

    /**
     * @param ICUOperating the ICUOperating to set
     */
    public void setICUOperating(double ICUOperating)
    {
        this.ICUOperating = ICUOperating;
    }

    /**
     * @return the GMUOperating
     */
    public double getGMUOperating()
    {
        return GMUOperating;
    }

    /**
     * @param GMUOperating the GMUOperating to set
     */
    public void setGMUOperating(double GMUOperating)
    {
        this.GMUOperating = GMUOperating;
    }

    /**
     * @return the DCUOperating
     */
    public double getDCUOperating()
    {
        return DCUOperating;
    }

    /**
     * @param DCUOperating the DCUOperating to set
     */
    public void setDCUOperating(double DCUOperating)
    {
        this.DCUOperating = DCUOperating;
    }

    /**
     * @return the Event
     */
    public double getEvent()
    {
        return Event;
    }

    /**
     * @param Event the Event to set
     */
    public void setEvent(double Event)
    {
        this.Event = Event;
    }

    /**
     * @return the DC_U1
     */
    public double getDC_U1()
    {
        return DC_U1;
    }

    /**
     * @param DC_U1 the DC_U1 to set
     */
    public void setDC_U1(double DC_U1)
    {
        this.DC_U1 = DC_U1;
    }

    /**
     * @return the DC_U2
     */
    public double getDC_U2()
    {
        return DC_U2;
    }

    /**
     * @param DC_U2 the DC_U2 to set
     */
    public void setDC_U2(double DC_U2)
    {
        this.DC_U2 = DC_U2;
    }

    /**
     * @return the DC_U3
     */
    public double getDC_U3()
    {
        return DC_U3;
    }

    /**
     * @param DC_U3 the DC_U3 to set
     */
    public void setDC_U3(double DC_U3)
    {
        this.DC_U3 = DC_U3;
    }

    /**
     * @return the DC_U4
     */
    public double getDC_U4()
    {
        return DC_U4;
    }

    /**
     * @param DC_U4 the DC_U4 to set
     */
    public void setDC_U4(double DC_U4)
    {
        this.DC_U4 = DC_U4;
    }

    /**
     * @return the DC_U5
     */
    public double getDC_U5()
    {
        return DC_U5;
    }

    /**
     * @param DC_U5 the DC_U5 to set
     */
    public void setDC_U5(double DC_U5)
    {
        this.DC_U5 = DC_U5;
    }

    /**
     * @return the DC_I1
     */
    public double getDC_I1()
    {
        return DC_I1;
    }

    /**
     * @param DC_I1 the DC_I1 to set
     */
    public void setDC_I1(double DC_I1)
    {
        this.DC_I1 = DC_I1;
    }

    /**
     * @return the DC_I2
     */
    public double getDC_I2()
    {
        return DC_I2;
    }

    /**
     * @param DC_I2 the DC_I2 to set
     */
    public void setDC_I2(double DC_I2)
    {
        this.DC_I2 = DC_I2;
    }

    /**
     * @return the DC_I3
     */
    public double getDC_I3()
    {
        return DC_I3;
    }

    /**
     * @param DC_I3 the DC_I3 to set
     */
    public void setDC_I3(double DC_I3)
    {
        this.DC_I3 = DC_I3;
    }

    /**
     * @return the DC_P
     */
    public double getDC_P()
    {
        return DC_P;
    }

    /**
     * @param DC_P the DC_P to set
     */
    public void setDC_P(double DC_P)
    {
        this.DC_P = DC_P;
    }

    /**
     * @return the AC_UL1
     */
    public double getAC_UL1()
    {
        return AC_UL1;
    }

    /**
     * @param AC_UL1 the AC_UL1 to set
     */
    public void setAC_UL1(double AC_UL1)
    {
        this.AC_UL1 = AC_UL1;
    }

    /**
     * @return the AC_UL2
     */
    public double getAC_UL2()
    {
        return AC_UL2;
    }

    /**
     * @param AC_UL2 the AC_UL2 to set
     */
    public void setAC_UL2(double AC_UL2)
    {
        this.AC_UL2 = AC_UL2;
    }

    /**
     * @return the AC_UL3
     */
    public double getAC_UL3()
    {
        return AC_UL3;
    }

    /**
     * @param AC_UL3 the AC_UL3 to set
     */
    public void setAC_UL3(double AC_UL3)
    {
        this.AC_UL3 = AC_UL3;
    }

    /**
     * @return the AC_PL1
     */
    public double getAC_PL1()
    {
        return AC_PL1;
    }

    /**
     * @param AC_PL1 the AC_PL1 to set
     */
    public void setAC_PL1(double AC_PL1)
    {
        this.AC_PL1 = AC_PL1;
    }

    /**
     * @return the AC_PL2
     */
    public double getAC_PL2()
    {
        return AC_PL2;
    }

    /**
     * @param AC_PL2 the AC_PL2 to set
     */
    public void setAC_PL2(double AC_PL2)
    {
        this.AC_PL2 = AC_PL2;
    }

    /**
     * @return the AC_PL3
     */
    public double getAC_PL3()
    {
        return AC_PL3;
    }

    /**
     * @param AC_PL3 the AC_PL3 to set
     */
    public void setAC_PL3(double AC_PL3)
    {
        this.AC_PL3 = AC_PL3;
    }

    /**
     * @return the DayEnergy
     */
    public double getDayEnergy()
    {
        return DayEnergy;
    }

    /**
     * @param DayEnergy the DayEnergy to set
     */
    public void setDayEnergy(double DayEnergy)
    {
        this.DayEnergy = DayEnergy;
    }

    /**
     * @return the T_COIL
     */
    public double getT_COIL()
    {
        return T_COIL;
    }

    /**
     * @param T_COIL the T_COIL to set
     */
    public void setT_COIL(double T_COIL)
    {
        this.T_COIL = T_COIL;
    }

    /**
     * @return the T_IGBT
     */
    public double getT_IGBT()
    {
        return T_IGBT;
    }

    /**
     * @param T_IGBT the T_IGBT to set
     */
    public void setT_IGBT(double T_IGBT)
    {
        this.T_IGBT = T_IGBT;
    }

    /**
     * @return the T_PCB
     */
    public double getT_PCB()
    {
        return T_PCB;
    }

    /**
     * @param T_PCB the T_PCB to set
     */
    public void setT_PCB(double T_PCB)
    {
        this.T_PCB = T_PCB;
    }

    /**
     * @return the T_UI
     */
    public double getT_UI()
    {
        return T_UI;
    }

    /**
     * @param T_UI the T_UI to set
     */
    public void setT_UI(double T_UI)
    {
        this.T_UI = T_UI;
    }

    /**
     * @return the OperatingTime
     */
    public double getOperatingTime()
    {
        return OperatingTime;
    }

    /**
     * @param OperatingTime the OperatingTime to set
     */
    public void setOperatingTime(double OperatingTime)
    {
        this.OperatingTime = OperatingTime;
    }

    /**
     * @return the RIsomation
     */
    public double getRIsolation()
    {
        return RIsolation;
    }

    /**
     * @param RIsomation the RIsomation to set
     */
    public void setRIsolation(double RIsomation)
    {
        this.RIsolation = RIsomation;
    }

    /**
     * @return the Frequency
     */
    public double getFrequency()
    {
        return Frequency;
    }

    /**
     * @param Frequency the Frequency to set
     */
    public void setFrequency(double Frequency)
    {
        this.Frequency = Frequency;
    }

    /**
     * @return the AFI_I
     */
    public double getAFI_I()
    {
        return AFI_I;
    }

    /**
     * @param AFI_I the AFI_I to set
     */
    public void setAFI_I(double AFI_I)
    {
        this.AFI_I = AFI_I;
    }

    /**
     * @return the ACDC_I
     */
    public double getACDC_I()
    {
        return ACDC_I;
    }

    /**
     * @param ACDC_I the ACDC_I to set
     */
    public void setACDC_I(double ACDC_I)
    {
        this.ACDC_I = ACDC_I;
    }

    /**
     * @return the PhaseDesiredd
     */
    public double getPhaseDesired()
    {
        return PhaseDesired;
    }

    /**
     * @param PhaseDesiredd the PhaseDesiredd to set
     */
    public void setPhaseDesired(double PhaseDesiredd)
    {
        this.PhaseDesired = PhaseDesiredd;
    }

    /**
     * @return the PhaseActualL1
     */
    public double getPhaseActualL1()
    {
        return PhaseActualL1;
    }

    /**
     * @param PhaseActualL1 the PhaseActualL1 to set
     */
    public void setPhaseActualL1(double PhaseActualL1)
    {
        this.PhaseActualL1 = PhaseActualL1;
    }

    /**
     * @return the PhaseActualL2
     */
    public double getPhaseActualL2()
    {
        return PhaseActualL2;
    }

    /**
     * @param PhaseActualL2 the PhaseActualL2 to set
     */
    public void setPhaseActualL2(double PhaseActualL2)
    {
        this.PhaseActualL2 = PhaseActualL2;
    }

    /**
     * @return the PhaseActualL3
     */
    public double getPhaseActualL3()
    {
        return PhaseActualL3;
    }

    /**
     * @param PhaseActualL3 the PhaseActualL3 to set
     */
    public void setPhaseActualL3(double PhaseActualL3)
    {
        this.PhaseActualL3 = PhaseActualL3;
    }

    /**
     * @return the PowerReduction
     */
    public double getPowerReduction()
    {
        return PowerReduction;
    }

    /**
     * @param PowerReduction the PowerReduction to set
     */
    public void setPowerReduction(double PowerReduction)
    {
        this.PowerReduction = PowerReduction;
    }

    /**
     * @return the ReduceMode
     */
    public double getReduceMode()
    {
        return ReduceMode;
    }

    /**
     * @param ReduceMode the ReduceMode to set
     */
    public void setReduceMode(double ReduceMode)
    {
        this.ReduceMode = ReduceMode;
    }

    /**
     * @return the PowerReductionPerCent
     */
    public double getPowerReductionPerCent()
    {
        return PowerReductionPerCent;
    }

    /**
     * @param PowerReductionPerCent the PowerReductionPerCent to set
     */
    public void setPowerReductionPerCent(double PowerReductionPerCent)
    {
        this.PowerReductionPerCent = PowerReductionPerCent;
    }

    /**
     * @return the QCommand
     */
    public double getQCommand()
    {
        return QCommand;
    }

    /**
     * @param QCommand the QCommand to set
     */
    public void setQCommand(double QCommand)
    {
        this.QCommand = QCommand;
    }

    /**
     * @return the Checksum
     */
    public double getChecksum()
    {
        return Checksum;
    }

    /**
     * @param Checksum the Checksum to set
     */
    public void setChecksum(double Checksum)
    {
        this.Checksum = Checksum;
    }

    /**
     * @return the Datas
     */
    public double getDatas()
    {
        return Datas;
    }

    /**
     * @param Datas the Datas to set
     */
    public void setDatas(double Datas)
    {
        this.Datas = Datas;
    }
    
}
