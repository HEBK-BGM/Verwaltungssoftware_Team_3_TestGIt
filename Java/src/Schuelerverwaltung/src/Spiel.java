//Sinn der Klasse ist selbsterklärend der rEst muss geschaut werden
public class Spiel {
  
    private String name;
    private double spielstunden;
    private int counter;
    //Wir wollen die Errungenschaften in Spiel erstellen
    private Errungenschaft[] errungenschaft = new Errungenschaft[10];
    private Bewertung bewertung;
    private int kaufjahr;
    private boolean bewertet = false;
    private boolean spielstudnengelegt = false;
    private Abzeichen abzeichen;
    private boolean kaufjahrvorhanden = false;
    private boolean abzeichenbestimmt = false;
    public Bewertung getBewertung() {
        return bewertung;
    }
    // getter und setter
    public Spiel(String pName){
        name = pName;
    }
    public void setname(){
        System.out.println("Bitte gib den Namen des Spiels ein");
        name = Read.string();
    }
    public String getname(){
        return name;
    }
    public boolean getkaufjahrfestgelegt(){
        return kaufjahrvorhanden;
    }
    public boolean getspielstundenfestgelegt(){
        return spielstudnengelegt;
    }
    public void setkaufjahr(){
        boolean x = false;
        while (x==false){
            String yesONo;
            System.out.println("Geben sie ihr Kaufjahr ein falls sie es nicht wissen geben sie x ein");
            yesONo = Read.string();
            if(yesONo.equals("x")){
                System.out.println("Es wurde kein Spieljahr gespeichert");
                x=true;
            } else{
                if(Read.ueberpruefeNumber(yesONo)==true){
                    kaufjahr = Integer.valueOf(yesONo);
                    kaufjahrvorhanden= true;
                    x=true;
                }else{
                    System.out.println("Eingabe muss x oder eine Zahl sein");
                }
            }
        }
    }
    public int getkaufjahr(){
        return kaufjahr;
    }
    public double getspielzeit(){
        return spielstunden;
    }
    public void setspiezeit(){
        boolean x = false;
        while (x==false){
            System.out.println("bitte geben sie ihre Spielzeit ein");
            System.out.println("Falls sie das nicht wissen geben sie x ein");
            String yesONo =Read.string();
            if(yesONo.equals("x")){
                System.out.println("Es wurde keine Spielzeit gespeichert");
                x = true;
            }else{
                if(Read.ueberpruefeNumber(yesONo)==true){
                    spielstunden = Double.valueOf(yesONo);
                    spielstudnengelegt = true;
                    x=true;
                    if(spielstunden>99999){
                        System.out.println("Ihre Spielstunden überschreiten unser Maximum,");
                        System.out.println("Ihre Spielstunden wurdne jetzt uf 99.999 gesetzt");
                    }
                }else{
                    System.out.println("Es wurde weder x noch eine Zahl eigegeben versuche es erneut");
                }
            }
        }
    }
    public Errungenschaft errungenschaftanlegen(){
        System.out.println("Geben Sie den namen der Errungenschaft ein");
        String pname= Read.string();
        
        Errungenschaft pErrungenschaft = new Errungenschaft(pname);
        return pErrungenschaft;
    }
    public void errungenschaftfestlegen(){
        errungenschaft[counter] = errungenschaftanlegen();
        errungenschaft[counter].setjahr();
        counter++;
    }
    public Bewertung bewertunganlegen(){
        boolean l= false;
        int bewertugnszahl = 0;
        while (l==false){
            System.out.println("Bitte geben sie ihre Bewertung (1-5) ein");
            bewertugnszahl = Read.numberOSchleife();
            if(bewertugnszahl<6){
                if (bewertugnszahl>0){
                    l = true;
                }else {
                    System.out.println("Ihre Bewertung muss zwischen 1 und 5 liegen");
                }
            }else{
                System.out.println("Ihre Bewertung muss zwischen 1 und 5 liegen");
            }
        }



        
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
        if(counter == 0){
            System.out.println("Sie haben für dieses Spiel keine Errungenschaft");
        }else{
        System.out.println("Für dieses Spiel haben Sie folgende errungenschaften");
        int b = 0;
      while (b<counter){
        System.out.println(errungenschaft[b].getname());
        if(errungenschaft[b].getjahrfestgelegt()==true){
        System.out.println(errungenschaft[b].getjahr());}
        b++;
      }
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
        int level = Read.numberOSchleife();
        Abzeichen pabzeichen = new Abzeichen(level);
        return pabzeichen;
    }
    public void abzeichenscann(){
        boolean l= false;
        while (l==false){
            abzeichen =abzeichenanlegen();
            if(abzeichen.getlevel()<7){
                if (abzeichen.getlevel()>0){
                    l = true;

                }else {
                    System.out.println("Dein Abzeichenlevel muss zwischen 1 und 6 sein");
                }
            }else{
                System.out.println("Dein Abzeichenlevel muss zwischen 1 und 6 sein");
            }
        }
    }

    public void abzeichenscanner(){
        if (abzeichenbestimmt==false){
        abzeichenscann();
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