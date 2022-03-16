//Sinn der Klasse ist selbsterklärend der rEst muss geschaut werden
public class Spiel {
  
    private String name;
    int i;
    //Wir wollen die Errungenschaften in Spiel erstellen
    private Errungenschaft[] errungenschaft = new Errungenschaft[10];
    private Bewertung bewertung;
    private int kaufjahr;
    private boolean bewertet = false;
    public Spiel(String pname,int pkaufjahr){
        name = pname;
        kaufjahr=pkaufjahr;
    }
    // getter und setter
    public void setname(String pname){
        name = pname;
    }
    public String getname(){
        return name;
    }
    public void setkaufjahr(int pkaufjahr){
        kaufjahr = pkaufjahr;
    }
    public int getkaufjahr(){
        return kaufjahr;
    }
    public Errungenschaft errungenschaftanlegen(){
        System.out.println("Geben Sie den namen der Errungenschaft ein");
        String pname= Read.string();
        System.out.println("Geben Sie das Jahr der Errungenschaft ein");
        int pjahr = Read.number();
        Errungenschaft pErrungenschaft = new Errungenschaft(pname, pjahr);
        return pErrungenschaft;
    }
    public void errungeschaftfestlegen(){
        errungenschaft[i] = errungenschaftanlegen();
        System.out.println(errungenschaft[i].getname());
        i++;
    }
    public Bewertung bewertunganlegen(){
        System.out.println("Bitte geben sie ihre Bewertung (1-5) ein");
        int bewertugnszahl = Read.number();
        System.out.println("Bitte geben sie eienen Bewertungstext ein");
        String pBewertungstext = Read.string();
        Bewertung pBewertung = new Bewertung(bewertugnszahl, pBewertungstext);
        return pBewertung;
    }
    public boolean getbwertet(){
    return bewertet;
    }
    public void bewertungscanner(){
        if (bewertet==false){
      bewertunganlegen();
        bewertet= true;
    }else{
        System.out.println("Sie haben für dieses Spiel bereits eien Bewertung erstlellt");
    }
    }
    
    
}
