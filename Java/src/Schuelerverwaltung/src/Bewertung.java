

public class Bewertung{
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
