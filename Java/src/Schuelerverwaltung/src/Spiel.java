//Sinn der Klasse ist selbsterklärend der rEst muss geschaut werden
public class Spiel {
  
    private String name;
    int i;
    //Wir wollen die Errungenschaften in Spiel erstellen
    private Errungenschaft[] errungenschaft = new Errungenschaft[10];
    private int kaufjahr;
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
    
    
}
