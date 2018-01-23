
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public final class InfoOnduleur {

    Date time;
    int NumeroApp,Nombre,Langue,Etat,Echec;
    double TensionCC,CourantCC,PuissanceCC,TensionReseau,CourantReseau,Puissance,RevenuAujordhui,Tmp1,Tmp2,Tmp3,Tmp4,LimitePuissance,Delta,Phi,RendementTotal,TmpFonction,ConnexionReseau;
    String NumeroSerie;
    String test;

    InfoOnduleur(String Line)
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
        setNombre(Integer.parseInt(fields[4]));
        setLangue(Integer.parseInt(fields[5]));
        setEtat(Integer.parseInt(fields[6]));
        setEchec(Integer.parseInt(fields[7]));
        setTensionCC(ParseDouble(fields[8]));
        setCourantCC(ParseDouble(fields[9]));
        setPuissanceCC(ParseDouble(fields[10]));
        setTensionReseau(ParseDouble(fields[11]));
        setCourantReseau(ParseDouble(fields[12]));
        setPuissance(ParseDouble(fields[13]));
        setRevenuAujordhui(ParseDouble(fields[14]));
        setTmp1(ParseDouble(fields[15]));
        setTmp3(ParseDouble(fields[17]));
        setTmp4(ParseDouble(fields[18]));
        setLimitePuissance(ParseDouble(fields[19]));
        setDelta(ParseDouble(fields[20]));
        setPhi(ParseDouble(fields[21]));
        setRendementTotal(ParseDouble(fields[22]));
        setTmpFonction(ParseDouble(fields[23]));
        if (fields.length>24)
        setConnexionReseau(ParseDouble(fields[24]));
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


    public int getNumeroApp() {
        return NumeroApp;
    }

    public void setNumeroApp(int numeroApp) {
        NumeroApp = numeroApp;
    }

    public int getNombre() {
        return Nombre;
    }

    public void setNombre(int nombre) {
        Nombre = nombre;
    }

    public int getLangue() {
        return Langue;
    }

    public void setLangue(int langue) {
        Langue = langue;
    }

    public int getEtat() {
        return Etat;
    }

    public void setEtat(int etat) {
        Etat = etat;
    }

    public int getEchec() {
        return Echec;
    }

    public void setEchec(int echec) {
        Echec = echec;
    }

    public double getTensionCC() {
        return TensionCC;
    }

    public void setTensionCC(double tensionCC) {
        TensionCC = tensionCC;
    }

    public double getCourantCC() {
        return CourantCC;
    }

    public void setCourantCC(double courantCC) {
        CourantCC = courantCC;
    }

    public double getPuissanceCC() {
        return PuissanceCC;
    }

    public void setPuissanceCC(double puissanceCC) {
        PuissanceCC = puissanceCC;
    }

    public double getTensionReseau() {
        return TensionReseau;
    }

    public void setTensionReseau(double tensionReseau) {
        TensionReseau = tensionReseau;
    }

    public double getCourantReseau() {
        return CourantReseau;
    }

    public void setCourantReseau(double courantReseau) {
        CourantReseau = courantReseau;
    }

    public double getPuissance() {
        return Puissance;
    }

    public void setPuissance(double puissance) {
        Puissance = puissance;
    }

    public double getRevenuAujordhui() {
        return RevenuAujordhui;
    }

    public void setRevenuAujordhui(double revenuAujordhui) {
        RevenuAujordhui = revenuAujordhui;
    }

    public double getTmp1() {
        return Tmp1;
    }

    public void setTmp1(double tmp1) {
        Tmp1 = tmp1;
    }

    public double getTmp2() {
        return Tmp2;
    }

    public void setTmp2(double tmp2) {
        Tmp2 = tmp2;
    }

    public double getTmp3() {
        return Tmp3;
    }

    public void setTmp3(double tmp3) {
        Tmp3 = tmp3;
    }

    public double getTmp4() {
        return Tmp4;
    }

    public void setTmp4(double tmp4) {
        Tmp4 = tmp4;
    }

    public double getLimitePuissance() {
        return LimitePuissance;
    }

    public void setLimitePuissance(double limitePuissance) {
        LimitePuissance = limitePuissance;
    }


    public double getDelta() {
        return Delta;
    }

    public void setDelta(double delta) {
        Delta = delta;
    }

    public double getPhi() {
        return Phi;
    }

    public void setPhi(double phi) {
        Phi = phi;
    }

    public double getRendementTotal() {
        return RendementTotal;
    }

    public void setRendementTotal(double rendementTotal) {
        RendementTotal = rendementTotal;
    }

    public double getTmpFonction() {
        return TmpFonction;
    }

    public void setTmpFonction(double tmpFonction) {
        TmpFonction = tmpFonction;
    }

    public double getConnexionReseau() {
        return ConnexionReseau;
    }

    public void setConnexionReseau(double connexionReseau) {
        ConnexionReseau = connexionReseau;
    }

    public String getNumeroSerie() {
        return NumeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        NumeroSerie = numeroSerie;
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
