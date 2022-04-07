import java.io.Serializable;

public class Bewertung implements Serializable{
    private int bewertung;
    private String bewertungstext;
    public Bewertung(int pBewertung, String pBewertungstext){
        bewertung = pBewertung;
        bewertungstext = pBewertungstext;
    }
    public int getBewertung(){
        return bewertung;
    }
    public String getBewertungstext(){
        return bewertungstext;
    }
}
