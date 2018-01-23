
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
public class InfoWind
{ private Date time;
  private Double speed;
   InfoWind(String Line)
    {
     
         String[] fields = Line.split("\\s");
        String[] year = fields[0].split("/");
        String[] tim = fields[1].split(":");
        Calendar cal = Calendar.getInstance();
        if(Integer.parseInt(year[2])>2000) cal.set(Calendar.YEAR, Integer.parseInt(year[2]));
        else  cal.set(Calendar.YEAR, Integer.parseInt("20"+year[2]));
        cal.set(Calendar.MONTH, (Integer.parseInt(year[1])-1));
        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(year[0]));
        cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(tim[0]));
        cal.set(Calendar.MINUTE, Integer.parseInt(tim[1]));
        cal.set(Calendar.SECOND, Integer.parseInt(tim[2]));
        setTime(cal.getTime());
        setSpeed(Double.parseDouble(fields[2]));
    
    
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
     * @return the speed
     */
    public Double getSpeed()
    {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(Double speed)
    {
        this.speed = speed;
    }
}
