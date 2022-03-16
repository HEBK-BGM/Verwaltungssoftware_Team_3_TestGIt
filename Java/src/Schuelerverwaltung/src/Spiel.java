//Sinn der Klasse ist selbsterklärend der rEst muss geschaut werden
public class Spiel {
  
    private String name;
    int counter;
    //Wir wollen die Errungenschaften in Spiel erstellen
    private Errungenschaft[] errungenschaft = new Errungenschaft[10];
    private Bewertung bewertung;
    private int kaufjahr;
    private boolean bewertet = false;
    private Abzeichen abzeichen;
    private boolean abzeichenbestimmt = false;
    public Bewertung getBewertung() {
        return bewertung;
    }
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
    public void errungenschaftfestlegen(){
        errungenschaft[counter] = errungenschaftanlegen();
        counter++;
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
      bewertung = bewertunganlegen();
        bewertet= true;
    }else{
        System.out.println("Sie haben für dieses Spiel bereits eien Bewertung erstlellt");
    }
    }
    public void errungenschaftenausgeben(){
        System.out.println("Für dieses Spiel haben Sie folgende errungenschaften");
        int b = 0;
      while (b<counter){
        System.out.println(errungenschaft[b].getname());
        System.out.println(errungenschaft[b].getjahr());
        b++;
      }
        System.out.println();
    }
    public void bewertungausgeben(){
        if (bewertet==true){
            System.out.println(bewertung.getBewertung());
            System.out.println(bewertung.getBewertungstext());
        }
    }
    public Abzeichen abzeichenanlegen(){
        System.out.println("Geben sie das Level das Abzeichens ein");
        int level = Read.number();
        Abzeichen pabzeichen = new Abzeichen(level);
        return pabzeichen;
    }

    public void abzeichenscanner(){
        if (abzeichenbestimmt==false){
        abzeichen = abzeichenanlegen();
        abzeichenbestimmt= true;
        }else{
            System.out.println("Sie haben für dieses Spiel bereits ein Abzeichen erstlellt");
        } 
    }
    public void abzeichenausgeben(){
        if (abzeichenbestimmt==true){
            System.out.println(abzeichen.getlevel());
        }
    }
}